package com.fantasy.site.services;

import com.fantasy.site.domain.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
public interface PlayerService
{
    Iterable<Player> listAllPlayers();

    Player getPlayerById(Integer id);

    Player savePlayer(Player player);

    Iterable<Player> savePlayerList(Iterable<Player> playerIterable);

    void deletePlayer(Integer id);

    List<Player> fetchPlayersFromAPIByPosition(String position);

    List<Player> fetchPlayersFromAPI();

    Page<Player> getAllActivePlayersByPage(Integer active, Pageable pageRequest);

    Page<Player> getAllActivePlayersByPosition(Integer active, String position, Pageable pageRequest);
}
