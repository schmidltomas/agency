package cz.muni.fi.pv168;

import java.util.List;

/**
 * Created by Tomáš on 27.2.2015.
 */
public class AgencyManagerImpl implements AgencyManager {
    @Override
    public void assignAgentToAMission(Agent agent, Mission mission) {
    }

    @Override
    public List<Agent> findAgentsForMission(Mission mission) {
        return null;
    }

    @Override
    public List<Mission> findMissionsAssignedtoAgent(Agent agent) {
        return null;
    }

    @Override
    public List<Mission> findUnassignedMissions() {
        return null;
    }
}
