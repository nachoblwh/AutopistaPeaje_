package Tickets;

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
		
	private int precioKilometro;
	private final int kilometroEntrada;
	private int kilometroSalida;
	private double tarifa;
	private final int precio;
	
	public Ticket(int precioKilometro, int kilometroEntrada, int kilometroSalida, double tarifa, int precio) 
	{
		super();
		this.precioKilometro = precioKilometro;
		this.kilometroEntrada = kilometroEntrada;
		this.kilometroSalida = kilometroSalida;
		this.tarifa = tarifa;
		this.precio = precio;
	}

	public int getPrecioKilometro() 
	{
		return precioKilometro;
	}

	public void setPrecioKilometro(int precioKilometro) 
	{
		this.precioKilometro = precioKilometro;
	}

	public int getKilometroEntrada() {
		return kilometroEntrada;
	}

	public void setKilometroEntrada(int kilometroEntrada) 
	{
		this.kilometroEntrada = kilometroEntrada;
	}

	public int getKilometroSalida() 
	{
		return kilometroSalida;
	}

	public void setKilometroSalida(int kilometroSalida) 
	{
		this.kilometroSalida = kilometroSalida;
	}

	public double getTarifa() 
	{
		return tarifa;
	}

	public void setTarifa(double tarifa) 
	{
		this.tarifa = tarifa;
	}

	public int getPrecio() 
	{
		return precio;
	}

	public void setPrecio(int precio) 
	{
		this.precio = precio;
	}
	
	
	public String registroTicketEntrada(int kmEntrada, int preciokm) 
	{
		return "Se ha creado el ticket (kmEntrada:"+kmEntrada+" Precio"+Constantes.getPrecioTarifaGeneral()+")";
	}
	
	public abstract String registroTicketSalida(int kmSalida, int tarifa);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
