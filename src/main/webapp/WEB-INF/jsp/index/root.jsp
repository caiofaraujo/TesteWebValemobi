<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="./bootstrap/css/bootstrap.css">
<title>Menu</title>
</head>
<body>
	<div class="container">
		<h1>Menu</h1>
		<!-- MENU PRINCIPAL -->
		<ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
			<li class="nav-item"><a class="nav-link active"
				id="pills-home-tab" data-toggle="pill" href="./motorista/novo" role="tab"
				aria-controls="pills-home" aria-selected="true">Novo Motorista</a></li>
				
			<li class="nav-item"><a class="nav-link" id="pills-profile-tab"
				data-toggle="pill" href="./passageiro/novo" role="tab"
				aria-controls="pills-profile" aria-selected="false">Novo Passageiro</a></li>
				
			<li class="nav-item"><a class="nav-link" id="pills-contact-tab"
				data-toggle="pill" href="./motorista/lista" role="tab"
				aria-controls="pills-contact" aria-selected="false">Consultar Motoristas</a></li>
				
			<li class="nav-item"><a class="nav-link" id="pills-contact-tab"
				data-toggle="pill" href="./passageiro/lista" role="tab"
				aria-controls="pills-contact" aria-selected="false">Consultar Passageiros</a></li>
		</ul>
		<div class="tab-content" id="pills-tabContent">
			<div class="tab-pane fade show active" id="pills-home"
				role="tabpanel" aria-labelledby="pills-home-tab">...</div>
			<div class="tab-pane fade" id="pills-profile" role="tabpanel"
				aria-labelledby="pills-profile-tab">...</div>
			<div class="tab-pane fade" id="pills-contact" role="tabpanel"
				aria-labelledby="pills-contact-tab">...</div>
		</div>
	</div>
</body>
</html>