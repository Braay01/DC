package com.DigitalContentV2.DigitalContentv2.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "cart_items")
public class Car_items {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto product;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Usuario cliente;
		
	@ManyToOne
	@JoinColumn(name = "ordenCompra")
	private Entrega ordenCompra;

	private int cantidad;
	
	public Entrega getOrdenCompra() {
		return ordenCompra;
	}

	public void setOrdenCompra(Entrega ordenCompra) {
		this.ordenCompra = ordenCompra;
	}

	public Integer getId() {
		return id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Producto getProduct() {
		return product;
	}

	public void setProduct(Producto product) {
		this.product = product;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	@Transient
	public float getSubtotal() {
		return this.product.getPrecio() * cantidad;
	}	
}
