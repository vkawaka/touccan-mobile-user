package br.senai.sp.jandira.touccanmobile_user.service

import br.senai.sp.jandira.touccanmobile_user.model.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserService {

    @POST("usuario")
    fun saveUser(@Body user: User): Call<User>
}