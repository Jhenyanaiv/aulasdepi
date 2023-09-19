package ifrn.pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.evento;
import ifrn.pi.eventos.repositories.EventoRepositery;

@Controller
public class EventosController{
	
	@Autowired
	private EventoRepositery er;
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
		
	}
	
	@RequestMapping( "/eventos")
	public String salvar(evento Evento) {
		System.out.println(Evento);
		er.save(Evento);
		return "formEvento";
	}

}
