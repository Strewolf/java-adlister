<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/">Home</a>
        </div>
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">Adlister</a>
        </div>
        <% if (session != null && session.getAttribute("user") != null) { %>
        <ul class="nav navbar-nav navbar-right">
            <li class="nav-item">
                <a class="nav-link" href="/profile">Welcome <%= session.getAttribute("user") %></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/logout">Logout</a>
            </li>
        </ul>
        <% } else { %>
        <ul class="nav navbar-nav navbar-right">
            <li class="nav-item">
                <a class="nav-link" href="/login">Login</a>
            </li>
        </ul>
        <% } %>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>