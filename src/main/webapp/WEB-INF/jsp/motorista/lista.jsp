<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="../bootstrap/css/bootstrap.css">
<title>Motorista</title>
</head>
<body>
	<div class="container">
		<h1>Lista de Motoristas</h1>
		<a href="../motorista/novo">Novo Motorista</a>
		<a href="../passageiro/novo">Novo Passageiro</a>
		<table class="table table-stripped">
			<tr>
				<th>Nome</th>
				<th>Data de Nascimento</th>
				<th>CPF</th>
				<th>Modelo do Carro</th>
				<th>Sexo</th>
				<th>Status</th>
				<th>Editar</th>
				<th>Excluir</th>
			</tr>
			<c:forEach var="motorista" items="${motoristas}">
				<tr>
					<td>${motorista.nome}</td>
					<td> ${motorista.dataNasc}</td>
					<td>${motorista.cpf}</td>
					<td>${motorista.modeloCarro}</td>
					<td>${motorista.sexo}</td>
					<td>${motorista.status}</td>
					<td><a href="../motorista/edita?id=${motorista.id}">Editar</a></td>
					<td><a href="../motorista/excluir?id=${motorista.id}">Excluir</a></td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<a type="button" href="/caiofa-teste" class="btn btn-primary" >Voltar</a>
	</div>
</body>
</html>