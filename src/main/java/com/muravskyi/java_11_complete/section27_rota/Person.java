package com.muravskyi.java_11_complete.section27_rota;

import java.util.HashSet;
import java.util.Set;

public class Person {

    private String name;
    private Set<Skill> skills;
    private boolean onHoliday = false;

    public Person(String name) {
        this.name = name;

        skills = new HashSet<>();
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public boolean isOnHoliday() {
        return onHoliday;
    }

    public void setOnHoliday(boolean onHoliday) {
        this.onHoliday = onHoliday;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name);
        sb.append(": ");

        for (var skill : skills) {
            sb.append(skill);
            sb.append("\t");
        }

        return sb.toString();
    }

}
