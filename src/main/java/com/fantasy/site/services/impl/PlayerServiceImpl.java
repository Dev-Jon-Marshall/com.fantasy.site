package com.fantasy.site.services.impl;

import com.fantasy.site.domain.DTO.PlayerListResponse;
import com.fantasy.site.domain.Player;
import com.fantasy.site.repositories.PlayerRepository;
import com.fantasy.site.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
@Service
public class PlayerServiceImpl implements PlayerService
{
    @Autowired
    private PlayerRepository playerRepository;

    String url ="https://www.fantasyfootballnerd.com/service/players/json/kcwbg5nbzdzm/";

    final static Integer PAGE_SIZE = 20;

    //CRUD features
    @Override
    public Iterable<Player> listAllPlayers()
    {
        return playerRepository.findAll();
    }

    @Override
    public Player getPlayerById(Integer id)
    {
        return playerRepository.findOne(id);
    }

    @Override
    public Player savePlayer(Player player)
    {
        return playerRepository.save(player);
    }

    @Override
    public Iterable<Player> savePlayerList(Iterable<Player> playerIterable)
    {
        return playerRepository.save(playerIterable);
    }

    @Override
    public void deletePlayer(Integer id)
    {
        playerRepository.delete(id);
    }

    //Custom Methods

    //From API
    @Override
    public List<Player> fetchPlayersFromAPIByPosition(String position)
    {
        //creating headers
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        //instantiate a rest template object
        RestTemplate restTemplate = new RestTemplate();

        // call resttemplate.exchange method that returns a wrapper of PlayerListResponse
        ResponseEntity<PlayerListResponse> response = restTemplate.exchange(url + "/" + position + "/", HttpMethod.GET, entity, PlayerListResponse.class);

        PlayerListResponse responseBody = response.getBody();
        return responseBody.getPlayerList();
//        System.out.println(responseBody);
    }

    //From API
    @Override
    public List<Player> fetchPlayersFromAPI()
    {
        //creating headers
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        //instantiate a rest template object
        RestTemplate restTemplate = new RestTemplate();

        // call resttemplate.exchange method that returns a wrapper of PlayerListResponse
        ResponseEntity<PlayerListResponse> response = restTemplate.exchange(url + "/ACTIVE/", HttpMethod.GET, entity, PlayerListResponse.class);

        PlayerListResponse responseBody = response.getBody();
        playerRepository.save(responseBody.getPlayerList());
        return responseBody.getPlayerList();
//        System.out.println(responseBody);
    }


    //From DB with pagination
    @Transactional(readOnly = true)
    @Override
    public Page<Player> getAllActivePlayersByPage(Integer active, Pageable pageRequest)
    {
        return  playerRepository.findAllByActive(active, pageRequest);
    }




    @Override
    public Page<Player> getAllActivePlayersByPosition(Integer active, String position, Pageable pageRequest)
    {
        return playerRepository.findAllByActiveAndPosition(active, position, pageRequest);
    }
}
