var existingData = 0;

function emailExists(emailAddress) {
    console.log(emailAddress + " - First Log");
//        alert("Entered Email Address is "+ emailAddress);
    $.ajax({
        type: 'POST',
        url: "/api/createLeague/email/",
        data: emailAddress,
        dataType: "json",
        success: function (data) {
            //console.log(existingData = JSON.stringify(data));
            console.log(data);
            console.log(data + " - Second Log");
            if (data == false) {
                $('#firstNameForm').show();
                $('#lastNameForm').show();
            } else {
                $('#firstNameForm').hide();
                $('#lastNameForm').hide();
                existingData = data.contactInfoId;
            }
        }
    });

}

function createLeague()
{

    var ownerId = $('#ownerId').val();
    var ownerVersion = $('#ownerVersion').val();
    var contactInfoId = $('#contactInfoId').val();
    var contactInfoVersion = $('#contactInfoVersion').val();

    var emailAddress = $('#email').val();
    var firstName = $('#firstName').val();
    var lastName = $('#lastName').val();
    var leagueName = $('#leagueName').val();
    var numberOfTeams = $("input[name='leagueSizeRadio']:checked").val();
    var seasonLength = $("input[name='seasonLengthRadio']:checked").val();


    var teamName = 'Team';
    var zeroValue = 0;
    var nullValue = null;
    var defaultEmail = 'Enter your Email Address';
    var defaultPhone = 'Enter a Phone Number';
    var defaultFirstName = 'Owner' + teamName, numAdd;
    var defaultLastName = 'unknown';
    var defaultRoster = null;


    if (numberOfTeams == 10)
    {
        //region JSON BUILD 10 Teams
        var league =
        {
            leagueId: nullValue,
            version: nullValue,
            leagueName: leagueName,
            numberOfTeams: numberOfTeams,
            seasonLength: seasonLength,
            owner:
            {
                ownerId: ownerId,
                version: ownerVersion,
                firstName: firstName,
                lastName: lastName,
                contactInfo:
                {
                    contactInfoId: contactInfoId,
                    version: contactInfoVersion,
                    emailAddress: emailAddress,
                    phoneNumber: defaultPhone

                }
            },

            teamList: [ //List of teams based on league team number setting
                {//TEAM 1
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 1', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 2
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 2', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 3
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 3', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 4
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 4', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 5
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 5', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 6
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 6', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 7
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 7', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 8
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 8', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 9
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 9', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 10
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 10', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                }



            ]


        }



        //endregion
    }
    else
    {
        //region JSON BUILD 12 Teams
        var league =
        {
            leagueId: nullValue,
            version: nullValue,
            leagueName: leagueName,
            numberOfTeams: numberOfTeams,
            seasonLength: seasonLength,
            owner:
            {
                ownerId: ownerId,
                version: ownerVersion,
                firstName: firstName,
                lastName: lastName,
                contactInfo:
                {
                    contactInfoId: contactInfoId,
                    version: contactInfoVersion,
                    emailAddress: emailAddress,
                    phoneNumber: defaultPhone

                }
            },

            teamList: [ //List of teams based on league team number setting
                {//TEAM 1
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 1', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 2
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 2', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 3
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 3', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 4
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 4', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 5
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 5', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 6
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 6', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 7
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 7', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 8
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 8', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 9
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 9', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 10
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 10', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue


                },
                {//TEAM 11
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 11', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue

                },
                {//TEAM 12
                    teamId: nullValue,
                    version: nullValue,
                    teamName: teamName + ' 12', //Default team name plus incremented number "Team 1"
                    owner:
                    {
                        ownerId: nullValue,
                        version: nullValue,
                        firstName: defaultFirstName,
                        lastName: defaultLastName,
                        contactInfo:
                        {
                            contactInfoId: nullValue,
                            version: nullValue,
                            emailAddress: defaultEmail,
                            phoneNumber: defaultPhone
                        }
                    },
                    roster: defaultRoster,
                    wins: zeroValue,
                    loses: zeroValue,
                    pointsFor: zeroValue,
                    pointsAgainst: zeroValue
                }
            ]
        }

        //endregion
    }




    console.log(league)

    //synchronous javascript call
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "POST",
        data: JSON.stringify(league),
        url: "/api/createLeague/",
        async: true,
        dataType: "json",
        success: function(data) {
            console.log(data);
            alert('data equals ' + data);
            window.location.href = '/leagueHome/'+ parseInt(data);
            //window.location.href = '/leagueHome';
            //$.ajax({
            //   type: "GET",
            //    url: "/api/leagueHome/"+data
            //});
        }
    });

    //WORKS MINUS REDIRECT LOGIC
    //$.ajax({
    //    headers: {
    //        'Accept': 'application/json',
    //        'Content-Type': 'application/json'
    //    },
    //    type: "POST",
    //    data: JSON.stringify(league),
    //    url: "/api/createLeague/",
    //    async: true,
    //    dataType: "json",
    //    success: function() {
    //        //window.location.reload();
    //        window.location = '/'
    //    }
    //})
}

