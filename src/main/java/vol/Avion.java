package vol;

public class Avion{

	// declaration des variables de la classe:
	  protected int idAvion;
	  protected int nb_place;
	  protected String companie;
	// le constructeur:
	public Avion(int idAvion,int nb_place){
	  this.idAvion = idAvion;
	  this.nb_place = nb_place;
	}
	public Avion(){}
	//Getters:
	public int getIdAvion(){
	    return this.idAvion;
	}
	public int getNb_place(){
	    return this.nb_place;
	}
	public String getCompanie(){
	    return this.companie;
	}

	//Setters:
	public void setIdAvion(int idAvion){
	    this.idAvion = idAvion;
	}

	public void setNb_place(int nb_place){
	    this.nb_place = nb_place;
	}
	public void setCompanie(String companie){
	    this.companie = companie;
	}
	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", nb_place=" + nb_place + "]";
	}




	}
