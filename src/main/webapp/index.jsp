<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Anita's Supermarket</title>
    <link href="css/estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    <div class="Container">
    <div id="logo"><img src="images/canasta.png" alt="Logo" width="150"></div>
    <div id="title">
  <h1>SUPERMERCADO ANITA'S</h1>
    </div>
    <div id="content">
      <h1>Bienvenidos</h1>
      
      <div class="enlace">
<a href="${pageContext.request.contextPath}/ServletListadoSupermercado">Ver lista de Productos</a>
       </div>
       
       <div class="enlace"><a href="admin.jsp">Administrar</a></div>
      </div>
    </div>
</body>
</html>