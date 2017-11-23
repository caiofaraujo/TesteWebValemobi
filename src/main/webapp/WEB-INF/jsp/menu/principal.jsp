<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="../bootstrap/css/bootstrap.css">
<title>Menu</title>
</head>
<body>
	<div class="container">
		<h1>Menu</h1>

		<!-- MENU PRINCIPAL -->
		<ul class="nav navbar-nav">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" role="button" aria-haspopup="true"
				aria-expanded="false">Albuns<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="../motorista/novo">Novo Motorista</a></li>
					<li><a href="../passageiro/novo">Novo Passageiro</a></li>
					<li role="separator" class="divider"></li>
					<li><a href="../motorista/lista">Consultar Motoristas</a></li>
					<li><a href="../passageiro/lista">Consultar Passageiros</a></li>
					<li><a href="#">Separated link</a></li>
				</ul>
			</li>
		</ul>
		
	</div>
</body>
</html>