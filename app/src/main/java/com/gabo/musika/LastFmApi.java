package com.gabo.musika;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 5/21/2016.
 */
public class LastFmApi {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://ws.audioscrobbler.com/2.0/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

//    GitHubService service = retrofit.create(GitHubService.class);
}
