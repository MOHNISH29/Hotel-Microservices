package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Rating;
import com.example.demo.Service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	public RatingService ratingService;
	@PostMapping("/")
	public ResponseEntity<Rating>createRating(@RequestBody Rating rating)
	{
		Rating rating1 = ratingService.createRating(rating);
		return new ResponseEntity<Rating>(rating1 , HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Rating>> getAllRatings()
	{
		List<Rating> rateList = ratingService.getAllRating();
		return ResponseEntity.ok(rateList);
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingsByUser(@PathVariable Integer userId)
	{
		List<Rating> rateList = ratingService.getAllRatingByUserId(userId);
		return ResponseEntity.ok(rateList);
	}
	
	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getAllRatingsByHotel(@PathVariable Integer hotelId)
	{
		List<Rating> rateList = ratingService.getAllRatingByHotelId(hotelId);
		return ResponseEntity.ok(rateList);
	}
	

}
