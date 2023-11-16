package edu.caldas.ingenieria.POO.herenciaabstracto;

public class carro extends vehiculo {
	
	public carro(String marca, String modelo, double kilometrosRecorridos) {
		super(marca, modelo, kilometrosRecorridos);
	}
	
	public void andarCarro() {
		System.out.println("El carro "+ this.marca + " " + this.modelo +" esta en camino.");
	}

	public void quemarLlantaCarro() {
		System.out.println("El carro "+ this.marca + " " + this.modelo +" esta quemando llanta.");
	}
	
}