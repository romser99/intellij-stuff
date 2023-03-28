<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
    </head>
    <body>
        <h1>test
          <c:out value="${requestScope.Imcs}"/>
        </h1>
        <form name="form1" action="/imc" method="post">
            <input type="text" name="taille" placeholder="taille m.cm"/>
            <input type="text" name="poids" placeholder="poids kg"/>
            <button> Calculer </button>
        </form>

    </body>
</html>
