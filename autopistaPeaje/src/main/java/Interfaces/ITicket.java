package Interfaces;

/**
 * INTERFAZ
 * Esta clase guardará los metodos a utilizar en las demas clases
 * @author NACHO
 *
 */

public interface ITicket {
	
	String registroTicketEntrada(int kmEntrada, int preciokm);
	String registroTicketSalida(int kmSalida, int tarifa);
	int calculoTarifaGeneral(); //Kilometros recorridos X precio por Kilometro
	int calculoTarifaEspecial(); //(Kilometros recorridos X precio por Kilometro) * Num pasajeros del autobus
	int calcularImporteDeSalida(int kmSalida);
	
}
