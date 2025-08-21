package com.sena.ecommerce3063267.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String descripion;
	private String imagen; // null>>> default.jpg
	private String precio;
	private String cantidad;

	@ManyToOne
	private Usuario usuario;

	// constructor vacio
	public Producto() {
		super();

	}

//constructor con datos

	public Producto(Integer id, String nombre, String descripion, String imagen, String precio, String cantidad,
			Usuario usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripion = descripion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
		this.usuario = usuario;
	}

//getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripion() {
		return descripion;
	}

	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario=usuario;
	}

//Spring
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripion=" + descripion + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + ", usuario=" + usuario + "]";
	}

}
