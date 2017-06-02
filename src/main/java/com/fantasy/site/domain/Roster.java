package com.fantasy.site.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)

public class Roster
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rosterId")
    private Integer rosterId;

    @Version
    private Integer version;

    @Column(name="weekNum")
    private Integer weekNum;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Player> playerList;

    public Roster () {}

    public Roster (List<Player> playerList)
    {
        this.setPlayerList(playerList);
    }

    public Integer getRosterId()
    {
        return rosterId;
    }

    public void setRosterId(Integer rosterId)
    {
        this.rosterId = rosterId;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public Integer getWeekNum()
    {
        return weekNum;
    }

    public void setWeekNum(Integer weekNum)
    {
        this.weekNum = weekNum;
    }

    public List<Player> getPlayerList()
    {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList)
    {
        this.playerList = playerList;
    }
}
