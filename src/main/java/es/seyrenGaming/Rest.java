package es.seyrenGaming;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import es.seyrenGaming.model.NewUser;
import es.seyrenGaming.model.Users;
import es.seyrenGaming.repository.RepoUsuario;
import es.seyrenGaming.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.media.*;


@Controller
public class Rest {
	@Autowired
	private UserService uservice;
	
	@PostMapping("api/newUser")
	public String createUser(String nombre ,String apellido,String login,String correo,String password1,String password2,String pais){
		NewUser nuevoUsuario =new NewUser(nombre,apellido,login,correo,password1,password2,pais);

		if
		(uservice.save(nuevoUsuario))
		
			return "redirect:/";
		else return "redirect:/newUserFallo";
	}

	
	/*
	@RequestMapping(path="/api/usuarioCreado", method=RequestMethod.GET)
	public String usuarioCreado(Model model) {
	    return "index";
	}
	@RequestMapping(path="/api/nuevoUsuarioFallo", method=RequestMethod.GET)
	public String nuevoUsuarioFallo(Model model) {
	    return "nuevoUsuarioFallo";
	}
	*/
}
