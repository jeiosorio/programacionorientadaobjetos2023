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
		
		int total = 0;  
		int grade; 
		int gradeCounter = 1; 
		int average;
		
		while ( gradeCounter <=5) {
			System.out.println( " por favor ingresar la nota ");
			grade = sc.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}
		
		average = total/5;
		System.out.println(" el promedio de las notas son " + average);
		
	}
}
