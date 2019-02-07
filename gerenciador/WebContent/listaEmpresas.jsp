<%@page import="java.util.List"%>
<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<ul>
	<%
		List<Empresa> lista = (List)request.getAttribute("listaEmpresas");
		for( Empresa e : lista ) {
			out.println("<li>" + e.getNome() + "</li>");
		}
	%>
</ul>

</body>
</html>