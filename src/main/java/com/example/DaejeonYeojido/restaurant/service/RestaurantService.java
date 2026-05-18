package com.example.DaejeonYeojido.restaurant.service;

import com.example.DaejeonYeojido.restaurant.domain.Restaurant;
import com.example.DaejeonYeojido.restaurant.dto.RestaurantResponse;
import com.example.DaejeonYeojido.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    // 맛집 목록
    public List<RestaurantResponse> getRestaurants(){
        return restaurantRepository.findAll()
                .stream()
                .map(RestaurantResponse::from)
                .toList();
    }

    // 맛집 상세
    public RestaurantResponse getRestaurant(Long restaurantId){
        Restaurant restaurant = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new IllegalStateException("해당 맛집을 찾을 수 없습니다."));

        return RestaurantResponse.from(restaurant);
    }

    // 추천하기
    public RestaurantResponse increaseLikeCount(Long restaurantId){
        Restaurant restaurant = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new IllegalStateException("해당 맛집을 찾을 수 없습니다."));

        restaurant.increaseLikeCount();

        return RestaurantResponse.from(restaurant);
    }

}
