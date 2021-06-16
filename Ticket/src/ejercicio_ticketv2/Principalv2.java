package ejercicio_ticketv2;

public class Principalv2 {



	public static void main(String[] args) {
	
		int ticket = 0;
		//char serie = 'a';
		
		while (ticket <= 99) {
			System.out.printf("%da\n",ticket);
			ticket++;	
			if(ticket == 99) {
				break;
			}
		}
	}

}
