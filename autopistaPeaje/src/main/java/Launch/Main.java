package Launch;

import Tickets.Ticket;
import Tickets.TicketEspecial;

public class Main {

	public static void main(String[] args) {
		TicketEspecial tesp1= new TicketEspecial(2, 200, 450, 0, 0);
		
		System.out.println(tesp1.toString());
	}

}
