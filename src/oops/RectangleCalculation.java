package oops;

//Write a Java program to create a class called "Rectangle" 
//with width and height attributes. Calculate the area and 
//perimeter of the rectangle.

public class RectangleCalculation {
	
	double length;
	double width;
	
	public RectangleCalculation(double length, double width ) {
		this.length = length;
		this.width= width;
		
	}
	public double width(){
		return width;
		
	}

	public double length(){
		return length;
	
}
	
	public double Area() {
		return length * width;
	}
	
	public double Perimeter() {
        
        return 2 * (width + length);
	
	}
}