package cz.muni.fi.pv168;

import java.util.List;

/**
 * Created by Tomáš on 27.2.2015.
 */
public interface AgentManager {
    void createAgent(Agent agent);

    Agent getAgentByID(int agentID);



    List<Agent> findAllAgents();

    void updateAgent(Agent agent);

    void deleteAgent(Agent agent);
}
