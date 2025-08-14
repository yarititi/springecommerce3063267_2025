package com.sena.ecommerce3063267.service;

import java.util.List;
import java.util.Optional;

import com.sena.ecommerce3063267.model.Orden;
import com.sena.ecommerce3063267.model.Usuario;

public interface IOrdenService {

public Orden save(Orden orden);
	
	public Optional<Orden> findById(Integer id);

	public List<Orden> findAll();
	
	public List<Orden> findByUsuario(Usuario usuario);
	
	public String generarNumeroOrden();
	
}
