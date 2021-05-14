package vol;

import java.time.Instant;
import java.util.Date;
import java.time.Duration;
public class Vol{

// importation pour utiliser Date et Instant.now()


// declaration des variables de la classe:
protected String idVol;
protected Avion idAvion;
protected String heurDepart;
protected String heurArrivee;
protected int duree;
protected String aeroportDepart;
protected String aeroportArrivee;
protected String villeDepart;
protected String villeArrive;
protected int distance;
public Vol() {}
public Vol(String idVol, Avion idAvion, String heurDepart, String heurArrivee, int duree, String aeroportDepart,
		String aeroportArrivee, String villeDepart, String villeArrive, int distance) {
	super();
	this.idVol = idVol;
	this.idAvion = idAvion;
	this.heurDepart = heurDepart;
	this.heurArrivee = heurArrivee;
	this.duree = duree;
	this.aeroportDepart = aeroportDepart;
	this.aeroportArrivee = aeroportArrivee;
	this.villeDepart = villeDepart;
	this.villeArrive = villeArrive;
	this.distance = distance;
}
public String getIdVol() {
	return idVol;
}
public void setIdVol(String idVol) {
	this.idVol = idVol;
}
public Avion getIdAvion() {
	return idAvion;
}
public void setIdAvion(Avion idAvion) {
	this.idAvion = idAvion;
}
public String getHeurDepart() {
	return heurDepart;
}
public void setHeurDepart(String heurDepart) {
	this.heurDepart = heurDepart;
}
public String getHeurArrivee() {
	return heurArrivee;
}
public void setHeurArrivee(String heurArrivee) {
	this.heurArrivee = heurArrivee;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
}
public String getAeroportDepart() {
	return aeroportDepart;
}
public void setAeroportDepart(String aeroportDepart) {
	this.aeroportDepart = aeroportDepart;
}
public String getAeroportArrivee() {
	return aeroportArrivee;
}
public void setAeroportArrivee(String aeroportArrivee) {
	this.aeroportArrivee = aeroportArrivee;
}
public String getVilleDepart() {
	return villeDepart;
}
public void setVilleDepart(String villeDepart) {
	this.villeDepart = villeDepart;
}
public String getVilleArrive() {
	return villeArrive;
}
public void setVilleArrive(String villeArrive) {
	this.villeArrive = villeArrive;
}
public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}

}
