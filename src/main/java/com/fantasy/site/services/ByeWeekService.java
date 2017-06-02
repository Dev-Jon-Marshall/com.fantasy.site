package com.fantasy.site.services;

import com.fantasy.site.domain.ByeWeek;

import java.util.List;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
public interface ByeWeekService
{
    String url = "https://www.fantasyfootballnerd.com/service/byes/json/kcwbg5nbzdzm/";

    Iterable<ByeWeek> listAllByeWeeks();

    ByeWeek getByeWeekById(Integer id);

    ByeWeek saveByeWeek(ByeWeek byeWeek);

    Iterable<ByeWeek> saveByeWeekList(Iterable<ByeWeek> byeWeekIterable);

    void deleteByeWeek(Integer id);

    //customMethods
    List<ByeWeek> listByeWeeksAndTeams();
}
