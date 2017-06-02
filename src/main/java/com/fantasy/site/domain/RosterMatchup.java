package com.fantasy.site.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)

public class RosterMatchup
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "matchUpId")
    private Integer matchUpId;

    @Version
    private Integer version;

    @Column(name="teamA")
    private String teamA;

    @Column(name="teamB")
    private String teamB;

    public RosterMatchup () {}

    public Integer getMatchUpId()
    {
        return matchUpId;
    }

    public void setMatchUpId(Integer matchUpId)
    {
        this.matchUpId = matchUpId;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public String getTeamA()
    {
        return teamA;
    }

    public void setTeamA(String teamA)
    {
        this.teamA = teamA;
    }

    public String getTeamB()
    {
        return teamB;
    }

    public void setTeamB(String teamB)
    {
        this.teamB = teamB;
    }
}
