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
	<form:errors path="nombre" class="text-danger"/>
	<br/>
	Apellido: <form:input path="apellido" class="form-control w-25 p-3"/>
	<form:errors path="apellido" class="text-danger"/>
	<br/>
	Email: <form:input path="email" class="form-control w-25 p-3"/>
	<form:errors path="email" class="text-danger"/>
	<br/>
	Edad: <form:input path="edad" class="form-control w-25 p-3"/>
	<form:errors path="edad" class="text-danger"/>
	<br/>
	Código Postal: <form:input path="codigoPost" class="form-control w-25 p-3"/>
	<form:errors path="codigoPost" class="text-danger"/>
	<br/>
	Optativas: 
	<br/>
	<form:select path="optativa" multiple="true" class="form-select w-25 p-3">
		<form:option selected="selected" value="Diseño" label="Diseño"/>
		<form:option value="Padel" label="Padel"/>
		<form:option value="Danza" label="Danza"/>
		<form:option value="Tencología" label="Tecnología"/>
	</form:select>
	<br/>
	<div class="m-2 bg-info p-3 d-inline-block rounded">
		<p>Ubicación del centro de estudios</p>
		<form:radiobutton path="ciudad" value="Barcelona" class="ml-1 form-check-input"/> <p class="ml-4">Barcelona</p>
		<form:radiobutton path="ciudad" value="Madrid" class=" ml-1 form-check-input"/> <p class="ml-4">Madrid</p>
		<form:radiobutton path="ciudad" value="Valencia" class="ml-1 form-check-input"/> <p class="ml-4">Valencia</p>
		<form:radiobutton path="ciudad" value="Bilbao" class="ml-1 form-check-input"/> <p class="ml-4">Bilbao</p>
	</div>
	<br/>
	<div class="m-2 bg-info p-3 d-inline-block rounded">
		<p>Idiomas a estudiar</p>
		<form:checkbox path="idioma" value="Inglés" class="checkbox"/> Inglés<br/>
		<form:checkbox path="idioma" value="Francés" class="checkbox"/> Francés<br/>
		<form:checkbox path="idioma" value="Aleman" class="checkbox"/> Aleman<br/>
		<form:checkbox path="idioma" value="Chino" class="checkbox"/> Chino<br/>
	</div>
	<br/><br/>
	<input type="submit" value="Enviar" class="btn btn-primary"/> 
	
	</form:form>

</body>
</html>