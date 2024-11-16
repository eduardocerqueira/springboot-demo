package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Scanner;

public class PasswordEncryptor {

    public static void main(String[] args) {
        // Create a BCryptPasswordEncoder instance
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        // Read the password to encode
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password to encrypt: ");
        String rawPassword = scanner.nextLine();

        // Encrypt the password
        String encodedPassword = passwordEncoder.encode(rawPassword);

        // Print the encrypted password
        System.out.println("Encrypted password: " + encodedPassword);
        
        scanner.close();
    }
}
