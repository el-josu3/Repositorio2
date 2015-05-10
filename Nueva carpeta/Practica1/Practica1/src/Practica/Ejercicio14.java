package Practica;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		int num=0;
		System.out.println("Ingrese la longitud de su cuadrado");
		Scanner s=new Scanner (System.in);
		num=s.nextInt();
		for (int i=1; i<=num; i++){//Primer ciclo para mostrar las lineas horizontales.
			for (int j=1; j<=num; j++){
				if (j==1 || j==num || i==1 || i==num ){// Condicion para evaluar los vertices del cuadrado
					System.out.print("*");				// Si esta en las orillas que imprima las lineas verticales
				}	else{								// De lo contrario cuando este dentro del cuadrado solo vaya dejando espacios en blanco.
					System.out.print(" ");
				}
				
			}
			System.out.println();// Para correrse a la siguiente linea.	
		}
		
		
	}

}
