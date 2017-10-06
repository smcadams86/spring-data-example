package com.example.kevin.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Major {

    String department;
    String name;
    @Id
    private long id;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//    @OneToMany
//    Set<Constraint> constraints;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Set<Constraint> getConstraints() {
//        return constraints;
//    }
//
//    public void setConstraints(Set<Constraint> constraints) {
//        this.constraints = constraints;
//    }
}
