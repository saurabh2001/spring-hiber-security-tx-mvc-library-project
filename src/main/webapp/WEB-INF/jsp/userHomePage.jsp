<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"></jsp:include>
<html><body>
<h3>Library Management</h3>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<a href="${contextPath}/user/list-all-books">
                <button type="submit" class="btn btn-primary">See All books</button>
                </a>
   
<a href="${contextPath}/user/list-my-issued-books">
                <button type="submit" class="btn btn-primary">See Issued books</button>
                </a>
   
</body>
</html>