package reletionship.entities;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;
    @Column
    private int pageCount;
    @Column
    private LocalDate publishDate;

//    //    @OneToOne(cascade = CascadeType.ALL)
////    @OneToOne(mappedBy = "book")
////    @ManyToOne(cascade = CascadeType.ALL)
////    @JoinColumn(name = "author_id")
//
//    @OneToMany(mappedBy = "book")
//    private Set<Author> author;


    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "autor_id")
    @JoinTable(name = "author_book",
            joinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "autor_id", referencedColumnName = "id")})
    private Set<Author> authors;


    public Book() {
    }

    public Book(String title, int pageCount, LocalDate publishDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.publishDate = publishDate;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }


    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", publishDate=" + publishDate +
                ", authors=" + authors +
                '}';
    }
}
