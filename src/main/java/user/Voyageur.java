package user;

public class Voyageur{

	// declaration des variables de la classe:
	private int id;
	private String passeport;
	private String nom;
	private String prenom;
	private String adresse;

	// le constructeur:
	  public Voyageur(String prenom ,String nom ,String passeport ,String adresse){
	    this.passeport = passeport;
	    this.nom = nom;
	    this.prenom = prenom;
	    this.adresse = adresse;
	  }

	//Getters:
	public String getPasseport(){
	  return this.passeport;
	}

	public String getNom(){
	  return this.nom;
	}

	public String getPrenom(){
	  return this.prenom;
	}

	public String getAdresse(){
	  return this.adresse;
	}

	//Setters:
	public void setPasseport(String passeport){
	  this.passeport = passeport;
	}

	@Override
	public String toString() {
		return "Voyageur [passeport=" + passeport + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	public void setNom(String nom){
	  this.nom = nom;
	}

	public void setPrenom(String prenom){
	  this.prenom = prenom;
	}

	public void setAdresse(String adresse){
	  this.adresse = adresse;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	}
