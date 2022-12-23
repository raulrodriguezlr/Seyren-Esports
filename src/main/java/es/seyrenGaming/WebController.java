package es.seyrenGaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import es.seyrenGaming.repository.RepoUsuario;




@Controller
public class WebController {
	@Autowired
	private RepoUsuario Users;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	@GetMapping("/team")
	public String team() {
		return "team";
	}
	@GetMapping("/error")
	public String error() {
		return "error";
	}
	@GetMapping("/founders")
	public String founders() {
		return "founders";
	}
	@GetMapping("/newUser")
	public String newUserGet() {
		return "nuevoUsuario";
	}
	@GetMapping("/newUserFallo")
	public String newUserFalloGet() {
		return "nuevoUsuarioFallo";
	}
	@GetMapping("/sponsor")
	public String sponsor() {
		return "sponsor";
	}
	
	
	@GetMapping("/info")
	public String info() {
		return "info";
	}
	
}
