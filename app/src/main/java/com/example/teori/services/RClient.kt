package com.example.teori.services

import android.util.Base64
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RClient {


//    private const val BASE_URL = "https://laundry.ibrahimalanshor.me/"

//    private val okHttpClient = okHttpClient.Builder()
//        .addInterceptor { chain ->
//            val original = chain.request()
//
//            val requestBuilder = original.newBuilder()
//                .method(original.method(), original.body())
//
//            val request = requestBuilder.build()
//            chain.proceed(request)
//        }.build()

//    val instance: Api by lazy {
//        val retrofit = Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(okHttpClient)
//            .build()
//        retrofit.create(Api::class.java)
//    }
}