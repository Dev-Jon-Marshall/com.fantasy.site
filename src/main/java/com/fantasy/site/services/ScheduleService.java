package com.fantasy.site.services;

import com.fantasy.site.domain.Schedule;

import java.util.List;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
public interface ScheduleService
{
    String url = "https://www.fantasyfootballnerd.com/service/schedule/json/kcwbg5nbzdzm/";

    Iterable<Schedule> listAllSchedule();

    Schedule getScheduleById(Integer id);

    Schedule saveSchedule(Schedule schedule);

    Iterable<Schedule> saveScheduleList(Iterable<Schedule> scheduleIterable);

    void deleteSchedule(Integer id);

    //Custom Method
    List<Schedule> listScheduleGames();
}
