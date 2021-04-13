package ola.com.booking.service.impl;

import java.sql.SQLException;
import java.util.List;

import ola.com.booking.dao.RideDao;
import ola.com.booking.dao.UserDao;
import ola.com.booking.dao.impl.UserDaoImpl;
import ola.com.booking.dao.impl.rideDaoImpl;
import ola.com.booking.helper.RideHelper;
import ola.com.booking.helper.UserHelper;
import ola.com.booking.model.Ride;
import ola.com.booking.model.User;
import ola.com.booking.service.RideService;

public class RideServiceImpl implements RideService {
	RideDao rideDao;

	public void saveRide(Ride ride) {
		rideDao = new rideDaoImpl();
		
		ride.setRideId(RideHelper.getIncrement());
		rideDao.saveRide(ride);	
	}

	@Override
	public List<String> getRideDetail(Ride ride) {
		rideDao = new rideDaoImpl();
		
		try {
			return rideDao.getRideDetail(ride);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
