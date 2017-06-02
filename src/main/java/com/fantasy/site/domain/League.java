package com.fantasy.site.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)

public class League
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LeagueId")
    private Integer leagueId;

    @Version
    private Integer version;

    @Column(name="LeagueName")
    private String leagueName;

    @Column(name="NumTeams")
    private Integer numberOfTeams;

    @Column(name="SeasonLength")
    private Integer seasonLength;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Owner owner;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Team> teamList;

    public League () {}

    public League (String leagueName)
    {
        this.setLeagueName(leagueName);
    }

    public League (String leagueName, Owner owner)
    {
        this.setLeagueName(leagueName);
        this.setOwner(owner);
    }

    public Integer getLeagueId()
    {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId)
    {
        this.leagueId = leagueId;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public String getLeagueName()
    {
        return leagueName;
    }

    public void setLeagueName(String leagueName)
    {
        this.leagueName = leagueName;
    }

    public Owner getOwner()
    {
        return owner;
    }

    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }

    public List<Team> getTeamList()
    {
        return teamList;
    }

    public void setTeamList(List<Team> teamList)
    {
        this.teamList = teamList;
    }

    public Integer getNumberOfTeams()
    {
        return numberOfTeams;
    }

    public void setNumberOfTeams(Integer numberOfTeams)
    {
        this.numberOfTeams = numberOfTeams;
    }

    public Integer getSeasonLength()
    {
        return seasonLength;
    }

    public void setSeasonLength(Integer seasonLength)
    {
        this.seasonLength = seasonLength;
    }
}
