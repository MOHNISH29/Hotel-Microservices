package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer>{

}
