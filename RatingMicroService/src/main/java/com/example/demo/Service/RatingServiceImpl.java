package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Rating;
import com.example.demo.Repository.RatingRepo;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingRepo ratingRepo;
	@Override
	public Rating createRating(Rating rating) {
		
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getAllRatingByUserId(int userId) {
		List<Rating> rateList = ratingRepo.findByUserId(userId);
		return rateList;
	}

	@Override
	public List<Rating> getAllRatingByHotelId(int hotelId) {
		List<Rating> rateList = ratingRepo.findByHotelId(hotelId);
		return rateList;
	}

}
