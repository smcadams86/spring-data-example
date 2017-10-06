package com.example.kevin.model;

import java.util.Set;

//@Entity
public class Course {

    String name;
    Integer credit;
    String description;
    Set<Constraint> constraints;
    private long id;
    private Course parent;
    private Set<Course> prerequisite;

    public Set<Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(Set<Constraint> constraints) {
        this.constraints = constraints;
    }

    public Course getParent() {
        return parent;
    }

    public void setParent(Course parent) {
        this.parent = parent;
    }

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

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Course> getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(Set<Course> prerequisite) {
        this.prerequisite = prerequisite;
    }
}
