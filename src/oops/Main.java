package oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an instance of the Person class with the name "Ean Craig" and age 11
        PersonClass person1 = new PersonClass("Ean Craig", 11, 10000);
        // Create another instance of the Person class with the name "Evan Ross" and age 12
        PersonClass person2 = new PersonClass("Evan Ross", 12, 1000);
        System.out.println(person1.age+" "+person1.getn());
        System.out.println(person2.age+" "+person2.getn());
	
        person1.upateName("Hrigved");
System.out.println(person1.getn()+person1.age+ person1.salary);	
	
	}

}
