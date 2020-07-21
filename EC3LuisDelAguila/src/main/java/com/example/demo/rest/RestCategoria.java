package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.ICategoria;
import com.example.demo.model.Categoria;


@RestController
@RequestMapping("/rest_cat")
public class RestCategoria {

	@Autowired
	private ICategoria data;		
	
	@GetMapping
	public List<Categoria> listar() {	
	return (List<Categoria>)data.findAll();
	}
	
	
	

	@PostMapping
	public void insertar(@RequestBody Categoria cat) {
	data.save(cat);
	}

	@PutMapping
    public void modificar(@RequestBody Categoria cat) {
        data.save(cat);
    }
    
    @DeleteMapping(value ="/{idcategoria}")
    public void eliminar(@PathVariable("idcategoria") Integer idcategoria) {
        data.deleteById(idcategoria);
    }  
    
    
    //LISTAR POR ID
    @GetMapping(value ="/{idcategoria}")
	public Optional<Categoria> listar(@PathVariable("idcategoria") Integer id) {	
	return data.findById(id);
	}
}
