package com.fantasy.site.domain.DTO;

import com.fantasy.site.domain.Player;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Jonathan.Marshall on 4/4/2017.
 */
public class PlayerListResponse
{

    @JsonProperty("Players")
    private List<Player> playerList;

    public List<Player> getPlayerList()
    {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList)
    {
        this.playerList = playerList;
    }
}
