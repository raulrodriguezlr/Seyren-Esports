package es.seyrenGaming.model;
//Ignorar, esto es una idea que TENIA para hacer un apartado comunidad dentro de la web
//ESTABA CONECTADO A UNA BD MYSQL PERO ESTA DESACTIVADO Y USA AHORA H2
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String login;
	private String contraseña;
	private String nombre;
	private String apellido;
	private String correo;
	private String pais;
	private Date alta;
	
	public Users() {}
	public Users(String nombre,String apellido,String login,String correo,String contraseña,String pais) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.contraseña=contraseña;
		this.login=login;
		this.correo=correo;
		this.pais=pais;
		alta= new Date();
		
	}
	public long getId() {
		return id;
	}
	public boolean contraseñaCorrecta(String contraseña1, String contraseña2) {
		return contraseña1.equals(contraseña2);
	}
}
