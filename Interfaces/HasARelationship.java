package com.java.Interfaces;

public class HasARelationship {
	public static void main(String[] args) {
	party p=new party("abc","an@gmail.com",7675,new Address("a","b","c"));
	
  System.out.println(p.getAddress().getMandal());
  System.out.println(p.getAddress().getState());
	}

}
class party {
	private String name;
	private String mail;
	private int mobilenumber;
	private Address address;
	
	party(String name,String mail,int mobilenumber,Address address){

		this.name=name;
		this.mail=mail;
		this.mobilenumber=mobilenumber;
		this.address=address;
	}
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	
}
class Address{
	private String village;
	private String mandal;
	private String state;
	  
	Address(String village,String mandal,String state){
		this.village=village;
		this.mandal=mandal;
		this.state=state;
	}
	
	
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}