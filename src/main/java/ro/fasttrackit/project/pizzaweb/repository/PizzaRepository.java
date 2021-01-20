package ro.fasttrackit.project.pizzaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.fasttrackit.project.pizzaweb.model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza,Integer> {
}
