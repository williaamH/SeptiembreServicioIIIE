package com.idat.SeptiembreIIIE.service;

import java.util.List;

import com.idat.SeptiembreIIIE.model.Producto;

public interface ProductoService {

	List<Producto> lista();
	Producto obtener(Integer idProducto);
	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer idProducto);
	
}
