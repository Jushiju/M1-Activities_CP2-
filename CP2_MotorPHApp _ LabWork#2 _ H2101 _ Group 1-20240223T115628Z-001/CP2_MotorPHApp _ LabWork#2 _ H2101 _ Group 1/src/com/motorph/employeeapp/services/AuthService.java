package com.motorph.employeeapp.services;

public class AuthService {
    public boolean verifyLogin(String username, String password) {
        return username.equals("user") && password.equals("admin");
    }
}
