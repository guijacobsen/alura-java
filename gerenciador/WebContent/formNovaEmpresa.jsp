
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- <c:url value="/novaEmpresa" /> --%>

	<form method="post" action="<c:url value="/novaEmpresa" />">
		<label>
			Nome : <input type="text" name="nome" />
		</label>
		
		<input type="submit" value="Enviar" />
		
	</form>

</body>
</html>