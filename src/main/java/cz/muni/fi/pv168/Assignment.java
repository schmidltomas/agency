package cz.muni.fi.pv168;

import java.util.Date;
import java.util.List;

/**
 * Created by Tomáš on 27.2.2015.
 */
public class Assignment {
    private Date startTime;
    private Date endTime;
    private Mission mission;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public Assignment() {

    }
}
