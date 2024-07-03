<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/functions"
prefix="fn" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>가계부</title>

    <!---Custom CSS File--->
    <link rel="stylesheet" href="../css/mInsert.css" />

    <!-- ♣♣♣ font ♣♣♣ -->
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
    />

    <link href="../css/global.css?ver=1" rel="stylesheet" />
    <link href="../css/auth.css?ver=1" rel="stylesheet" />
    <link href="../css/components/input.css?ver=1" rel="stylesheet" />
    <link href="../css/components/button.css?ver=1" rel="stylesheet" />

    <!-- JQuery 최신 -->
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  </head>
  <script>
    $(function () {
      $("#idChk").click(function () {
        alert("test");
      }); //아이디 중복체크
    }); //제이쿼리최신
  </script>
  <body>
    <div id="auth">
      <div class="auth-card">
        <div class="auth-card-box sign-up">
          <div class="input-box">
            <div class="input-container">
              <input class="input" type="text" placeholder="이메일주소" />
            </div>
            <br />
            <div class="input-container">
              <input class="input" type="password" placeholder="비밀번호" />
            </div>
            <br />
            <div class="input-container">
              <input
                class="input"
                type="password"
                placeholder="비밀번호 재입력"
              />
            </div>
            <br />
            <div class="input-container">
              <input class="input" type="text" placeholder="닉네임" />
            </div>
            <br />
            <div class="input-container">
              <input class="input" type="text" placeholder="휴대전화" />
            </div>
            <br />
            <div class="input-container">
              <input class="input" type="text" placeholder="주소" />
            </div>
          </div>
          <div class="login-button">회원가입</div>
          <div><a href="sign-in" class="sign-text">로그인</a></div>
        </div>
      </div>
    </div>
  </body>
</html>
