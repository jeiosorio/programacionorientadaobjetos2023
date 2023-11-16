package edu.caldas.ingenieria.POO.herenciaabstracto;

public class vehiculo {
	//Contructor
	public vehiculo(String marca, String modelo, double kilometrosRecorridos) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometrosRecorridos= kilometrosRecorridos;
	}
	
	//Variables de clase
	public int vehiculosCreados;
	public double kilometrosTotales;
	
	//Varible de instancia
	public String marca;
	public String modelo;
	public double kilometrosRecorridos;	
		
	public int getVehiculosCreados() {
		return vehiculosCreados;
	}
	
	public void setVehiculosCreados(int vehiculosCreados) {
		this.vehiculosCreados = vehiculosCreados;
	}
	
	public double getKilometrosTotales() {
		return kilometrosTotales;
	}
	
	public void setKilometrosTotales(double kilometrosTotales) {
		this.kilometrosTotales = kilometrosTotales;
	}
	
	public double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	
	public void setKilometrosRecorridos(double kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}
	
	public static void salir() {
		System.out.println("ha salido del programa =D");
	}


}
