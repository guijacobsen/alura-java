<%@page import="java.util.List"%>
<%@page import="br.com.alura.gerenciador.modelo.Empresa"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <c:url value="/novaEmpresa" var="linkServletNovaEmpresa" /> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${ not empty empresa }">
		Cadatro empresa: ${ empresa }
	</c:if>
	
	<p>Lista de empresas</p>
	
	<ul>
		
		<c:forEach items="${listaEmpresas}" var="e">
			 
			<li>
				${ e.getNome() } 
				<fmt:formatDate value="${ e.getDataAbertura() }" pattern="dd/MM/yyyy" /> 
				<a href="/gerenciador/entrada?acao=removeEmpresa&id=${ e.getId() }">remover</a> 
				<a href="/gerenciador/entrada?acao=mostraEmpresa&id=${ e.getId() }">editar</a>
			</li>
		</c:forEach>
	
	</ul>

</body>
</html>