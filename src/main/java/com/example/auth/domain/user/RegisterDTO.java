package com.example.auth.domain.user;

public record RegisterDTO(String email, String password, UserRole role) {
}
