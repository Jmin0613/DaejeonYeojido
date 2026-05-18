package com.example.DaejeonYeojido.restaurant.dto;

import com.example.DaejeonYeojido.restaurant.domain.FoodCategory;
import com.example.DaejeonYeojido.restaurant.domain.Restaurant;
import lombok.Getter;

@Getter
public class RestaurantResponse {
    private Long id;
    private String name;
    private String address;
    private FoodCategory foodCategory;
    private String description;

    private Double latitude;
    private Double longitude;

    private RestaurantResponse(Restaurant restaurant){
        this.id = restaurant.getId();
        this.name = restaurant.getName();
        this.address = restaurant.getAddress();
        this.foodCategory = restaurant.getFoodCategory();
        this.description = restaurant.getDescription();
        this.latitude = restaurant.getLatitude();
        this.longitude = restaurant.getLongitude();
    }

    public static RestaurantResponse from(Restaurant restaurant){
        return new RestaurantResponse(restaurant);
    }
}
