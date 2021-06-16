package ejercicio_ticket;

public class Principal {

	public static void main(String[] args) {
		
		Ticket dispP = new Ticket(0, 'D', "Pescaderia");
		Ticket dispC = new Ticket(19, 'S', "Carniceria");
		
		
		for (int i = 0; i < 100; i++) {
			dispP.sacarTicket();
			System.out.println(dispP.toString());
		}
		
		for (int b = 19; b < 401; b++) {
			dispC.sacarTicket();
			System.out.println(dispC.toString());
		}
		
		
	}

}
