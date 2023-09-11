package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class EventosController {
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}

}
