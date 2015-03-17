package cz.muni.fi.pv168;

import org.junit.Before;
import org.junit.Test;

import cz.muni.fi.pv168.Mission;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class MissionManagerImplTest {

    MissionManagerImpl missionManager;

    @Before
    public void setUp() throws Exception {
        missionManager = new MissionManagerImpl();
    }

    @Test
    public void testCreateMissionWithNull() throws Exception {
        try {
            missionManager.createMission(null);
            fail("nevyhodil NullPointerException pre null vstup");
        } catch (NullPointerException ex) {
        }
    }

    @Test
    public void testCreateMissionWithId() throws Exception {
        Mission mission = new Mission();
        mission.setName("Kennedy murder");
        Mission mission2 = new Mission();
        mission.setName("Castro murder");
        missionManager.createMission(mission);
        missionManager.createMission(mission2);
        assertThat(mission2.getId(), is(not(equalTo(mission.getId()))));
    }

    @Test
    public void testCreateMissionCanBeRetrieved() throws Exception {
        Mission mission = new Mission();
        mission.setName("Kennedy Assassination");
        missionManager.createMission(mission);
        assertThat(missionManager.findAllMissions(), hasItem(mission));
    }
}