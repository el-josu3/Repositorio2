package Practica;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		double num1=0; double num2=0;
		String exp=" ";
		System.out.println("INGRESE DOS NUMEROS ");
		Scanner s=new Scanner (System.in);
		num1=s.nextDouble();
		num2=s.nextDouble();
		System.out.println("INGRESE LA OPERACION QUE DESEE REALIZAR: ");
		System.out.println("La opcion {s} es para mostrar la Suma de sus numeros");
		System.out.println("La opcion {r} es para mostrar la Resta de sus numeros");
		System.out.println("La opcion {m} es para mostrar la Multiplicacionde sus numeros");
		System.out.println("La opcion {d} es para mostrar el residuo de sus numeros");
		exp=s.next();
		// Validacion de las operaciones
		switch (exp){
		case"s":
			System.out.println("LA SUMA DE LOS NUMEROS INGRESADOS ES DE: "+(num1+num2));
			break;
		case"S":
			System.out.println("LA SUMA DE LOS NUMEROS INGRESADOS ES DE: "+(num1+num2));
			break;
		case "r":
			System.out.println("LA RESTA DE LOS NUMEROS INGRESADOS ES DE: "+(num1-num2));
			break;
		case "R":
			System.out.println("LA RESTA DE LOS NUMEROS INGRESADOS ES DE: "+(num1-num2));
			break;
		case "m":
			System.out.println("LA MULTIPLICACION DE LOS NUMEROS INGRESADOS ES DE: "+(num1*num2));
			break;
		case "M":
			System.out.println("LA MULTIPLICACION DE LOS NUMEROS INGRESADOS ES DE: "+(num1*num2));
			break;
		case "d":
			System.out.println("EL COCIENTE DE LOS NUMEROS INGRESADOS ES DE: "+(num1/num2));
			break;
		case "D":
			System.out.println("EL COCIENTE DE LOS NUMEROS INGRESADOS ES DE: "+(num1/num2));
			break;
		default:
			System.err.println("HA INGRESADO  UNA OPERACION INVALIDA, LEEA BIEN LAS INSTRUCCIONES!");
			break;

							
		}
				

}
}