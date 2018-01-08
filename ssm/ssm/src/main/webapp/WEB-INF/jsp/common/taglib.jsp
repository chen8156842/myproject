<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	String path = request.getContextPath();
	int port = request.getServerPort();
	String basePath = "";
	if (port == 80) {
		basePath = request.getScheme() + "://" + request.getServerName() + path + "/";
	} else {
		basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	}
%>
<c:set var="ctx" value="<%=basePath%>"/>
<script>
	var basePath = '<%=basePath%>';
</script>