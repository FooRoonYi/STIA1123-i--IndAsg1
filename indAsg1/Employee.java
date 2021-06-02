package indAsg1;

//1.2 predefined class
import java.util.Scanner; 
import java.text.DecimalFormat;

//1.3 user defined class
public class Employee {
	
	Scanner sc = new Scanner(System.in);
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	//declare variables
	String department, name;
	int employeeID;
	double salary;
	
	//1.4 constructor
	//default constructor
	//department, name, ID
	public Employee() { //constructor with no argument
		
		System.out.println("Please enter the details: ");
		
		//input the details for participant
		System.out.print("Department\t\t\t   : ");
		this.department = sc.nextLine();
		
		System.out.print("Employee ID\t\t\t   : ");
		this.employeeID = sc.nextInt();
		
		System.out.print("Employee Name\t\t\t   : ");
		this.name = sc.next();	
		
		System.out.print("Salary\t\t\t\t   : RM ");
		this.salary = sc.nextDouble();	

	}
	
	public Employee(String n) { //constructor with one argument
		
		this.name = n;
		
		System.out.println("\nThe details are: ");
		System.out.println("Employee Name\t\t\t   : " + n);
		
	}
	
	public Employee(String d, String n, int id, double s) { //constructor with three arguments
		
		this.department = d;
		this.name = n;
		this.employeeID = id;
		this.salary = s;
		
		System.out.println("\nThe details are: ");
		System.out.println("Department\t\t\t   : " + d);
		System.out.println("Employee Name\t\t\t   : " + n);
		System.out.println("Employee ID\t\t\t   : " + id);
		System.out.println("Salary\t\t\t\t   : RM " + s);
		
	}
	
	//1.3 user defined class
	//create getter method
	public String getDepartment() {
		return this.department;
	}
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	
	public String getEmployeeName() {
		return this.name;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	//to print out employee details	
	public String toString() {
					
		return "\n2. Employee Details" + 
			   "\n============================================================" +
			   "\nDepartment\t\t\t   : " + this.department +
			   "\nEmployee ID\t\t\t   : " + this.employeeID +
			   "\nEmployee Name\t\t\t   : " + this.name +
			   "\nSalary\t\t\t\t   : RM " + df2.format(this.salary) +
			   "\n============================================================";
			
	}
}
