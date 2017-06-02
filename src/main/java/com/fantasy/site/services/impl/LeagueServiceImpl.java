package com.fantasy.site.services.impl;

import com.fantasy.site.domain.ContactInfo;
import com.fantasy.site.domain.League;
import com.fantasy.site.domain.Owner;
import com.fantasy.site.repositories.LeagueRepository;
import com.fantasy.site.services.ContactInfoService;
import com.fantasy.site.services.LeagueService;
import com.fantasy.site.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
@Service
public class LeagueServiceImpl implements LeagueService
{
    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private ContactInfoService contactInfoService;

    @Autowired
    private OwnerService ownerService;

    @Override
    public Iterable<League> listAllLeagues()
    {
        return leagueRepository.findAll();
    }

    @Override
    public League getLeagueById(Integer id)
    {
        return leagueRepository.findOne(id);
    }

    @Override
    public League saveLeague(League league)
    {
        //assign proposed new leagues owner email address to emailAddress variable
        String emailAddress = league.getOwner().getContactInfo().getEmailAddress();

        //edit out the JSON serialization and place "@" symbol in email
        emailAddress = emailAddress.replace("%40", "@");

        //region This region edited out "=" on end of email address during serialization.
        //int index = emailAddress.length();
        //emailAddress = emailAddress.substring(0, index - 1);
        //endregion

        //attempt to create a contact info object based on email address
        ContactInfo ci = contactInfoService.getContactInfoByEmailAddress(emailAddress); //league.getOwner().getContactInfo().getEmailAddress()

        //check if created contact info object is null or not
        if(ci == null)
        {
            //if contact info is null then create new league with new owner and contacts
            leagueRepository.save(league);
        }
        else
        {
            //contact info was not null so existing owner will be assigned to new league
            Owner owner = ownerService.findByContactInfoContactInfoId(ci.getContactInfoId());
            league.setOwner(owner);
            leagueRepository.save(league);
        }

        return leagueRepository.save(league);
    }

    @Override
    public Iterable<League> saveLeagueList(Iterable<League> leagueIterable)
    {
        return leagueRepository.save(leagueIterable);
    }

    @Override
    public void deleteLeague(Integer id)
    {
        leagueRepository.delete(id);
    }



    //CUSTOM METHODS
    @Override
    public Integer getLeagueIdByLeagueName(String leagueName)
    {
        //Use new league name to find league ID
        League league = leagueRepository.findByLeagueName(leagueName);

        //Return newly created leagues ID to controller
        return league.getLeagueId();
    }
}
