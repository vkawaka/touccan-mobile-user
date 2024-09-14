package br.senai.sp.jandira.touccanmobile_user.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val BASE_URL = "https://touccan-backend.onrender.com/1.0/touccan/"

    //cliente http
    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun getUserService(): UserService {
        return retrofitFactory.create(UserService::class.java)
    }
}