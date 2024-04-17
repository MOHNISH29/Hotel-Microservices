package com.example.demo.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="hotel")

@Getter
@Setter
@NoArgsConstructor
public class Hotel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int hotelId;
	private String hotelName;
	private String about;

}
