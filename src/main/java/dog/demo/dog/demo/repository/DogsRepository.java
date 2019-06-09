package dog.demo.dog.demo.repository;

import dog.demo.dog.demo.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogsRepository extends CrudRepository<Dog,Long> {
}
