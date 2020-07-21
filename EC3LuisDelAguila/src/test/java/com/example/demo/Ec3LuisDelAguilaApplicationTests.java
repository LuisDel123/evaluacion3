package com.example.demo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.interfaces.IUsuario;
import com.example.demo.model.Usuario;


@SpringBootTest
class  Ec3LuisDelAguilaApplicationTests {
	
	@Autowired
	private IUsuario repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;	
	
	@Test
	public void crearUsuarioTest() {
		Usuario us= new Usuario();
		us.setId(3);
		us.setNombre("docenteaaa");
		us.setClave(encoder.encode("d18135aa"));
		Usuario retorno = repo.save(us);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
