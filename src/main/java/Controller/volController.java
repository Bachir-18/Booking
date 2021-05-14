package Controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vol.Avion;
import vol.Vol;

import java.io.IOException;
import java.util.List;

import DAO.Iavion;
import DAO.ImplAvion;
import DAO.Ivol;
import DAO.implVol;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class volController
 */
@WebServlet("*.vol")
public class volController extends HttpServlet{
	private static final Avion[] Avion = null;
	private Ivol metier;
	private Iavion metierAvion;
     @Override
    public void init() throws ServletException {
    		metier=new implVol();
    		metierAvion = new ImplAvion();
    }  
    public volController() {}
    @Override
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String path=request.getServletPath();
	 	if(path.equals("/listevol.vol")) {
	 		List<Vol> vols=metier.lister_vol();
	 		Avion av = new Avion();
	 		request.setAttribute("vol", vols);
	 		request.setAttribute("av", av);
	 		request.getRequestDispatcher("/vol/lister.jsp").forward(request,response);
	 	}
	 	else if(path.equals("/add.vol"))
 	    {
	 		List<Avion> avions=metierAvion.listerAvion();
	 		request.setAttribute("avion", avions);
	 		request.getRequestDispatcher("/vol/ajouter.jsp").forward(request,response);
 	    }
	 	else if(path.equals("/supprimer.vol"))
	 	{
	 		String id=request.getParameter("idVol");
	 		metier.retirer_vol(id);
	 		List<Vol> vols=metier.lister_vol();
	 		request.setAttribute("vol", vols);
	 		request.getRequestDispatcher("/vol/lister.jsp").forward(request,response);
	 	}
		else if(path.equals("/modifier.vol"))
	 	{
	 		String id=request.getParameter("idVol");
	 		List<Avion> avions=metierAvion.listerAvion();
	 		List<Vol> vols=metier.lister_vol();
	 		request.setAttribute("vol", vols);
	 		request.setAttribute("avion", avions);
	 		request.getRequestDispatcher("/vol/editer.jsp").forward(request,response);
	 	}
	 	 
	 	
	 	 else if(path.equals("/save.vol") && request.getMethod().equals("POST"))
	 	  { 
	 		 		Vol V=new Vol();
	 		     int idAvion=Integer.parseInt(request.getParameter("idAvion"));
	 		     Avion avionId = metierAvion.getAvion(idAvion);
	 		     String iv=request.getParameter("idVol");
	 			 String hd =request.getParameter("heurDepart");
	 			 String ha=request.getParameter("heurArrivee");
	 			 int duree=Integer.parseInt(request.getParameter("duree"));
	 			 String ad=request.getParameter("ad");
	 			 String ar=request.getParameter("ar");
	 			 String vd=request.getParameter("vd");
	 			 String va=request.getParameter("va");
	 			 int distance=Integer.parseInt(request.getParameter("distance"));
	 			 V.setIdVol(iv);
	 			 V.setIdAvion(avionId);
	 			 V.setHeurDepart(hd);
	 			 V.setHeurArrivee(ha);
	 			 V.setDuree(duree);
	 			 V.setAeroportDepart(ad);
	 			 V.setAeroportArrivee(ar);
	 			 V.setVilleDepart(vd);
	 			 V.setVilleArrive(va);
	 			 V.setDistance(distance);
	 			 metier.inserer_vol(V);
	 			List<Vol> vols=metier.lister_vol();
		 		Avion av = new Avion();
		 		request.setAttribute("vol", vols);
		 		request.setAttribute("av", av);
		 		request.getRequestDispatcher("/vol/lister.jsp").forward(request,response);

	 			request.getRequestDispatcher("/vol/lister.jsp").forward(request,response);
	 	  }
	 	else if(path.equals("/modify.vol") && request.getMethod().equals("POST"))
	 	  { 
	 		     int idAvion=Integer.parseInt(request.getParameter("idAvion"));
	 		     Avion avionId = metierAvion.getAvion(idAvion);
	 		     String iv=request.getParameter("idVol");
	 			 String hd =request.getParameter("heurDepart");
	 			 String ha=request.getParameter("heurArrivee");
	 			 int duree=Integer.parseInt(request.getParameter("duree"));
	 			 String ad=request.getParameter("ad");
	 			 String ar=request.getParameter("ar");
	 			 String vd=request.getParameter("vd");
	 			 String va=request.getParameter("va");
	 			 int distance=Integer.parseInt(request.getParameter("distance"));
	 			 Vol V=new Vol();
	 			 V.setIdAvion(avionId);
	 			 V.setIdVol(iv);
	 			 V.setHeurDepart(hd);
	 			 V.setHeurArrivee(ha);
	 			 V.setDuree(duree);
	 			 V.setAeroportDepart(ad);
	 			 V.setAeroportArrivee(ar);
	 			 V.setVilleDepart(vd);
	 			 V.setAeroportArrivee(va);
	 			 V.setDistance(distance);
	 			 metier.modifier_vol(V);
	 			request.getRequestDispatcher("/vol/lister.jsp").forward(request,response);
	 	  }
	}
    
    @Override
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		doGet(request, response);
    	}
    

}
