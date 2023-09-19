package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
		
	}
	
	@RequestMapping("/eventos/form/salvar")
	public String salvar(String Evento) {
		System.out.println("nome;"+ Evento);
		System.out.println("local;"+ Evento);
		System.out.println("data;"+ Evento);
		System.out.println("horario;"+ Evento);
		return "formEvento";
	}

}
