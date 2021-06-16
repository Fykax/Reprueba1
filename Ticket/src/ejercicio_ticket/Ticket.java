package ejercicio_ticket;

public class Ticket {
	
	//Atributos
	private int numTicket;
	private char serie;
	private String descripcion;
	
	
	//Constructor
	public Ticket(int pnumTicket, char pserie, String pdescripcion) {
		numTicket = pnumTicket;
		serie = pserie;
		descripcion = pdescripcion;
	}
	
	
	//Metodos
	public int getnumTicket() {
		return numTicket;
	}
	
	public void setnumTicket(int numTicket) {
		this.numTicket = numTicket;
	}
	
	public char getserie() {
		return serie;
	}
	
	public void setserie(char serie) {
		this.serie = serie;
	}
	
	public String getdescripcion() {
		return descripcion;
	}
	
	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	public int sacarTicket() {
		if(numTicket < 99) {
			numTicket++;
		}else {
			numTicket = 0;
			serie++;
		}
		return numTicket;
	}
	
	@Override
	public String toString() {
		String formato;
		formato = String.format("     -->  %s%s%s  %03d%s","<<", descripcion, ">>", numTicket, serie);
		return formato;
	}

}
