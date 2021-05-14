package Controller;
import java.io.IOException;
import java.util.List;
import DAO.Iavion;
import DAO.ImplAvion;
import jakarta.servlet.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import vol.Avion;

@WebServlet("*.avion")
public class AvionController extends HttpServlet{
       private Iavion metier;
       @Override
    	public void init() throws ServletException {
    	   metier=new ImplAvion();
    	}
    public AvionController() {
      
    }
    
    @Override
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 	String path=request.getServletPath();
    	 	if(path.equals("/listeAvion.avion")) {
    	 		List<Avion> avions=metier.listerAvion();
    	 		request.setAttribute("avion", avions);
    	 		request.getRequestDispatcher("/avion/lister.jsp").forward(request,response);
    	 	}
    	 	else if(path.equals("/supprimer.avion"))
    	 	{
    	 		int id=Integer.parseInt(request.getParameter("idAvion"));
    	 		metier.retirerAvion(id);
    	 		List<Avion> avions=metier.listerAvion();
    	 		request.setAttribute("avion", avions);
    	 		request.getRequestDispatcher("/avion/lister.jsp").forward(request,response);
    	 	}
    	 	  else if(path.equals("/add.avion"))
    	 	    {
    	 		  
    	 		 request.getRequestDispatcher("/avion/ajouter.jsp").forward(request,response);
    	 	    }
    	 	
    	 	  else if(path.equals("/save.avion"))
    	 	  {
    	 		  	int nb_place=Integer.parseInt(request.getParameter("nb_place"));
     	 			Avion A=new Avion();
     	 			A.setNb_place(nb_place);
     	 			A.setCompanie(request.getParameter("companie"));
     	 			metier.save(A);
     	 			List<Avion> avions=metier.listerAvion();
        	 		request.setAttribute("avion", avions);
     	 			request.getRequestDispatcher("/avion/lister.jsp").forward(request,response);
    	 	  }
    	}

    @Override
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		doGet(request, response);
    	}

}
