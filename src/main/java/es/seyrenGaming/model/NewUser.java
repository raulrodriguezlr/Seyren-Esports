package es.seyrenGaming.model;
//Ignorar, esto es una idea que TENIA para hacer un apartado comunidad dentro de la web
//ESTABA CONECTADO A UNA BD MYSQL PERO ESTA DESACTIVADO Y USA AHORA H2
public class NewUser {
	private String nombre;
	private String apellido;
	private String login;
	private String contraseña;
	private String comprobarContraseña;
	private String pais;
	private String correo;
	
	public NewUser(String nombre,String apellido,String login,String correo,String contraseña,String contraseña2,String pais) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.login=login;
		this.correo=correo;
		this.contraseña=contraseña;
		this.comprobarContraseña=contraseña2;
		this.pais=pais;
	}
	public String getNombre() {return nombre;}
	public String getApellido() {return apellido;}
	
	public String getLogin() {return login;}
	public String getContraseña() {return contraseña;}
	public String getComprobarContraseña() {return comprobarContraseña;}
	public String getPais() {return pais;}
	public String getCorreo() {return correo;}

}
