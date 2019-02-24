
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/entrada?acao=Login" var="linkServletNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="${ linkServletNovaEmpresa }">
		<label>
			Login : <input type="text" name="login" />
		</label>
		
		<label>
			Senha : <input type="password" name="senha" />
		</label>
		
		<input type="submit" value="Enviar" />
		
	</form>

</body>
</html>