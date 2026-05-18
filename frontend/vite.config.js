import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

export default defineConfig({
  plugins: [react()],

  server: {
    proxy: {
      '/api' : 'http://localhost:8080',
    }
  }
})

/*
React url : http://localhost:5173
Spring Boot url : http://localhost:8080
-> url이 달라서 CORS 발생. Vite Proxy 사용하여 우회.

실제 백엔드는 여전히 8080포트에서 동작.
React가 5173으로 API를 직접 처리하는거 X.
Vite가 중간에서 8080으로 대신 전달하는 것(대리인).
 */