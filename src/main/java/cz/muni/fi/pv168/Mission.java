package cz.muni.fi.pv168;

import java.util.List;

/**
 * Created by Tomáš on 26.2.2015.
 * edited by Juro
 */
public class Mission {
    private String name;
    private String location;
    private int maxAgents;
    private boolean completed;
    private String description;
    private int id;
    private List<Skill> requiredSkills;

    public int getMaxAgents() {
        return maxAgents;
    }

    public void setMaxAgents(int maxAgents) {
        this.maxAgents = maxAgents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Skill> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<Skill> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public Mission() {
    }


}
