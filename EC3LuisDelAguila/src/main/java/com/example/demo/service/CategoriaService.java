package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.ICategoriaService;
import com.example.demo.interfaces.ICategoria;
import com.example.demo.model.Categoria;




@Service
public class CategoriaService implements ICategoriaService{

	@Autowired
	ICategoria data;
	
	@Override
	public List<Categoria> listar() {
		return (List<Categoria>)data.findAll();
	}

	@Override
	public Optional<Categoria> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Categoria c) {
		int res=0;
		Categoria categoria=data.save(c);
		if(!categoria.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}
	
}
