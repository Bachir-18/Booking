package DAO;


import java.util.Date;
import java.util.List;

import vol.Avion;
import vol.Vol;

public class Test {

	public static void main(String[] args) {
		Ivol metier=new implVol();
		Avion a=new Avion();
		a.setNb_place(200);
		Vol V=new Vol();
		 V.setIdVol("AIRLINE");
		 V.setIdAvion(a);
		 V.setHeurDepart("2z");
		 V.setHeurArrivee("dk");
		 V.setDuree(200);
		 V.setAeroportDepart("e");
		 V.setAeroportArrivee("eE");
		 V.setVilleDepart("ZE");
		 V.setVilleArrive("ED");
		 V.setDistance(2000);
		 metier.inserer_vol(V);
	}

}
