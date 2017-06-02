<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp" %>

<c:url value="/static/js/draft.js" var="draft" />
<script src="${draft}"></script>

<script>
    //    This JScript code executes on page load
    $(document).ready(function() {
        buildTable();
        document.getElementById("selectALL").addEventListener("click", buildTableByPosition);
        document.getElementById("selectQB").addEventListener("click", buildTableByPosition);
        document.getElementById("selectRB").addEventListener("click", buildTableByPosition);
        document.getElementById("selectWR").addEventListener("click", buildTableByPosition);
        document.getElementById("selectTE").addEventListener("click", buildTableByPosition);
        document.getElementById("selectK").addEventListener("click", buildTableByPosition);
        document.getElementById("selectDEF").addEventListener("click", buildTableByPosition);
//        choosePosition();
//        buildTableByPosition();

    })
</script>


<div class="container-fluid">

    <h2 class="text-center">Draft Center</h2>
    <br/>

    <%--LEFT COLUMN FOR DRAFT ORDER BY TEAM--%>
    <div class="col-sm-2">
        <h5 class="text-center">Draft Order</h5>
        <hr>
        <div class="list-group">
            <a href="#" class="list-group-item active">First Team</a>
            <a href="#" class="list-group-item">Second Team</a>
            <a href="#" class="list-group-item">Third Team</a>
            <a href="#" class="list-group-item ">Fourth Team</a>
            <a href="#" class="list-group-item">Fifth Team</a>
            <a href="#" class="list-group-item">Sixth Team</a>
            <a href="#" class="list-group-item">Seventh Team</a>
            <a href="#" class="list-group-item ">Eighth Team</a>
            <a href="#" class="list-group-item">Ninth Team</a>
            <a href="#" class="list-group-item">Tenth Team</a>
        </div>
    </div>

    <%--CENTER COLUMN DISPLAY OF DRAFTABLE PLAYERS--%>
    <div class="col-sm-7">

        <h5>Players</h5>
        <hr>

        <%--BUTTONS TO SELECT PLAYERS BY POSITION--%>
        <div class="btn-toolbar">
            <div class="btn-group">
                <a href="#ALL" class="btn btn-default positionSelect" id="selectALL" >ALL</a>
                <a href="#QB" class="btn btn-default positionSelect" id="selectQB" >QB</a>
                <a href="#RB" class="btn btn-default positionSelect" id="selectRB" >RB</a>
                <a href="#WR" class="btn btn-default positionSelect" id="selectWR" >WR</a>
                <a href="#TE" class="btn btn-default positionSelect" id="selectTE" >TE</a>
                <a href="#K" class="btn btn-default positionSelect" id="selectK" >K</a>
                <a href="#DEF" class="btn btn-default positionSelect" id="selectDEF" >DEF</a>
            </div>
        </div>

        <%--CREATE TABLE HEADERS--%>
        <table id="player-table" class="table table-striped table-hover">
            <thead>
            <tr>
                <th class="col-sm-1">Pos</th>
                <th class="col-sm-3">Name</th>
                <th class="col-sm-1 ">Team</th>
                <th class="col-sm-1 col-lg-offset-5 ">View Player</th>
                <th class="col-sm-1">Draft Player</th>
            </tr>
            </thead>

            <tbody>

            </tbody>
        </table>

        <%--PAGINATION BUTTONS FOR NOW.....--%>
        <ul class="pagination">
            <li class="disabled"><a href="#">&laquo;</a></li>
            <li class="active"><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li><a href="#">&raquo;</a></li>
        </ul>


    </div>

    <%--RIGHT COLUMN, INDIVIDUAL TEAM ROSTER SPOTS--%>
    <div class="col-sm-3">
        <h5 class="text-center">TEAM ROSTER</h5>
        <hr>
        <form class="form-horizontal">
            <fieldset>
                <div class="form-group">

                    <label for="activeQB" class="col-lg-2 control-label"> QB: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="activeQB" value="starting QB" readonly/>
                    </div>

                    <label for="activeRB1" class="col-lg-2 control-label"> RB: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="activeRB1" value="starting RB" readonly/>
                    </div>

                    <label for="activeRB2" class="col-lg-2 control-label"> RB: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="activeRB2" value="starting RB" readonly/>
                    </div>

                    <label for="activeWR1" class="col-lg-2 control-label"> WR: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="activeWR1" value="starting WR" readonly/>
                    </div>

                    <label for="activeWR2" class="col-lg-2 control-label"> WR: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="activeWR2" value="starting WR" readonly/>
                    </div>

                    <label for="activeTE" class="col-lg-2 control-label"> TE: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="activeTE" value="starting TE" readonly/>
                    </div>

                    <label for="activeK" class="col-lg-2 control-label">  K: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="activeK" value="starting K" readonly/>
                    </div>

                    <label for="activeDEF" class="col-lg-2 control-label">DEF: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="activeDEF" value="starting DEF" readonly/>
                    </div>

                    <div>
                        <label class="col-lg-12 control-label"></label>
                    </div>

                    <label for="reserve1" class="col-lg-2 control-label">RES: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="reserve1" value="reserve player" readonly/>
                    </div>

                    <label for="reserve2" class="col-lg-2 control-label">RES: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="reserve2" value="reserve player" readonly/>
                    </div>

                    <label for="reserve3" class="col-lg-2 control-label">RES: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="reserve3" value="reserve player" readonly/>
                    </div>

                    <label for="reserve4" class="col-lg-2 control-label">RES: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="reserve4" value="reserve player" readonly/>
                    </div>

                    <label for="reserve5" class="col-lg-2 control-label">RES: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="reserve5" value="reserve player" readonly/>
                    </div>

                    <label for="reserve6" class="col-lg-2 control-label">RES: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="reserve6" value="reserve player" readonly/>
                    </div>

                    <label for="reserve7" class="col-lg-2 control-label">RES: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="reserve7" value="reserve player" readonly/>
                    </div>

                    <label for="reserve8" class="col-lg-2 control-label">RES: </label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control btn" id="reserve8" value="reserve player" readonly/>
                    </div>






                </div>
            </fieldset>
        </form>
    </div>












    <%--MODAL FOR PLAYER INFORMATION--%>
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