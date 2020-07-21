package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.ICategoriaService;
import com.example.demo.model.Categoria;


@Controller	
@RequestMapping
public class ControladorCategoria {
	
	@Autowired
	private ICategoriaService service;
	
	@GetMapping("/listarCategoria")
	public String listar(Model model) {
		List<Categoria>categorias=service.listar();
		model.addAttribute("categorias",categorias);
		return "indexcategoria";
	}
	
	@GetMapping("/newCategoria")
	public String agregar(Model model) {		
		model.addAttribute("categorias",new Categoria());
		return "formcategoria";
	}
	
	@PostMapping("/saveCategoria")
	public String save( Categoria c,Model model) {		
		service.save(c);
		return "redirect:/listarCategoria";
	}
	
	@GetMapping("/editarCategoria/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Categoria>categorias=service.listarId(id);
		model.addAttribute("categorias",categorias);
		return "formcategoria";
	}	
	
	@GetMapping("/eliminarCategoria/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listarCategoria";
	}

	

}
