package com.dinhgt.pattern.creational.builder;

public class PersonBuilder {

    private String name ;
    private String age;
    private String dob;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setDob(String dob) {
        this.dob = dob;
        return this;
    }

    public Person build(){
        Person person = new Person(this.name, this.age, this.dob);
        initialField();
        return person;
    }
    private void initialField(){
        this.name = "";
        this.age = "";
        this.dob = "";
    }
}
