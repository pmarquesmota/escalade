package pt.marquesmota.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EscaladeController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("test", "Hello, World!");
		return "index";
	}
}
