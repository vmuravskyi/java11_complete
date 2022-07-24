package com.muravskyi.java_11_complete.section27_rota;

import java.util.HashSet;
import java.util.Set;

public class VitalSkillSet extends HashSet<Skill> {

    private static final long serialVersionUID = 1L;

    private Set<Skill> vitalSkills = Set.of(Skill.PROGRAMMING, Skill.MANAGEMENT, Skill.RECEPTION);

    public boolean isComplete() {

        for(var skill: vitalSkills) {
            if(!contains(skill)) {
                return false;
            }
        }

        return true;
    }

}
