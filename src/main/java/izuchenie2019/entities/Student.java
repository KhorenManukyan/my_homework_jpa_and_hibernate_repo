package izuchenie2019.entities;

//import izuchenie2019.enums.Days;
//import jakarta.persistence.*;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Student {
    private int id;
    private String name;

    @Enumerated(EnumType.STRING)
//    private Days days;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Embedded
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
//
//    public Student(String name, Days days) {
//        this.name = name;
//        this.days = days;
//    }
//
//    public Student(String name, Days days, Date date) {
//        this.name = name;
//        this.days = days;
//        this.date = date;
//    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return "Mr." + name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Days getDays() {
//        return days;
//    }
//
//    public void setDays(Days days) {
//        this.days = days;
//    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

