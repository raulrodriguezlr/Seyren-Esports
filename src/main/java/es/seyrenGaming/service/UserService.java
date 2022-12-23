package es.seyrenGaming.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.seyrenGaming.model.NewUser;
import es.seyrenGaming.model.Users;
import es.seyrenGaming.repository.RepoUsuario;



@Service
public class UserService {
	@Autowired
	private RepoUsuario repository;
	public UserService(RepoUsuario repository) {
		this.repository=repository;
	}

	public boolean exist(Long id) {
		return repository.existsById(id);
	}
	public Optional<Users> findOne(long id) {
		return repository.findById(id);
	}

	public List<Users> findAll() {
		return repository.findAll();
	}
	
	public boolean save (NewUser newUser) {
		if (coincidenContraseñas(newUser.getContraseña(),newUser.getComprobarContraseña())) {
			Users user = new Users(newUser.getNombre(),newUser.getApellido(),newUser.getLogin(),newUser.getCorreo(),getMD5(newUser.getContraseña()),newUser.getPais());
			repository.save(user);
			return true;
			}
		
		return false;
	}
	public boolean coincidenContraseñas(String contraseña1, String contraseña2) {
		return contraseña1.equals(contraseña2);
		
	}
	public void editarNombre (long id,String name) {
		repository.updateNombreById(id, name);
	
		
	}
	public static String getMD5(String input) {
		 try {
		 MessageDigest md = MessageDigest.getInstance("MD5");
		 byte[] messageDigest = md.digest(input.getBytes());
		 BigInteger number = new BigInteger(1, messageDigest);
		 String hashtext = number.toString(16);

		 while (hashtext.length() < 32) {
		 hashtext = "0" + hashtext;
		 }
		 return hashtext;
		 }
		 catch (NoSuchAlgorithmException e) {
		 throw new RuntimeException(e);
		 }
		 }
	
}
