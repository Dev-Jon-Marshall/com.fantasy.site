package com.fantasy.site.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)

public class Team
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="TeamId")
    private Integer teamId;

    @Version
    private Integer version;

    @Column(name="TeamName")
    private String teamName;


    @OneToOne(cascade = CascadeType.ALL)
    private Owner owner;

    @OneToOne(cascade=CascadeType.ALL)
    private Roster roster;

    @Column(name="Wins")
    private Integer wins;

    @Column(name="Loses")
    private Integer loses;

    @Column(name="PointsFor")
    private Integer pointsFor;

    @Column(name="PointsAgainst")
    private Integer pointsAgainst;

    public Team () {}

    public Team(String teamName)
    {
        this.setTeamName(teamName);
    }

    public Team(String teamName, Owner owner, Integer wins, Integer loses, Integer pointsFor, Integer pointsAgainst)
    {
        this.setTeamName(teamName);
        this.setOwner(owner);
        this.setWins(wins);
        this.setLoses(loses);
        this.setPointsFor(pointsFor);
        this.setPointsAgainst(pointsAgainst);
    }


    public Integer getTeamId()
    {
        return teamId;
    }

    public void setTeamId(Integer teamId)
    {
        this.teamId = teamId;
    }


    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public Roster getRoster()
    {
        return roster;
    }

    public void setRoster(Roster roster)
    {
        this.roster = roster;
    }

    public Owner getOwner()
    {
        return owner;
    }

    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }

    public Integer getWins()
    {
        return wins;
    }

    public void setWins(Integer wins)
    {
        this.wins = wins;
    }

    public Integer getLoses()
    {
        return loses;
    }

    public void setLoses(Integer loses)
    {
        this.loses = loses;
    }

    public Integer getPointsFor()
    {
        return pointsFor;
    }

    public void setPointsFor(Integer pointsFor)
    {
        this.pointsFor = pointsFor;
    }

    public Integer getPointsAgainst()
    {
        return pointsAgainst;
    }

    public void setPointsAgainst(Integer pointsAgainst)
    {
        this.pointsAgainst = pointsAgainst;
    }
}



