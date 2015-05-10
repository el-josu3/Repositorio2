package Practica;

import java.util.Scanner;

public class Ejercicio15 {
		public static void main(String[] args) {
		int num=0; int j=0; int cont=0;
		System.out.println("Ingrese un numero ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for (int i=1; i<=num; i++){//Ciclo para calcular los numeros primos.
			if (num%i==0){
				j++;// Validacion para que sea primo.Siempre va a ser 2//
				for (int k=1;k<=i;k++){
					if(j==2){
						cont++;
					}
				}
			}
				
		}
	if 	(j!=2){ //Si tiene mas de dos divisores es par
		 System.out.println("El numero ingresado es par");
	}else{
		System.out.println("Esta es la cantidad de numeros primos antes de "+(num) +":"+(cont));
		  
		}
	}
}

				
		
