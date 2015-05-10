package Practica;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	 String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
     String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
     String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; 
     String Miles []={"", "C", "CC", "CCC"} ;
     System.out.println("Ingrese un numero arabigo que desee convertir a Romano");  
     int num = s.nextInt();  
     int u=num%10;  
     int d=(num/10)%10;  
     int c=num/100;  
     if(num>=300){           
         System.out.println(Centena[c]+Decena[d]+Unidad[u]);  
     }else{  
         if(num>=10){  
             System.out.println(Decena[d]+Unidad[u]);            
         }else{  
             System.out.println(Unidad[num]);            
         }            
     }            
     
 
		
	


	}
}
