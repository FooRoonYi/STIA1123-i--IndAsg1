package indAsg1;

//1.2 predefined class
import java.util.Scanner;

//1.3 user defined class
public class EventDetails {
	
	Scanner sc = new Scanner(System.in);
	
	String location, contact;
	int eventName, category;
	double registrationFee;
	
	//1.4 constructor
	public EventDetails() { //constructor with no argument
		
		System.out.println("Choose the event that you participated: ");
		System.out.println("1. Duck Pin Bowling\n2. 5-Pin Bowling\n3. Candlepin Bowling");
		System.out.print("\nType of Event\t\t\t   : ");
		this.eventName = sc.nextInt();
		
		System.out.println("\nChoose the category: \n1. 10-pin \n2. 5-Pin");
		System.out.print("Category\t\t\t   : ");
		this.category = sc.nextInt();
		
		System.out.print("\nBowling Event Venue\t\t   : ");
		sc.nextLine();
		this.location = sc.nextLine();
		
		System.out.print("Contact\t\t\t\t   : ");
		this.contact = sc.nextLine();
		
		System.out.print("Registration Fee\t\t   : RM ");
		this.registrationFee = sc.nextDouble();
		
	}
	
	public EventDetails(int t) { //constructor with one argument
		
		this.eventName = t;
		System.out.print("Type of Event\t\t\t   : " + t);
		
	}
	
	public EventDetails(int t, int c, String n, String ct, double rf) { //constructor with three arguments
		
		this.eventName = t;
		this.category = c;
		this.location = n;
		this.contact = ct;
		
		System.out.println("\nThe details are: ");
		
		System.out.println("Type of Event\t\t\t   : " + t);
		System.out.println("Category\t\t\t   : " + c);
		System.out.println("Bowling Event Venue\t\t   : " + n);
		System.out.println("Contact\t\t\t\t   : " + ct);
		System.out.println("Registration Fee\t\t   : RM " + rf);
		
	}
	
	//1.3 user defined class
	//create getter methods (accessors)
	public int getEventName() {
		return this.eventName;
	}
	
	public int getCategory() {
		return this.category;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String getContact() {
		return this.contact;
	}
	
	public double getRegistrationFee() {
		return this.registrationFee;
	}
	
	public void printDuckPinInfo() {
		System.out.println("Hey there! Here comes the rules...");
		System.out.println("1. A game consists of 10 frames.  \n   Each box on the score sheet represents one frame.");
		System.out.println("2. Maximum number of balls rolled in each frame is three.");
		System.out.println("3. Add each frame’s score to the previous one so that the game score progressively increases.");
		System.out.println("4. If all ten pins are knocked down by the first ball in any frame, \n   1it is called a 'Strike' and is usually symbolised on the score sheet with an X.");
		System.out.println("5. The maximum score is 300.");
	}
	
	public void print5PinInfo() {
		System.out.println("Hey there! Here comes the rules...");
		System.out.println("1. In each frame, each player gets three attempts to knock all five pins over.");
		System.out.println("2. Knocking all five pins down with the first ball is a strike, worth 15 points.");
		System.out.println("3. If a bowler manages to clear the pins with the first ball, then this is a 'strike'.");
		System.out.println("4. If a bowler succeeds upon his second attempt, then this is a 'spare'.");
		System.out.println("5. The maximum score is 450.");
	}
	
	public void printCandlepinInfo() {
		System.out.println("Hey there! Here comes the rules...");
		System.out.println("1. Each player gets three rolls per turn.");
		System.out.println("2. This is scored by bowling 12 strikes: one in each box, and a strike with both bonus balls in the 10th box.");
		System.out.println("3. Candlepins are thinner (hence the name \"candlepin\"), and thus harder to knock down.");
		System.out.println("4. The candlepin pinsetter is triggered manually with a reset button after each frame rather than automatically.");
		System.out.println("5. The maximum score is 300.");
	}
	
	//to print out event details
	//print out registered participant's name, gender, team name, noOfParcipants in a team
	public String toString() {
						
		 return "\n1. Event Details" +
			 	"\n============================================================" +
			 	"\nType of Event\t\t\t   : " + this.eventName +
			 	"\nCategory\t\t\t   : " + this.category +
			 	"\nBowling Event Venue\t\t   : " + this.location +
			 	"\nContact\t\t\t\t   : " + this.contact +
			 	"\nRegistration Fee\t\t   : RM " + this.registrationFee +
			 	"\n============================================================";
				
	}
}
