package com.idat.SeptiembreIIIE.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.SeptiembreIIIE.model.Producto;

@Repository
public class ProductoRespositoryImp implements ProductoRepository {

	List<Producto> almacenamiento = new ArrayList<>();
	
	@Override
	public void guardar(Producto producto) {
		almacenamiento.add(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		Producto existeActualizar = obtener(producto.getIdProducto());
		eliminar(existeActualizar.getIdProducto());
		almacenamiento.add(producto);
	}

	@Override
	public void eliminar(Integer id) {
		Producto existeEliminar = obtener(id);
		almacenamiento.remove(existeEliminar);
	}

	@Override
	public List<Producto> listar() {
		return almacenamiento;
	}

	@Override
	public Producto obtener(Integer id) {
		// TODO Auto-generated method stub
		return almacenamiento.stream().filter(p-> p.getIdProducto()==id).findFirst().orElse(null);
	}

}
