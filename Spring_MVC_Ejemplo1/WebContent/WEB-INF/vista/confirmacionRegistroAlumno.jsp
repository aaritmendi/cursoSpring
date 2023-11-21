<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmación de Registro</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/css/bootstrap.css">
</head>
<body>
<div class="m-2 bg-info p-3 d-inline-block rounded">
	<h4 class="h4">El alumno con nombre ${elAlumno.nombre}, apellido ${elAlumno.apellido} y edad de ${elAlumno.edad } años</h4>
	<p>El mail del alumno es: ${elAlumno.email }</p>
	<p>El codigo postal del alumno es: ${elAlumno.codigoPost }</p>
	<p>La asignatura escogida es: ${elAlumno.optativa }</p>
	<p>En el centro de: ${elAlumno.ciudad }</p>
	<p>Los idiomas escogidos por el alumno son: ${elAlumno.idioma }</p>
</div>

</body>
</html>