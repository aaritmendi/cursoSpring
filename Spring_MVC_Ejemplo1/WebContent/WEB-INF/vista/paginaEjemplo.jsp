<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pagina de Ejemplo</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/css/bootstrap.css">
</head>
<body class="m-0 row justify-content-center">
	<div class="col-auto p-5 rounded-bottom bg-dark text-light">
		<h1 class="h1">Spring</h1>
		<a href="secundario/muestraFormulario" class="link-primary">ir al formulario</a>
		<br/><br/>
		<a href="alumno/muestraFormulario" class="link-success">ir al registro</a>
	</div>
</body>
</html>