package com.codeclan.example.pirateservice.models;

import javax.persistence.*;


@Entity //Entity annotation tells Hibernate that we want to map this class into a table, it will create a table named Pirate
@Table(name = "pirates") //specifying the table name overriding the default
public class Pirate {

    @Id //Id annotation, tells hibernate to use the following for ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //specifies method of ID creation
    private Long id;

    @Column(name = "first_name") //identifies a column to be inserted and what the column will be called
    private String firstName;

    @Column(name= "last_name")
    private String lastName;

    @Column
    private int age;

    public Pirate(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Pirate(){} //all classes to be mapped by hibernate must have a default constructor

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
