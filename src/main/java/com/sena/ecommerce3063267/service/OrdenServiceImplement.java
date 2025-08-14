package com.sena.ecommerce3063267.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.ecommerce3063267.model.Orden;
import com.sena.ecommerce3063267.model.Usuario;
import com.sena.ecommerce3063267.repository.IOrdenRepository;

@Service
public class OrdenServiceImplement implements IOrdenService{
	
	@Autowired
	private IOrdenRepository ordenRepository;

	@Override
	public Orden save(Orden orden) {
		// TODO Auto-generated method stub
		return ordenRepository.save(orden);
	}

	@Override
	public Optional<Orden> findById(Integer id) {
		// TODO Auto-generated method stub
		return ordenRepository.findById(id);
	}

	@Override
	public List<Orden> findAll() {
		// TODO Auto-generated method stub
		return ordenRepository.findAll();
	}

	@Override
	public List<Orden> findByUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return ordenRepository.findByUsuario(usuario);
	}

	@Override
	public String generarNumeroOrden() {
		int numero = 0;
		String numeroConcatenado = "";
		List<Orden> ordenes = findAll();
		List<Integer> numeros = new ArrayList<Integer>();
		
		//funciones de java8
		//variable anonima
		
		ordenes.stream().forEach(o -> numeros.add(Integer.parseInt(o.getNumero())));
		
		//vaidacion
		if (ordenes.isEmpty()) {
			numero=1;
		} else {
				numero=numeros.stream().max(Integer::compare).get();
			}
		if (numero<10) {
			numeroConcatenado="T000000000"+String.valueOf(numero);
		} else if (numero<100){
			numeroConcatenado="T00000000"+String.valueOf(numero);
		}else if(numero<1000){
			numeroConcatenado="T0000000"+String.valueOf(numero);
		}
		
		return numeroConcatenado;
	}

	
}
