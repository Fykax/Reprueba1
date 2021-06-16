package ejercicio_ticketv1;

public class TicketV1 {

	public static void main(String[] args) {
	
		int ticket1 = 0, ticket2 = 0;
		char serie1 = 'A', serie2 = 'B';
		String descripcion1 = "Pescaderia", descripcion2 = "Carniceria";
			
			while (ticket1 <= 99) {
				System.out.printf("       -->   %s%s%s  %03d%s\n","<<", descripcion1, ">>", ticket1, serie1);
				ticket1++;	
				if(ticket1 == 100) {
					ticket1 = 0;
					serie1++;
					if(serie1 == 'B') {
						break;
					}
				}	
			}
			
			while (ticket2 <= 99) {
				System.out.printf("       -->   %s%s%s  %03d%s\n","<<", descripcion2, ">>",ticket2, serie2);
				ticket2++;	
				if(ticket2 == 100) {
					ticket2 = 0;
					serie2++;
					if(serie2 == 'C') {
						break;
					}
				}	
			}
			
		}
}
