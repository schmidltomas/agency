package cz.muni.fi.pv168;

/**
 * Created by Tomáš on 26.2.2015.
 */
public class Mission {
    private String name;
    private String location;
    private int maxAgents;
    private boolean completed;
    private String description;
    private int id;
    private AgentSkills requiredSkills;

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

    public AgentSkills getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(AgentSkills requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public Mission() {
    }
}
