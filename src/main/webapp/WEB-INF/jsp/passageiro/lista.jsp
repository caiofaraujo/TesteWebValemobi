<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="../bootstrap/css/bootstrap.css">
<title>Passageiro</title>
</head>
<body>
	<div class="container">
		<h1>Lista de Passageiros</h1>
		<a href="../motorista/novo">Novo Motorista</a>
		<a href="../passageiro/novo">Novo Passageiro</a>
		<table class="table table-stripped">
			<tr>
				<th>Nome</th>
				<th>Data de Nascimento</th>
				<th>CPF</th>
				<th>Sexo</th>
				<th>Editar</th>
				<th>Excluir</th>
			</tr>
			<c:forEach var="passageiro" items="${passageiros}">
				<tr>
					<td>${passageiro.nome}</td>
					<td> ${passageiro.dataNasc}</td>
					<td>${passageiro.cpf}</td>
					<td>${passageiro.sexo}</td>
					<td><a href="../passageiro/edita?id=${passageiro.id}">Editar</a></td>
					<td><a href="../passageiro/excluir?id=${passageiro.id}">Excluir</a></td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<a type="button" href="/caiofa-teste" class="btn btn-primary" >Voltar</a>
	</div>
</body>
</html>