package com.sena.ecommerce3063267.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//decirle a la clase que es de tipo controlador
@Controller
@RequestMapping("/administrador") // solicitud de mapeo al directorio al administrador
public class AdministradorController {

	@GetMapping("")
	public String home() {
		return "administrador/home";
	}

}
