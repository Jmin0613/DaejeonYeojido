function RestaurantDetail({restaurant}) {
    // 마커 선택 전에는 아무것도 x.
    if(!restaurant) {
        return null
    }

    return (
        <aside className="restaurant-detail">
            <h2>{restaurant.name}</h2>

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
        </aside>
    )
}

export default RestaurantDetail