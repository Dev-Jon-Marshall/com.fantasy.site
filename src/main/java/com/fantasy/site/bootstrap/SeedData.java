package com.fantasy.site.bootstrap;

        import com.fantasy.site.domain.*;
        import com.fantasy.site.repositories.RoleRepository;
        import com.fantasy.site.repositories.UserRepository;
        import com.fantasy.site.services.*;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.context.ApplicationListener;
        import org.springframework.context.event.ContextRefreshedEvent;
        import org.springframework.stereotype.Component;


        import java.util.ArrayList;
        import java.util.HashSet;
        import java.util.List;
        import java.util.Set;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent>
{


    @Autowired
    private ContactInfoService contactInfoService;

    @Autowired
    private LeagueService leagueService;

    @Autowired
    private TeamService teamService;

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RosterService rosterService;

    @Autowired
    private RosterMatchupService rosterMatchupService;

    @Autowired
    private StatsService statsService;

    @Autowired
    private ByeWeekService byeWeekService;

    @Autowired
    private NFL_TeamService nfl_teamService;

    @Autowired
    private PlayerService playerService;

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserService userService;

    @Value("${seed.database}")
    private Boolean seedDatabase;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {

        if (seedDatabase)
        {
            generateLeague_Teams_Owners_Contacts();
            playerService.fetchPlayersFromAPI();
            nfl_teamService.listNFLTeams();
            scheduleService.listScheduleGames();
            byeWeekService.listByeWeeksAndTeams();

        }

    }

    private void generateLeague_Teams_Owners_Contacts()
    {
        ContactInfo contact1 = new ContactInfo();
        contact1.setEmailAddress("bob@bobsMail.com");
        contact1.setPhoneNumber("654-456-8524");

        ContactInfo contact2 = new ContactInfo();
        contact2.setEmailAddress("Jim@JimmyJohn.com");
        contact2.setPhoneNumber("458-856-4528");

        ContactInfo contact3 = new ContactInfo();
        contact3.setEmailAddress("Jake@JakeEchan.com");
        contact3.setPhoneNumber("320-456-8521");

        ContactInfo contact4 = new ContactInfo();
        contact4.setEmailAddress("fantasywoes@loser.com");
        contact4.setPhoneNumber("321-856-7895");

        ContactInfo contact5 = new ContactInfo();
        contact5.setEmailAddress("bigwinner@compensator.com");
        contact5.setPhoneNumber("741-852-9631");

        ContactInfo contact6 = new ContactInfo();
        contact6.setEmailAddress("chicks@realHOTmail.com");
        contact6.setPhoneNumber("784-856-1235");

        Role admin = new Role();
        admin.setName("ADMIN");
        roleRepository.save(admin);

        Role user = new Role();
        user.setName("USER");
        roleRepository.save(user);


        User user1 = new User();
        user1.setUsername("user1");
        user1.setPassword("123");
        userService.save(user1);

        User user2 = new User();
        user2.setUsername("user2");
        user2.setPassword("123");
        userService.save(user2);

        User user3 = new User();
        user3.setUsername("user3");
        user3.setPassword("123");
        userService.save(user3);

        User user4 = new User();
        user4.setUsername("user4");
        user4.setPassword("123");
        userService.save(user4);

        User user5 = new User();
        user5.setUsername("user5");
        user5.setPassword("123");
        userService.save(user5);

        User user6 = new User();
        user6.setUsername("user6");
        user6.setPassword("123");
        userService.save(user6);


        Owner owner1 = new Owner();
        owner1.setFirstName("Bob");
        owner1.setLastName("Baller");
        owner1.setContactInfo(contact1);
        owner1.setUser(user1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jimmy");
        owner2.setLastName("John");
        owner2.setContactInfo(contact2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Jake");
        owner3.setLastName("Chan");
        owner3.setContactInfo(contact3);

        Owner owner4 = new Owner();
        owner4.setFirstName("Bum");
        owner4.setLastName("Player");
        owner4.setContactInfo(contact4);

        Owner owner5 = new Owner();
        owner5.setFirstName("Bigs");
        owner5.setLastName("Johnson");
        owner5.setContactInfo(contact5);

        Owner owner6 = new Owner();
        owner6.setFirstName("Chica");
        owner6.setLastName("Aphrodite");
        owner6.setContactInfo(contact6);


        List<Team> teamList = new ArrayList<>();
        teamList.add(new Team("Bobs-Ballers", owner1,0,0,0,0));
        teamList.add(new Team("BallersX2", owner2,0,0,0,0));
        teamList.add(new Team("Basket Ballers", owner3,0,0,0,0));
        teamList.add(new Team("Low Ballers", owner4,0,0,0,0));
        teamList.add(new Team("Blue Ballers", owner5,0,0,0,0));
        teamList.add(new Team("Ate Ballers", owner6,0,0,0,0));


        League league1 = new League();
        league1.setLeagueName("Ballers League");
        league1.setOwner(owner1);
        league1.setTeamList(teamList);

//        List<Team> loginTeamList = new ArrayList<>();
//        loginTeamList.add(teamList[1]);
//
//        List<League> loginLeagueList = new ArrayList<>();

        leagueService.saveLeague(league1);


    }

//    private void generateDefaultLogins()
//    {
//        User user1 = new User();
//        user1.setUserName("user1");
//        user1.setPassword("password");
//        user1.setEnabled("1");
//        user1.
//
//        UserRole role1 = new UserRole();
//        role1.setRole("USER");
//        role1.setUserId(user1);
//        userRoleRepository.save(role1);
//    }
}
