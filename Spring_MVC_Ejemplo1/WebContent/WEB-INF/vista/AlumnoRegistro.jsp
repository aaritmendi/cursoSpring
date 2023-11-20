<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Registro</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/css/bootstrap.css">
</head>
<body>

	<form:form action="procesarFormulario" modelAttribute="elAlumno" class="m-4">
	
	Nombre: <form:input path="nombre" class="form-control w-25 p-3"/>
	<br/>
	Apellido: <form:input path="apellido" class="form-control w-25 p-3"/>
	<br/><br/>
	<input type="submit" value="Enviar" class="btn btn-primary"/> 
	
	</form:form>

</body>
</html>