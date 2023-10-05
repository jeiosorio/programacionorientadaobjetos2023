package edu.caldas.ingenieria.POO.gradebook;

import java.util.Scanner;

public class Gradebook {
	
	private String coursename;
	// zona de contructores
	public Gradebook()
	// construtor vacio
	{
	}
	public Gradebook(String coursename) {
		this.coursename = coursename;
		// TODO Auto-generated constructor stub
		// this escoger el atributo principal
	}

	public String getcoursename() {
	return coursename;
	}
	
	public void  setcoursename(String coursename) {
		this.coursename = coursename;
	}
	// zona de logica
		public void displayMessage(String coursename) {
			System.out.println(" hello course programacion orientada a objetos 2023 " + coursename);	
	}
		
	public void determineClassAveriguar() {
		
		Scanner sc = new Scanner(System.in);
		double total = 0;  
		double grade; 
		double gradeCounter = 1; 
		double average = 0;
		
		System.out.println(" ingrese la nota o ingrese -1 para salir");
	    grade = sc.nextDouble();
		
		while ( grade != -1) {
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
			System.out.println(" ingrese la tecla -1 para salir");
			grade = sc.nextDouble();
		}
		if (gradeCounter !=0) {
			average = total/gradeCounter;
		}
		
		System.out.println(" el promedio total de la nota es  " + average);
		
	}
}
