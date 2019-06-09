package dog.demo.dog.demo.repository;

import dog.demo.dog.demo.model.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatsRepository extends CrudRepository <Cat,Long>{

}
