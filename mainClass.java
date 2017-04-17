package Model;
import java.util.Scanner;
public class mainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Customer model = new Customer();
		CustomerInfo info = new CustomerInfo();
		CustomerController controller = new CustomerController(model,info);
	    controller.createCustomer();
	    controller.print();
	    
	    System.out.println("press 1 to log in or 0 for exit");	
		int login = input.nextInt();
		 
			switch(login) {
			case 1: break;
			case 0: System.exit(0);
	}
	    ezBooking c = new ezBooking();
	    c.Validation();
            
	}
		
	

}
