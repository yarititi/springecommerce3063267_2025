package com.sena.ecommerce3063267.service;

import java.util.List;
import java.util.Optional;
import com.sena.ecommerce3063267.repository.IProductosRepository;
import org.springframework.stereotype.Service;

import com.sena.ecommerce3063267.model.Producto;

@Service
public class ProductoServiceImplement implements IProductosService{

    private final IProductosRepository IProductosRepository;

    ProductoServiceImplement(IProductosRepository IProductosRepository) {
        this.IProductosRepository = IProductosRepository;
    }

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return IProductosRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// TODO Auto-generated method stub
		return IProductosRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		IProductosRepository.save(producto);
	}

	@Override
	public void deelete(Integer id) {
		// TODO Auto-generated method stub
		IProductosRepository.deleteById(id);
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return IProductosRepository.findAll();
	}
	
	

}
