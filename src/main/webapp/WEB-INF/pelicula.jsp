<%@page import="bean.Pelicula" %>
<%@page pageEncoding="UTF-8"%>
<% Pelicula peli = (Pelicula) session.getAttribute("data"); %>

<br /><h1>Cartelera</h1><br />
<div class="contenido-pelicula">
	<div class="datos-pelicula">
		<h2><%= peli.getTitulo()%></h2>
		<p><%= peli.getSinopsis()%></p>
		<br />
		<div class="tabla">
			<div class="fila">
				<div class="celda-titulo">Título Original :</div>
				<div class="celda"><%= peli.getTitulo()%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Estreno :</div>
				<div class="celda"><%= peli.getFechaEstreno()%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Género :</div>
				<div class="celda"><%= peli.getGeneros()%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Director :</div>
				<div class="celda"><%= peli.getDirector()%></div>
			</div>
			<div class="fila">
				<div class="celda-titulo">Reparto :</div>
				<div class="celda"><%= peli.getReparto()%></div>
			</div>
		</div>
	</div>
	<img src="img/pelicula/<%= peli.getId()%>.jpg" width="160" height="226"><br />
	<br />
</div>
<div class="pelicula-video">
	<!-- <iframe width="580" height="400" src="http://www.youtube.com/v/6maujJFcuxA" frameborder="0" allowfullscreen></iframe> -->
	<embed src="http://www.youtube.com/v/<%= peli.getLink()%>"
		type="application/x-shockwave-flash" allowscriptaccess="always"
		allowfullscreen="true" width="580" height="400">
</div>