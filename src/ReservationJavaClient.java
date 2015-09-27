import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.naming.InitialContext;

public class ReservationJavaClient {

	
	public static void main(String args[]) {

		try {

			InitialContext ic = new InitialContext();
			Reservation rsrv = (Reservation) ic.lookup("Reservation");
			while(true)
			{
				menu();
				Scanner in = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        	
				int i = in.nextInt();
				switch (i) {
				case 1:  
                    
					String ch1,ch2,ch3,ch4,ch5;
					
					System.out.println("Would you please give the following informations :");
					System.out.println("Enter the Client Name :");
					ch1 = br.readLine(); //We read from user's input
					System.out.println("Enter the Show Name :");
					ch2 = br.readLine();
					System.out.println("Enter the Showroom Name :");
					ch3 = br.readLine();
					System.out.println("Enter the Number of Seats :");
					ch4 = br.readLine();
					int nb = Integer.parseInt(ch4);
					int rslt = rsrv.makeReservation(ch3, ch2, ch1, nb);
					if (rslt > 0 )
					{ System.out.println("Reservation done by ID " + rslt); }
					else { System.out.println("Reservation not done");}
					//System.out.println("The List of all reservation");System.out.println(rsrv.showAllReservation());
					System.out.println("################################################################");
					break;

				case 2: 
					
					System.out.println("Enter reservation ID to remove");
					int remove_id = in.nextInt(); 
					System.out.println(rsrv.cancelReservation(remove_id));
					//System.out.println("Reservation Cancelled for ID" + remove_id);
					System.out.println("################################################################");
					break;
					
				case 3:  
					System.out.println("Enter reservation ID to view showroom name");
					int shr_id = in.nextInt(); 					
					System.out.println(rsrv.getShowroomName(shr_id));
					System.out.println("################################################################");
					break;
				case 4:  
					System.out.println("Enter reservation ID to view show name");
					int sh_id = in.nextInt(); 					
					System.out.println(rsrv.getShowName(sh_id));
					System.out.println("################################################################");
					break;
				case 5: 
					System.out.println("Enter showroom name to view number of seats");
					String shr_name = br.readLine();
					System.out.println("Remaining seats are "+ rsrv.getNbSeats(shr_name));
					break;
				case 6:  System.out.println("The List contains the following reservations IDS " + rsrv.showAllReservation());
				System.out.println("################################################################");
				break;
				case 7: 
					System.exit(0);
					break;

				}

			}   


		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void menu() 
	{
		System.out.println("Welcome to Reservation Agency :");
		System.out.println("1. Make Reservation");
		System.out.println("2. Cancel Reservation");
		System.out.println("3. View Showroom Name");
		System.out.println("4. View Show Name");
		System.out.println("5. View Seats Remaining");
		System.out.println("6. List Of All Reservations");
		System.out.println("7. QUIT");
		System.out.println("Choose an option : ");

	}
}
