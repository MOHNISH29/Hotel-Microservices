package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Rating;

public interface RatingService {

	Rating createRating(Rating rating);
	List<Rating> getAllRating();
	List<Rating> getAllRatingByUserId(int userId);
	List<Rating> getAllRatingByHotelId(int hotelId);
	
}
