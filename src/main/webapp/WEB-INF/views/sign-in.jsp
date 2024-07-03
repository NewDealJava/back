<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/functions"
prefix="fn" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
  <%--
  <c:if test="${session_id!=null }">
    <script>
      alert("※로그인 상태입니다.");
      location.href = "/";
    </script>
  </c:if>
  --%>
  <head>
    <meta charset="UTF-8" />
    <title>가계부</title>

    <!-- ♣♣♣ CSS ♣♣♣ -->
    <link href="../css/global.css?ver=1" rel="stylesheet" />
    <link href="../css/auth.css?ver=1" rel="stylesheet" />
    <link href="../css/components/input.css?ver=1" rel="stylesheet" />
    <link href="../css/components/button.css?ver=1" rel="stylesheet" />
    <!-- JQuery 최신 -->
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  </head>


  <script>
    $(function () {
      $("#loginBtn").click(function () {
        if ($("#id").val().length < 1) {
          alert("※ 아이디를 입력하세요");
          $("#id").focus();
          return false;
        } //아이디 미입력시

        if ($("#pw").val().length < 1) {
          alert(" ※ 비밀번호를 입력하세요");
          $("#pw").focus();
          return false;
        } //비밀번호 미입력시

        loginFrm.submit();
      }); //#loginBtn(로그인)
    }); //제이쿼리 최신
  </script>

  <body>
    <div id="auth">
      <div class="auth-card">
        <div class="auth-card-box sign-in">
          <div class="button kakao-button">
            <div class="icon-wrapper">
              <img
                src="../img/kakao-icon.png"
                alt="카카오아이콘"
                width="20px"
                height="20px"
              />
            </div>
            <div>카카오 계정으로 로그인</div>
            <div></div>
          </div>

          <div class="button google-button">
            <div class="icon-wrapper">
              <img
                src="../img/google-icon.png"
                alt="구글아이콘"
                width="20px"
                height="20px"
              />
            </div>
            <div>구글 계정으로 로그인</div>
            <div></div>
          </div>
          <p>또는</p>
          <div class="input-box">
            <div class="input-container">
              <input class="input" type="text" placeholder="이메일주소" />
            </div>
            <div class="input-container">
              <input class="input" type="password" placeholder="비밀번호" />
            </div>
          </div>
          <div class="login-button">로그인</div>
          <div><a href="sign-up" class="sign-text">회원가입</a></div>
        </div>
      </div>
    </div>
  </body>
</html>
