<%@page import="java.util.List"%>
<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>Lista de empresas</p>
	
	<ul>
		
		<c:forEach items="${listaEmpresas}" var="e">
			 
			<li>
				${ e.getNome() } 
				<fmt:formatDate value="${ e.getDataAbertura() }" pattern="dd/MM/yyyy" />
			</li>
		</c:forEach>
	
	</ul>

	<%-- <ul>
		<%
			List<Empresa> lista = (List)request.getAttribute("listaEmpresas");
			for( Empresa e : lista ) {
				out.println("<li>" + e.getNome() + "</li>");
			}
		%>
	</ul> --%>

</body>
</html>