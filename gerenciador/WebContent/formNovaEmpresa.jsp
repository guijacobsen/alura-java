
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/novaEmpresa" var="linkServletNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="${ linkServletNovaEmpresa }">
		<label>
			Nome : <input type="text" name="nome" />
		</label>
		
		<input type="submit" value="Enviar" />
		
	</form>

</body>
</html>