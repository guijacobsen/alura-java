<%
String nomeEmpresa = (String)request.getAttribute("empresa");
System.out.println(nomeEmpresa);
%>

<html>
	<body>
		Cadatro empresa: <% out.println(nomeEmpresa); %>
	</body>
</html>