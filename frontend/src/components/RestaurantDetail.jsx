function RestaurantDetail({restaurant}) {
    // 마커 선택 전에는 아무것도 x.
    if(!restaurant) {
        return null
    }

    //구글 링크 연결
    const googleMapsUrl = `https://www.google.com/maps/search/?api=1&query=${encodeURIComponent(
        `${restaurant.name} ${restaurant.address}`
    )}`

    return (
        <aside className="restaurant-detail">
            <h2>{restaurant.name}</h2>

            {restaurant.imageUrl && (
                <img
                    className="restaurant-image"
                    src={restaurant.imageUrl}
                    alt={`${restaurant.name} 사진`}
                />
            )}

            <div className="detail-item">
                <strong>주소 </strong>
                <p>{restaurant.address}</p>
            </div>

            <div className="detail-item">
                <strong>음식 종류 </strong>
                <p>{restaurant.foodCategory}</p>
            </div>

            <div className="detail-item">
                <strong>한줄평 </strong>
                <p>{restaurant.description}</p>
            </div>

            <a
                className="google-map-link"
                href={googleMapsUrl}
                target="_blank"
                rel="noreferrer"
            >
                Google 지도에서 보기
            </a>
        </aside>
    )
}

export default RestaurantDetail