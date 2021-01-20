package ro.fasttrackit.project.pizzaweb.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Pizza {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private String weight;
    private Integer price;

}
