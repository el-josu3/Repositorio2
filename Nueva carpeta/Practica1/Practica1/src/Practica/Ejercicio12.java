package Practica;
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args) {
		String exp="";
		System.out.println("INGRESE  UNA FRASE");
		Scanner s=new Scanner (System.in);
		exp=s.nextLine();
		String[] vector= exp.split(" ");//Convierte mi cadena de caracteres a un vector y los separa palabra por palabra por eso el (" ")
		for(int j=0;j<vector.length;j++){//Ciclo para evaluar cada palabra 
			for (int i=0; i<vector[j].length() ;i++){// Ciclo para evaluar caracter por caracter
				System.out.print("*");
			}
			System.out.print(" ");			
			}
	}

}



