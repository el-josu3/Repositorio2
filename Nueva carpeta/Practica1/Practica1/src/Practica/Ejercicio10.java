package Practica;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		char espacio = ' ';  
		int num=0;
		System.out.print("Ingrese un numero: ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for (int i= num; i>=1; i--){ 
	           for (int j=num-i; j>0;j--)       
	                System.out.print(" "); 
	                 for (int k = 1; k < 2*i ; k++) 
	                   System.out.print(i); 
	                    System.out.println(""); 
	        } 
}
}



	


