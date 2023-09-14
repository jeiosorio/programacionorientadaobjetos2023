package edu.caldas.ingenieria.POO.gradebook;

import java.util.Scanner;

public class gadebooktest {

public gadebooktest(){
}
	public static void main( String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Gradebook gradebook = new Gradebook();
		
		System.out.println(" give coruse name ");
		String courseName = sc.nextLine();
		Gradebook gradebookprogramacion00 = new Gradebook(" programacion orientada a objertos"); 
		
		System.out.println(" give a course name(): " + gradebook.getcoursename());
		System.out.println(" programacion orientada a objetos():"+ gradebookprogramacion00);
		gradebook.displayMessage(courseName);
	}
}
