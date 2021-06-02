package indAsg1;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Bowling Event!\n");
		
		EventDetails ed = new EventDetails();
		System.out.println(ed.toString());
		switch(ed.eventName){
			case 1: 
				ed.printDuckPinInfo(); 
				break;
			case 2: 
				ed.print5PinInfo(); 
				break;
			case 3: 
				ed.printCandlepinInfo();
				break;
			default: 
				System.out.println("Invalid input!");
				System.exit(0);
		} 
		
		System.out.println();
		
		Employee em = new Employee();
		System.out.println(em.toString());
		
		System.out.println();
		
		Participant p = new Participant();
		System.out.println(p.toString()); 
		
		System.out.println(); 
		
		Finance f = new Finance();
		System.out.println(f.toString()); 
		
		System.out.println(); 
		
		Marketing m = new Marketing(500, "Monday", 99.99);
		System.out.println(m.toString());
		m.printAdvertisement();
		
	}
}
