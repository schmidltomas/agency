package cz.muni.fi.pv168;

import java.util.List;

/**
 * Created by Tomáš on 27.2.2015.
 */
public interface MissionManager {
    void createMission(Mission mission);

    void getMissionByID(int missionID);

    List<Mission> findAllMissions();

    void updateMission(Mission mission);

    void deleteMission(Mission mission);
}
