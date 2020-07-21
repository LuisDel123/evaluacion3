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

import com.example.demo.interfaceService.IProductosService;
import com.example.demo.model.Productos;

@Controller	
@RequestMapping
public class ControladorProductos {

	@Autowired
	private IProductosService service;
	
	@GetMapping("/listarProducto")
	public String listar(Model model) {
		List<Productos>productos=service.listar();
		model.addAttribute("productos",productos);
		return "indexproducto";
	}
	
	@GetMapping("/newProducto")
	public String agregar(Model model) {		
		model.addAttribute("productos",new Productos());
		return "formproducto";
	}
	
	@PostMapping("/saveProducto")
	public String save( Productos p,Model model) {		
		service.save(p);
		return "redirect:/listarProducto";
	}
	
	@GetMapping("/editarProducto/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Productos>productos=service.listarId(id);
		model.addAttribute("productos",productos);
		return "formproducto";
	}	
	
	@GetMapping("/eliminarProducto/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listarProducto";
	}

	
}
