<%-- 
    Document   : index
    Created on : Feb 28, 2017, 12:05:55 PM
    Author     : shibo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/jquery.mobile-1.4.5"/>

        <script type="text/javascript">
                    function handle() {
                    alert($("#message").val());
                            $.post("chatServlet",
                            {
                            username: $("#username").val(),
                                    message: $("#message").val(),
                            }
                            );
                    }
            function handleGet() {
            
                    $.ajax({
                    type: 'GET',
                            url: 'chatServlet?' + Date(),
                            data: [],
                            dataType: 'json',
                            success: function (data) {
                                var text="";
                            for (var i = 0; i < data.length; i++) {
                             
                             text += "<p>Sender :" + data[i].username + " </p>" + "<p>" + data[i].message + "</p>" + "<hr>";
                                  //  $("#mydiv").html($("#mydiv").html() + text);
                                  $("#mydiv").html( text);
                            }

                            } });}

        </script>
    </head>
    <body onload="setInterval(handleGet , 1000)">
    <center>
        <form >
            <label>username</label>:<input type="text" id="username" name="username"/><br>
            <label>message</label>:<input type="text" id="message" name="message"/><br>
            <button type="button" value="submit" onclick="handle();"/>


        </form>
    </center>
    <center>   
        <div id="mydiv"></div>


    </center>

</body>
</html>
