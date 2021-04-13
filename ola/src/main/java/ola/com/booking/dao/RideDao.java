package ola.com.booking.dao;

import java.sql.SQLException;
import java.util.List;

import ola.com.booking.model.Ride;

public interface RideDao {

	void saveRide(Ride ride);

	List<String> getRideDetail(Ride ride) throws SQLException;
}
