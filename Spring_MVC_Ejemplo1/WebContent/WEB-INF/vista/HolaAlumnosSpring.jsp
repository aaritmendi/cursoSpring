<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Respuesta Formulario</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/css/miestilo.css">
</head>
<body>
	<h1>Hola ${param.nombreAlumno}. Bienvenido al curso de Spring</h1>
	<h3>Atención a todos</h3>
	<p>
	${mensajeClaro}
	</p>
	<img alt="imagen" src="${pageContext.request.contextPath}/recursos/img/perfil_vass.png">
	
</body>
</html>