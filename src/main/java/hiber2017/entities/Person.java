package hiber2017.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
}
