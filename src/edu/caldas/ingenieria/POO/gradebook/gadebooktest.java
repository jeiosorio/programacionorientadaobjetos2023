package edu.caldas.ingenieria.POO.gradebook;

import java.util.Scanner;

public class gadebooktest {

public gadebooktest(){
}
	public static void main( String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Gradebook gradebook = new Gradebook();
		Gradebook gradebookprogramacion = new Gradebook(" programacion orientada a objertos");
		
		gradebook.determineClassAveriguar();
		
		
		/*
		System.out.println(" hola cual es en nombre de curso ");
		String courseName = sc.nextLine();
		System.out.println(" give a course name(): " + gradebook.getcoursename());
		System.out.println(" programacion orientada a objetos():"+ gradebookprogramacion00);
		gradebook.displayMessage(courseName);
		*/
	}
}
