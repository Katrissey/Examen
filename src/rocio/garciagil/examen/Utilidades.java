package rocio.garciagil.examen;

import java.util.Scanner;


public class Utilidades {
	
	public static String pideDatoTexto (String peticionTexto) {
		System.out.println (peticionTexto);
		Scanner scan = new Scanner (System.in);
		String respuestaFormaTexto = scan.nextLine ();
		
		return respuestaFormaTexto;
	
	}
		
	public static int pideDatoNumerico (String peticionNumero) {
		System.out.println (peticionNumero);
		Scanner scan = new Scanner (System.in);
		int respuestaFormaNumero = scan.nextInt ();
		
		return respuestaFormaNumero;
	}
	
	
	public static int pintarMenu (String menu, String pregunta) {
		System.out.println (menu);
		int opcion = pideDatoNumerico (pregunta);
	
		return opcion;

	}
	
	public static int pintarMenu (String [] array, String pregunta) {
		for ( String menu : array) {
		System.out.println (menu);
		}
		
		int opcion = pideDatoNumerico (pregunta);
	
		return opcion;

	}
	
	
}
