package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;
import com.example.demo.model.Categoria;



public interface ICategoriaService {

	public List<Categoria> listar();
	public Optional<Categoria> listarId(int c);
	public int save(Categoria c);
	public void delete(int id);
}
