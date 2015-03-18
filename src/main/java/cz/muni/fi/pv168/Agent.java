package cz.muni.fi.pv168;

import java.util.List;

/**
 * Created by Tomáš on 26.2.2015.
 */
public class Agent {
    private int id;
    private String name;
    private String codeName;
    private String status;
    private List<Skill> agentSkills;

    public Agent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Skill> getAgentSkills() {
        return agentSkills;
    }

    public void setAgentSkills(List<Skill> agentSkills) {
        this.agentSkills = agentSkills;
    }
}
