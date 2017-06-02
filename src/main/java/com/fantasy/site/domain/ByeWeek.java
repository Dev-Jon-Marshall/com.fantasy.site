package com.fantasy.site.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class ByeWeek
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "byeWeekId")
    private Integer byeWeekId;

    @Version
    private Integer version;

    @Column(name = "team")
    private String team;

    @Column(name = "byeWeek")
    private String byeWeek;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<NFL_Team> nfl_teamList;

    public ByeWeek() {}

    public ByeWeek(Integer byeWeekId, List<NFL_Team> nfl_teamList)
    {
        this.byeWeekId = byeWeekId;
        this.nfl_teamList = nfl_teamList;
    }


    public Integer getByeWeekId()
    {
        return byeWeekId;
    }

    public void setByeWeekId(Integer byeWeekId)
    {
        this.byeWeekId = byeWeekId;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public String getTeam()
    {
        return team;
    }

    public void setTeam(String team)
    {
        this.team = team;
    }

    public String getByeWeek()
    {
        return byeWeek;
    }

    public void setByeWeek(String byeWeek)
    {
        this.byeWeek = byeWeek;
    }

    public List<NFL_Team> getNfl_teamList()
    {
        return nfl_teamList;
    }

    public void setNfl_teamList(List<NFL_Team> nfl_teamList)
    {
        this.nfl_teamList = nfl_teamList;
    }
}
