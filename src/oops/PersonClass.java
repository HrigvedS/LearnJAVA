package oops;

public class PersonClass {
	String name;
	int age;
	int salary;
	
	//Constructor
	public PersonClass(String name,int age, int salary){
	this.name= name;
	this.age= age;
	this.salary= salary;
 }
	//getter
	public String getn() {
		return name;
		
	}
	public int age() {
		return age;
	}
	
	public void upateName(String name) {
	this.name= name;
}

	public int salary() {
	return salary;
}

}
