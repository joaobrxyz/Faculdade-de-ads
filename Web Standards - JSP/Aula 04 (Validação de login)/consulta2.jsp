<%@ page language="java" import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("usuario") == null) {
        out.print("Acesso negado!");
        out.print("<br><br>");
        out.print("<a href='login.html'>Login</a>");
    } else {

    

%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        tr:nth-child(even) {
            background-color: lightgray;
        }

        tr:hover {
            background-color: #363636;
            color: white;
        }
    </style>
</head>
<body>
    <%
        out.print("<h2>Consulta 2 - Bem vindo(a) "+ session.getAttribute("usuario") +"</h2>");
        out.print("<a href='logout.jsp'>Sair</a>");

        // Variáveis para acessar o banco de dados
        String database = "web";
        String enderecoBD = "jdbc:mysql://localhost:3306/" + database;
        String usuarioBD = "root";
        String senhaBD = "";

        // Driver
        String driver = "com.mysql.jdbc.Driver"; // Certifique-se de que o driver está na biblioteca do projeto

        // Carregar o driver na memória
        Class.forName(driver);

        // Cria uma variável para conexão com o banco de dados
        Connection conexao;

        // Abrir a conexão com o banco de dados
        conexao = DriverManager.getConnection(enderecoBD, usuarioBD, senhaBD);

        // Comando para consultar no banco
        String sql = "SELECT * from alunos";

        // Cria a variável do tipo PreparedStatement
        PreparedStatement stm = conexao.prepareStatement(sql); 

        // Cria a variável do tipo ResultSet para armazenar os dados que estão no banco
        ResultSet dados = stm.executeQuery();

        out.print("<table border=1>");

        while ( dados.next() ) {
            out.print("<tr>");
                out.print("<td>");
                out.print(dados.getString("codigo"));
                out.print("</td>");

                out.print("<td>");
                out.print(dados.getString("nome"));
                out.print("</td>");

                out.print("<td>");
                out.print(dados.getString("idade"));
                out.print("</td>");

                out.print("<td>");
                out.print(dados.getString("email"));
                out.print("</td>");

                out.print("<td>");
                out.print(dados.getString("senha"));
                out.print("</td>");

            out.print("</tr>");
        }

        out.print("</table>");
    %>
</body>
</html>
<%
    }
%>