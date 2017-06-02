package com.fantasy.site.services.impl;

import com.fantasy.site.domain.ByeWeek;
import com.fantasy.site.domain.DTO.ByeWeekListResponse;
import com.fantasy.site.domain.DTO.PlayerListResponse;
import com.fantasy.site.domain.Player;
import com.fantasy.site.repositories.ByeWeekRepository;
import com.fantasy.site.services.ByeWeekService;
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
public class ByeWeekServiceImpl implements ByeWeekService
{
    String url = "https://www.fantasyfootballnerd.com/service/byes/json/kcwbg5nbzdzm/";

    @Autowired
    private ByeWeekRepository byeWeekRepository;

    @Override
    public Iterable<ByeWeek> listAllByeWeeks()
    {
        return byeWeekRepository.findAll();
    }

    @Override
    public ByeWeek getByeWeekById(Integer id)
    {
        return byeWeekRepository.findOne(id);
    }

    @Override
    public ByeWeek saveByeWeek(ByeWeek byeWeek)
    {
        return byeWeekRepository.save(byeWeek);
    }

    @Override
    public Iterable<ByeWeek> saveByeWeekList(Iterable<ByeWeek> byeWeekIterable)
    {
        return byeWeekRepository.save(byeWeekIterable);
    }

    @Override
    public void deleteByeWeek(Integer id)
    {
        byeWeekRepository.delete(id);
    }

    @Override
    public List<ByeWeek> listByeWeeksAndTeams()
    {
        //creating headers
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        //instantiate a rest template object
        RestTemplate restTemplate = new RestTemplate();

        // call resttemplate.exchange method that returns a wrapper of ByeWeekListResponse
        ResponseEntity<ByeWeekListResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, ByeWeekListResponse.class);

        ByeWeekListResponse responseBody = response.getBody();
        responseBody.mergeLists();
        byeWeekRepository.save(responseBody.getByeWeekList());
        return responseBody.getByeWeekList();

    }
}
