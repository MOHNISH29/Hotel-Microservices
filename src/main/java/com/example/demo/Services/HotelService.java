package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Hotel;


public interface HotelService {

	Hotel createHotel(Hotel hotel);
	List<Hotel> getAllHotels();
	Hotel getHotelById(Integer hotelId);
}
