package reletionship;

import reletionship.entities.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainRelationships {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        try {
/*            Author author = new Author("John",LocalDate.now());
            Author author1 = new Author("Tom",LocalDate.now());

            Set<Author> authors = new HashSet<>();
            authors.add(author);
            authors.add(author1);

            Book book = new Book("OSP", 490,LocalDate.ofEpochDay(545));
            Book book1 = new Book("OCP", 600, LocalDate.now());
//            Book book2 = new Book("OCPHp", 5400, LocalDate.now());

            book.setAuthors(authors);

            authors = new HashSet<>();
            authors.add(author);
            book1.setAuthors(authors);

            entityManager.persist(book);
            entityManager.persist(book1);*/

            //transient
            Book book = entityManager.find(Book.class,2L);

            book.setTitle("osp");
            //persistence
            entityManager.persist(book);

            book.setTitle("OSG");

            //detached
            entityManager.getTransaction().commit();
            entityManagerFactory.close();
            entityManager.close();
            System.out.println(book.getAuthors());
        } catch (Exception e) {
            e.printStackTrace();
//            entityManager.getTransaction().rollback();
        }





































//        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Hibernate");
//
//        EntityManager entitymanager = emfactory.createEntityManager();
//        entitymanager.getTransaction().begin();
//
//        try {
//            Author author = new Author("John", LocalDate.of(2020, 10, 10));
//
//            Book book = new Book("OCA", 550, LocalDate.now());
//
//
////            Book book1 = new Book("OCP", 600, LocalDate.now());
////            Book book2 = new Book("OCPHp", 5400, LocalDate.now());
////            Book book3 = new Book("OCPA", 2100, LocalDate.now());
////            Book book4 = new Book("OCPB", 3600, LocalDate.now());
//
//            book.setAuthor(author);
////            book.setAuthor(author);
////            book1.setAuthor(author);
//            entitymanager.persist(book);
////            entitymanager.persist(author);
//
//            entitymanager.getTransaction().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
////            entitymanager.getTransaction().rollback();
//        }
//
//

    }
}
