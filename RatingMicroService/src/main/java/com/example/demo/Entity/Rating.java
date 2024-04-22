package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="rating")

@Getter
@Setter
@NoArgsConstructor
public class Rating {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int ratingId;
	
	private int userId;
	private int hotelId;
	private int rating;
	private String feedback;

}
