package connection.service;

import connection.domain.Producer;
import connection.repository.ProducerRepository;

public class ProducerService {

    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(Producer producer) {
        idIsValid(producer.getId());
        ProducerRepository.delete(producer);
    }

    public static void update(Producer producer2, Producer producer) {
        idIsValid(producer.getId());
        ProducerRepository.update(producer2, producer);
    }

    private static void idIsValid(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for ID");
        }
    }
}
