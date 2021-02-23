<%-- 
    Document   : horoscopo
    Created on : 15-feb-2021, 21:34:13
    Author     : David Rebato
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Horóscopo</h1>
        <form action="horoscopo" method="post">
            <%
                ArrayList<String> meses = (ArrayList<String>) request.getAttribute("meses");
                ArrayList<String> dias = (ArrayList<String>) request.getAttribute("dias");
                String dia = (String) request.getAttribute("dia");
                if (dia == null){
                    dia = "1";
                }
                String mes = (String) request.getAttribute("mes");
                if (mes == null) {
                    mes = "1";
                }
                String nombre = (String) request.getAttribute("nombre");
                if (nombre == null) {
                    nombre = "";
                }
            %>
            <label for="nombre">Nombre: </label><input type="text" id="nombre" name="nombre" value="<%= nombre %>"><br>
            <label for="mes">Mes: </label><select name="mes" id="mes">
                <%
                    for(int i=0; i<meses.size(); i++){
                %>
                <option value="<%= meses.get(i) %>"><%= meses.get(i) %></option>
                <%
                    }
                %>
            </select><br>
            <label for="dia">Dia: </label><select name="dia" id="dia">
                <%
                    for(int i=0; i<dias.size(); i++){
                %>
                <option value="<%= dias.get(i) %>"><%= dias.get(i) %></option>
                <%
                    }
                %>
            </select><br>
            <input type="submit" value="Signo">
        </form>
        <% 
            String signo = (String) request.getAttribute("signo");
            if (signo != null) {
        %>
        <h2><%= nombre %> tu signo del zodiaco es: <%= signo %></h2>
        <% 
            }
        %>
    </body>
</html>
