<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 11/14/2021
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

<%--    <link rel="stylesheet" href="./assets/css/signin.css">--%>
    <link rel="stylesheet" href="./assets/css/update.css">
    <link rel="stylesheet" href="./assets/font/fontawesome-free-5.15.4-web%20(1)/fontawesome-free-5.15.4-web/css/all.min.css">

    <title>Title</title>
</head>
<body>
<div class="main">
    <div class="container">
        <form id="form" class="form" action="/Adev/login" method="post">



            <div class="header">
                <h3>Sign In</h3>
            </div>
            <div class="alert alert-danger" role="alert" style="color: red">
                <p>${mess}</p>
            </div>

            <div class="user">
                <i class="fas fa-user"></i>
                <input type="text" placeholder="UserName" name="username"
value="${nameuser}"
                >

            </div>
            <div class="pass">

                <i class="fas fa-key"></i>
                <input id="ip-pass" type="password" placeholder="Password" name="password">
                <i class="icon-eyes fas fa-eye"></i>
            </div>
            <div class="button">
                <input type="submit" value="Sign In" readonly>
            </div>
            <div class="social">
                <p>Or Login with</p>
                <div class="icon-social">
                    <i class="fab fa-facebook-f"></i>
                    <i class="fab fa-google"></i>
                </div>
            </div>
            <div class="sign-up">
                <a href="/Adev/signup.jsp">Sign Up</a>
            </div>

        </form>
    </div>
</div>
<script src="./assets/js/signin.js"></script>
</body>
</html>
