package org.example;


import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

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
//    public static void main( String[] args ) {
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        try {
//            session.beginTransaction();
//            //Person person = session.get(Person.class, 2);
//            //person.setName("New name");// обновление имени
//           // session.delete(person);//удаление сушьности
//            Person person = new Person("Some name", 60);
//            session.save(person);// сохранение сушьности
//
//            session.getTransaction().commit();
//
//            System.out.println(person.getId());
//
//        } finally {
//            sessionFactory.close();
//        }
//    }

// пример использования языка HQL
    public static void main( String[] args ) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            //List<Person> people = session.createQuery("FROM Person").getResultList();//вывод всех столбцов
            //List<Person> people = session.createQuery("FROM Person where age >30").getResultList();
            // вывод всех с возрастом больше 30
            //List<Person> people = session.createQuery("FROM Person where name LIKE 't%'").getResultList();
            // вывод всех у кого имя начинаеться на t (% - любое количество символов после t)
            //int updatedRows = session.createQuery("UPDATE Person set name='Jon' where age > 30")
            //        .executeUpdate();
            //обновляет всех людей у которых возраст больше 30
            int updatedRows = session.createQuery("delete from Person where age > 30 and age < 60")
                    .executeUpdate();
            //удаляет всех людей с возрастом больше 30 и меньше 60
            System.out.println("Количество обновленных записей: " + updatedRows);
//
//            for (Person person : people)
//                System.out.println(person.getName() + "," + person.getAge());

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
