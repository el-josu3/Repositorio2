package Practica;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int opcion=0;
		Scanner s=new Scanner(System.in);
		opcion=s.nextInt();
		while (opcion != 0){
			
			switch (opcion){
			
			case 1:
					Ejercicio1.Pito(); //
					
					break;
				
			case 2:
				System.out.println("INGRESE LAS 6 NOTAS DE SU CURSO DE IPC1 DE 0-100 PTS");
				Ejercicio2.Atol4(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
		
			}
			
			opcion=s.nextInt();
			
		}
		
	}

}
