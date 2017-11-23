<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="../bootstrap/css/bootstrap.css">
<title>Corrida</title>
</head>
<body>
	<div class="container">
		<h1>Cadastro de Corrida</h1>
		<form id="formCorrida" action='<c:url value="/corrida/adiciona" />'
			method="post">
			Motorista:
			<select class="form-control" name="corrida.motorista.id">
				<option value="Selecione">Selecione</option>
				<c:forEach var="motoristas" items="${motoristas}">
					<option id="${motoristas.id}" value="${motoristas.nome}">${motoristas.nome}</option>
				</c:forEach>
			</select>
			<br>
			Passageiro:
			<select class="form-control" name="corrida.passageiro">
				<option value="">Selecione</option>
				<c:forEach var="passageiros" items="${passageiros}">
					<option id="${passageiros.id}" value="${passageiros.nome}">${passageiros.nome}</option>
				</c:forEach>
			</select>
			<br>
			Valor:
			<input type="text" class="form-control" name="corrida.valor" />
			<br>

			<c:if test="${not empty errors}">
				<div class="alert alert-danger" role="alert" id="error">
					<ul>
						<c:forEach items="${errors}" var="error">
							<li>${error.message}</li>
						</c:forEach>
					</ul>
				</div>
			</c:if>
			<a type="button" href="/caiofa-teste" class="btn btn-primary">Voltar</a>
			<input type="submit" class="btn btn-primary" value="Cadastrar" />
		</form>
	</div>
</body>
</html>