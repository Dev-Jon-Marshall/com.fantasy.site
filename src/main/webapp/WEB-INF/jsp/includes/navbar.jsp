<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">

            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <%--HOME--%>
            <a class="navbar-brand" href="/createLeague">HOME(Create League)</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <%--<li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>--%>
                <%--Page Links--%>
                <li><a href="/leagueHome">LEAGUE</a></li>
                <li><a href="/teamHome">TEAM</a></li>
                <li><a href="/matchup">MATCHUP</a></li>
                <li><a href="/players">PLAYERS</a></li>
                <li><a href="/draft">DRAFT</a></li>
            </ul>


            <ul class="nav navbar-nav navbar-right">
                <%--Login LInk--%>
                <li><a href="/logout">Logout</a></li>
            </ul>
        </div>
    </div>
</nav>