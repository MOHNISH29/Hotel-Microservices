package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Ratings {
	
	private int ratingId;
	private int userId;
	private int hotelId;
	private int ratingScore;
	private String feedback;
}
