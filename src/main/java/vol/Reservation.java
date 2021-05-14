package vol;

import user.Voyageur;

public class Reservation {
	  protected int idr;
	  protected String dateReservation;
	  protected Vol vol;
	  protected Voyageur passager;
	  //constructeur
	  public Reservation(int idr, String dateReservation, Vol vol, Voyageur passager) {
			super();
			this.idr = idr;
			this.dateReservation = dateReservation;
			this.vol = vol;
			this.passager = passager;
		}
	  public Reservation() {}
	public int getIdr() {
		return idr;
	}
	public void setIdr(int idr) {
		this.idr = idr;
	}
	public String getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(String dateReservation) {
		this.dateReservation = dateReservation;
	}
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	public Voyageur getPassager() {
		return passager;
	}
	public void setPassager(Voyageur passager) {
		this.passager = passager;
	}
	  
}
