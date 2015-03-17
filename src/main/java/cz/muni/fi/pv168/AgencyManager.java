package cz.muni.fi.pv168;

import java.util.List;

/**
 * Created by Tomáš on 26.2.2015.
 */
public interface AgencyManager {

    public void assignAgentToAMission(Agent agent, Mission mission);

    public List<Agent> findAgentsForMission(Mission mission);

    public List<Mission> findMissionsAssignedtoAgent(Agent agent);

    public List<Mission> findUnassignedMissions();

}
