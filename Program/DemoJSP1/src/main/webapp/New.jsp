<html>
<body>

<h2>My First JSP Program</h2>

<%
    String name = "Nivedh Sunil";
    int a = 10;
    int b = 20;
    int sum = a + b;
%>

<p>Hello, <%= name %></p>
<p>Sum = <%= sum %></p>

</body>
</html>