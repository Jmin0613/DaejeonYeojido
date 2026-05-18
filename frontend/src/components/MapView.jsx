import {Map} from '@vis.gl/react-google-maps'

function MapView() {
    // 대전 중심 좌표 객체
    const daejeonCenter = {
        lat: 36.350411,
        lng: 127.384547
    }

    return (
        <section>
            <h2>대전 맛집 지도</h2>

            <div
                style={{
                    width: '100%',
                    height: '400px',
                    borderRadius: '12px',
                    overflow: 'hidden'
                }}
            >
                <Map
                    defaultCenter={daejeonCenter}
                    defaultZoom={13}
                />
            </div>
        </section>
    )
}

export default MapView