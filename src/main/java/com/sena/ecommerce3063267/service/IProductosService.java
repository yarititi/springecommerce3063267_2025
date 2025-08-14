package com.sena.ecommerce3063267.service;

import java.util.List;
import java.util.Optional;

import com.sena.ecommerce3063267.model.Producto;

public interface IProductosService {

	
	public Producto save(Producto prducto);
	
	public Optional<Producto> get(Integer id);
	
	public void update(Producto producto);
	
	public void deelete(Integer id);
	
	public List<Producto> findAll();
	
}
