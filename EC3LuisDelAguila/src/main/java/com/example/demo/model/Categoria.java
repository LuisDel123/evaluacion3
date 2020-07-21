package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="categorias")
public class Categoria {
	
	@Id
	@Column(name="idcategoria")
	private int idcategoria;	
	@Column (name="nombrecategoria" , length = 100)
	private String nombrecategoria;
	@Column (name="descripcion")
	private String descripcion;
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNombrecategoria() {
		return nombrecategoria;
	}
	public void setNombrecategoria(String nombrecategoria) {
		this.nombrecategoria = nombrecategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Categoria() {
		
	}
	public Categoria(int idcategoria, String nombrecategoria, String descripcion) {
		super();
		this.idcategoria = idcategoria;
		this.nombrecategoria = nombrecategoria;
		this.descripcion = descripcion;
	}
	
	
	

}
