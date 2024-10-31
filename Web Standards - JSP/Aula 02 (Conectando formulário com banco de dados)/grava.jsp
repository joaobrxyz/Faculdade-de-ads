<%@ page language="java" import="java.sql.*" %>

<%
    // Cria as variáveis e armazena as informações digitadas pelo usuário
    String vnome = request.getParameter("txtnome");
    int vidade = Integer.parseInt(request.getParameter("txtidade"));
    String vemail = request.getParameter("txtemail");
    String vsenha = request.getParameter("txtsenha");

    // Variáveis para acessar o banco de dados
    String database = "web";
    String enderecoBD = "jdbc:mysql://localhost:3306/" + database;
    String usuarioBD = "root";
    String senhaBD = "";

    // Driver
    String driver = "com.mysql.jdbc.Driver";

    // Carregar o driver na memória
    Class.forName(driver);

    // Cria uma variável para conexão com o banco de dados
    Connection conexao;

    // Abrir a conexão com o banco de dados
    conexao = DriverManager.getConnection(enderecoBD, usuarioBD, senhaBD);

    // Comando para inserir no banco
    String sql = "INSERT INTO alunos(nome, idade, email, senha) values(?,?,?,?)";

    // Cria a variável do tipo PreparedStatement
    PreparedStatement stm = conexao.prepareStatement(sql);
    stm.setString(1, vnome);
    stm.setInt(2, vidade);
    stm.setString(3, vemail);
    stm.setString(4, vsenha);

    stm.execute();
    stm.close();

    out.print("<h2>Dados gravados com sucesso!!!");
    out.print("<br>");
    out.print("<a href='index.html'>Voltar</a>");
%>