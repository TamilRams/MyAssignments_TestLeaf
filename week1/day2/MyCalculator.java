package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Create a class Calculator
//		  create add() with three input arguments and return sum
//		  create mul() with two input arguments and return result
//		  create sub() with no return type and just have a print statement
//		  create another class MyCalculator 
//		  Have a main method and create an object for Calculator class and
//		        access all methods.

		Calculator cal=new Calculator();
		int addition = cal.add(10, 20, 30);
		System.out.println("addition of 3 numbers : "+addition);
		int multiplication = cal.mul(5, 100);
		System.out.println("multiplication of 2 numbers : "+multiplication);
		cal.sub(10,4);
		
		
		
		
		
	}

}
