package Practica;

import java.util.Scanner;
import  java.lang.Math;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String op=" ";
		double area=0;
		double perimetro=0;
		double r=0;
		System.out.println("Ingrese la opcion que desee calcular, UX, C,X O T,X");
		op=s.nextLine();
		switch 	(op) {
		case "C,X":
			System.out.println("Ingrese un numero x");
			r=s.nextDouble();//Numero cualquiera que ingrese el usuario
		area= Math.PI * Math.pow(r,2);//Permite llamar al PI y trabajarlo como numero. Con la libreria
		//math.pow
		perimetro=2*Math.PI*r;
		System.out.println("Estos son sus resultados: ");
		System.out.println("El radio: "+(r));
	    System.out.println("el area de su circulo es: " +(area));
	    System.out.println(  "Y el perimetro es:"+(perimetro));
		break;
		case "U,X"://Caso para un cuadrado
			System.out.println("Ingrese un numero x");
			r=s.nextDouble();
			area= r*r;
			perimetro=4*r;
			System.out.println("Estos son sus resultados: ");
			System.out.println("el area de su cuadrado es : " +(area));
		    System.out.println(  "Y el perimetro es:"+(perimetro));
			break;
		case "T,X":
			System.out.println("Ingrese un numero x");
			r=s.nextDouble();
			area= (r*r)/2;
			perimetro=3*r;
			System.out.println("Estos son sus resultados: ");
			System.out.println("el area de su triangulo es : " +(area));
		    System.out.println(  "Y el perimetro es:"+(perimetro));
			break;
			default:
			System.err.println("No selecciono ninguna opcion");
			break;
				}
		}
}


