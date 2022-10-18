package com.idat.SeptiembreIIIE.service;

import java.util.List;

import com.idat.SeptiembreIIIE.model.Proveedor;

public interface ProveedorService {
	List<Proveedor> lista();
	Proveedor obtener(Integer idProveedor);
	void guardar(Proveedor proveedor);
	void actualizar(Proveedor proveedor);
	void eliminar(Integer idProveedor);
	
}
