<%@ page pageEncoding="UTF-8"%>
<br /><h1>Nuestros Cines</h1><br />
<% String[][] mCines = (String[][]) session.getAttribute("mCines");
	for(String[] cine : mCines){ %>
	<div class="contenido-cine">
		<img src="img/cine/<%= cine[0] %>.1.jpg" width="227" height="170" />
		<div class="datos-cine">
			<h4><%= cine[1] %></h4>
			<br /> <span><%= cine[4]%> - <%= cine[6] %><br />
			<br />Teléfono: <%= cine[5] %>
			</span>
		</div>
		<br /> <a
			href="CineSVL?idCine=<%=cine[0]%>">
			<img src="img/varios/ico-info2.png" width="150" height="40" />
		</a>
	</div>
<%}%>