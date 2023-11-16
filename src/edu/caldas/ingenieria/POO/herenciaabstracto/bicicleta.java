package edu.caldas.ingenieria.POO.herenciaabstracto;

public class bicicleta extends vehiculo {

	public bicicleta(String marca, String modelo, double kilometrosRecorridos) {
		super(marca, modelo, kilometrosRecorridos);
	}
	
	public void andarBicicleta() {
		System.out.println("La bicicleta "+ this.marca + " " + this.modelo +" esta en camino.");
	}

	public void picarBicicleta() {
		System.out.println("La bicicleta "+ this.marca + " " + this.modelo +" esta picando.");
	}

}
