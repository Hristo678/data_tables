package com.example.data_tables.Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class CopyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int age;

    private String email;
    @Column(name = "data_of_copy")
    private LocalDate dataOfCopy;

    public CopyUser() {
    }

    public CopyUser(long id, String name, int age, String email, LocalDate dataOfCopy) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.dataOfCopy = dataOfCopy;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataOfCopy() {
        return dataOfCopy;
    }

    public void setDataOfCopy(LocalDate dataOfCopy) {
        this.dataOfCopy = dataOfCopy;
    }
}
