import {AdvancedMarker, Map, Marker} from '@vis.gl/react-google-maps'

function MapView({restaurants = [], onSelectRestaurant, selectedRestaurant}) {
    // 대전 중심 좌표 객체
    const daejeonCenter = {
        lat: 36.350411,
        lng: 127.384547
    }

    return (
        <section className="map-section">
            <h2>대전 맛집 지도</h2>

            <div className="map-container">
                <Map
                    defaultCenter={daejeonCenter}
                    defaultZoom={13}
                    mapId="DEMO_MAP_ID"
                >
                    {/* 반복문 이용하여 마커 렌더링 */}
                    {restaurants.map((restaurant) => {

                        const isSelected = selectedRestaurant?.id === restaurant.id

                        return (
                            <AdvancedMarker
                                key = {restaurant.id}
                                position={{
                                    lat : restaurant.latitude,
                                    lng : restaurant.longitude,
                                }}
                                onClick={() => onSelectRestaurant(restaurant)}
                            >
                                <div className={`restaurant-marker ${
                                    isSelected ? 'selected-marker' : ``
                                }`}
                                >
                                    <div className="restaurant-marker">
                                        <div className="marker-pin" />
                                    </div>
                                    <span>{restaurant.name}</span>
                                </div>
                            </AdvancedMarker>
                        )
                    })}
                </Map>
            </div>
        </section>
    )
}

export default MapView