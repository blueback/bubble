import Api from './api';

const api = new Api({
  baseURI: 'http://localhost:8099/springboot',
  headers: {
    'Accept': 'application/json',
    'Content-Type':'application/x-www-form-urlencoded' 
  }
})

export default api
