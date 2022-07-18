package com.learning.sba.business.domain;

public class User {

    private Long id;
    private Long dni;
    private String name;
    private String address;
    private Long age;

    public User() {
    }

    public User(Long id, Long dni, String name, String address, Long age) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public Long getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Long getAge() {
        return age;
    }
}
