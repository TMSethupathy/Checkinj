package com.controller.Control.model;

public class Employee {

    private Integer id;
    private String name;
    private String email;
    private  Long phone;


    public Employee(Integer id, String name, String email, Long phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}

