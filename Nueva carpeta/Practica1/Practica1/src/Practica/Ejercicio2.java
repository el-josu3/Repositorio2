package Practica;

import java.util.Scanner;
public class Ejercicio2 {
	public static void Atol4(int n,int n2, int n3, int n4, int n5, int n6  ){
		double promedio=0;
		
	
		promedio=((n+n2+n3+n4+n5+n6)/6);
	     if (n>100  | n2>100 | n3>100 | n4>100 | n5>100 | n6>100){//Validacion de las notas.
			System.err.println("UNA DE LAS NOTAS INGRESADA NO EXISTE, INGRESELA DE 0-100");
			return;
	     }	
		 if (promedio>0 && promedio <=59){
			System.out.println("Es merecedor de una calificacion E, y su promedio es:"+(promedio));
		}else if (promedio>=60 && promedio <=69){
			System.out.println("Es merecedor de una calificacion D, y su promedio es:"+(promedio));
		}else if (promedio>=70 && promedio <=79){	
			System.out.println("Es merecedor de una calificacion C, y su promedio es:"+(promedio));
		}else if (promedio>=80 && promedio <=89){	
			System.out.println("Es merecedor de una calificacion B, y su promedio es:"+(promedio));
		}else if (promedio>=90 && promedio <=100){	
			System.out.println("Es merecedor de una calificacion A, y su promedio es: "+(promedio));
	} 
	}
	public static void main(String[] args) {
		
		}
					
	     }
		



