<%-- 
    Document   : index
    Created on : Feb 27, 2017, 12:28:38 PM
    Author     : shibo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript">
            
            var req = null;
            function submitForm() {
                alert("dsdsdss");
                if (window.XMLHttpRequest)
                    req = new XMLHttpRequest();
                else if (window.ActiveXObject)
                    req = new ActiveXObject(Microsoft.XMLHTTP);
                req.onreadystatechange = handleReq;
                req.open("GET", "check?username="+document.getElementsBy("username").value, true);
                  req.send(null);
            }
            function handleReq()
            {
                if (req.readyState == 4
                    &&req.status == 200)
                        document.getElementsByClassName("check").value =  req.responseText;
//                    else
//                        document.ajax.dyn.value = "Error code " + req.status;
            }
            function hello(){alert("kjdksjdkjkjskdjs");}


        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body onload="hello();">
        <form >
            <label>username</label>:<input type="text" class="username" name="username" onblur="submitForm();"/><label class="check"></label><br>
            <label>username</label>:<input type="password" name="password"/><br>
            <input type="submit" name="submit"/>
        </form>
    </body>
</html>
