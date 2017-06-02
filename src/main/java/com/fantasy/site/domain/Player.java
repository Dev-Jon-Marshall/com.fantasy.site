package com.fantasy.site.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)

public class Player
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "playerId")
    private Integer playerId;

    @Version
    private Integer version;

    @Column(name="active")
    private Integer active;

    @Column(name="jersey")
    private Integer jersey;

    @Column(name="lname")
    private String lname;

    @Column(name="fname")
    private String fname;

    @Column(name="displayName")
    private String displayName;

    @Column(name="position")
    private String position;

    @Column(name="height")
    private String height;

    @Column(name="weight")
    private double weight;

    @Column(name="dob")
    private String dob;

    @Column(name="college")
    private String college;

    @Column(name="team")
    private String team;

    @OneToOne(cascade = CascadeType.ALL)
    private NFL_Team nfl_team;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Stats> statsList;


    public Player () {}


    public Integer getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(Integer playerId)
    {
        this.playerId = playerId;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public Integer getActive()
    {
        return active;
    }

    public void setActive(Integer active)
    {
        this.active = active;
    }

    public Integer getJersey()
    {
        return jersey;
    }

    public void setJersey(Integer jersey)
    {
        this.jersey = jersey;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public String getHeight()
    {
        return height;
    }

    public void setHeight(String height)
    {
        this.height = height;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getDob()
    {
        return dob;
    }

    public void setDob(String dob)
    {
        this.dob = dob;
    }

    public String getCollege()
    {
        return college;
    }

    public void setCollege(String college)
    {
        this.college = college;
    }

    public NFL_Team getNfl_team()
    {
        return nfl_team;
    }

    public void setNfl_team(NFL_Team nfl_team)
    {
        this.nfl_team = nfl_team;
    }

    public List<Stats> getStatsList()
    {
        return statsList;
    }

    public void setStatsList(List<Stats> statsList)
    {
        this.statsList = statsList;
    }

    public String getTeam()
    {
        return team;
    }

    public void setTeam(String team)
    {
        this.team = team;
    }
}
