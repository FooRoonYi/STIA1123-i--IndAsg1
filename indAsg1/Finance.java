package indAsg1;

//1.2 predefined class
import java.util.Scanner;
import java.text.DecimalFormat;

//1.3 user defined class
public class Finance {
	
	Scanner sc = new Scanner(System.in);
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	//declare variables
	//income = total price
	double employeeSalary, utilityFee, advertisementFee, prize, registrationFee;
	int employeeQuantity, participantQuantity;
	
	//1.4 constructor
	//default constructor
	//total rent, total hours, total prize, no of participants, quantityOfEmployee, salaryPerHour
	public Finance() { //constructor with no argument
		
		System.out.println("Please enter the details: ");
		
		System.out.print("Utility Fee budgeted\t\t   : RM ");
		this.utilityFee = sc.nextDouble();
		
		System.out.print("Advertisement Fee budgeted\t   : RM ");
		this.advertisementFee = sc.nextDouble();
		
		System.out.print("Prize budgeted\t\t\t   : RM ");
		this.prize = sc.nextDouble();
		
		System.out.print("\nEmployee Salary\t\t\t   : RM ");
		this.employeeSalary = sc.nextDouble();
		
		System.out.print("Quantity of Employee\t\t   : ");
		this.employeeQuantity = sc.nextInt();
		
		System.out.print("\nRegistration Fee\t\t   : RM ");
		this.registrationFee = sc.nextDouble();
		
		System.out.print("Quantity of Participant\t\t   : ");
		this.participantQuantity = sc.nextInt();
		
	}
	
	public Finance(double u, double a, double p) { //constructor with three arguments
		
		this.utilityFee = u;
		this.advertisementFee = a;
		this.prize = p;
		
		System.out.println("\nThe details are: ");
		System.out.println("Utility Fee\t\t   : RM " + u);
		System.out.println("Advertisement Fee\t   : RM " + a);
		System.out.println("Prize budgeted\t\t\t   : RM " + p);
		
	}
	
	public Finance(double u, double a, double p, double s, int qtyE, double rf, int qtyP) { //constructor with seven arguments
		
		this.utilityFee = u;
		this.advertisementFee = a;
		this.prize = p;
		this.employeeSalary = s;
		this.employeeQuantity = qtyE;
		this.registrationFee = rf;
		this.participantQuantity = qtyP;
		
		System.out.println("\nThe details are: ");
		System.out.println("Utility Fee\t\t   : RM " + u);
		System.out.println("Advertisement Fee\t   : RM " + a);
		System.out.println("Prize budgeted\t\t\t   : RM " + p);
		System.out.println("\nEmployee Salary\t\t\t   : RM " + s);
		System.out.println("Quantity of Employee\t\t   : " + qtyE);
		System.out.println("\nRegistration Fee\t\t\t   : RM " + rf);
		System.out.println("Quantity of Participant\t\t   : " + qtyP);
		
	}
	
	//1.3 user defined class
	//create getter methods (accessors)
	public double getUtilityFee() {
		return this.utilityFee;
	}
	
	public double getAdvertisement() {
		return this.advertisementFee;
	}
	
	public double getPrize() {
		return this.prize;
	}
	
	public double getEmployeeSalary() {
		return this.employeeSalary;
	}
	
	public int getEmployeeQuantity() {
		return this.employeeQuantity;
	}
	
	public double getRegistrationFee() {
		return this.registrationFee;
	}
	
	public int getParticipantQuantity() {
		return this.participantQuantity;
	}
	
	//calculate total salary needed to pay
	//employee salary * employee quantity
	public double totalSalary() {
		return this.employeeSalary * this.employeeQuantity;
	}
	
	//calculate total income from customers
	//registration fee * participant quantity
	public double totalIncome() { 
		return this.registrationFee * this.participantQuantity;
	}
	
	//calculate total budget needed
	//total salary + utility fee + advertisement fee + prize
	public double totalBudget() {
		return (totalSalary() + this.utilityFee + this.advertisementFee + this.prize);
	}
	
	//calculate net profit which is get by bowling centre
	public double calcProfit() {
		return totalIncome() - totalBudget();
	}
	
	//to print out finance details
	public String toString() {
		
		return "\n4. Finance Details" +
			   "\n============================================================" +
			   "\nUtility Fee\t\t\t   : RM " + df2.format(this.utilityFee) +
			   "\nAdvertisement Fee\t\t   : RM " + df2.format(this.advertisementFee) + 
			   "\nPrize budgeted\t\t\t   : RM " + df2.format(this.prize) +
			   "\n\nEmployee Salary\t\t\t   : RM " + df2.format(this.employeeQuantity) +
			   "\nQuantity of Employee\t\t   : " + this.employeeQuantity +
			   "\nTotal Salary\t\t\t   : RM " + df2.format(totalSalary()) +
			   "\n\nRegistration fee\t\t   : RM " + df2.format(this.registrationFee) +
			   "\nTotal Number of Participants\t   : " + this.participantQuantity +
			   "\nTotal Income\t\t\t   : RM " + df2.format(totalIncome()) +
			   "\n\nTotal Net Profit\t\t   : RM " + df2.format(calcProfit()) +
			   "\n============================================================";
		
	}

}
