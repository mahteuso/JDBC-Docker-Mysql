package connection.service;

import connection.domain.Producer;
import connection.repository.ProducerRepository;

public class ProducerService {

    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delete(Producer producer){
        ProducerRepository.delete(producer);
    }

    public static void update(Producer producer, Producer producer2){
        ProducerRepository.update(producer, producer2);
    }
}
