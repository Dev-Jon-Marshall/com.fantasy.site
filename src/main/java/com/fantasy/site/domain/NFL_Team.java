package com.fantasy.site.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class NFL_Team
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nflTeamId")
    private Integer nflTeamId;

    @Version
    private Integer version;

    @Column(name = "code")
    private String code;

    @Column(name="fullName")
    private String fullName;

    @Column(name="shortName")
    private String shortName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Schedule> scheduleList;


    public NFL_Team () {}

    public NFL_Team (String code, String fullName, String shortName)
    {
        this.setCode(code);
        this.setFullName(fullName);
        this.setShortName(shortName);
    }


    public Integer getNflTeamId()
    {
        return nflTeamId;
    }

    public void setNflTeamId(Integer nflTeamId)
    {
        this.nflTeamId = nflTeamId;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public String getShortName()
    {
        return shortName;
    }

    public void setShortName(String shortName)
    {
        this.shortName = shortName;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public List<Schedule> getScheduleList()
    {
        return scheduleList;
    }

    public void setScheduleList(List<Schedule> scheduleList)
    {
        this.scheduleList = scheduleList;
    }
}
