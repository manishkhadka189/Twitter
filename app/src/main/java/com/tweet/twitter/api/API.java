package com.tweet.twitter.api;


import com.tweet.twitter.model.Check;
import com.tweet.twitter.model.ImageModel;
import com.tweet.twitter.model.SignUpResponse;
import com.tweet.twitter.model.TweetResponse;
import com.tweet.twitter.model.User;
import com.tweet.twitter.model.UserInfoList;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


public interface API {

    @POST("users/login")
    Call<SignUpResponse> checkUser(@Field("email") String username, @Field("password") String password);


    @POST("users/signup")
    Call<SignUpResponse> register(@Body User cud);

    @Multipart
    @POST("upload")
    Call<ImageModel> uploadImage(@Part MultipartBody.Part imageFile);

    @POST("users/check")
    Call<Check> check(@Body User email);

    @GET("tweet/tweetList")
    Call<List<TweetResponse>> GetTweet(@Header("Authorization") String token);

    @GET("users/me")
    Call<UserInfoList> getUser(@Header("Authorization") String token);
}

