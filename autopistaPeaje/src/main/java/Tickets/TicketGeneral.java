package Tickets;

public class TicketGeneral extends Ticket {

	public TicketGeneral(int precioKilometro, int kilometroEntrada, int kilometroSalida, double tarifa, int precio) 
	{
		super(precioKilometro, kilometroEntrada, kilometroSalida, tarifa, precio);
		// TODO Auto-generated constructor stub
	}
	
	
	public int calcularKilometrosRecorridos(int km)
	{
		int kmRecorridos=getKilometroEntrada()-getKilometroSalida();
		return kmRecorridos;
	}
	
	public int calculoTarifaGeneral()
	{
		return calcularKilometrosRecorridos(getKilometroEntrada() * getPrecio());
	}
	

	

}
