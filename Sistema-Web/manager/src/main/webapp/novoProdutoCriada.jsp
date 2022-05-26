<!-- SWII5- Trabalho Prático 02
Lucas Henrique de Souza Santos CB3012212
Nikolas Caldeira Rodrigues e Silva CB3012247 -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <c:if test="${not empty produto }">
        Produto ${produto} cadastrado com sucesso!
    </c:if>
    <c:if test="${ empty produto }">
        Nenhum produto cadastrado!
    </c:if> 
</body>
</html>