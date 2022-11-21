package com.example.app;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
