package Controller;

import java.io.IOException;

import DAO.ImplReservation;
import DAO.Ireservation;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import vol.Avion;

@WebServlet("*.reservation")
public class ReservationController extends HttpServlet {
	Ireservation metier;
	@Override
	public void init() throws ServletException {
		metier=new ImplReservation();
	}
	
    public ReservationController() {}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		if(path.equals("/add.reservation")) 
		{
			 request.getRequestDispatcher("/reservation/ajouter.jsp").forward(request,response);
		}
		else if(path.equals("/save.reservation"))
	 	  {
	 		 String reservation=request.getParameter("");
	 			request.getRequestDispatcher("/reservation/lister.jsp").forward(request,response);
	 	  }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
