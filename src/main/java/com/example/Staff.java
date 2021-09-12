package com.example;
import org.springframework.data.annotation.Id;

import java.util.*;

public class Staff {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String position;
    private String university;
    private List<Staff> children = new ArrayList<>();
    public void add(Staff e) {
        children.add(e);
    }

    public void remove(Staff a) {
        children.remove(a);
    }

    public List<Staff> getChildren(){
        return children;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Staff(String id, String firstName, String lastName, String position, String university) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.university = university;
        this.children = getChildren();
    }

}


