import java.util.ArrayList;

import javax.ejb.Remote;

@Remote
public interface Reservation {

	public int makeReservation(String showroomName, String showName, String cltName, int nbSeats);
	public String cancelReservation(int idRsrv);
	public String getShowroomName (int idRsrv);
	public String getShowName (int idRsrv);
	public int getNbSeats(String showroomName);
	public String showAllReservation();

}
