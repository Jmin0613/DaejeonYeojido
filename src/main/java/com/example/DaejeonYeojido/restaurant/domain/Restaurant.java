package com.example.DaejeonYeojido.restaurant.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "restaurants")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; //맛집 이름

    @Column(nullable = false)
    private String address; //주소

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FoodCategory foodCategory; // 음식 종류

    @Column(nullable = false)
    private String description; //한줄평(추천 이유)

    @Column(length = 500)
    private String imageUrl; // 음식 사진

    @Column(nullable = false)
    private Double latitude; // 위도(y좌표)
    @Column(nullable = false)
    private Double longitude; // 경도(x좌표)

    @CreatedDate
    private LocalDateTime createdAt; //생성일
    @LastModifiedDate
    private LocalDateTime updatedAt; //수정일

    private Restaurant(String name, String address, FoodCategory foodCategory,
                       String description, Double latitude, Double longitude, String imageUrl){
        if(name == null || name.isBlank()){ throw new IllegalStateException("맛집 이름을 입력해주세요."); }
        if(address == null || address.isBlank()){ throw new IllegalStateException("주소를 입력해주세요."); }
        if(foodCategory == null){ throw new IllegalStateException("음식 종류를 입력해주세요."); }
        if(description == null || description.isBlank()){ throw new IllegalStateException("한줄 평을 입력해주세요."); }

        if(latitude == null){ throw new IllegalStateException("맛집 위도를 입력해주세요."); }
        if(longitude == null){ throw new IllegalStateException("맛집 경도를 입력해주세요."); }

        this.name = name;
        this.address = address;
        this.foodCategory = foodCategory;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imageUrl = imageUrl;
    }

    // 맛집 등록
    public static Restaurant createRestaurant(String name, String address, FoodCategory foodCategory,
                             String description, Double latitude, Double longitude, String imageUrl){
        return new Restaurant(
                name, address, foodCategory, description, latitude, longitude, imageUrl
        );
    }

}
