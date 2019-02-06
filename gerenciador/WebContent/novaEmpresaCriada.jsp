<%
String nomeEmpresa = "Alura";
System.out.println(nomeEmpresa);
%>

<html>
	<body>
		Cadatro empresa: <% out.println(nomeEmpresa); %>
		<br />
		Cadatro empresa: <%= nomeEmpresa %>
	</body>
</html>