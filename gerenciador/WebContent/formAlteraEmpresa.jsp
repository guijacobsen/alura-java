
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/alteraEmpresa" var="linkServletAlteraEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="${ linkServletAlteraEmpresa }">
		<label>
			Nome : <input type="text" name="nome" value="${ empresa.getNome() }" />
		</label>
		
		<label>
			Data Abertura : <input type="text" name="data" value='<fmt:formatDate value="${ empresa.getDataAbertura() }" pattern="dd/MM/yyyy"/>' />
		</label>
		
		<input type="hidden" name="id" value="${ empresa.getId()  }" />
		
		<input type="submit" value="Enviar" />
		
	</form>

</body>
</html>