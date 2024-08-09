<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        table td,th,input{
            text-align: center;
        }
    </style>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <script>
        function updateWorker(wid){
            var username = document.getElementById("wname"+wid).value;
            var password = document.getElementById("wpwd"+wid).value;
            $.ajax({
                url:"updateWorker.action",
                data:{"wid":wid,"username":username,"password":password},
                success:function(){
                    alert("updated "+wid);
                    location.reload();
                }
            });
        }
        function deleteWorker(wid){
            $.ajax({
                url:"deleteWorker.action",
                data:{"wid":wid},
                success:function(){
                    alert("deleted "+wid);
                    location.reload();
                }
            });
        }
        function registWorker(wid){
            var username = document.getElementById("registName").value;
            var password = document.getElementById("registPwd").value;
            $.ajax({
                url:"registWorker.action",
                data:{"wid":wid,"username":username,"password":password},
                success:function(){
                    alert("registed "+ username);
                    location.reload();
                }
            });
        }
    </script>
</head>
<body>
<h2>所有用户信息表</h2>
<table border="1px">
    <tr>
        <th>wid</th>
        <th>username</th>
        <th>password</th>
        <th>update</th>
        <th>delete</th>
    </tr>
    <c:forEach items="${workers}" var="worker">
        <tr>
            <td>${worker.wid}</td>
            <td><input type="text" value="${worker.username}" id="wname${worker.wid}"></td>
            <td><input type="text" value="${worker.password}" id="wpwd${worker.wid}"></td>
            <td><input type="button" value="更新" onclick="updateWorker(${worker.wid})"></td>
            <td><input type="button" value="删除" onclick="deleteWorker(${worker.wid})"></td>
        </tr>
    </c:forEach>
    <tr>
        <td>${workers.size()+1}</td>
        <td><input type="text" id="registName"></td>
        <td><input type="text" id="registPwd"></td>
        <td colspan="2"><input type="button" value="注册" onclick="registWorker(${workers.size()+1})"></td>
    </tr>

</table>
</body>
</html>
