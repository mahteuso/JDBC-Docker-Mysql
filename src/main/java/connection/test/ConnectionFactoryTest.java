package connection.test;

import connection.conn.ConnectionFactory;
import connection.domain.Producer;
import connection.repository.ProducerRepository;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = new Producer("Julia");
        ProducerRepository.save(producer);
    }
}
