package ola.com.booking.service;


import java.util.List;

import ola.com.booking.model.Ride;

public interface RideService {

	void saveRide(Ride ride);

	List<String> getRideDetail(Ride ride);

}
