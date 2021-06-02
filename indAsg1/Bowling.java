package indAsg1;

//1.2 predefined class
import java.util.Scanner;

//1.3 user defined class
public class Bowling {
	
	Scanner sc = new Scanner(System.in);
	
	String nameCentre, location, contact;
	int noOfParticipant;
	
	public Bowling() {
		
		System.out.print( "Bowling Centre Name\t\t   : ");
		this.nameCentre = sc.nextLine();
		
		System.out.print("Location\t\t\t   : ");
		this.location = sc.nextLine();
		
		System.out.print("Contact\t\t\t\t   : ");
		this.contact = sc.nextLine();
		
		System.out.print("Number of Participants\t\t   : ");
		this.noOfParticipant = sc.nextInt();
		
	}
	public Bowling(String n) {
		
		this.nameCentre = n;
		System.out.println( "Bowling Centre Name\t\t\t   : " + n);
		
	}
	
	public Bowling(String n, String l, String c, int noPt) {
		
		this.nameCentre = n;
		this.location = l;
		this.contact = c;
		this.noOfParticipant = noPt;
		
		System.out.println( "Bowling Centre Name\t\t   : " + n);
		System.out.println("Location\t\t\t   : " + l);
		System.out.println("Contact\t\t\t\t   : " + c);
		System.out.println("Number of Participants\t\t   : " + noPt);
		System.out.println();
	}
	
}
