package com.company.Users;

public class User {
    protected String name;
    protected Integer identificatieCode;

    public User(String name, Integer identificatieCode){
        this.name = name;
        this.identificatieCode = identificatieCode;

    }

    public String getName(){

        return name;
    }

    public Integer getIdentificatieCode() {
        return identificatieCode;
    }
}

