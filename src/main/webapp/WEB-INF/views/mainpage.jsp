<%--
  Created by IntelliJ IDEA.
  User: lwdky
  Date: 2017/12/12
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SChicken个人主页</title>
</head>
<body>
    <div>
        <a href="/ssm/mainpage.do">主页</a>
        <a href="/ssm/visit.do">游客</a>
        <a href="/ssm/message.do">私信</a>
        <img src="${pageContext.servletContext.contextPath}/resources/img/dog.png">
        <form method="get" action="/ssm/search.do">
            <input type="text" name="what2search">
            <input type="submit" value="搜索">
        </form>
    </div>
    <div>
        <img src="${userinfo.picurl}">
        <a href="/ssm/mypage.do">${user.realname}</a>
        <a href="/ssm/follow2fans.do">推文${}</a>
        <a href="/ssm/follow2fans.do">正在关注${}</a>
        <a href="/ssm/follow2fans.do">关注者${}</a>
    </div>
    <div>
        <a href="/ssm/logout.do">注销</a>
        <p>你是否想分享图文SChicken？</p>
        <a >立即成为SChicken VIP</a>
    </div>
    <div>
        <img src="${pageContext.servletContext.contextPath}/resources/img/dog.png">
        <input type="text">
        <div>
            微博位置！
        </div>
    </div>
</body>
</html>
