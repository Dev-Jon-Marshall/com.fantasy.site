package com.fantasy.site.services;

import com.fantasy.site.domain.Stats;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
public interface StatsService
{
    Iterable<Stats> listAllStats();

    Stats getStatsById(Integer id);

    Stats saveStats(Stats stats);

    Iterable<Stats> saveStatsList(Iterable<Stats> statsIterable);

    void deleteStats(Integer id);
}
