package com.fantasy.site.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)

public class Schedule
{
    @Id
    @Column(name = "gameId")
    private Integer gameId;

    @Version
    private Integer version;

    @Column(name="gameWeek")
    private String gameWeek;

    @Column(name="gameDate")
    private String gameDate;

    @Column(name="awayTeam")
    private String awayTeam;

    @Column(name="homeTeam")
    private String homeTeam;

    @Column(name="gameTimeET")
    private String gameTimeET;

    @Column(name="tvStation")
    private String tvStation;

    @Column(name="winner")
    private String winner;




    public Schedule () {}

    public Schedule(Integer gameId, String gameDate, String homeTeam, String awayTeam)
    {
        this.gameId = gameId;
        this.gameDate = gameDate;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }


    public Integer getGameId()
    {
        return gameId;
    }

    public void setGameId(Integer gameId)
    {
        this.gameId = gameId;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public String getGameDate()
    {
        return gameDate;
    }

    public void setGameDate(String gameDate)
    {
        this.gameDate = gameDate;
    }

    public String getHomeTeam()
    {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam)
    {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam()
    {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam)
    {
        this.awayTeam = awayTeam;
    }

    public String getGameWeek()
    {
        return gameWeek;
    }

    public void setGameWeek(String gameWeek)
    {
        this.gameWeek = gameWeek;
    }

    public String getGameTimeET()
    {
        return gameTimeET;
    }

    public void setGameTimeET(String gameTimeET)
    {
        this.gameTimeET = gameTimeET;
    }

    public String getTvStation()
    {
        return tvStation;
    }

    public void setTvStation(String tvStation)
    {
        this.tvStation = tvStation;
    }

    public String getWinner()
    {
        return winner;
    }

    public void setWinner(String winner)
    {
        this.winner = winner;
    }
}
