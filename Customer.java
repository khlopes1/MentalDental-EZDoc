package Model;


public class Customer {
	private String firstName,lastName,birth,address,cprNumber,telephone,postcode,username,password; 
    
public Customer(){
		
	}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCprNumber() {
	return cprNumber;
}

public void setCprNumber(String cprNumber) {
	this.cprNumber = cprNumber;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public void setPostcode(String postcode) {
	this.postcode = postcode;
}

public String getPostcode() {
	return postcode;
}
public void setUsername(String usename) {
	username = firstName.charAt(0) + lastName.substring(0,3);
}
public String getUsername() {
	return username;
}
public void setPassword(String password) {
	password = lastName.substring(0,3) + cprNumber.substring(7);
}
public String getPassword() {
	return password;
}
public String toString(){
	
	return (firstName+ " " + lastName + " " + birth + " "+ cprNumber + " "+  address +" " +postcode + " "+ telephone );
}
    
     }

