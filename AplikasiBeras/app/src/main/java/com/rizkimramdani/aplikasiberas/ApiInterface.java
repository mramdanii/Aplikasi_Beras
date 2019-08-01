package com.rizkimramdani.aplikasiberas;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("getdata.php")
    Call<List<GetBeras>> getBeras(
            @Query("item_type") String item_type,
            @Query("key") String keyword
    );
}
