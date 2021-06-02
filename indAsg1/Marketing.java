package indAsg1;

//1.2 predefined class
import java.util.Scanner;
import java.text.DecimalFormat;

//1.3 user defined class
public class Marketing {
	
	Scanner sc = new Scanner(System.in);
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	//declare variables
	int prize;
	String day;
	double registrationFee;
	
	//1.4 constructor
	//default constructor
	//prize, advertisement, registration fee
	public Marketing() { //constructor with no argument
		
		System.out.println("\nPlease enter the details: ");
		
		//input details for marketing
		System.out.print("Prize\t\t\t\t   : RM ");
		this.prize = sc.nextInt();
		
		System.out.print("Day\t\t\t\t   : ");
		this.day = sc.nextLine();
		
		System.out.print("Registration Fee\t\t   : RM ");
		this.registrationFee = sc.nextDouble();
	}
	
	public Marketing(int pr) { //constructor with one argument
		
		System.out.print("Prize\t\t\t\t   : RM ");
		pr = sc.nextInt();
		
	}
	
	public Marketing(int pr, String d, double rf) { //constructor with two argument
		
		this.prize = pr;
		this.day = d;
		this.registrationFee = rf;
		
		System.out.println("The details are: ");
		System.out.println("Prize\t\t\t\t   : RM " + pr);
		System.out.println("Day\t\t\t\t   : " + d);
		System.out.println("Registration Fee\t\t   : RM " + rf);
		
	}
	
	//1.3 user defined class
	//create getter methods (accessors)
	public int getPrize() {
		return this.prize;
	}
	
	public String getDay() {
		return this.day;
	}
	
	public double getRegistrationFee() {
		return this.registrationFee;
	}
	
	//totalPrice with no argument
	public double totalPrice() { //overloading method with no argument
		return this.registrationFee;
	}
	
	//totalPrice with one argument 
	public double totalPrice(double disc) { //overloading method with one argument
		return this.registrationFee * (1-disc);
	}
	
	//totalPrice with two arguments
	public double totalPrice(String day, double disc) { //overloading method with two arguments
		
		if(day.equals("Sunday")) {
			System.out.println("\nDiscount\t\t\t   : " + disc);
			return totalPrice(0.10);
		}
		else if(day.equals("Saturday")){
			return totalPrice(0.10);
		}
		else {
			System.out.println("There is no discount on that day!");
		}
		
		return totalPrice(0.1);
	}
	
	//print out advertisement
	public void printAdvertisement() {
		System.out.println("Contact 0123456789 for registration now to join bowling event!");
		System.out.println("Registration fee is lowest at RM " + df2.format(totalPrice(0.10)) + " now!");
		System.out.println("The prizes given are up to RM " + this.prize + " to the highest mark team!");
		System.out.println("And, there is 10% discount provided to the team registered during weekend!");
		System.out.println("Let's bowling now ~~!");
	}
	
	//to print out marketing details
	//print out prize, advertisement, registration fee
	public String toString() {
		
		return "\n6. Marketing Details" +
			   "\n============================================================" +
			   "\nPrize\t\t\t\t   : RM " + this.prize +
			   "\nDay\t\t\t\t   : " + this.day +
			   "\nRegistration Fee\t\t   : RM " + this.registrationFee +
			   "\nLowest Price\t\t\t   : RM " + df2.format(totalPrice(0.10)) + " especially at Sunday and Saturday" +
			   "\n============================================================";
		
	}
}
