package org.example.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity//Аннотация, которая указывает, что класс является сущностью.
@Table(name = "Person")//Аннотация, которая позволяет настроить свойства таблицы базы данных в данном случае имя таблици
public class Person {
    @Id//Указывает, что поле, к которому применяется аннотация, является первичным ключом сущности.
    @Column(name = "id")//Аннотация, которая позволяет настроить свойства столбца базы данных для поля сущности.
    // Можно указать имя столбца с помощью атрибута name.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//: Аннотация для указания стратегии генерации значений для
    // первичного ключа.IDENTITY говорит hibernate не трогать поля id оно генерируеться на стороне bd
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    //@OneToMany(mappedBy = "owner", cascade = CascadeType.PERSIST)//вместо метода save можно использовать данный метод
    // PERSIST, различие в том что PERSIST есть везде и ничего не возвращает, а save только в Hibernate и может что
    // возвращать по запросу
//    @OneToMany(mappedBy = "owner")
//    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
//    private List<Item> items;
    @OneToOne(mappedBy = "person")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Passport passport;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
        getPassport().setPerson(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public List<Item> getItems() {
//        return items;
//    }
//
//    public void setItems(List<Item> items) {
//        this.items = items;
//    }
//
//    public void addItem(Item item) {
//        if (this.items == null)
//            this.items = new ArrayList<>();
//
//        this.items.add(item);
//        item.setOwner(this);
//    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
