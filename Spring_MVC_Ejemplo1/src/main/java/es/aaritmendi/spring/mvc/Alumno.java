package es.aaritmendi.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import es.aaritmendi.spring.mvc.validacionespersonalizadas.CPostalMadrid;

public class Alumno {
	
	@NotNull
	@Size(min=2, message="Nombre incorrecto")
	private String nombre;
	
	@NotNull
	@Size(min=2, message="Apellido incorrecto")
	private String apellido;
	
	private String optativa;
	
	private String ciudad;
	
	private String idioma;
	
	@NotBlank(message="Campo obligatorio")
	@Email(message="No es un mail correcto")
	private String email;
	
	@Min(value=10, message="No se permiten edades menores de 10")
	@Max(value=100, message="No se permiten edades mayores de 100")
	private int edad;
	
	/*Validación con expresión regular
	@Pattern(regexp="[0-9]{5}", message="Solo son validos 5 carácteres numéricos")
	private String codigoPost;*/
	
	@CPostalMadrid
	private String codigoPost;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getOptativa() {
		return optativa;
	}
	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCodigoPost() {
		return codigoPost;
	}
	public void setCodigoPost(String codigoPost) {
		this.codigoPost = codigoPost;
	}
	
	
	

}
