// $Id$
package manualtest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("Enter the array size");
			
			Scanner scan = new Scanner(System.in);
			try {
				int arrSize = scan.nextInt();
				System.out.println("Enter the  values");
				
				float[] arr = new float[arrSize];
				for(int i = 0; i < arr.length; i++) {
					arr[i] = scan.nextFloat();
				}
				NumericalValue numerical = new NumericalValue();
				System.out.println("Average is : " + numerical.getNumericalValue(arr));
				break;
			}catch(InputMismatchException e) {
				System.out.println("enter the number only");
			}catch(Exception f) {
				System.out.println("enter the number only");
			}
		}
	}
	
}
