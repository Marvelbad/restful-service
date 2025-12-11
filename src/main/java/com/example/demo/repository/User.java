package com.example.demo.repository;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private String email;
    private LocalDate birth;
    private Integer age;

    public User() {
    }

    public User(Long id, String name, String email, LocalDate birth, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birth = birth;
        this.age = age;
    }
}
