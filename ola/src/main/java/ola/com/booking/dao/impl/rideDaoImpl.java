package ola.com.booking.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import ola.com.booking.ConectionManager;
import ola.com.booking.dao.RideDao;
import ola.com.booking.model.Ride;

public class rideDaoImpl implements RideDao {

	Connection conn= ConectionManager.getConnection();
	
	@Override
	public void saveRide(Ride ride) {
		try {
			PreparedStatement stmt = conn.prepareStatement("insert into ride (rideId, userId, routeId, date) values (?,?,?,?)");
			stmt.setInt(1, ride.getRideId());
			stmt.setInt(2, ride.getUserId());
			stmt.setInt(3, ride.getRouteId());
			stmt.setDate(4, Date.valueOf(ride.getDate()));
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public List<String> getRideDetail(Ride ride) throws SQLException {
		List<String> list=new LinkedList<String>();
		
		PreparedStatement stmt1 = conn.prepareStatement("SELECT * FROM user WHERE userId=?");
	    stmt1.setInt(1, ride.getUserId());
	    ResultSet rs1=stmt1.executeQuery();  
	    rs1.next();
	    
	    PreparedStatement stmt2 = conn.prepareStatement("SELECT * FROM ride WHERE rideId=?");
	    stmt2.setInt(1, ride.getRideId());
	    ResultSet rs2=stmt2.executeQuery();  
	    rs2.next();
	    
	    PreparedStatement stmt3 = conn.prepareStatement("SELECT * FROM route WHERE routeId=?");
	    stmt3.setInt(1, ride.getRouteId());
	    ResultSet rs3=stmt3.executeQuery();  
	    rs3.next();
	    
	    list.add(String.valueOf(ride.getRideId()));
	    list.add(rs1.getString("name"));
	    list.add(rs3.getString("source"));
	    list.add(rs3.getString("destination"));
	    list.add(rs2.getString("date"));
		
		return list;
	}

}
