package com.fantasy.site.services.impl;

import com.fantasy.site.domain.Stats;
import com.fantasy.site.repositories.StatsRepository;
import com.fantasy.site.services.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
@Service
public class StatsServiceImpl implements StatsService
{
    @Autowired
    private StatsRepository statsRepository;

    @Override
    public Iterable<Stats> listAllStats()
    {
        return statsRepository.findAll();
    }

    @Override
    public Stats getStatsById(Integer id)
    {
        return statsRepository.findOne(id);
    }

    @Override
    public Stats saveStats(Stats stats)
    {
        return statsRepository.save(stats);
    }

    @Override
    public Iterable<Stats> saveStatsList(Iterable<Stats> statsIterable)
    {
        return statsRepository.save(statsIterable);
    }

    @Override
    public void deleteStats(Integer id)
    {
        statsRepository.delete(id);
    }
}
