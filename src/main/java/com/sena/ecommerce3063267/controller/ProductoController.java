package com.sena.ecommerce3063267.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sena.ecommerce3063267.model.Producto;
import com.sena.ecommerce3063267.model.Usuario;
import com.sena.ecommerce3063267.service.IProductosService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

	
	//Instancia LOGGER
	private final Logger LOGGER =(Logger) LoggerFactory.getLogger(ProductoController.class);
	
	@Autowired
	private IProductosService productoservice;
	
	
	@GetMapping("")
	public String show(Model model) {
		model.addAttribute("productos", productoservice.findAll());
		return "productos/show";
	}
	
	@GetMapping("/create")
	public String create() {
		return"productos/create";
	}
	
	@PostMapping("/save")
	public String save(Producto producto) {
		LOGGER.info("Este es el objeto del producto a guardar en la DB{}",producto);
		Usuario u = new Usuario(1, "", "", "", "", "", "", "", "");
		producto.setUsuario(u);
		productoservice.save(producto);
		return"redirect:/productos";
	}
	
}
