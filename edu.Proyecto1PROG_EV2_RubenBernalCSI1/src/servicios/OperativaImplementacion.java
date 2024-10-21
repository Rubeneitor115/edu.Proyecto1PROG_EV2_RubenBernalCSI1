/**
 * Rubén Bernal Ramos, CSI1
 */

package servicios;

import java.util.Scanner;

/**
 * Implementación de la interfaz Operativa
 * rbr - 211024
 */
public class OperativaImplementacion implements OperativaInterfaz{

	/**
	 * Método que mostrará por consola el título de la aplicación
	 * rbr - 211024
	 */
	public void mostrarTitulo() {
		
		System.out.println("=== Bienvenido al Juego de Adivinanza ===");
		System.out.println("He pensado en un número entre 1 y 100. ¡Adivina cuál es!");
		
	}

	/**
	 * Método que irá solicitando números al usuario por consola hasta que adivine el número aleatorio
	 * rbr - 211024
	 */
	public void solicitaNumero(int numero, int intAleatorio) {
		
		//Creo una variable contador para registrar el número de intentos del usuario
		int cont = 0;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creo el bucle que se realizará hasta que el usuario adivine el número aleatorio
		do {
			System.out.println("Introduce tu número: ");
			numero = sc.nextInt();
			//Controlo si el número introducido es menor, mayor o igual que el aleatorio
			if(numero<intAleatorio) {
				System.out.println("El número es menor.");
			}else if(numero>intAleatorio) {
				System.out.println("El número es mayor.");
			}else if(numero==intAleatorio) {
				System.out.println("¡Felicidades! Has acertado el número en " + cont + " intentos.");
			}
			cont++;
		}while(numero!=intAleatorio);
		
	}

}
