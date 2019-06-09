package dog.demo.dog.demo.service;

import dog.demo.dog.demo.model.Cat;
import dog.demo.dog.demo.model.CatDto;
import dog.demo.dog.demo.repository.CatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CatsService {

    @Autowired
    CatsRepository repository;

    public void add(CatDto dtoCat){
        repository.save(toEntity(dtoCat));
    }

    public void delete(long idCat){
        repository.deleteById(idCat);

    }

    public List<Cat>getCats(){
        return (List<Cat>) repository.findAll();
    }

    public Cat getCatById(long idCat) throws RuntimeException{
        Optional<Cat> optionalCat = repository.findById(idCat);
        return optionalCat.orElseThrow(() -> new CatNotFoundException("Couldn't find a Cat with id: " + idCat));
    }



    private Cat toEntity(CatDto dtoCat) {
        Cat entity = new Cat();
        entity.setNameCat(dtoCat.getNameCat());
        entity.setAgeCat(dtoCat.getAgeCat());
        return entity;

    }
}
