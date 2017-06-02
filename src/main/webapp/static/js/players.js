function buildTable()
{
    $.getJSON('/api/players/', {
        ajax: 'true'
    }, function (data){
        console.log(data)
        $('#player-table').find('tbody').empty();
        var rows = data.length;
        alert('number of rows' + rows);
        $.each(data.content, function (index, single) {

            $('#player-table').find('tbody')
                .append("<tr>" +

                "<td>" + single.position + "</td>" +
                "<td>" + single.displayName + "</td>" +
                "<td>" + single.team + "</td>" +
                "<td>" + "<button class='btn-default form-control ' onclick='viewPlayer(" + single.playerId + ")'>View</button>" + "</td>" +
                "<td>" + "<button class='btn-default form-control ' onclick='addPlayer(" + single.playerId + ")'>Add</button>" + "</td>" +
                "</tr>");
        });

    });
}


function buildTableByPosition(selectedPosition, page)
{
        var position = selectedPosition;

        var url;
        console.log(position);

            position = position.replace("#", "");
            url = '/api/players/position/' + position + '/' + page;


        //
        //    $.getJSON('/api/players/', {
        //        ajax: 'true'
        //    }, function (data){
        //        console.log(data);
        //        $('#player-table').find('tbody').empty();
        //        $.each(data.content, function (index, single) {
        //            console.log(single);
        //
        //            $('#player-table').find('tbody')
        //                .append("<tr>" +
        //                "<td>" + single.position + "</td>" +
        //                "<td>" + single.displayName + "</td>" +
        //                "<td>" + single.team + "</td>" +
        //                "<td>" + "<button class='btn-default form-control ' onclick='viewPlayer(" + single.playerId + ")'>View</button>" + "</td>" +
        //                "<td>" + "<button class='btn-default form-control ' onclick='addPlayer(" + single.playerId + ")'>Add</button>" + "</td>" +
        //                "</tr>");
        //        });
        //    });
        //}
        //else
        //{
        //    position = position.replace("#", "");
        //    console.log(position);
            $.getJSON(url, {
                ajax: 'true'
            }, function (data){
                console.log(data);

                var total_Rows = data.totalElements;
                var total_Pages = data.totalPages;
                //alert('number of rows ' + total_Rows + ' number of pages ' + total_Pages);

                $('#player-table').find('tbody').empty();
                $.each(data.content, function (index, single) {
                    console.log(single);

                    $('#player-table').find('tbody')
                        .append("<tr>" +
                        "<td>" + single.position + "</td>" +
                        "<td>" + single.displayName + "</td>" +
                        "<td>" + single.team + "</td>" +
                        "<td>" + "<button class='btn-default form-control ' onclick='viewPlayer(" + single.playerId + ")'>View</button>" + "</td>" +
                        "<td>" + "<button class='btn-default form-control ' onclick='addPlayer(" + single.playerId + ")'>Add</button>" + "</td>" +
                        "</tr>");
                });
                $('#pageable-buttons').find('pages').empty();

                var prevPage = +page + -1;
                var clickFunctionPrevious = "onclick='buildTableByPosition(\"" + position + "\"," + prevPage + ")'";
                console.log(clickFunctionPrevious);

                var nextPage = +page + +1;
                var clickFunctionNext = "onclick='buildTableByPosition(\"" + position + "\"," + nextPage + ")'";
                console.log(clickFunctionNext);

                $('#pageable-buttons').find('pages')
                    .html("<li><a href='#'" + clickFunctionPrevious + "class='btn btn-default' id='btnPrev'>Previous</a></li>" +
                    "<li><a href='#'" + clickFunctionNext + "class='btn btn-default' id='btnNext'>Next</a></li>");

                if (page == 0)
                {
                    $('#btnPrev').hide();
                    $('#btnNext').show();
                }
                else if (page == (total_Pages - 1))
                {
                    $('#btnPrev').show();
                    $('#btnNext').hide();
                }
                else
                {
                    $('#btnPrev').show();
                    $('#btnNext').show();
                }

            });



    //});
}
//******* build pagination toolbar with logic at end of table build in build table function...??
// Navigation handler



function pagingFunction()
{
    //var NUMBER_PAGES ; //global? populated when table is built by position?
    //var MAX_ROWS = 10; //handled by my controller atm...
    //var totalRows = 0;
    page = 0; //The vital tid bit I need to pass on...

    //$(".pageSelect").one('click', function(e){

    //    var pageNumber = $(e.target).data(parseInt(pageNumber))
    //});

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
        if (player.weight == 0)
        {$('#weight').val(null);}
        else
        {$('#weight').val(player.weight);}

        //open the modal
        $('#viewPlayerModal').modal('show')
    })
}

function addPlayer(id)
{

}