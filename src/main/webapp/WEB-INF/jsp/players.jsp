<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp" %>

<c:url value="/static/js/players.js" var="players" />
<script src="${players}"></script>

<script>
    //    This JScript code executes on page load
    $(document).ready(function() {
        //Load All players by default
        buildTableByPosition('#ALL', 0);

    })
</script>

<style>
    input[readonly]{color: white; background: #202020; border: none}
</style>

<div class="container">

    <h2 class="text-center">Player List</h2>
    <hr>
    <%--Add Search Function--%>
    <%--<button onclick="findPlayer()" class="btn btn-primary">Search</button>--%>
    <%--Query pass string... findByFirstNameContainsStringOrLastNameContainsString--%>

    <div class="btn-toolbar">
        <div class="btn-group">
            <a href="#ALL" class="btn btn-default positionSelect" id="selectALL" onclick="buildTableByPosition('#ALL', 0)">ALL</a>
            <a href="# QB" class="btn btn-default positionSelect" id="selectQB" onclick="buildTableByPosition('#QB', 0)">QB</a>
            <a href="# RB" class="btn btn-default positionSelect" id="selectRB" onclick="buildTableByPosition('#RB', 0)">RB</a>
            <a href="# WR" class="btn btn-default positionSelect" id="selectWR" onclick="buildTableByPosition('#WR', 0)">WR</a>
            <a href="# TE" class="btn btn-default positionSelect" id="selectTE" onclick="buildTableByPosition('#TE', 0)">TE</a>
            <a href="# K " class="btn btn-default positionSelect" id="selectK" onclick="buildTableByPosition('#K', 0)">K</a>
            <a href="#DEF" class="btn btn-default positionSelect" id="selectDEF" onclick="buildTableByPosition('#DEF', 0)">DEF</a>
        </div>
    </div>


    <table id="player-table" class="table table-striped table-hover">
        <thead>
            <tr>
                <th>Pos</th>
                <th>Name</th>
                <th>Team</th>
                <th>View Player</th>
                <th>Add Player</th>
            </tr>
        </thead>

        <tbody>

        </tbody>
    </table>

    <ul class=" col-sm-12" id="pageable-buttons">
        <pages class="pagination list-inline">

        </pages>
    </ul>


    <%--<ul class="pagination"  name="page" >--%>
        <%--<li class="active = true"><a href="#">&laquo;</a></li>--%>
        <%--<li><a href="#1" class="btn btn-default pageSelect" id="page"  data-pageNumber="1" value="1">1</a></li>--%>
        <%--<li><a href="#2" class="btn btn-default pageSelect" id="page" value="2">2</a></li>--%>
        <%--<li><a href="#3" class="btn btn-default pageSelect" id="page" value="3">3</a></li>--%>
        <%--<li><a href="#4" class="btn btn-default pageSelect" id="page" value="4">4</a></li>--%>
        <%--<li><a href="#5" class="btn btn-default pageSelect" id="page" value="5">5</a></li>--%>
        <%--<li><a href="#">&raquo;</a></li>--%>
    <%--</ul>--%>





    <div class="modal" id="viewPlayerModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close text-white" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h3 class="modal-title text-white">Player Profile</h3>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal">
                        <fieldset>
                            <hidden id="playerId"/>
                            <hidden id="version"/>
                            <%--<hidden id="fname"/>--%>
                            <%--<hidden id="lname"/>--%>

                            <div class="form-group">
                                <label for="displayName" class="col-lg-3 control-label">Name:</label>
                                <div class="col-lg-9">
                                    <input type="text" class="form-control" id="displayName" placeholder="Name" readonly>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="position" class="col-lg-3 control-label">Position:</label>
                                <div class="col-lg-3">
                                    <input type="text" class="form-control" id="position" placeholder="Pos" readonly>
                                </div>

                                <label for="jersey" class="col-lg-3 control-label">#:</label>
                                <div class="col-lg-3">
                                    <input type="text" class="form-control" id="jersey" placeholder="00" readonly>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="team" class="col-lg-3 control-label">Team:</label>
                                <div class="col-lg-3">
                                    <input type="text" class="form-control" id="team" placeholder="Team" readonly>
                                </div>

                                <label for="college" class="col-lg-3 control-label">College:</label>
                                <div class="col-lg-3">
                                    <input type="text" class="form-control" id="college" placeholder="---" readonly>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="height" class="col-lg-3 control-label">Height:</label>
                                <div class="col-lg-3">
                                    <input type="text" class="form-control" id="height" placeholder="---" readonly>
                                </div>

                                <label for="weight" class="col-lg-3 control-label">Weight:</label>
                                <div class="col-lg-3">
                                    <input type="text" class="form-control" id="weight" placeholder="---" readonly>
                                </div>
                            </div>

                        </fieldset>
                    </form>


                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <%--<button type="button" class="btn btn-primary" onclick="saveEmployee()">Save changes</button>--%>
                </div>
            </div>
        </div>
    </div>







</div>



<%@ include file="includes/footer.jsp" %>