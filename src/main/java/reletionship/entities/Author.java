package reletionship.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;
    @Column
    private LocalDate birthDate;

////    @OneToMany(mappedBy = "author")
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "book_id")

//    @OneToOne(mappedBy = "author")















    @ManyToMany(mappedBy = "authors")
    private Set<Book> book;


























/*

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Book book;

 */


    public Author() {
    }

    public Author(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}
