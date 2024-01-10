package org.example.model;

import javax.persistence.*;

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

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
