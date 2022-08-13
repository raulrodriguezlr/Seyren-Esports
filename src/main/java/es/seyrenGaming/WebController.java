package es.seyrenGaming;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

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
	
}
