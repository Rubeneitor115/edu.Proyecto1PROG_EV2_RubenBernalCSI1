/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import servicios.OperativaInterfaz;

import java.util.Random;
import java.util.Scanner;

import servicios.OperativaImplementacion;

/**
 * Clase controladora de la aplicación
 * rbr - 211024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 211024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero = 0;
		String respuesta;
		boolean seguir = false, seguir2 = false;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Instancio las interfaces con sus implementaciones
		OperativaInterfaz oi = new OperativaImplementacion();
		
		//Creo un bucle que se realizará mientras el usuario quiera seguir jugando
		do {
			//Genero el número aleatorio entre 1 y 100
			Random aleatorio = new Random();
			int intAleatorio = aleatorio.nextInt(100) + 1;
			//Muestro el título de la aplicación
			oi.mostrarTitulo();
			//Realizo la operativa principal de la aplicación
			oi.solicitaNumero(numero, intAleatorio);
			//Pregunto al usuario si quiere volver a jugar
			System.out.println("¿Quieres jugar de nuevo? (S/N):");
			//Recojo la respuesta del usuario
			respuesta = sc.next();
			//Controlo si el usuario quiere seguir jugando
			if(respuesta.equals("N") || respuesta.equals("n")) {
				seguir = true;
			}else if(respuesta.equals("S") || respuesta.equals("s")) {
				seguir = false;
			}
		}while(!seguir);

	}

}
