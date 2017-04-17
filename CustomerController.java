package Model;

public class CustomerController {
	private Customer myCustomer = new Customer();
	   private CustomerInfo myInfo = new CustomerInfo();
		
		public CustomerController(Customer myCustomer, CustomerInfo myInfo){
			this.myCustomer = myCustomer;
			this.myInfo = myInfo;
		}
		
		public void createCustomer(){
			myCustomer = myInfo.getCustomerDetails();
		}
		
		public void print(){
			myInfo.printCustomerDetails(myCustomer);
		}

}
