<%-- 
    Document   : insertProduct
    Created on : 6/06/2015, 09:42:03 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar producto</title>
    <link href="../css/estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    <div class="Container">
    <div id="logo"><img src="../images/canasta.png" alt="Logo" width="150"></div>
      <div id="title">
  <h1>Actualizar producto</h1>
      </div>
      <div id="content">
  <form action="${pageContext.request.contextPath}/updateProduct.do" method="post"><table border="0" align="center" cellpadding="2" cellspacing="2">
  <tr>
    <th align="right" scope="row">ID:</th>
    <td><input name="id_producto" type="text" id="id_producto" value="<%= request.getParameter("id") %>" maxlength="3" readonly></td>
    <td rowspan="4" align="center"><input type="submit" value="Actualizar" class="boton"></td>
  </tr>
  <tr>
    <th align="right" scope="row">Nombre:</th>
    <td><input name="nombre_producto" type="text" id="nombre_producto" value="<%= request.getParameter("prod") %>" maxlength="50"></td>
    </tr>
  <tr>
    <th align="right" scope="row">Valor:</th>
    <td><input name="valor" type="text" id="valor" value="<%= request.getParameter("val") %>" maxlength="6"></td>
    </tr>
  <tr>
    <th align="right" scope="row">Catálogo:</th>
    <td><input name="id_catalogo" type="text" id="id_catalogo" value="<%= request.getParameter("cat") %>" maxlength="3"></td>
    </tr>
</table>
  </form>
  <div class="enlace"><a href="../admin.jsp">Volver al Menú Ppal</a></div>
  <div class="enlace"><a href="${pageContext.request.contextPath}/listProducts.do">Listar Productos</a></div>
      </div>
    </div>
    </body>
</html>
