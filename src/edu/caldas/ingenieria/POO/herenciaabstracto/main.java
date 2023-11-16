package edu.caldas.ingenieria.POO.herenciaabstracto;


	import java.io.PrintStream;
	import java.util.Scanner;
	
	public class main {

		public static Scanner keyboard = new Scanner(System.in);
	    public static PrintStream screen = System.out;
		
		public static void main(String[] args) {		
		
			carro mazda = new carro("Mazda", "1998", 100);
			bicicleta gw = new bicicleta("GW", "2015", 30);	
			
			System.out.println("1. andar bicicleta");
			System.out.println("2. picar bicicleta");
			System.out.println("3. andar en carro");
			System.out.println("4. quemar llantas");
			System.out.println("5. ver kilometraje bicicleta");
			System.out.println("6. ver kilometraje carro");
			System.out.println("7. ver kilometraje total");
			System.out.println("8. salir");
		
	        double result = 0;
			int opcion = 8;
			
			 while (opcion !=0){
		            screen.println(" elija un numero del 1 al 7.Numero 8 para salir ");
		            
		        opcion = Integer.parseInt(keyboard.next());

				switch (opcion) {
		            case 1:
		                gw.andarBicicleta();
		        		System.out.println("la bicicleta " + gw.marca + " recorrio " + gw.kilometrosRecorridos + " kilometros andando");

		                break;
		            case 2:
		                gw.picarBicicleta();
		        		System.out.println("la bicicleta " + gw.marca + " recorrio " + gw.kilometrosRecorridos + " kilometros picando");
		        		break;
		            case 3:
		                mazda.andarCarro();
		        		System.out.println("el carro " + mazda.marca + " recorrio " + mazda.kilometrosRecorridos + " kilometros andando");
		                break;
		            case 4:
		                mazda.quemarLlantaCarro();
		        		System.out.println("el carro " + mazda.marca + " recorrio " + mazda.kilometrosRecorridos + " kilometros quemando llanta");
		                break;
		            case 5:
		                screen.println(" el kilometraje de la bicicleta es: " + gw.kilometrosRecorridos + " kilometros recorridos" );
		                break;
		            case 6:
		                mazda.getKilometrosRecorridos();
		                screen.println(" el kilometraje del carro es: " + mazda.kilometrosRecorridos + " kilometros recorridos");
		                break;
		            case 7:
		            	result = gw.kilometrosRecorridos + mazda.kilometrosRecorridos;
		                screen.println(" el kilometraje total de ambos vehiculos es de: " + result + " kilometros");
		            	break;
		            case 8:
		                vehiculo.salir();
		                return;
		        }
		        
		        screen.println(" el usuario escogio el numero " + opcion);
			 }
		}
	}
	

