
public class TicketDemo {

	public static void main(String[] args) {
		
		Ticket walkupTicket = new WalkupTicket();
		Ticket advanceTicket = new AdvanceTicket(5);
		Ticket advanceTicket2 = new AdvanceTicket(15);
		Ticket studentAdvanceTicket = new StudentAdvanceTicket(5);
		Ticket studentAdvanceTicket2 = new StudentAdvanceTicket(15);
		
		System.out.println(walkupTicket);
		System.out.println(advanceTicket);
		System.out.println(advanceTicket2);
		System.out.println(studentAdvanceTicket);
		System.out.println(studentAdvanceTicket2);
		

	}

}
