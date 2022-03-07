package hiber2017.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HomeAddress {
    @Id
    @GeneratedValue
    private int id;
    private String street;
}
