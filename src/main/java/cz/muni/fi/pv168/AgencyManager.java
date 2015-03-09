package cz.muni.fi.pv168;

import java.util.List;

/**
 * Created by Tomáš on 26.2.2015.
 */
public interface AgencyManager {
    void assignAgentToAMission(Agent agent, Assignment assignment);

    List<Assignment> findAssignmentsForAgent(Agent agent);

    void deleteAssignment(Assignment assignment);
}
