import {useEffect, useState} from 'react'
import './App.css'
import {getRestaurants} from "./api/restaurantApi.js";
import {APIProvider} from "@vis.gl/react-google-maps";
import MapView from "./components/MapView.jsx";
import RestaurantDetail from "./components/RestaurantDetail.jsx";

function App() {
  // 백엔드에서 받아온 맛집 목록
  const [restaurants, setRestaurants] = useState([])

  // 선택된 맛집
  const [selectedRestaurant, setSelectedRestaurant] = useState(null)

  // 요청중인지 여부
  const [loading, setLoading] = useState(true)

  // API 호출 실패 여부
  const [error, setError] = useState(null)

  // 선택한 맛집 취소 함수
  const handleSelectRestaurant = (restaurant) => {
    setSelectedRestaurant((prevSelectedRestaurant) => {
      if(prevSelectedRestaurant?.id === restaurant.id) {
        return null;
      }

      return restaurant
    })
  }

  useEffect(() => {
    const fetchRestaurants = async () => {
      try {
        const data = await getRestaurants(); // 맛집 목록 불러오기
        setRestaurants(data)
      } catch (error) {
        setError(error.message)
      } finally {
        setLoading(false)
      }
    }

    fetchRestaurants()
  }, [])

  if(loading){
    return <div>맛집 목록을 불러오는 중입니다...</div>
  }

  if(error){
    return <div>{error}</div>
  }

  return (
      <APIProvider apiKey={import.meta.env.VITE_GOOGLE_MAPS_API_KEY}>
        <main className="app-page">
          <h1>대전여지도</h1>

          <div className="main-layout">
            <RestaurantDetail restaurant={selectedRestaurant} />

            <MapView
                restaurants={restaurants} //마커 찍을 전체 맛집 목록
                selectedRestaurant={selectedRestaurant} //현재 선택된 맛집
                onSelectRestaurant={handleSelectRestaurant} //맛집 선택 함수
            />
          </div>
        </main>
      </APIProvider>

  )

}

export default App
