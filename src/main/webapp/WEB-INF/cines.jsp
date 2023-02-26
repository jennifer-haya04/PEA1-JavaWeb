<%@page import="bean.Cine" %>
<%@page import="java.util.List" %>
<%@ page pageEncoding="UTF-8"%>
<br /><h1>Nuestros Cines</h1><br />
<% List<Cine> lstCines = ( List<Cine> ) session.getAttribute("lstCine");
	for(Cine cine : lstCines){ %>
	<div class="contenido-cine">
		<img src="img/cine/<%= cine.getIdCine() %>.1.jpg" width="227" height="170" />
		<div class="datos-cine">
			<h4><%= cine.getRazonSocial() %></h4>
			<br /> <span><%= cine.getDireccion()%> - <%= cine.getDetalle() %><br />
			<br />Teléfono: <%= cine.getTelefonos() %>
			</span>
		</div>
		<br /> <a
			href="CineSVL?idCine=<%=cine.getIdCine()%>">
			<img src="img/varios/ico-info2.png" width="150" height="40" />
		</a>
	</div>
<%}%>