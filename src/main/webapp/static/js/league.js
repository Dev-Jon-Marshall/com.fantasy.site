
function buildTable()
{
    $.getJSON('/api/leagueHome/', {
        ajax: 'true'
    }, function (data){
        console.log(data)
        $('#league-table').find('tbody').empty();
        //var rows = data.length;
        //alert('number of rows' + rows);
        $.each(data.content, function (index, single) {

            $('#league-table').find('tbody')
                .append("<tr>" +

                "<td>" + single.teamId + "</td>" +
                "<td>" + single.teamName + "</td>" +
                "<td>" + single.wins + "</td>" +
                "<td>" + single.loses + "</td>" +
                "<td>" + single.pointsFor + "</td>" +
                "<td>" + single.pointsAgainst + "</td>" +
                    //"<td>" + "<button class='btn-default form-control ' onclick='viewPlayer(" + single.playerId + ")'>View</button>" + "</td>" +
                    //"<td>" + "<button class='btn-default form-control ' onclick='addPlayer(" + single.playerId + ")'>Add</button>" + "</td>" +
                "</tr>");
        });

    });
}

