package cz.muni.fi.pv168;

import java.util.List;

/**
 * Created by Tomáš on 3.3.2015.
 */
public class Skill {
    private String skill;

    public Skill(String skill) {
        this.skill = skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Skill skill1 = (Skill) o;

        if (skill != null ? !skill.equals(skill1.skill) : skill1.skill != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return skill != null ? skill.hashCode() : 0;
    }
}
