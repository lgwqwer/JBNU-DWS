<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
// 이 안은 자바
  double grade = Double.parseDouble(request.getParameter("grade"));
  double distScore = Double.parseDouble(request.getParameter("dist-score"));

  double resultScore = (grade / 4.5) * 90 + distScore;
%>


<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<title>결과</title>
</head>

<body>

  <div class="result_block">
    <h1>기숙사 추천 결과</h1>
    <p id="grade"></p>
    <p id="distScore"></p>
    <p id="resultScore"></p>
  </div>

</body>

</html>
