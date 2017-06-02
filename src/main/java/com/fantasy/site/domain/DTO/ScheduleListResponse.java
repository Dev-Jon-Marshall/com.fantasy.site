package com.fantasy.site.domain.DTO;

import com.fantasy.site.domain.Schedule;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Jonathan.Marshall on 4/5/2017.
 */
public class ScheduleListResponse
{
    @JsonProperty("Schedule")
    private List<Schedule> scheduleList;

    public List<Schedule> getScheduleList()
    {
        return scheduleList;
    }

    public void setScheduleList(List<Schedule> scheduleList)
    {
        this.scheduleList = scheduleList;
    }
}
