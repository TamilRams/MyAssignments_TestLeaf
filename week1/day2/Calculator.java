package week1.day2;

public class Calculator {
	
	int sum;
	int result;
	int subvalue;
	
	
	public int add(int a,int b,int c)
	{
		sum = a+b+c;
		return sum;
	}
	
	public int mul(int x,int y)
	{
		
		result = x*y;
		return result;
	
	}
	
	public void sub(int num1,int num2)
	{
		subvalue = num1-num2;
		System.out.println("This is a subraction result : "+subvalue);
	}
	
	
//	Create a class Calculator
//	  create add() with three input arguments and return sum
//	  create mul() with two input arguments and return result
//	  create sub() with no return type and just have a print statement
//	  create another class MyCalculator 
//	  Have a main method and create an object for Calculator class and
//	        access all methods.

}
