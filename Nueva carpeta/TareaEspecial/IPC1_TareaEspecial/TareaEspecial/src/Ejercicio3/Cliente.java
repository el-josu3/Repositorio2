package Ejercicio3;

public class Cliente {
	
	public void hacerReserva(){
		Reservas reserva=new Reservas(); // Relacion uno a uno entre una reserva para un cliente.
	}
	public void automovil(){
		Automovil auto=new Automovil();//La clase automovil deende de lo que pida el cliente.
	}
	
	public int dpi;
	public String nombre;
	public String direccion;
	public int telefono;
	protected int numeroReserva;
//Metodos
	public void Reservar(){ //El cliente realiza una reservacion de automovil, o varias
		
	}

}
