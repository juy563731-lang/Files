package myProject;
import java.util.Arrays;
import java.util.Scanner;

public class Class {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int Hotel [][] = new int [7][5];
		int choice = 0;
		do {
		System.out.print("=== HOTEL RESERVATION SYSTEM ===\n"
				+ "1. View Rooms\r\n"
				+ "2. Check In\r\n"
				+ "3. Check Out\r\n"
				+ "4. Exit\n");
		System.out.print("choice: ");
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			int flno = 1;
			for (int[] row:Hotel)
				System.out.println("Floor "+flno+++": "+Arrays.toString(row));
				
			break;
		case 2:
			System.out.print("Enter floor: ");
			int floor = sc.nextInt();
			System.out.print("Enter room: ");
			int room = sc.nextInt();
			
			if (Hotel[7-floor][room-1]== 1) {
				System.out.println("Room Occupied\n");
			}else {
				Hotel[7-floor][room-1]= 1;
				System.out.println("Check-in Successful\n");
			}
			
			
			break;
		case 3:
			System.out.print("Enter floor: ");
			int exitFlor = sc.nextInt();
			System.out.print("Enter room: ");
			int exitRom = sc.nextInt();
			
			if (Hotel[7-exitFlor][exitRom-1]== 1) {
				Hotel[7-exitFlor][exitRom-1]= 1-1;
				System.out.print("Check out Successful");
			}else 
				System.out.print("None");
			
			break;
		case 4:
			System.out.print("Exit");
			break;
		default:
			break;
		}
		
		}while (choice !=4);	
		
		
	}
}
	

	
	
		


