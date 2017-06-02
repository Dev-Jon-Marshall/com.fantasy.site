<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp" %>

<c:url value="/static/js/createLeague.js" var="createLeague"/>
<script src="${createLeague}"></script>

<script>
    //    This JScript code executes on page load
    $(document).ready(function () {

        $('#firstNameForm').hide();
        $('#lastNameForm').hide();
    });

</script>

<style>

</style>

<div class="container">

    <h2 class="text-center">Create League</h2>
    <hr>

    <form class="form-horizontal col-lg-6 col-lg-offset-3">
        <br>
        <fieldset>
            <hidden id="ownerId"/>
            <hidden id="ownerVersion"/>
            <hidden id="contactInfoId"/>
            <hidden id="contactInfoVersion"/>

            <%--!||REGISTERED EMAIL ADDRESS--%>
            <div class="form-group">
                <label for="email" class="col-lg-3 control-label">Email</label>

                <div class="col-lg-9">
                    <input type="text" class="form-control" id="email" placeholder="Email"
                           onchange="emailExists(this.value)">
                    <%--document.getElementsByName('email')--%>
                </div>
            </div>

            <%--HIDE IF EMAIL ALREADY EXISTS!!--%>
            <div class="form-group" id="firstNameForm">
                <label for="firstName" class="col-lg-3 control-label">First Name</label>

                <div class="col-lg-9">
                    <input type="text" class="form-control" id="firstName" placeholder="First Name">
                </div>
            </div>
            <div class="form-group" id="lastNameForm">
                <label for="lastName" class="col-lg-3 control-label">Last Name</label>

                <div class="col-lg-9">
                    <input type="text" class="form-control" id="lastName" placeholder="Last Name">
                </div>

            </div>

            <%--TEAM NAME--%>
            <div class="form-group">
                <label for="leagueName" class="col-lg-3 control-label">League Name</label>

                <div class="col-lg-9">
                    <input type="text" class="form-control" id="leagueName" placeholder="League Name">
                </div>
            </div>

            <%--RADIOS FOR TEAMS AND WEEKS LENGTH--%>
            <div class="form-group">
                <label class="col-lg-3 control-label"># Teams</label>

                <div class="col-lg-9">
                    <div class="radio">
                        <label>
                            <input type="radio" name="leagueSizeRadio" id="numTeams1" value="10">
                            10 Team League
                        </label>
                    </div>
                    <div class="radio">
                        <label>
                            <input type="radio" name="leagueSizeRadio" id="numteams2" value="12" checked="">
                            12 Team League
                        </label>
                    </div>
                </div>
            </div>
            <br>

            <div class="form-group">
                <label class="col-lg-3 control-label">Season Length</label>

                <div class="col-lg-9">
                    <div class="radio">
                        <label>
                            <input type="radio" name="seasonLengthRadio" id="numWeeks1" value="10">
                            10 Week Season
                        </label>
                    </div>
                    <div class="radio">
                        <label>
                            <input type="radio" name="seasonLengthRadio" id="numWeeks2" value="13" checked="">
                            13 Week Season
                        </label>
                    </div>
                </div>
            </div>
            <br>

        </fieldset>
    </form>
    <%--BUTTONS--%>
    <div class="form-group">
        <div class="col-lg-9 col-lg-offset-3">
            <button type="reset" class="btn btn-default">Cancel</button>
            <button class="btn btn-primary" onclick="createLeague()">Create</button>
        </div>
    </div>


</div>


<%@ include file="includes/footer.jsp" %>