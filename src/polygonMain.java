/*
Name: Stephen Wu
Date Today: September 24th, 2013
Date of Submission: September 30th, 2013
Input:
Polygon
Length and/or Second Length
Output:
Area of Polygon
Perimeter of Polygon
Summary of the program:
Initially the program requires the user to input a polygon, and the length of the side. It is optional to type in another side. The program will differentiate if the user inputs two or three inputs. Based on the polygon input, the program will select the specific polygon and calculate the area and perimeter of the specific polygon.
*/

import java.util.*;

public class polygonMain {
	
	public static void main(String[] args){
		String shape = "";
		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		Scanner str;
		
		while(!shape.equalsIgnoreCase("quit")){
		num1 = -1;
		num2 = -1;
		
		System.out.print("Please type in your input: ");
		str = new Scanner(scan.nextLine());
		
		shape = str.next();
		
		if(str.hasNext()){
			num1 = str.nextInt();
		}
		
		if(str.hasNext()){
			num2 = str.nextInt();
		}
		
			
		switch (shape) {
			case "triangle":
				if(num2 >= 0){
					IsocelesTriangle tri = new IsocelesTriangle(num1,  num2);
					System.out.println("Perimeter of Isoceles Triangle: " + tri.getPerimeter() + "\nArea of Isoceles Triangle: " + tri.getArea());
				} else {
					EquilateralTriangle tri = new EquilateralTriangle(num1);
					System.out.println("Perimeter of Equilateral Triangle: " + tri.getPerimeter() + "\nArea of Equilateral Triangle: " + tri.getArea());
				};
				break;
				
			case "quadrilateral": 
				if(num2 >= 0){
					Rectangle rec = new Rectangle(num1,  num2);
					System.out.println("Perimeter of Rectangle: " + rec.getPerimeter() + "\nArea of Rectangle: " + rec.getArea());
				} else {
					Square sq = new Square(num1);
					System.out.println("Perimeter of Square: " + sq.getPerimeter() + "\nArea of Square: " + sq.getArea());
				};
				break;
				
			case "pentagon": 
					Pentagon pent = new Pentagon(num1);
					System.out.println("Perimeter of Pentagon: " + pent.getPerimeter() + "\nArea of Pentagon: " + pent.getArea());
				break;
				
			case "octagon": Octagon oct = new Octagon(num1);
			System.out.println("Perimeter of Octagon: " + oct.getPerimeter() + "\nArea of Octagon: " + oct.getArea());
				break;
				
			case "hexagon": Hexagon hex = new Hexagon(num1);
			System.out.println("Perimeter of Hexagon: " + hex.getPerimeter() + "\nArea of Hexagon: " + hex.getArea());
				break;
			}
		System.out.println("-------------------------------------------------------");
	}
		
	}
}
