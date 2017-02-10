package ca.demo.salestool;

public class SalesData {
	int data[] = {0, 4, 42};
	
	public void display(){
		System.out.println("Header here Data: ");
		for(int i = 0; i < data.length; i++){
			System.out.println("Next value: "+ data[i]);///
		}
	}

}
