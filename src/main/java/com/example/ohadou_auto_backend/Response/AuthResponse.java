package com.example.ohadou_auto_backend.Response;

public class AuthResponse {

    private String jwt;
    private String message;

    public AuthResponse(String jwt, String message) {
        super();
        this.jwt = jwt;
        this.message = message;
    }



}
