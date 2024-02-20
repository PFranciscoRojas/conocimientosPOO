package com.poo;

class Tienda {
	private String nombreArma;
	private String tipoArma;
	private double precio;
	private int cantidadDisponible;

	public Tienda(String nombreArma, String tipoArma, double precio, int cantidadDisponible) {
		// TODO Auto-generated constructor stub
		this.nombreArma = nombreArma;
		this.tipoArma = tipoArma;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}

	public String getNombreArma() {
		return nombreArma;
	}

	public void setNombreArma(String nombreArma) {
		this.nombreArma = nombreArma;
	}

	public String getTipoArma() {
		return tipoArma;
	}

	public void setTipoArma(String tipoArma) {
		this.tipoArma = tipoArma;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	

}
