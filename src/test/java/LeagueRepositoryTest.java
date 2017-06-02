import com.fantasy.site.Application;
import com.fantasy.site.domain.ContactInfo;
import com.fantasy.site.domain.League;
import com.fantasy.site.domain.Owner;
import com.fantasy.site.domain.Team;
import com.fantasy.site.repositories.ContactInfoRepository;
import com.fantasy.site.repositories.LeagueRepository;
import com.fantasy.site.services.ContactInfoService;
import com.fantasy.site.services.LeagueService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by Jonathan.Marshall on 5/4/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class LeagueRepositoryTest
{
    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private LeagueService leagueService;

//    @Before
//    public void setup()
//    {
//        Integer zeroValue = 0;
//
//        ContactInfo ownerContact = new ContactInfo();
//        ownerContact.setEmailAddress("League@Owner.com");
//        ownerContact.setPhoneNumber(null);
//
//        ContactInfo defaultContact = new ContactInfo();
//        defaultContact.setEmailAddress("default@owner.com");
//        defaultContact.setPhoneNumber(null);
//
//        Owner leagueOwner = new Owner();
//        leagueOwner.setFirstName("OwnerFirstName");
//        leagueOwner.setLastName("OwnerLastName");
//        leagueOwner.setContactInfo(ownerContact);
//
//        Owner defaultOwner = new Owner();
//        defaultOwner.setFirstName("defaultFirstName");
//        defaultOwner.setLastName("defaultLastName");
//        defaultOwner.setContactInfo(defaultContact);
//
//        Team ownerTeam = new Team();
//        ownerTeam.setRoster(null);
//        ownerTeam.setTeamName("OwnerTeam");
//        ownerTeam.setLoses(zeroValue);
//        ownerTeam.setWins(zeroValue);
//        ownerTeam.setPointsAgainst(zeroValue);
//        ownerTeam.setPointsFor(zeroValue);
//        ownerTeam.setOwner(leagueOwner);
//
//        Team defaultTeam = new Team();
//        defaultTeam.setRoster(null);
//        defaultTeam.setTeamName("DefaultTeam");
//        defaultTeam.setLoses(zeroValue);
//        defaultTeam.setWins(zeroValue);
//        defaultTeam.setPointsAgainst(zeroValue);
//        defaultTeam.setPointsFor(zeroValue);
//        defaultTeam.setOwner(defaultOwner);
//
//        List<Team> teamList = new ArrayList<>();
//        teamList.add(ownerTeam);
//        teamList.add(defaultTeam);
//
//        League league = new League();
//        league.setLeagueName("Test League");
//        league.setOwner(leagueOwner);
//        league.setTeamList(teamList);
//
//        leagueService.saveLeague(league);
//
//    }


    @Test
    public void createLeague()
    {
        Integer zeroValue = 0;

        ContactInfo ownerContact = new ContactInfo();
        ownerContact.setEmailAddress("League@Owner.com");
        ownerContact.setPhoneNumber(null);

        ContactInfo defaultContact = new ContactInfo();
        defaultContact.setEmailAddress("default@owner.com");
        defaultContact.setPhoneNumber(null);

        Owner leagueOwner = new Owner();
        leagueOwner.setFirstName("OwnerFirstName");
        leagueOwner.setLastName("OwnerLastName");
        leagueOwner.setContactInfo(ownerContact);

        Owner defaultOwner = new Owner();
        defaultOwner.setFirstName("defaultFirstName");
        defaultOwner.setLastName("defaultLastName");
        defaultOwner.setContactInfo(defaultContact);

        Team ownerTeam = new Team();
        ownerTeam.setRoster(null);
        ownerTeam.setTeamName("OwnerTeam");
        ownerTeam.setLoses(zeroValue);
        ownerTeam.setWins(zeroValue);
        ownerTeam.setPointsAgainst(zeroValue);
        ownerTeam.setPointsFor(zeroValue);
        ownerTeam.setOwner(leagueOwner);

        Team defaultTeam = new Team();
        defaultTeam.setRoster(null);
        defaultTeam.setTeamName("DefaultTeam");
        defaultTeam.setLoses(zeroValue);
        defaultTeam.setWins(zeroValue);
        defaultTeam.setPointsAgainst(zeroValue);
        defaultTeam.setPointsFor(zeroValue);
        defaultTeam.setOwner(defaultOwner);

        List<Team> teamList = new ArrayList<>();
        teamList.add(ownerTeam);
        teamList.add(defaultTeam);

        League league = new League();
        league.setLeagueName("Test League");
        league.setOwner(leagueOwner);
        league.setTeamList(teamList);

        leagueService.saveLeague(league);


        assertNotNull(league.getLeagueId());
        assertNotNull(ownerTeam.getTeamId());
        assertNotNull(leagueOwner.getOwnerId());
        assertNotNull(ownerContact.getContactInfoId());


    }
}
