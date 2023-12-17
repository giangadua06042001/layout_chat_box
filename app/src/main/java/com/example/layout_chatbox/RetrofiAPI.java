package com.example.layout_chatbox;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofiAPI {
    @GET
    Call<MsgModal>getMessage(@Url String url);
}
