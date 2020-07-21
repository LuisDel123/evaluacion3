package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IUsuario;
import com.example.demo.model.Usuario;


@Service
public class UsuarioService implements UserDetailsService {
	
	@Autowired
	private IUsuario repousuario;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario us = repousuario.findBynombre(username); 
		
		List<GrantedAuthority> roles= new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		UserDetails userDet = new User(us.getNombre(),us.getClave(),roles);
		return userDet;
	}


}
