function buildTable()
{
    //INITIAL TABLE BUILD ON PAGE LOAD
    $.getJSON('/api/players/', {
        ajax: 'true'
    }, function (data){
        console.log(data)
        $('#player-table').find('tbody').empty();
        $.each(data.content, function (index, single) {

            $('#player-table').find('tbody')
                .append("<tr>" +

                "<td>" + single.position + "</td>" +
                "<td>" + single.displayName + "</td>" +
                "<td>" + single.team + "</td>" +
                "<td>" + "<button class='btn-default form-control ' onclick='viewPlayer(" + single.playerId + ")'>View</button>" + "</td>" +
                "<td>" + "<button class='btn-default form-control ' onclick='draftPlayer(" + single.playerId + ")'>Draft</button>" + "</td>" +
                "</tr>");
        });
    });
}


function buildTableByPosition()
{
    //DISPLAY PLAYERS BY POSITION
    //LIST ALL
    $(".positionSelect").one('click',function(e) {
        e.stopImmediatePropagation();

        var position = $(e.target).attr("href") // activated btn

        if(position == '#ALL')
        {
            position = position.replace("#ALL", "");
            console.log(position);
            $.getJSON('/api/players/', {
                ajax: 'true'
            }, function (data){
                console.log(data);
                $('#player-table').find('tbody').empty();
                $.each(data.content, function (index, single) {
                    console.log(single);

                    $('#player-table').find('tbody')
                        .append("<tr>" +
                            //"<td>" + single.playerId + "</td>" +
                        "<td>" + single.position + "</td>" +
                        "<td>" + single.displayName + "</td>" +
                        "<td>" + single.team + "</td>" +
                        "<td>" + "<button class='btn-default form-control ' onclick='viewPlayer(" + single.playerId + ")'>View</button>" + "</td>" +
                        "<td>" + "<button class='btn-default form-control ' onclick='draftPlayer(" + single.playerId + ")'>Draft</button>" + "</td>" +
                        "</tr>");
                });
            });
        }
        else
        {
            //LIST BY POSITION
            position = position.replace("#", "");
            console.log(position);
            $.getJSON('/api/players/position/'+ position , {
                ajax: 'true'
            }, function (data){
                console.log(data);
                $('#player-table').find('tbody').empty();
                $.each(data.content, function (index, single) {
                    console.log(single);

                    $('#player-table').find('tbody')
                        .append("<tr>" +
                            //"<td>" + single.playerId + "</td>" +
                        "<td>" + single.position + "</td>" +
                        "<td>" + single.displayName + "</td>" +
                        "<td>" + single.team + "</td>" +
                        "<td>" + "<button class='btn-default form-control ' onclick='viewPlayer(" + single.playerId + ")'>View</button>" + "</td>" +
                        "<td>" + "<button class='btn-default form-control ' onclick='draftPlayer(" + single.playerId + ")'>Draft</button>" + "</td>" +
                        "</tr>");
                });
            });
        }


    });
}

function viewPlayer(id)
{
    //retrieve the player with the passed in id
    $.getJSON('/api/players/id/' + id , {
        ajax: 'true'
    }, function(player){
        console.log(player);
        //populate values (hidden and input)
        $('#playerId').val(parseInt(player.id));
        $('#version').val(player.version);
        $('#fname').val(player.fname);
        $('#lname').val(player.lname);
        $('#displayName').val(player.displayName);
        $('#position').val(player.position);
        $('#jersey').val(player.jersey);
        $('#team').val(player.team);
        $('#college').val(player.college);
        $('#height').val(player.height);
        $('#weight').val(player.weight);

        //open the modal
        $('#viewPlayerModal').modal('show')
    })
}