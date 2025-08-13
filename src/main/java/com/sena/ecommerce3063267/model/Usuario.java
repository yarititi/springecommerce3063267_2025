package com.sena.ecommerce3063267.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String username;
	private String email;
	private String document;
	private String direccion;
	private String telefono;
	private String password;
	private String tipo;
	
	//relaciones DB(database)
	@OneToMany(mappedBy ="Usuario")
	private List<Producto> productos;
	
	@OneToMany(mappedBy="usuario")
	private List<Orden> ordenes;
	
	//metodo de constructor vacio
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructor con campos
	public Usuario(Integer id, String nombre, String username, String email, String document, String direccion,
			String telefono, String password, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.username = username;
		this.email = email;
		this.document = document;
		this.direccion = direccion;
		this.telefono = telefono;
		this.password = password;
		this.tipo = tipo;
	
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", username=" + username + ", email=" + email
				+ ", document=" + document + ", direccion=" + direccion + ", telefono=" + telefono + ", password="
				+ password + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	
}
