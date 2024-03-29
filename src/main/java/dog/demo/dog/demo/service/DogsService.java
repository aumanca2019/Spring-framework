package dog.demo.dog.demo.service;

import dog.demo.dog.demo.model.Dog;
import dog.demo.dog.demo.model.DogDto;
import dog.demo.dog.demo.repository.DogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DogsService {

    @Autowired
    DogsRepository repository;

    public void add(DogDto dto) {
        repository.save(toEntity(dto));
    }

    public void delete(long id) {
        repository.deleteById(id);

    }
    public List<Dog> getDogs() {
        return (List<Dog>) repository.findAll();

    }

    public Dog getDogById(long id) throws DogNotFoundException {
        Optional<Dog> optionalDog = repository.findById(id);
        return optionalDog.orElseThrow(() -> new DogNotFoundException("Couldn't find a Dog with id: " + id));

    }

    private Dog toEntity(DogDto dto) {
        Dog entity = new Dog();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        return entity;

    }

}



