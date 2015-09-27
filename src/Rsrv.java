
public class Rsrv {

	private int idRsrv;
	private String showroomName, showName, cltName;
	private int nbSeats;
	
	
	public Rsrv(int idRsrv, String showroomName, String showName, String cltName,
			int nbSeats) {
		super();
		this.showroomName = showroomName;
		this.showName = showName;
		this.cltName = cltName;
		this.nbSeats = nbSeats;
		this.idRsrv = idRsrv;
	}

	public int getIdRsrv() {
		return idRsrv;
	}

	public void setIdRsrv(int idRsrv) {
		this.idRsrv = idRsrv;
	}

	public String getShowroomName() {
		return showroomName;
	}

	public void setShowroomName(String showroomName) {
		this.showroomName = showroomName;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getCltName() {
		return cltName;
	}

	public void setCltName(String cltName) {
		this.cltName = cltName;
	}

	public int getNbSeats() {
		return nbSeats;
	}

	public void setNbSeats(int nbSeats) {
		this.nbSeats = nbSeats;
	}
	
	
	
	
}
