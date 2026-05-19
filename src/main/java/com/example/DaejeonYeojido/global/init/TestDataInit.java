package com.example.DaejeonYeojido.global.init;

import com.example.DaejeonYeojido.restaurant.domain.FoodCategory;
import com.example.DaejeonYeojido.restaurant.domain.Restaurant;
import com.example.DaejeonYeojido.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Profile("local-init") //비활성화
@Component
@RequiredArgsConstructor
public class TestDataInit implements CommandLineRunner {
    private final RestaurantRepository restaurantRepository;

    @Override
    @Transactional
    public void run(String... args){ //중복시드 저장 방지
        if(restaurantRepository.count() > 0){
            return;
        }

        testRestaurant();
    }

    // 맛집 테스트 데이터 6개
    private void testRestaurant(){
        List<Restaurant> restaurants = List.of(
            Restaurant.createRestaurant(
                    "시민 칼국수",
                    "대전광역시 중구 문화동 1-166",
                    FoodCategory.KOREAN,
                    "삼위일체 : 칼국수 + 두루치기(우동사리) + 돈까스",
                    36.321185,
                    127.415604,
                    "/images/simin-kalguksu.png"
            )

//            Restaurant.createRestaurant(
//                    "별뜨는집",
//                    "대전광역시 중구 보문로162번길 66",
//                    FoodCategory.KOREAN,
//                    "어르신들 소주3병 필수, 차 가지고 가지 마세요",
//                    36.319622,
//                    127.429104,
//                    "/images/"
//            ),
//
//            Restaurant.createRestaurant(
//                    "융프라우",
//                    "대전광역시 중구 보문로260번길 13",
//                    FoodCategory.CAFE_DESSERT,
//                    "낮에는 카페, 밤에는 칵테일. 썸남썸녀랑 함께 가면 좋아요.",
//                    36.326154,
//                    127.422705,
//                    "/images/"
//            ),
//
//            Restaurant.createRestaurant(
//                    "소슬",
//                    "대전광역시 중구 대흥로 131-6",
//                    FoodCategory.CAFE_DESSERT,
//                    "커피 및 타르트 맛집, 무화과 타르트 있으면 꼭 사수하기.",
//                    36.324863,
//                    127.426629,
//                    "/images/"
//            ),
//
//            Restaurant.createRestaurant(
//                    "이키야",
//                    "대전광역시 중구 대흥동 465-2",
//                    FoodCategory.JAPANESE,
//                    "미소철판돈가스 필수! 사장님 혼자 하셔서 조금 걸릴 수 있어요.",
//                    36.325425,
//                    127.423422,
//                    "/images/"
//            ),
//
//            Restaurant.createRestaurant(
//                    "대전 숯불돈까스",
//                    "대전광역시 서구 문정로 82 1층 103호",
//                    FoodCategory.JAPANESE,
//                    "숯불 삼겹살 돈까스 원탑. 숯불향이 금상첨화.",
//                    36.346634,
//                    127.388194,
//                    "/images/"
//            )
        );

        restaurantRepository.saveAll(restaurants);

    }
}
