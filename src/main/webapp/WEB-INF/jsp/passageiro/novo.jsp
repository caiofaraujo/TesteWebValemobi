<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.css">
<title>Passageiro</title>
</head>
<body>
<div class="container">
	<h1>Cadastro de Passageiros</h1>
	<form id="formPassageiro" action='<c:url value="/passageiro/adiciona" />' method="post">
		Nome: 
		<input type="text" class="form-control" name="passageiro.nome" />
		Data de Nascimento: 
		<input type="text" class="form-control" name="passageiro.dataNasc" />
		CPF: 
		<input type="text" class="form-control" name="passageiro.cpf" />
		Sexo: 
		<select class="form-control" name="passageiro.sexo">
			<option value="0">Selecione</option>
			<option value="Masculino">Masculino</option>
			<option value="Feminino">Feminino</option>
		</select>	
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
		
		<a type="button" href="/caiofa-teste" class="btn btn-primary" >Voltar</a>
		<input type="submit" class="btn btn-primary" value="Cadastrar"/>
	</form>
</div>
</body>
</html>