package indAsg1;

//1.2 predefined class
import java.util.Scanner;

//1.3 user defined class
public class Participant {
	
	Scanner sc = new Scanner(System.in);
	
	//declare variables
	String name, tName, gender;
	int age, noOfParticipants;
	
	//1.4 constructor
	//default constructor
	//participants name, gender, age, no of participants, team name
	public Participant() { //constructor with no argument
		
		System.out.println("Please enter the details: ");
		
		//input details for participants 
		System.out.print("Participant Name\t\t   : ");
		this.name = sc.nextLine();
		
		System.out.print("Gender (M for Male / F for Female) : ");
		this.gender = sc.nextLine();
		
		System.out.print("Age\t\t\t\t   : ");
		this.age = sc.nextInt();
		
		System.out.print("Number of participants in a team   : ");
		this.noOfParticipants = sc.nextInt();
		
		System.out.print("Team Name\t\t\t   : ");
		this.tName = sc.next(); 
		
	}
	
	public Participant(String pN) { //constructor with one argument
		
		System.out.print("Participant Name\t\t   : " + pN);
		
	}
	
	public Participant(String pN, String g, int a, int noPt, String tN) { //constructor with five arguments
		
		System.out.print("Participant Name\t\t   : " + pN);
		
		System.out.print("Gender (M for Male / F for Female) : " + g);
		
		System.out.print("Age\t\t\t\t   :" + a);
		
		System.out.print("Number of participants in a team   : " + noPt);
		
		System.out.print("Team Name\t\t\t   : " + noPt);
	
	}
	
	//1.3 user defined class
	//create getter method
	public String getParticipantName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getNoOfParticipants() {
		return this.noOfParticipants;
	}
	
	public String getTeamName() {
		return this.tName;
	}

	
	//to print out participant details
	//participant can be individual or team
	//print out registered participant's name, gender, team name, noOfParcipants in a team
	public String toString() {
					
		return "\n\n3. Participant Details" +
			   "\n============================================================" +
			   "\nParticpant Name\t\t\t   : " + this.name +
			   "\nGender (M for Male / F for Female) : " + this.gender +
			   "\nAge\t\t\t\t   : " + this.age +
			   "\nNumber of participants in a team   : " + this.noOfParticipants +
			   "\nTeam Name\t\t\t   : " + this.tName +
		   	   "\n============================================================";
			
	}
	
}
