package io.zipcoder.interfaces;

public class Person {
    final long id;
    public String name;


    Person(){
        id = 0L;
        name = "";
    };
    Person(Long id, String name){
        this.id = id;
        this.name =name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
