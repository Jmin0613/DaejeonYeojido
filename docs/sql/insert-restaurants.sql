-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: daejeon_yeojido
-- ------------------------------------------------------
-- Server version	8.0.46

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `restaurants`
--

LOCK TABLES `restaurants` WRITE;
/*!40000 ALTER TABLE `restaurants` DISABLE KEYS */;
INSERT INTO `restaurants` VALUES (1,'대전광역시 중구 문화동 1-166','2026-05-19 08:41:30.705533','칼국수 + 두루치기(우동사리) + 돈까스의 삼위일체','KOREAN','/images/simin-kalguksu.jpg',36.321185,127.415604,'시민 칼국수','2026-05-19 08:41:30.705533');
INSERT INTO `restaurants` VALUES (2,'대전광역시 중구 보문로162번길 66','2026-05-19 08:41:30.805533', '어르신들 소주3병 필수, 차 가지고 가지 마세요', 'KOREAN', '/images/byeol-tteuneun-jip.jpg', 36.318876, 127.429138, '별뜨는집','2026-05-19 08:41:30.805533');
INSERT INTO `restaurants` VALUES (3,'대전광역시 유성구 봉명서로 21-1','2026-05-19 08:49:07.684923','마파두부에 눈을 뜬 계기','CHINESE','/images/always-sangsang.jpg',36.344792,127.341678,'늘상상','2026-05-19 08:49:07.684923');
INSERT INTO `restaurants` VALUES (4,'대전광역시 중구 선화동 번지 3층 62-2','2026-05-19 08:51:38.657684','느좋, 음료 위 샤베트가 Kick','CAFE_DESSERT','/images/cafe-hanbat.jpg',36.329046,127.425143,'한밭카페','2026-05-19 08:51:38.657684');
INSERT INTO `restaurants` VALUES (5,'대전광역시 중구 선화서로 34-10','2026-05-19 08:55:41.561129','커피 + 브라우니 맛집. 아이스모카에 얼음없는게 시그니처!','CAFE_DESSERT','/images/value-coffee-bar.jpg',36.327451,127.418852,'가치있는커피','2026-05-19 08:55:41.561129');
INSERT INTO `restaurants` VALUES (6,'대전광역시 중구 중앙로156번길 41-12','2026-05-19 08:58:18.338866','안 가본 사람은 있지만, 한 번 간 사람은 없다.','JAPANESE','/images/osaka-okonomiyaki.jpg',36.327987,127.428257,'오사카 오코노미야끼','2026-05-19 08:58:18.338866');
INSERT INTO `restaurants` VALUES (7,'대전광역시 서구 문정로 82 1층 103호','2026-05-19 09:00:10.595034','대전 돈까스 맛집 TOP5급. 숯불향 가득인데, 입에서 녹음.','JAPANESE','/images/daejeon-sutbul-donkatsu.jpg',36.34643,127.388252,'숯불돈까스','2026-05-19 09:00:10.595034');
INSERT INTO `restaurants` VALUES (8,'대전광역시 중구 선화동 중앙로79번길 78','2026-05-19 09:01:26.421651','계절 디저트인 딸기 아이스크림이 간판','CAFE_DESSERT','/images/d-Blume.jpg',36.329015,127.4186,'디블루메','2026-05-19 09:01:26.421651');
INSERT INTO `restaurants` VALUES (9,'대전광역시 중구 은행동 33-4번지','2026-05-19 09:03:51.258846','윗세대부터 아랫세대까지 이어지는 가성비 맛집','KOREAN','/images/dideli.jpg',36.329875,127.427424,'디델리','2026-05-19 09:03:51.258846');
INSERT INTO `restaurants` VALUES (10,'대전광역시 유성구 대학로155번길 37','2026-05-19 09:05:22.492375','맛이 들쑥날쑥하지만, 평균값이 좋은 가성비 맛집','KOREAN','/images/doldol-wangsimni.jpg',36.362438,127.350504,'돌돌왕십리야채곱창','2026-05-19 09:05:22.492375');
INSERT INTO `restaurants` VALUES (11,'대전광역시 중구 대흥동 446-8','2026-05-19 09:07:42.956076','유린기 필수, 고추 폭탄인데 하나두 안맵고 매콤!','CHINESE','/images/do-able.jpg',36.323902,127.424999,'도어블','2026-05-19 09:07:42.956076');
INSERT INTO `restaurants` VALUES (12,'대전광역시 보문산로365번길 2','2026-05-19 09:10:12.430377','얼큰칼칼, 디저트로 볶음밥 필수','KOREAN','/images/duseon-gaeseong-mandu.jpg',36.319889,127.4141,'두손개성만두','2026-05-19 09:10:12.430377');
INSERT INTO `restaurants` VALUES (13,'대전광역시 중구 보문로260번길 13','2026-05-19 09:11:44.951281','낮에는 카페, 밤에는 칵테일. 썸남썸녀랑 함께가기 좋음.','KOREAN','/images/gongplau.jpg',36.32608,127.422724,'융프라우','2026-05-19 09:11:44.951281');
INSERT INTO `restaurants` VALUES (14,'대전광역시 대덕구 쌍청당로 14','2026-05-19 09:14:45.303118','소식좌도 1인 1짬뽕으로 호로록-하는 곳','KOREAN','/images/hyangmigak.jpg',36.363306,127.435306,'조기종의 향미각','2026-05-19 09:14:45.303118');
INSERT INTO `restaurants` VALUES (15,'대전광역시 중구 대흥동 465-2','2026-05-19 09:16:06.463834','미소철판돈가스 필수! 사장님 혼자 하셔서 조금 걸릴 수 있음.','JAPANESE','/images/ikiya.jpg',36.325372,127.423407,'이키야','2026-05-19 09:16:06.463834');
INSERT INTO `restaurants` VALUES (16,'대전광역시 중구 은행선화동 중앙로137번길 64','2026-05-19 09:17:21.555418','키레이 라멘에 부타동 필수. 부타동이 K!ck','JAPANESE','/images/kirei.jpg',36.330553,127.42275,'키레이','2026-05-19 09:17:21.555418');
INSERT INTO `restaurants` VALUES (17,'대전광역시 대덕구 송촌북로16번길 35','2026-05-19 09:20:35.955258','무난하게 좋은 미나리 삼겹살 맛집.','KOREAN','/images/mok-gu-merng.jpg',36.364427,127.438487,'목구멍','2026-05-19 09:20:35.955258');
INSERT INTO `restaurants` VALUES (18,'대전광역시 유성구 계산동 305-10','2026-05-19 09:21:54.325872','교수님과 와우 이야기하며 데이트할 정도의 맛집(둘 다 호드였음)','KOREAN','/images/peach-blossom-house.jpg',36.335031,127.301085,'복사꽃피는집','2026-05-19 09:21:54.325872');
INSERT INTO `restaurants` VALUES (19,'대전광역시 중구 중촌동 402-2','2026-05-19 09:23:17.744276','여긴 진짜 분점!!!! 본점보다 분점이 더 맛폭발!!!!','KOREAN','/images/ramen-mura.jpg',36.337568,127.413335,'라멘무라 (전수점)','2026-05-19 09:23:17.744276');
INSERT INTO `restaurants` VALUES (20,'대전 대덕구 송촌북로20번길 42 (송촌동 456-8)','2026-05-19 09:25:48.534855','구운초밥의 맛을 깨달아버린 곳','JAPANESE','/images/small-sushi-bar.jpg',36.364893,127.438744,'작은 초밥집','2026-05-19 09:25:48.534855');
INSERT INTO `restaurants` VALUES (21,'대전광역시 동구 2층, 41-6','2026-05-19 09:29:30.491963','아저씨들 소주 인당 2병급 맛집, 단 양이 좀 적음.','KOREAN','/images/songrim-sikdang.jpg',36.328038,127.433736,'송림식당','2026-05-19 09:29:30.491963');
INSERT INTO `restaurants` VALUES (22,'대전광역시 중구 중앙로121번길 48','2026-05-19 09:31:25.379975','어죽칼국수 + 족발, 모두 공략하기 위해 최소 파티원 3명','KOREAN','/images/soniga-eojuk-kalguksu.jpg',36.329924,127.422764,'손이가어죽칼국수','2026-05-19 09:31:25.379975');
INSERT INTO `restaurants` VALUES (23,'대전광역시 유성구 죽동 721-5번지 101호','2026-05-19 09:37:38.504156','일식 코스요리, 쑥갓이 들어간 우동이 K!CK','JAPANESE','/images/soom.jpg',36.372144,127.339613,'숨','2026-05-19 09:37:38.504156');
INSERT INTO `restaurants` VALUES (24,'대전광역시 중구 대흥동 464-1','2026-05-19 09:46:18.765904','무난하게 맛있는 초밥집, 재료소진 이슈 많으니 얼른 가기!','JAPANESE','/images/sushi-kuruma.jpg',36.325563,127.423375,'스키킷도(스시쿠루마)','2026-05-19 09:46:18.765904');
INSERT INTO `restaurants` VALUES (25,'대전광역시 중구 은행동 163-3','2026-05-19 09:50:50.032935','2호점이 와따. 초밥만 먹고 배부르다 못해 남기는 곳.','JAPANESE','/images/yeon-izakaya.jpg',36.325563,127.423375,'연 이자카야(2호점)','2026-05-19 09:50:50.032935');
INSERT INTO `restaurants` VALUES (26,'대전광역시 중구 선화서로 34','2026-05-19 09:53:32.962700','둔산동 와타요업과 같은 곳. 무난하게 맛있는데, 메론소다가 필수!','JAPANESE','/images/yooran.jpg',36.326868,127.41881,'요우란','2026-05-19 09:53:32.962700');
INSERT INTO `restaurants` VALUES (26,'대전광역시 중구 선화서로 34','2026-05-19 09:53:32.962700','둔산동 와타요업과 같은 곳. 무난하게 맛있는데, 메론소다가 필수!','JAPANESE','/images/yooran.jpg',36.326868,127.41881,'요우란','2026-05-19 09:53:32.962700');
/*!40000 ALTER TABLE `restaurants` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-05-19 21:29:06
