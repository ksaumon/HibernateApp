package org.example;


import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
//    public static void main( String[] args ) {
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        try {
//            session.beginTransaction();
//            Person person = session.get(Person.class, 1);
//            System.out.println(person.getName());
//            System.out.println(person.getAge());
//
//            session.getTransaction().commit();
//
//        } finally {
//            sessionFactory.close();
//        }
//    }


    //добавление в bd
//    public static void main( String[] args ) {
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        try {
//            session.beginTransaction();
//            Person person1 = new Person("test1", 30);
//           public static void main( String[] args ) {
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        try {
//            session.beginTransaction();
//            Person person1 = new Person("test1", 30);
//            Person person2 = new Person("test2", 40);
//            Person person3 = new Person("test3", 50);
//
//            session.save(person1);
//            session.save(person2);
//            session.save(person3);
//
//            session.getTransaction().commit();
//
//        } finally {
//            sessionFactory.close();
//        }
//    }
//            Person person3 = new Person("test3", 50);
//
//            session.save(person1);
//            session.save(person2);
//            session.save(person3);
//
//            session.getTransaction().commit();
//
//        } finally {
//            sessionFactory.close();
//        }
//    }

    //обновление, удаление, добавление сущьности в bd
    public static void main( String[] args ) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            //Person person = session.get(Person.class, 2);
            //person.setName("New name");// обновление имени
           // session.delete(person);//удаление сушьности
            Person person = new Person("Some name", 60);
            session.save(person);// сохранение сушьности
            session.getTransaction().commit();

            System.out.println(person.getId());

        } finally {
            sessionFactory.close();
        }
    }
}
