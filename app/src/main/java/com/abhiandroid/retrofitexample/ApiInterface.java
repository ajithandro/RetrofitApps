package com.abhiandroid.retrofitexample;

import java.util.List;

import retrofit.Callback;
import retrofit.http.EncodedPath;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface ApiInterface {

    // API's endpoints
    @GET("/API/testtingretrofitfile.php/")
    void getUsersList(@Query("ty") String gstMode,
            Callback<List<UserListResponse>> callback);

// UserListResponse is POJO class to get the data from API, In above method we use List<UserListResponse> because the data in our API is starting from JSONArray

}
