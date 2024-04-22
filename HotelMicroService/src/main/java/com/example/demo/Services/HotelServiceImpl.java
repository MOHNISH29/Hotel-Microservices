package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Hotel;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repositories.HotelRepo;
@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepo hotelrepo;

	@Override
	public Hotel createHotel(Hotel hotel) {
		
		return hotelrepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
	
		return hotelrepo.findAll();
	}

	@Override
	public Hotel getHotelById(Integer hotelId) {
		
		return hotelrepo.findById(hotelId).orElseThrow(()->new ResourceNotFoundException(hotelId));
	}

}
