
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/entrada?acao=NovaEmpresa" var="linkServletNovaEmpresa" />

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
		
		<label>
			Data Abertura : <input type="text" name="data" />
		</label>
		
		<input type="submit" value="Enviar" />
		
	</form>

</body>
</html>