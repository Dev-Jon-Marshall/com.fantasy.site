package com.fantasy.site.rest;

import com.fantasy.site.domain.ContactInfo;
import com.fantasy.site.domain.League;
import com.fantasy.site.services.ContactInfoService;
import com.fantasy.site.services.LeagueService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jonathan.Marshall on 5/3/2017.
 */

@RestController
@RequestMapping("/api/createLeague")
public class CreateLeagueRest
{
    private Logger log = Logger.getLogger(CreateLeagueRest.class);

    @Autowired
    private LeagueService leagueService;

    @Autowired
    private ContactInfoService contactInfoService;

    //GET BY ID League
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public League getById(@PathVariable int id)
    {
        return leagueService.getLeagueById(id);
    }

    //GET BY Email in ContactInfo
    @RequestMapping(value = "/email/", method = RequestMethod.POST)
    public boolean getByEmail(@RequestBody String emailAddress)
    {

        //System.out.println(emailAddress);

        emailAddress = emailAddress.replace("%40", "@");
        int index = emailAddress.length();
        emailAddress = emailAddress.substring(0, index - 1);
        //System.out.println(emailAddress);


        ContactInfo ci = contactInfoService.getContactInfoByEmailAddress(emailAddress);
        if(ci == null){
            return false;
        } else {
            return true;
        }

    }

    //POST SAVE
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public League save(@RequestBody League league)
    {
         //Save League
        return leagueService.saveLeague(league);
//        league.getLeagueId();
//        //Fetch League Id Based on League Name
//        String leagueName = league.getLeagueName();
//
//        //Return League ID Number to be used for page redirect
//        return leagueService.getLeagueIdByLeagueName(leagueName);

    }

//    //POST SAVE
//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public League save(@RequestBody League league)
//    {
//        String emailAddress = league.getOwner().getContactInfo().getEmailAddress();
//
//        emailAddress = emailAddress.replace("%40", "@");
////        int index = emailAddress.length();
////        emailAddress = emailAddress.substring(0, index - 1);
//
//        ContactInfo ci = contactInfoService.getContactInfoByEmailAddress(emailAddress); //league.getOwner().getContactInfo().getEmailAddress()
//
//        if(ci == null)
//        {
//
//            return leagueService.saveLeague(league);
//        }
//        else
//        {
//            Owner owner = ownerService.findByContactInfoContactInfoId(ci.getContactInfoId());
//            league.setOwner(owner);
//            return leagueService.saveLeague(league);
//        }
//
//
//
//    }
}