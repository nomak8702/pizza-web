package ro.fasttrackit.project.pizzaweb.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.project.pizzaweb.exceptions.ResourceNotFoundException;
import ro.fasttrackit.project.pizzaweb.model.Pizza;
import ro.fasttrackit.project.pizzaweb.service.PizzaService;

import java.util.List;

@RestController
@CrossOrigin
public class PizzaController {

   private final PizzaService service;

    public PizzaController(PizzaService service) {
        this.service = service;
    }

    @GetMapping("/pizzas")
    public List<Pizza> getPizzas() {
        return service.getPizzas();
    }

    @GetMapping("/pizzas/{id}")
    public Pizza getPizza(@PathVariable Integer id){
        return service.getPizza(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pizza with id " + id + " not find!"));
    }

    @PostMapping("/pizzas/addnew")
    public void addPizza(@RequestBody Pizza pizza) {
        service.addPizza(pizza);
    }

    @PutMapping("/pizzas/{id}/edit")
    public void updatePizza(@PathVariable("id") Integer id, @RequestBody Pizza pizza) {
        service.updatePizza(pizza);

    }

    @DeleteMapping("/pizzas/{id}/delete")

    public void deletePizza(@PathVariable("id") Integer id) {
        service.deletePizza(id);
    }


}
