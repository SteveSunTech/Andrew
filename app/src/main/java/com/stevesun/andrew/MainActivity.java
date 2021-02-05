package com.stevesun.andrew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.stevesun.andrew.model.NewsResponse;
import com.stevesun.andrew.network.NewsApi;
import com.stevesun.andrew.network.RetrofitClient;


public class MainActivity extends AppCompatActivity {

   private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

               BottomNavigationView navView = findViewById(R.id.nav_view);
              NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                           .findFragmentById(R.id.nav_host_fragment);
              navController = navHostFragment.getNavController();
              NavigationUI.setupWithNavController(navView, navController);
        NewsApi api = RetrofitClient.newInstance(this).create(NewsApi.class);


        /// 这些code要挪到model中：

        //NewsApi api = RetrofitClient.newInstance(this).create(NewsApi.class);
        //api.getTopHeadlines("US").enqueue(new Callback<NewsResponse>() {
        //@Override
        //public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
        //                 if (response.isSuccessful()) {
        //                   Log.d("getTopHeadlines", response.body().toString());
        //                       } else {
        //                          Log.d("getTopHeadlines", response.toString());
        //                    }
        //              }
        //@Override
        //public void onFailure(Call<NewsResponse> call, Throwable t) {
        //                   Log.d("getTopHeadlines", t.toString());
        //                }
        //              });

    }

  @Override
  public boolean onSupportNavigateUp() {
             return navController.navigateUp();
    }
}
