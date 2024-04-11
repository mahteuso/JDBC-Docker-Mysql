package connection.test;

import connection.conn.ConnectionFactory;
import connection.domain.Producer;
import connection.repository.ProducerRepository;
import connection.service.ProducerService;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Helena Dias").build();
        Producer producer2 = Producer.builder().name("Helena Dias Leite").build();
        ProducerService.save(producer);
        ProducerService.update(producer2, producer);
    }
}
