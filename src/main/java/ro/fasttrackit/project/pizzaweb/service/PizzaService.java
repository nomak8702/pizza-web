package ro.fasttrackit.project.pizzaweb.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.project.pizzaweb.model.Pizza;
import ro.fasttrackit.project.pizzaweb.repository.PizzaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {

    private final PizzaRepository repository;

    public PizzaService(PizzaRepository repository) {
        this.repository = repository;
    }

    public Optional<Pizza> getPizza(Integer id){
        return repository.findById(id);
    }

    public List<Pizza> getPizzas() {
        return repository.findAll();
    }

    public void addPizza(Pizza pizza) {
        repository.save(pizza);
    }

    public void updatePizza(Pizza pizza) {
        repository.save(pizza);
    }

    public void deletePizza(Integer id) {
        repository.deleteById(id);
    }

}
