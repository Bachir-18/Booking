package user;

public class Administrateur{

	  protected String Login ;
	  protected String PWD ;

	// le constructeur:
	  public Administrateur(String pLogin, String  pPWD){
	    this.Login = pLogin;
	    this.PWD = encrypt(pPWD,pLogin);
	  }

	private String encrypt(String pPWD, String pLogin) {
																					
		return pPWD;
	}

	//Getters:
	  public String getLogin(){
	    return this.Login;
	  }

	  public String getPWD(){
	    return this.PWD;
	  }

	//Setters:
	public void setLogin(String pLogin){
	  this.Login = pLogin;
	}

	public void setPWD(String pPWD){
	  this.PWD = pPWD;
	}





	}
