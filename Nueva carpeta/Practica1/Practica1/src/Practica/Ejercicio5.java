package Practica;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	int Di=0; int Df=0; int Mf=0; int Mi=0; int Af=0; int Ai=0; int a=0; int m=0; int d=0; int totalDias=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Ingrese la fecha del dia final que desee calcular");
	Df=s.nextInt();
	System.out.println("Ingrese la fecha del dia inicial que desee calcular");
	Di=s.nextInt();
	System.out.println("Ingrese la fecha del mes final que desee calcular");
	Mf=s.nextInt();
	System.out.println("Ingrese la fecha del mes inicial que desee calcular");
	Mi=s.nextInt();
	System.out.println("Ingrese la fecha del anio final que desee calcular");
	Af=s.nextInt();
	System.out.println("Ingrese la fecha del anio final que desee calcular");
	Ai=s.nextInt();
	if (Af>Ai){
		 a=(Af-Ai)*360;
		 m=(Mf-Mi)*60;
		 d=(Df-Di);
		 totalDias=a+m+d;
		 System.out.println("Esta es la diferencia de dias entre una fecha y otra: "+(totalDias));
	}else{
		System.err.println("Ingreso una fecha mal");
	}
	         }  
 }  
	
	


