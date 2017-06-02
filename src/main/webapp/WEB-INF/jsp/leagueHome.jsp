<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp" %>

<c:url value="/static/js/league.js" var="league"/>
<script src="${league}"></script>

<script>
    //    This JScript code executes on page load
    $(document).ready(function () {
//        alert.('League Id' + leagueId);
//        $('#firstNameForm').hide();
//        $('#lastNameForm').hide();


    });

</script>

<style>

</style>

<div class="container col-sm-12">

    <%--Insert League name in h2 text field on page load--%>
    <h2 class="text-center">League Home</h2>
    <hr>

    <div class="col-sm-2">
        <h4 class="text-center">Left container</h4>

    </div>

    <div class="col-sm-8">

        <table id="league-table" class="table table-striped table-hover">
            <thead>
            <tr>
                <th class="col-sm-1">Rank</th>
                <%--Link to Team Page--%>
                <th class="col-sm-6">Team Name</th>
                <th class="col-sm-1">W</th>
                <th class="col-sm-1">L</th>
                <th class="col-sm-1">PF</th>
                <th class="col-sm-1">PA</th>
            </tr>
            </thead>

            <tbody>

            </tbody>
        </table>
    </div>

    <div class="col-sm-2">
        <h4 class="text-center">Right container</h4>
    </div>

</div>

<%@ include file="includes/footer.jsp" %>