package com.idat.SeptiembreIIIE.service;

import java.util.List;

import com.idat.SeptiembreIIIE.model.Item;

public interface ItemService {
	List<Item> lista();
	Item obtener(Integer idItem);
	void guardar(Item item);
	void actualizar(Item item);
	void eliminar(Integer idItem);
	
}
