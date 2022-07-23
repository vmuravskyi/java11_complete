package com.muravskyi.section27_rota;

import java.util.LinkedHashSet;
import java.util.Set;

public class Person {

    private String name;
    private Set<Skill> skills;
    private boolean onHoliday = false;

    public Person(String name) {
        this.name = name;
        skills = new LinkedHashSet<>();
    }

    public boolean isOnHoliday() {
        return onHoliday;
    }

    public void setOnHoliday(boolean onHoliday) {
        this.onHoliday = onHoliday;
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "name: " + name + ", skills: " + skills;
    }

}
