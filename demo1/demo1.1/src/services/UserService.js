import axios from 'axios'

const REST_GET_URL='http://localhost:7070/users'

class UserService
{
    getUsers(){
       return axios.get(REST_GET_URL)
    }
}

export default new UserService();
