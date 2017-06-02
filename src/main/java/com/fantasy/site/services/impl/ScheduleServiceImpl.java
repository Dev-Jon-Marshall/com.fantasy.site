package com.fantasy.site.services.impl;

import com.fantasy.site.domain.DTO.ScheduleListResponse;
import com.fantasy.site.domain.Schedule;
import com.fantasy.site.repositories.ScheduleRepository;
import com.fantasy.site.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
@Service
public class ScheduleServiceImpl implements ScheduleService
{
    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public Iterable<Schedule> listAllSchedule()
    {
        return scheduleRepository.findAll();
    }

    @Override
    public Schedule getScheduleById(Integer id)
    {
        return scheduleRepository.findOne(id);
    }

    @Override
    public Schedule saveSchedule(Schedule schedule)
    {
        return scheduleRepository.save(schedule);
    }

    @Override
    public Iterable<Schedule> saveScheduleList(Iterable<Schedule> scheduleIterable)
    {
        return scheduleRepository.save(scheduleIterable);
    }

    @Override
    public void deleteSchedule(Integer id)
    {
        scheduleRepository.delete(id);
    }

    //custom methods
    @Override
    public List<Schedule> listScheduleGames()
    {
        //creating headers
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        //instantiate a rest template object
        RestTemplate restTemplate = new RestTemplate();

        // call resttemplate.exchange method that returns a wrapper of PlayerListResponse
        ResponseEntity<ScheduleListResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, ScheduleListResponse.class);

        ScheduleListResponse responseBody = response.getBody();

        scheduleRepository.save(responseBody.getScheduleList());
        return responseBody.getScheduleList();

    }
}
