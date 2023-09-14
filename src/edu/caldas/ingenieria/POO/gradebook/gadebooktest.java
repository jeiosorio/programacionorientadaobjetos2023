package edu.caldas.ingenieria.POO.gradebook;

import java.util.Scanner;

public class gadebooktest {

public gadebooktest(){
}
	public static void main( String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Gradebook gradebook = new Gradebook();
		
		System.out.println(" give a course name: ");
		
		String courseName = sc.nextLine();
		
		gradebook.displayMessage(courseName);
	}
}
