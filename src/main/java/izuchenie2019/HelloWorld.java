package izuchenie2019;

import izuchenie2019.entities.Address;
//import izuchenie2019.enums.Days;
import izuchenie2019.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try (SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        ) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
//            session.save(new Student("Max", Days.MONDAY, new Date()));

//            Student max = new Student("Max", Days.MONDAY,new Date());
//            max.setAddress(new Address("Lenina", 22));
//            session.save(max);
/*            Student load = session.load(Student.class,502);
            Student get = session.get(Student.class,552);
            System.out.println(load.getName());
            System.out.println(get.getName());*/
            session.getTransaction().commit();

//            session.close();
        }
    }
}
