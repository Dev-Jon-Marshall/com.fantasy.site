package com.fantasy.site.domain.VO;

import com.fantasy.site.domain.ContactInfo;
import com.fantasy.site.domain.League;
import com.fantasy.site.domain.Owner;
import com.fantasy.site.domain.Team;

/**
 * Created by Jonathan.Marshall on 5/3/2017.
 */
public class CreateLeagueVO
{
    private ContactInfo contactInfo;
    private Owner owner;
    private League league;
    private Team team;



    public CreateLeagueVO(){}



    public ContactInfo getContactInfo()
    {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo)
    {
        this.contactInfo = contactInfo;
    }

    public Owner getOwner()
    {
        return owner;
    }

    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }

    public League getLeague()
    {
        return league;
    }

    public void setLeague(League league)
    {
        this.league = league;
    }

    public Team getTeam()
    {
        return team;
    }

    public void setTeam(Team team)
    {
        this.team = team;
    }

}
