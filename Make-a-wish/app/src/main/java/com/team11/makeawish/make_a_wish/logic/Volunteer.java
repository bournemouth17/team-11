package com.team11.makeawish.make_a_wish.logic;

import java.util.List;

public class Volunteer {
    String location, name, contact;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    /*public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    List<String> skills;
    */
    public Volunteer(String location, String name, String contact) {
        this.location = location;
        this.name = name;
        this.contact = contact;
        //this.skills = skills;
    }
}
