import {useEffect, useState} from 'react'
import './App.css'
import {getRestaurants} from "./api/restaurantApi.js";
import {APIProvider} from "@vis.gl/react-google-maps";
import MapView from "./components/MapView.jsx";

function App() {
  // 백엔드에서 받아온 맛집 목록
  const [restaurants, setRestaurants] = useState([])

  // 요청중인지 여부
  const [loading, setLoading] = useState(true)

  // API 호출 실패 여부
  const [error, setError] = useState(null)

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
        <div>
          <h1>대전여지도</h1>

          <MapView />

          <h2>맛집 목록</h2>

          <ul>
            {/* 반복문map이용하여 맛집목록 데이터 조회 */}
            {restaurants.map((restaurant) => (
                <li key={restaurant.id}>
                  <strong>{restaurant.name}</strong>
                  <p>{restaurant.address}</p>
                  <p>{restaurant.description}</p>
                </li>
            ))}
          </ul>
        </div>
      </APIProvider>

  )

}

export default App
