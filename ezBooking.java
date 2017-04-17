//modeled on web-shopping class
package Model;

import java.util.Scanner;

public class ezBooking {
	Scanner input = new Scanner(System.in);

	public ezBooking() {
	}
	 public void Validation(){
	 Customer login = new Customer();
	 String username = login.getUsername();
	 String password = login.getPassword();
     Scanner admin = new Scanner(System.in);
     int count = 0;
		while (count<3){
		        System.out.println("username: ");
		        String usernameInput = admin.nextLine();
		        System.out.println("password: ");
		        String passwordInput = admin.nextLine();
		        if(usernameInput.equals(username) && passwordInput.equals(password)){
		        	 System.out.println("You are now logged in");
		        	 break;}
			    else{
		           System.out.println("You entered the wrong password and/or username"); 
		           count=count+1; 
		            	
			    }
		  if(count==3)
             System.out.println("Sorry you have exceeded the number of tries. Please try again after few hours");
		 }
		 System.out.println("\nYou are now logged in!" );
         
         AppointmentDatabase pd = new AppointmentDatabase ();
		 String mainMenu = ("Press 1 to browse through our regular dental services provided by our skilled doctors at all types of quality and prices\n"
                 + " Press 2 to if you're looking for something more special\n");
		 
                 System.out.println(mainMenu);
                 String chooseProducts = input.next();
                 Scanner itemChoice = new Scanner(System.in); 
                 
                 switch (chooseProducts) {
                 
                 case "1": pd.browseRegular(); 
                	  
                	String addToBasket = itemChoice.next();  
           		 	System.out.println("Enter 1, 2 or 3 to add the selected item to your basket");                

                		switch (addToBasket) {
                		case "1": System.out.println("One copy of 'Harry Potter' has been added to your basket."); break;
                		case "2": System.out.println("One copy of 'The Hobbit' has been added to your basket."); break; 
                		case "3": System.out.println("One copy of '1984' has been added to your basket."); break; 
                 } break;
                  	
                 case "2": pd.browseSpecials();
                 
                 	String addToBasket2 = itemChoice.next();
                 	System.out.println("Enter 1, 2 or 3 to add the selected offerings to your basket");                

                 		switch (addToBasket2) {
                 		case "1": System.out.println("You have been scheduled for the procedure One 'Sporty sweater' has been added to your basket."); break;
                 		case "2": System.out.println("One 'Regular Sweater' has been added to your basket."); break; 
                 } break;
             
            			}
	 		}
                             
}
