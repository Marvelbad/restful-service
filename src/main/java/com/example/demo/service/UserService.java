package com.example.demo.service;

import com.example.demo.repository.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    @GetMapping
    public List<User> helloWorld() {
        return List.of(
                new User(1L, "Alex", "alex@gmail.com", LocalDate.of(1988, 2, 1), 35),
                new User(1L, "Sergey", "serg@gmail.com", LocalDate.of(1984, 6, 3), 35),
                new User(1L, "Dima", "dima@gmail.com", LocalDate.of(1990, 8, 6), 35)
        );
    }
}
