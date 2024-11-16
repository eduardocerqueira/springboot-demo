package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class AuthService {
    private static final String USER_FILE = "src/main/resources/users.txt";

    public List<User> loadUsers() throws Exception {
        System.err.println(this.getClass().getName());
        return Files.lines(Paths.get(USER_FILE))
                .map(line -> line.split(","))
                .map(arr -> new User(arr[0], arr[1]))
                .collect(Collectors.toList());
    }
}
