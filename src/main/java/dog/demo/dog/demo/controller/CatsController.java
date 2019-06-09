package dog.demo.dog.demo.controller;

import dog.demo.dog.demo.model.Cat;
import dog.demo.dog.demo.model.CatDto;
import dog.demo.dog.demo.service.CatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatsController {

    @Autowired
    CatsService service;

    @GetMapping
    public List<Cat> getCats(){
        return service.getCats();
    }
    @PostMapping
    public void postCats(@RequestBody CatDto dtoCat){
        service.add(dtoCat);
    }
   @GetMapping("/{idCat}")
    public Cat getById(@PathVariable(required = true) long idCat){
        return service.getCatById(idCat);
    }
    @DeleteMapping("{/idCat}")
    public void delete(@PathVariable(required = true) long idCat){
        service.delete(idCat);
    }
}
