package com.shoppingweb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="users")
public class Users {
    @Id
    @GeneratedValue
    int id;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;
}
