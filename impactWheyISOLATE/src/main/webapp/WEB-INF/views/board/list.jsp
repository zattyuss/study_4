<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layout/header.jspf" %>
<div class="container">
회원목록 조회
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
		</tr>
		<tr>
		<c:forEach items="${list}" var="b">
			<td>${b.bno }</td>	
			<td>
				<a href="get?bno=${b.bno }">${b.title }</a>
			</td>
			<td>${b.writer }</td>	
			<td>${b.regDate }</td>	
		</tr>
		</c:forEach> 
	</table>
</div>
<a href="${contextPath}/board/register">글등록</a>
${message}

<%@ include file="/WEB-INF/views/layout/footer.jspf" %>
