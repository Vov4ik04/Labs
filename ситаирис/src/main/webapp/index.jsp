<%@ page import="services.WebService" %>
<jsp:useBean id="webService" class="services.WebService" scope="session"/>
<html>
<body>
<h2>Cars</h2>
<I><%= WebService.getData() %></I>
<h2>Total number <%= WebService.getNUmberOfTransport() %></h2>
<h2>Total price sum <%= WebService.getSumPrice() %></h2>
<h2>Total engine power sum <%= WebService.getSumEnginePower() %></h2>
</body>
</html>
