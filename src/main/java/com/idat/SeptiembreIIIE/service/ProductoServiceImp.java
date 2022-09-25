package com.idat.SeptiembreIIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.SeptiembreIIIE.model.Producto;
import com.idat.SeptiembreIIIE.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	private ProductoRepository repositorio;
	
	@Override
	public void guardar(Producto producto) {
		repositorio.guardar(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		repositorio.actualizar(producto);

	}

	@Override
	public void eliminar(Integer id) {
		repositorio.eliminar(id);
	}

	@Override
	public List<Producto> listar() {
		return repositorio.listar();
	}

	@Override
	public Producto obtener(Integer id) {
		return repositorio.obtener(id);
	}

}
