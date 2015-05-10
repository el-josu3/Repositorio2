package Practica;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		 
	}
	public static void Pito(){
		char espacio = ' '; 
	    char asterisco = '*'; 
	    for (int i= 1; i<=5; i++){ 
	           for (int espacios = 5 - i; espacios >0; espacios--)       
	                System.out.print(espacio); 
	                 for (int lineas = 1; lineas < 2 * i; lineas++) 
	                   System.out.print(asterisco); 
	                    System.out.println(""); 
	        } 
	        for (int i= 4; i>=1; i--){ 
	           for (int espacios = 5 - i; espacios >0; espacios--)       
	                System.out.print(espacio); 
	                 for (int lineas = 1; lineas < 2 * i; lineas++) 
	                   System.out.print(asterisco); 
	                    System.out.println(""); 
	        } 
	}
}

