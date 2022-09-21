package Tickets;

import java.util.Scanner;

import Constantes.Constantes;
import Interfaces.ITicket;

//CLASE ABSTRACTA
/**
 * 
 * @author 2DAM
 *
 */
public abstract class Ticket implements ITicket 
{
	Scanner scanner= new Scanner(System.in);	
	protected int kmInicial;

	public Ticket(int kmInicial) 
	{
		super();
		this.kmInicial = kmInicial;
	}
	
	
	public void registrarTicketEntrada() 
	{
		System.out.println("Dame el kilometro de entrada ");
		int km=Integer.parseInt(scanner.nextLine());
		
		System.out.println("Ticket creado: KilometrosIniciales: "+this.kmInicial+" Precio*Kilometro: "+Constantes.PRECIO_KM);
		
	}
	
	public abstract void registrarTicketSalida(int km);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
