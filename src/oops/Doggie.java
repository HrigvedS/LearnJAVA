package oops;

public class Doggie {
	
	// Write a Java program to create a class called "Dog" with a name and breed attribute. 
	//Create two instances of the "Dog" class, set their attributes using the constructor 
	//and modify the attributes using the setter methods and print the updated values.
	
	String name;
	String Bread;
	
	public Doggie(String name, String Bread) {
		this.name= name;
		this.Bread= Bread;
	}
	
	public String Dname() {
	 return name;
		
	}
	public String DBread() {
		 return Bread;
	
	}
	
	public void Upname(String name) {
		this.name= name;
	}
	
	public void UpBread(String Bread) {
		this.Bread= Bread;
	}
	

}
