package org.example;


import org.example.model.*;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

//// пример использования языка HQL
//    public static void main( String[] args ) {
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        try {
//            session.beginTransaction();
//            //List<Person> people = session.createQuery("FROM Person").getResultList();//вывод всех столбцов
//            //List<Person> people = session.createQuery("FROM Person where age >30").getResultList();
//            // вывод всех с возрастом больше 30
//            //List<Person> people = session.createQuery("FROM Person where name LIKE 't%'").getResultList();
//            // вывод всех у кого имя начинаеться на t (% - любое количество символов после t)
//            //int updatedRows = session.createQuery("UPDATE Person set name='Jon' where age > 30")
//            //        .executeUpdate();
//            //обновляет всех людей у которых возраст больше 30
//            int updatedRows = session.createQuery("delete from Person where age > 30 and age < 60")
//                    .executeUpdate();
//            //удаляет всех людей с возрастом больше 30 и меньше 60
//            System.out.println("Количество обновленных записей: " + updatedRows);
////
////            for (Person person : people)
////                System.out.println(person.getName() + "," + person.getAge());
//
//            session.getTransaction().commit();
//        } finally {
//            sessionFactory.close();
//        }
//    }


//    public static void main( String[] args ) {
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        try {
//            session.beginTransaction();
////            Person person = session.get(Person.class, 3);//для данного человека
////            System.out.println(person);
////
////            List<Item> items = person.getItems();
////            System.out.println(items);//получили все товары
//
////            Item item = session.get(Item.class, 5);// связь двухстороннея можем для данного товара получить
////            //всех людей
////            System.out.println(item);
////
////            Person person = item.getOwner();
////            System.out.println(person);// получить всех людей
//
////            Добавляем товар для существующего человека
////            Person person = session.get(Person.class, 2);
////            Item newItem = new Item("Item from Hibernate", person);// указание связи на стороне item(товар)
////            // у товара есть человек а ниже строча сохранения у человека этого товара
////            person.getItems().add(newItem); // данная строчка актуализирует кеш Hibernate не создавая SQL код
////
////            session.save(newItem);
//
////            создаем нового человека с одним заказом
////            Person person = new Person("Test Person", 30);
////            Item newItem = new Item("Item from Hibernate 2", person);
////            person.setItems(new ArrayList<>(Collections.singletonList(newItem)));
////            session.save(person);
////            session.save(newItem);
//
////          удаление товаров у человека
////            Person person = session.get(Person.class, 3);
////            List<Item> items = person.getItems();
////
////            for (Item item: items) {
////                session.remove(item);
////            }
////            person.getItems().clear();
//
////            удаление человека
////            Person person = session.get(Person.class, 2);
////
////            session.remove(person);// удаление
////            person.getItems().forEach(item -> item.setOwner(null));//актуализация кэша Hibernate
//
////           меняем человека у товара
//            Person person = session.get(Person.class, 4);
//            Item item = session.get(Item.class, 1);
//            item.getOwner().getItems().remove(item);// у старого владельца удаляеться товар для кэша Hibernate
//
//            item.setOwner(person);
//            person.getItems().add(item);
//
//            session.getTransaction().commit();
//        } finally {
//            sessionFactory.close();
//        }
//    }


//         Каскадирование в Hibernate
//    public static void main( String[] args ) {
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        try {
//            session.beginTransaction();
////            Person person = new Person("Test cascading", 1);
////            Item item = new Item("Test cascading item", person);
////            person.setItems(new ArrayList<>(Collections.singletonList(item)));
////           // session.persist(person); при использовании persist вместо save
////            session.save(person);
//            //session.save(item); данная строчка необходима если не использовать каскадирование иначе будет ошибка
//            //так как у нас в bd есть связь  при создании person_id int REFERENCES Person(id) ON DELETE SET NULL
//
//            Person person = new Person("Test cascading", 30);
//
//            person.addItem(new Item("item1"));
//            person.addItem(new Item("item2"));
//            person.addItem(new Item("item3"));
//            session.save(person);
//            session.getTransaction().commit();
//
//        } finally {
//            sessionFactory.close();
//        }
//    }


//    public static void main( String[] args ) {
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class)
//                .addAnnotatedClass(Passport.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        try {
//            session.beginTransaction();
//
//            Person person = new Person("Test person", 50);//добавили человека
//            Passport passport = new Passport(123456);//добавили человеку паспорт
//            person.setPassport(passport);//сохранили паспорт
//            session.save(person);//сохранили человека
////            Person person = session.get(Person.class, 1);// прочитали человека
////            System.out.println(person.getPassport().getPassportNumber());// получили номер
////            Passport passport = session.get(Passport.class, 1);// прочитали паспорт
////            System.out.println(passport.getPerson().getName());// получили имя
//
////            //изменение номера паспорта
////            Person person = session.get(Person.class, 1);
////            person.getPassport().setPassportNumber(654321);
//
////            //удаление человека
////            Person person = session.get(Person.class, 1);
////            session.remove(person);
//
//            session.getTransaction().commit();
//
//        } finally {
//            sessionFactory.close();
//        }
//    }

//    public static void main( String[] args ) {
//        Configuration configuration = new Configuration().addAnnotatedClass(Actor.class)
//                .addAnnotatedClass(Movie.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        // try с ресурсами
//        try (sessionFactory) {
//            Session session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
////            Movie movie = new Movie("Puil fiction", 1994);
////            Actor actor1 = new Actor("Marvel Katel", 81);
////            Actor actor2 = new Actor("Samuel Io", 80);
////
////            movie.setActors(new ArrayList<>(List.of(actor1, actor2)));
////
////            actor1.setMovies(new ArrayList<>(Collections.singletonList(movie)));
////            actor2.setMovies(new ArrayList<>(Collections.singletonList(movie)));
////
////            session.save(movie);
////
////            session.save(actor1);
////            session.save(actor2);
//
////            получаем список актеров для фильма
////            Movie movie = session.get(Movie.class, 1);
////            System.out.println(movie.getActors());
//
//
//////            добавим новый фильм для актера
////            Movie movie = new Movie("Reservoir Dogs", 1992);
////            Actor actor = session.get(Actor.class, 1);
////
////            movie.setActors(new ArrayList<>(Collections.singletonList(actor)));
////            actor.getMovies().add(movie);
////
////            session.save(movie);
//
//            //            удалим фильм у актера
//
//            Actor actor = session.get(Actor.class, 1);//получаем актера по айди
//            System.out.println(actor.getMovies());//выводим для него список фильмов
//            Movie movieToRemove = actor.getMovies().get(0);// получаем тот фильм из списка который хотим удалить
//
//            actor.getMovies().remove(0);// у актера удаляем фильм по индексу
//            movieToRemove.getActors().remove(actor);// у фильма удаляем актера
//
//            session.getTransaction().commit();
//
//        }
//    }



    public static void main( String[] args ) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class)
                .addAnnotatedClass(Item.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // try с ресурсами
        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Person person = session.get(Person.class, 10);
            System.out.println("Получили человека");
            // получим связаные сущьности (Lazy)
            System.out.println(person.getItems());
//          чтобы подгрузить товары из bd используется строчка сверху или метод
           // Hibernate.initialize(person.getItems());
            session.getTransaction().commit();
            //если после зарытия сессии неоходимо подгрузить данные снова открываем сессию и подружаем
            // и в даже после закрытия второй сессии данные будут видны так как они были подгружены
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            person = (Person) session.merge(person);//пристегиваем person ко второй сессии
            Hibernate.initialize(person);// подгружаем данные
            session.getTransaction().commit();

        }
    }
}
