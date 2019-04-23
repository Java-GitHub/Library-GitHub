package models;
import java.util.Date;
import java.util.GregorianCalendar;

import utilities.GenderType;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String email;
	private int customerNumber;
	private GenderType gender;
	private boolean isValid;
	private Date expiryDate;
	
	public Customer(String firstName, String lastName, String address,
			String phoneNumber, String email, int customerNumber, GenderType gender) {
		setName(firstName, lastName);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.customerNumber = customerNumber;
		this.gender = gender;
		this.isValid = true;
		
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.add(GregorianCalendar.YEAR, 1);
		
		this.expiryDate = gCal.getTime();		
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	private void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getMailingName() {
		StringBuilder sb = new StringBuilder(firstName.substring(0, 1));
//		sb.append(firstName.substring(0, 1));
		sb.append(" ");
		sb.append(lastName);
		return sb.toString();
//		int spacePosition;
//		spacePosition = firstName.indexOf(" ");
//		return firstName.substring(0, spacePosition) + " " + lastName;
//		return firstName.substring(0, 1) + " " + lastName;
	}
	
	public GenderType getGender() {
		return gender;
	}
	
	public Date getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return getMailingName();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (customerNumber != other.customerNumber)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender != other.gender)
			return false;
		if (isValid != other.isValid)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
	
	

}
