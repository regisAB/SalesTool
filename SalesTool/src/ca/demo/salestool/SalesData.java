package ca.demo.salestool;

public class SalesData {

		int data[] = {0, 4, 42, 57, 90, 100, 67, 69};
	
	public void display(){
		System.out.println("Header here Data second change here: ");
		//add three more headers
		System.out.println("Header one added Data: ");
		System.out.println("Header two  added Data: ");
		System.out.println("Header three added Data: ");
		System.out.println("Header here added Data: ");
		for(int i = 0; i < data.length; i++){
			System.out.println("Next value: "+ data[i]);///
		}
	}

}
