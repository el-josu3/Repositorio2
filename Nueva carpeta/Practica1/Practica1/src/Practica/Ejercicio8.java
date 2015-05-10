package Practica;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		double num1=0; double num2=0;
		int u=0; int d=0; int c=0;
		System.out.println("INGRESE DOS NUMEROS ENTRE 0 Y 100");
		Scanner s=new Scanner(System.in);
		num1=s.nextDouble();
		num2=s.nextDouble();
		 String Unidad[]={"", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve"};  
	     String Decena2[]={"", "Once","Doce","Trece","Catorce","Quince","Dieciseis","diecisiete","dieciocho","diecinueve" };
	     String Decena3[]={"", "Veintiuno","Veintidos","Veintitres", "Veinticuatro","Veinticinco","Veintiseis","Veintisiete","Veintiocho","Veintiocho","Veintinueve"};
	     String Decena[]={"", "Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Secenta", "Setenta", "Ochenta", "Noventa"};
	     String Centenas[]={"","Cien"};
	     if (num1>100|num2>100){ //Validacion de los datos.
			System.err.println("Ha ingresado un numero mayor a 100");
			return;
		}else if(num1<0 | num2<0){
			System.err.println("Ha ingresado un numero menor a 0");
			return;
			}
			System.out.println((int)(Math.random()*(num2-num1+1)+num1));
			  u=((int)(Math.random()*(num2-num1+1)+num1))%10;  
		      d=((int)(Math.random()*(num2-num1+1)+num1)/10)%10;  
		      c=(int)(Math.random()*(num2-num1+1)+num1)/100;  
		      if(((int)(Math.random()*(num2-num1+1)+num1)>101)){           
		          System.out.println(Centenas[c]+Decena[d]+Unidad[u]);  
		      }else{  
		          if(((int)(Math.random()*(num2-num1+1)+num1)>=10)){  
		              System.out.println(Decena[d]+Unidad[u]);            
		          }else{  
		              System.out.println(Unidad[((int)(Math.random()*(num2-num1+1)+num1))]);            
		          }            
		      }
	}
}


	


