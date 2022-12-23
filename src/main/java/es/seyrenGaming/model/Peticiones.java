package es.seyrenGaming.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//Ignorar, esto es una idea que TENIA para hacer un apartado comunidad dentro de la web
@Entity
public class Peticiones {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String login;
	private String asunto;
	private String motivo;
	private String cuerpo;
	public Peticiones() {}

}
