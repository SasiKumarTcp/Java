package ola.com.booking;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ola.com.booking.model.Ride;
import ola.com.booking.service.RideService;
import ola.com.booking.service.impl.RideServiceImpl;

/**
 * Servlet implementation class RideServlet
 */
@WebServlet("/bookRide")
public class RideServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RideService rideService = new RideServiceImpl();
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("action").equals("rideDetail")) {
			Ride ride = new Ride();
			HttpSession session = request.getSession();
			ride.setUserId(Integer.valueOf(session.getAttribute("userId").toString()));
			ride.setRouteId(Integer.valueOf(request.getParameter("routeId")));
			ride.setDate(LocalDate.now());
			
			rideService.saveRide(ride);
			request.setAttribute("rideList", rideService.getRideDetail(ride));
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/bookedDetail.jsp");
	        rd.forward(request, response);
		}
		
	}

}
