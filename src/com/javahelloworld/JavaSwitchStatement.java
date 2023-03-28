package com.javahelloworld;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaSwitchStatement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
// we can take runtime input form user by using two classes provided by java
//	SCanner and BufferReader; we can press cntrl to open predefined claass of java
		InputStreamReader ins = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ins);
		System.out.println("Enter a number between 1 to 7:");
		int choice=Integer.parseInt(br.readLine());
		
		
		switch(choice) //Fall through execution
		{
			case 1: System.out.println("Sunday");
					break;
			case 2: System.out.println("Monday");
					break;
			case 3: System.out.println("Tuesday");
					break;		
			case 4: System.out.println("Wednesday");
					break;	
			case 5: System.out.println("Thursday");
					break;
			case 6: System.out.println("Friday");
					break;
			case 7: System.out.println("Saturday");
					break;
			default:System.out.println("Wrong Choice..");	
//					System.err.println("Error occurred!!");
		}
		

	}

}
