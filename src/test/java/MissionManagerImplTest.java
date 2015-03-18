import cz.muni.fi.pv168.Mission;
import cz.muni.fi.pv168.MissionManagerImpl;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class MissionManagerImplTest {

    MissionManagerImpl missionManager = new MissionManagerImpl();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCreateMissionWithNull() throws Exception {
        try {
            missionManager.createMission(null);
            fail("nevyhodil NullPointerException pre null vstup");
        } catch (NullPointerException ignored) {
        }
    }

    @Test
    public void testCreateMissionWithId() throws Exception {
        Mission mission = new Mission();
        mission.setName("Kennedy murder");
        Mission mission2 = new Mission();
        missionManager.createMission(mission2);
        assertThat(mission2.getId(), is(not(equalTo(mission.getId()))));
    }

    @Test
    public void testCreateMissionCanBeRetrieved() throws Exception {
        Mission mission = new Mission();
        mission.setName("Kennedy Assassination");
        Mission mission2 = new Mission();
        missionManager.createMission(mission2);
        assertThat(missionManager.findAllMissions(), hasItem(mission2));
    }
}