package Model;

import java.util.Scanner;

public class CustomerInfo {
	
public CustomerInfo(){
	
}

public static Customer	getCustomerDetails(){
	Scanner input = new Scanner(System.in);
	String details;
	Customer C = new Customer();
	System.out.print("Enter your first name: ");
	details = input.nextLine();
	C.setFirstName(details);
	System.out.print("Enter your last name: ");
	details = input.nextLine();
	C.setLastName(details);
	System.out.println("Enter your CPR number(123456-1234):");
	details = input.nextLine();
	if (details.matches("^(\\d{6}-?\\d{4})$")) 
		    C.setCprNumber(details);
	else 
		System.out.println("you have entered wrong CPR number");
	
	System.out.println("Enter your Telephone Number (8 digits):");
	details = input.nextLine();
	if (details.matches("[0-9]+") && details.length()==8) 
        C.setTelephone(details);
	else
		System.out.println("Invalid number");
    System.out.print("Enter your address: ");
    details = input.nextLine();
	C.setAddress(details);
	System.out.print("Enter your postcode: ");
    details = input.nextLine();
    Integer y = Integer.valueOf(details);
    if(details.length() != 4 || (y > 2500 )) 
		 System.out.println("invalid post number, CBS WEBSHOP only mails within Copenhagen region");  
    else
	    C.setPostcode(details);
    
    
    
	return C;
	
}

public void printCustomerDetails(Customer C) {
	
	System.out.println(C.toString());
}
}






