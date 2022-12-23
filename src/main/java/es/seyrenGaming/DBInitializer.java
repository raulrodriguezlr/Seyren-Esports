package es.seyrenGaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;





import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import es.seyrenGaming.model.Users;
import es.seyrenGaming.repository.RepoUsuario;


@Component
@Profile("local")
public class DBInitializer {

	@Autowired
	private RepoUsuario UserRepo;
	
	
	//@PostConstruct
	public void userDB() {
		UserRepo.deleteAll();
		String contraseña= "Qwerty123456";
		//UserRepo.save(new Users("raulrodriguezlr","Raul Rodriguez",getMD5(contraseña)));
		
		System.out.println(contraseña.equalsIgnoreCase(getMD5(contraseña)));
		System.out.println(getMD5("Qwerty123456").equalsIgnoreCase(getMD5(contraseña)));
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

