
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
        <link rel="stylesheet" href="css/basestyle.css">
    </head>
    <body>
        <div id="header"></div>
        <form action="signup" method="POST" style="margin-left: 35%; margin-top: 10%">
            <label>Username</label>
            <input id="username" type="text" name="username" style="margin-left: 3%">
            <br>
            <br>
            <label>Password</label>
            <input id="password" type="password" name="password" style="margin-left:31px">
            <br>
            <br>
            <label>Họ và tên</label>
            <input id="hoten" type="text" name="hoten" style="margin-left:49px">
            <br>
            <br>
            <label>Email</label>
            <input id="email" type="text" name="email" style="margin-left:55px">
            <br>
            <br>
            <label>Phone</label>
            <input id="sdt" type="text" name="sdt" style="margin-left:52px">
            <br>
            <br>
            <input class="button" type="submit" value="Sign up" style="margin-left: 15%" onclick="return checkValid();"/>
        </form>

        <script>
            function checkValid() {
                
                var username = document.getElementById("username").value;
                var password = document.getElementById("password").value;
                var hoten = document.getElementById("hoten").value;
                var email = document.getElementById("email").value;
                var sdt = document.getElementById("sdt").value;
                var s = username + "|" + password;
                if (s.includes("select") || s.includes("union") || s.includes("\'") || s.includes("\"") || s.includes("insert")) {
                    alert("Username or password invalid");
                    return false;
                }
                if (hoten.length == 0 || email.length == 0 || sdt.length == 0) {
                    alert("Field is required");
                    return false;
                }
                if (!email.includes("@") || !email.includes(".com")) {
                    alert("Email is invalid");
                    return false;
                }
            }
        </script>
    </body>
</html>
