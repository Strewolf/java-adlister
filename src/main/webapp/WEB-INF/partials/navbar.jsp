<%--<%@ page import="com.codeup.adlister.models.User" %>--%>
<%--<%@ page import="com.codeup.adlister.dao.Users" %>--%>
<%--<nav class="navbar navbar-default">--%>
<%--    <div class="container-fluid">--%>
<%--        <!-- Brand and toggle get grouped for better mobile display -->--%>
<%--        <div class="navbar-header">--%>
<%--            <a class="navbar-brand" href="/">Home</a>--%>
<%--        </div>--%>
<%--        <div class="navbar-header">--%>
<%--            <a class="navbar-brand" href="/ads">Adlister</a>--%>
<%--        </div>--%>
<%--        <% if (session != null && session.getAttribute("user") != null) { %>--%>
<%--        <ul class="nav navbar-nav navbar-right">--%>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link" href="/profile">Welcome, ${sessionScope.user.username}!</a>--%>
<%--            </li>--%>
<%--            <li class="dropdown">--%>
<%--                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Options<span class="caret"></span></a>--%>
<%--                <ul class="dropdown-menu">--%>
<%--                    <li><a href="/ads/create">Create Ad</a></li>--%>
<%--                    <li><a href="/ads">View Ads</a></li>--%>
<%--                </ul>--%>
<%--            </li>--%>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link" href="/logout">Logout</a>--%>
<%--            </li>--%>
<%--        </ul>--%>
<%--        <% } else { %>--%>
<%--        <ul class="nav navbar-nav navbar-right">--%>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link" href="/login">Login</a>--%>
<%--            </li>--%>
<%--        </ul>--%>
<%--        <% } %>--%>
<%--    </div><!-- /.navbar-collapse -->--%>
<%--    </div><!-- /.container-fluid -->--%>
<%--    <script src="https://code.jquery.com/jquery-3.6.0.min.js"--%>
<%--            integrity="sha384-XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"--%>
<%--            crossorigin="anonymous"></script>--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"--%>
<%--            integrity="sha384-XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"--%>
<%--            crossorigin="anonymous"></script>--%>










</nav>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">Home</a>
        <a class="navbar-brand" href="/ads">Adlister</a>

            <% if (session != null && session.getAttribute("user") != null) { %>
        <ul class="nav navbar-nav navbar-right">
            <li class="nav-item">
                <a class="nav-link" href="/profile">Welcome, ${sessionScope.user.username}!</a>
            </li>
        </ul>
        <ul class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span>Options</span>
        </ul>



<%--        was commented the whole time--%>
<%--        <div class="collapse navbar-collapse" id="navbarNavDropdown">--%>
<%--            <ul class="navbar-nav me-auto mb-2 mb-lg-0">--%>
<%--            </ul>--%>
<%--            <ul class="navbar-nav">--%>





                <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <div class="nav-item dropdown">
                    <a class="dropdown-item" href="/ads/create">Create Ad</a>
                    <a class="dropdown-item" href="/ads">View Ads</a>
                    <a class="dropdown-item" href="/logout">Logout</a>
<%--                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">--%>
<%--                        Options--%>
<%--                    </a>--%>
<%--                    <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">--%>
<%--                        <li><a class="dropdown-item" href="/ads/create">Create Ad</a></li>--%>
<%--                        <li><a class="dropdown-item" href="/ads">View Ads</a></li>--%>
<%--                        <li><a class="dropdown-item" href="/logout">Logout</a></li>--%>
<%--                    </ul>--%>
                </div>




<%--                    was commented the whole time--%>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link" href="/profile">Welcome, ${sessionScope.user.username}!</a>--%>
<%--                </li>--%>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link" href="/logout">Logout</a>--%>
<%--                </li>--%>






            </ul>
            <% } else { %>
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="/login">Login</a>
                </li>
            </ul>
            <% } %>
        </div>
    </div>
</nav>