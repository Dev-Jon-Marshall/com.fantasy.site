package com.fantasy.site.domain.DTO;

import com.fantasy.site.domain.NFL_Team;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Jonathan.Marshall on 4/4/2017.
 */
public class NFL_TeamListResponse
{
    @JsonProperty("NFLTeams")
    private List<NFL_Team> NFL_TeamList;

    public List<NFL_Team> getNFL_TeamList()
    {
        return NFL_TeamList;
    }

    public void setNFL_TeamList(List<NFL_Team> NFL_TeamList)
    {
        this.NFL_TeamList = NFL_TeamList;
    }
}
