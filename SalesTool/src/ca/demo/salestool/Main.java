package ca.demo.salestool;

public class Main {
	public static void main(String[] args){
		SalesData data = new SalesData();//second attempt to commit this file
		
		displayGreeting();
		data.display();
		
	}
	
	private static void displayGreeting(){
		System.out.println("Hello happy Sales People!");
		System.out.println("This app sales data.");
		System.out.println("......................");
		
		System.out.println("Test 1899");
		System.out.println("Test 256");
		System.out.println("Test 456");
	}

}
