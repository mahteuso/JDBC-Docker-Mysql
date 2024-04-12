package connection.repository;

import connection.conn.ConnectionFactory;
import connection.domain.Producer;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
@Log4j2
public class ProducerRepository {

    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database rows affected: '{}' ", producer.getName(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName());
        }
    }

    public static void delete(Producer producer){
            String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%s');".formatted(producer.getId());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from the database rows affected: '{}' ", producer.getId(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", producer.getId(), e);
        }
    }

    public static void update(Producer producer2, Producer producer){
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%s');".formatted(producer2.getName(), producer.getId());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer '{}' to '{}' from the database rows affected: '{}' ", producer.getId(), producer2.getName(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }
}
