package edu.caldas.ingenieria.POO.gradebook;

public class Gradebook {
	
	private String coursename;
	// zona de contructores
	public Gradebook()
	// construtor vacio
	{
	}
	
	public Gradebook(String coursename) {
		super();
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
		public void displayMessage(String course) {
			System.out.println(" hello course programacion orientada a objetos 2023 " + course);	
	}
}
