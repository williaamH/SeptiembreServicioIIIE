package com.idat.SeptiembreIIIE.repository;

import java.util.List;

import com.idat.SeptiembreIIIE.model.Producto;

public interface ProductoRepository {

	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);
	
}
