package schoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Schoo3Controller {
	
	@GetMapping("/")
	public String index() {
		return "input";
	}
	
	@PostMapping("input")
	public String input(@RequestParam String message,
			             Model model) {
		model.addAttribute("message", message);
		return "output";
	}
	
}