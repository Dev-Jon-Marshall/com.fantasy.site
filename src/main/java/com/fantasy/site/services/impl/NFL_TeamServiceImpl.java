package com.fantasy.site.services.impl;

import com.fantasy.site.domain.DTO.NFL_TeamListResponse;
import com.fantasy.site.domain.DTO.PlayerListResponse;
import com.fantasy.site.domain.NFL_Team;
import com.fantasy.site.domain.Player;
import com.fantasy.site.repositories.NFL_TeamRepository;
import com.fantasy.site.services.NFL_TeamService;
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
public class NFL_TeamServiceImpl implements NFL_TeamService
{
    @Autowired
    private NFL_TeamRepository nfl_teamRepository;

    String url = "https://www.fantasyfootballnerd.com/service/nfl-teams/json/kcwbg5nbzdzm/";

    @Override
    public Iterable<NFL_Team> listAllNFL_Team()
    {
        return nfl_teamRepository.findAll();
    }

    @Override
    public NFL_Team getNFL_TeamById(Integer id)
    {
        return nfl_teamRepository.findOne(id);
    }

    @Override
    public NFL_Team saveNFL_Team(NFL_Team nfl_Team)
    {
        return nfl_teamRepository.save(nfl_Team);
    }

    @Override
    public Iterable<NFL_Team> saveNFL_TeamList(Iterable<NFL_Team> nfl_TeamIterable)
    {
        return nfl_teamRepository.save(nfl_TeamIterable);
    }

    @Override
    public void deleteNFL_Team(Integer id)
    {
        nfl_teamRepository.delete(id);
    }

    //Custom Method
    @Override
    public List<NFL_Team> listNFLTeams()
    {
        //creating headers
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        //instantiate a rest template object
        RestTemplate restTemplate = new RestTemplate();

        // call resttemplate.exchange method that returns a wrapper of PlayerListResponse
        ResponseEntity<NFL_TeamListResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, NFL_TeamListResponse.class);

        NFL_TeamListResponse responseBody = response.getBody();
        nfl_teamRepository.save(responseBody.getNFL_TeamList());

        return responseBody.getNFL_TeamList();
//        System.out.println(responseBody);
    }
}
