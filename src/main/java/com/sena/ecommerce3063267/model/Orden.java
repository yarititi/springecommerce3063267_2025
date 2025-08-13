package com.sena.ecommerce3063267.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orden")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fechacreacion;
	private Date fecharecibida;
	private Double total;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private List<DetalleOrden> detalle;

	// constructor vacio
	public Orden() {
		super();

	}

//constructor con campos
	public Orden(Integer id, String numero, Date fechacreacion, Date fecharecibida, Double total, Usuario usuario,
			List<DetalleOrden> detalle) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechacreacion = fechacreacion;
		this.fecharecibida = fecharecibida;
		this.total = total;
		this.usuario = usuario;
		this.detalle = detalle;
	}

	// getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFecharecibida() {
		return fecharecibida;
	}

	public void setFecharecibida(Date fecharecibida) {
		this.fecharecibida = fecharecibida;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<DetalleOrden> getDetalle() {
		return detalle;
	}

	// spring
	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechacreacion=" + fechacreacion + ", fecharecibida="
				+ fecharecibida + ", total=" + total + "]";
	}

}
