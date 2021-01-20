package ro.fasttrackit.project.pizzaweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.fasttrackit.project.pizzaweb.model.Pizza;
import ro.fasttrackit.project.pizzaweb.repository.PizzaRepository;

import java.util.List;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository repository;

    public List<Pizza> getPizzas(){
        return repository.findAll();
    }

    public void addPizza(Pizza pizza){
        repository.save(pizza);
    }

    public void updatePizza(Pizza pizza){
        repository.save(pizza);
    }
    public void deletePizza(Integer id){
        repository.deleteById(id);
    }

}
