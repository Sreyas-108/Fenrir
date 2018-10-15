package com.example.nishant.fenrir.data.retrofit

import com.google.gson.JsonObject
import com.squareup.okhttp.RequestBody
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.*

interface WalletService {

    @POST("2018/shop/add-money/")
    fun addMoney(@Header("Authorization") jwtToken: String, @Body body: JsonObject): Single<Response<MessageHolder>>

    @POST("2018/shop/transfer/")
    fun transferMoney(@Header("Authorization") jwtToken: String, @Body body: JsonObject): Single<Response<MessageHolder>>

    @GET("2018/shop/stalls/")
    fun getAllStalls(@Header("Authorization") jwtToken: String): Single<Response<List<RawStall>>>

    @GET("2018/shop/stalls/{stallId}/")
    fun getAllItemsInStallOfId(@Header("Authorization") jwtToken: String, @Path("stallId") stallId: String): Single<Response<List<RawItem>>>

    @POST("2018/shop/place-order/")
    fun placeOrder(@Header("Authorization") jwtToken: String, @Body body: JsonObject): Single<Response<PlaceOrderResponse>>
}