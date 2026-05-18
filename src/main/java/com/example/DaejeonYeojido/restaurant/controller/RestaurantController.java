package com.example.DaejeonYeojido.restaurant.controller;

import com.example.DaejeonYeojido.restaurant.dto.RestaurantResponse;
import com.example.DaejeonYeojido.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/restaurants")
public class RestaurantController {
    private final RestaurantService restaurantService;

    // 맛집 목록
    @GetMapping
    public ResponseEntity<List<RestaurantResponse>> getRestaurants(){
        return ResponseEntity.ok(restaurantService.getRestaurants());
    }

    // 맛집 상세
    @GetMapping("/{restaurantId}")
    public ResponseEntity<RestaurantResponse> getRestaurant(@PathVariable Long restaurantId){
        return ResponseEntity.ok(restaurantService.getRestaurant(restaurantId));
    }

    // 추천수
    @PostMapping("/{restaurantId}/like")
    public ResponseEntity<RestaurantResponse> likeRestaurant(@PathVariable Long restaurantId){
        return ResponseEntity.ok(restaurantService.increaseLikeCount(restaurantId));
    }
}
