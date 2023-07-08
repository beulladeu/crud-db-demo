package com.verkhonina.crud.model;

import java.util.List;

public class Developer extends BaseEntity{

    private String firstName;
    private String lastName;
    private List<Skill> skills;
    private Specialty specialty;

    public Developer(String firstName, String lastName, List<Skill> skills, Specialty specialty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.skills = skills;
        this.specialty = specialty;
    }

    public Developer(String firstName) {
        this.firstName = firstName;
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

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }


    @Override
    public String toString() {
        return "Developer{" +
                "id='" + super.getId() + '\'' +
                "status='" + super.getStatus() + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", skills=" + skills +
                ", specialty=" + specialty +
                '}';
    }
}
