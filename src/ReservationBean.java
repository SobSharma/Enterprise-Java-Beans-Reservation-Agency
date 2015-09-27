import java.util.ArrayList;

import javax.ejb.Stateful;

@Stateful
public class ReservationBean implements Reservation {

	public  int idRsrv= (int) (Math.random() * 10000);
	private static int nbSeatsRemaining=100;
	public static ArrayList<Rsrv> ListeRsrv = new ArrayList<Rsrv> ();
	
	@Override
	public int makeReservation(String showroomName, String showName,
			String cltName, int nbSeats) {
		
		// TODO Stub de la méthode généré automatiquement
		if (checkIfAvailable(nbSeats))
		{
		idRsrv++;				
		Rsrv R = new Rsrv(idRsrv,showroomName, showName, cltName, nbSeats);
		ListeRsrv.add(R);
		return idRsrv;
		}
		else 
		{
			return -1;
		}
	}

	private boolean checkIfAvailable (int nb)
	{
		if (nbSeatsRemaining>=nb)
		{ 
			nbSeatsRemaining = nbSeatsRemaining - nb;
			return true;
		}
		else return false;
	}
	@Override
	public String cancelReservation(int id) {
		// TODO Stub de la méthode généré automatiquement
		String ch="";
		for (int i=0;i<ListeRsrv.size();i++)
		{
			if(ListeRsrv.get(i).getIdRsrv()==id)
			{
				ListeRsrv.remove(i);
				return "Reservation is canceled for ID "+id;
			}
			else ch = "Reservation can not be canceled, check your ID";
		}
		return ch;
	}

	@Override
	public String getShowroomName(int idRsrv) {
		
		for (int i=0;i<ListeRsrv.size();i++)
		{
			if(ListeRsrv.get(i).getIdRsrv()==idRsrv)
			{
				return "Showroom name is "+ListeRsrv.get(i).getShowroomName()+"";
			}
		}
		return null;
		
	}

	@Override
	public String getShowName(int idRsrv) {
		// TODO Stub de la méthode généré automatiquement
		for (int i=0;i<ListeRsrv.size();i++)
		{
			if(ListeRsrv.get(i).getIdRsrv()==idRsrv)
			
				return "Show name is "+ListeRsrv.get(i).getShowName();
			
		}
		return null;
	}
		

	@Override
	public int getNbSeats(String showroomName) {
		// TODO Stub de la méthode généré automatiquement
		return nbSeatsRemaining;
	}

	@Override
	public String showAllReservation() {
		String ch="";
		for (int i=0; i<ListeRsrv.size();i++)
        	{ch = ch +ListeRsrv.get(i).getIdRsrv()+"|";}
		return ch;
	}
	public int returnID ()
	{
		return idRsrv;
	}
	
	
}
