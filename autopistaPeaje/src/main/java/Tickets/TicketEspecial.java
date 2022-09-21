package Tickets;

import java.util.Scanner;

import Constantes.Constantes;

public class TicketEspecial extends Ticket {
	
	public TicketEspecial(int kmInicial, int pasajeros) {
		super(kmInicial);
		// TODO Auto-generated constructor stub
	}



	Scanner scanner = new Scanner(System.in);
	protected int kmtotales;
	protected int tarifa;
	protected int porcentaje;
	protected int reduccion;
	protected int pasajeros;
	
	public void registrarTicketEntrada() 
	{
		System.out.println("Dame el kilometro de entrada ");
		int km=Integer.parseInt(scanner.nextLine());
		
		System.out.println("Ticket creado: KilometrosIniciales: "+this.kmInicial+" Precio*Kilometro: "+Constantes.PRECIO_KM);
		
	}
	
	

	public int getPasajeros() {
		return pasajeros;
	}



	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}



	@Override
	public void registrarTicketSalida(int km) 
	{
		System.out.println("Digame el numero de pasajeros del autobus");
		this.pasajeros=Integer.parseInt(scanner.nextLine());
		
			this.kmtotales = km - this.kmInicial;
		
			this.tarifa = this.kmtotales * Constantes.PRECIO_KM * this.pasajeros;
		
			if (this.kmtotales >= 100)
			{
			
				this.reduccion = tarifa * 5 / 100;
			
				this.tarifa = tarifa - reduccion;
			
			}

			System.out.println("Ticket final Especial kmTotales=" + this.kmtotales + ", Tarifa=" + this.tarifa + ", Pasajeros= " + this.pasajeros);
		
		
	}
	
	

}
