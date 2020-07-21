package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="productos")
public class Productos {

	@Id
	@Column(name ="id")
	private int id;	
	@Column (name="nombreproducto" , length = 40)
	private String nombreProducto;
	@Column (name="idproveedor")
	private int idProveedor;
	@Column (name="cantidadporunidad",length = 20)
	private String cantidadPorUnidad;
	@Column (name="preciounidad")
	private double precioUnidad;
	@ManyToOne
	@JoinColumn(name="idcategoria",referencedColumnName="idcategoria", nullable=false)
	public Categoria idcategoria;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getCantidadPorUnidad() {
		return cantidadPorUnidad;
	}
	public void setCantidadPorUnidad(String cantidadPorUnidad) {
		this.cantidadPorUnidad = cantidadPorUnidad;
	}
	public double getPrecioUnidad() {
		return precioUnidad;
	}
	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}
	public Categoria getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(Categoria idcategoria) {
		this.idcategoria = idcategoria;
	}
	
	
	
	
	public Productos(int id, String nombreProducto, int idProveedor, String cantidadPorUnidad, double precioUnidad,
			Categoria idcategoria) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.idProveedor = idProveedor;
		this.cantidadPorUnidad = cantidadPorUnidad;
		this.precioUnidad = precioUnidad;
		this.idcategoria = idcategoria;
	}
	public Productos() {
		
	}
	
	
	
}
