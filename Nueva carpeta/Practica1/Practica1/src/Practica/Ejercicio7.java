package Practica;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int num=0;
		System.out.println("INGRESE UN NUMERO ENTRE 0-10 PARA MOSTRAR SU TABLA DE MULTIPLICACION");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		// Validacion de los valores para evitar error alguno en el programa.
		if(num<0){
			System.err.println("ES DE 1-10!");
			return;
		}else if (num>10){
				System.err.println("ES DE 0 A 10!");
				return;
		}
		//Salida de la tabla de Multiplicacion en forma descendente.
		for(int i=10;i>=0;i--){
				System.out.println((num) + "*" +(i)+"="+(i*num));
							}
		}
}		



