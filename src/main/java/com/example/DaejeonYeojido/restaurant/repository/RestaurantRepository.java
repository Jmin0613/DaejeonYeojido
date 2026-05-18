package com.example.DaejeonYeojido.restaurant.repository;

import com.example.DaejeonYeojido.restaurant.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository <Restaurant, Long> {

}
