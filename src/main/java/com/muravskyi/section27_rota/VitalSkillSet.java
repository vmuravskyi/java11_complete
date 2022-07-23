package com.muravskyi.section27_rota;

import static com.muravskyi.section27_rota.Skill.MANAGEMENT;
import static com.muravskyi.section27_rota.Skill.PROGRAMMING;
import static com.muravskyi.section27_rota.Skill.RECEPTION;

import java.util.HashSet;
import java.util.Set;

public class VitalSkillSet extends HashSet<Skill> {

    private Set<Skill> vitalSkills = Set.of(PROGRAMMING, MANAGEMENT, RECEPTION);

    public boolean isComplete() {
        for (var skill : vitalSkills) {
            if (!this.contains(vitalSkills)) {
                return false;
            }
        }
        return true;
    }

}
