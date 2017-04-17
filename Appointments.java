//Modeled on the product class from web-shop
package Model;

public class Appointments {
	private String type;
	private double price;
	private String date;
	private String doctor;
	private static int appointmentsAvailable;
	
	public Appointments(String type,double price,String date,String doctor,int appointmentsAvailable){
		this.type = type;
		this.price = price;
		this.date = date;
		this.doctor = doctor;
		this.appointmentsAvailable = appointmentsAvailable;
		
		
	}
	
	public Appointments(){
		appointmentsAvailable++;
		//I want an appointment to be taken up once booked. I suppose something like
		//this could work. Maybe it would work better with a boolean statement..?
		}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDoctor() {
		return doctor;
	}
	
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void sellProduct() {
		appointmentsAvailable--;
	}
}
