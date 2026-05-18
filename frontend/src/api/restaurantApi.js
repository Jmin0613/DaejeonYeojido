// 맛집 목록
export async function getRestaurants() {
    const response = await fetch(`/api/restaurants`);

    if(!response.ok) {
        const errorText = await response.text()
        console.error('API 요청 실패 : ', response.status, errorText)
        throw new Error(`맛집 목록을 불러오지 못했습니다. status :  ${response.status}`)
    }

    // 받아온 목록 데이터, json변환하여 저장
    return response.json();
}