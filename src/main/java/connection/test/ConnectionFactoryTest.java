package connection.test;

import connection.conn.ConnectionFactory;
import connection.domain.Producer;
import connection.repository.ProducerRepository;
import connection.service.ProducerService;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Helena Dias").build();
        Producer producer2 = Producer.builder().name("Helena Dias Leite").build();
        Producer producer1 = Producer.builder().id(null).build();
//        ProducerService.save(producer);
        ProducerService.update(producer, producer1);
//        ProducerService.delete(producer1);
    }
}
