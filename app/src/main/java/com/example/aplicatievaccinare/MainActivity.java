package com.example.aplicatievaccinare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mTitlesInfo = new ArrayList<>();
    private ArrayList<String> mTimesInfo = new ArrayList<>();
    private ArrayList<String> mImageUrlsInfo = new ArrayList<>();

    private ArrayList<String> mTitlesNews = new ArrayList<>();
    private ArrayList<String> mTimesNews = new ArrayList<>();
    private ArrayList<String> mImageUrlsNews = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImagesInfo();
        getImagesNews();
    }

    private void getImagesInfo() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrlsInfo.add("https://i.imgur.com/Wwx25wY.jpg");
        mTitlesInfo.add("Test 1");
        mTimesInfo.add("x minute");

        mImageUrlsInfo.add("https://i.imgur.com/Wwx25wY.jpg");
        mTitlesInfo.add("Test 12");
        mTimesInfo.add("x2 minute");

        mImageUrlsInfo.add("https://i.imgur.com/Wwx25wY.jpg");
        mTitlesInfo.add("Test 13");
        mTimesInfo.add("x3 minute");

        mImageUrlsInfo.add("https://i.imgur.com/Wwx25wY.jpg");
        mTitlesInfo.add("Test 14");
        mTimesInfo.add("x4 minute");

        initRecyclerViewInfo();
    }

    private void getImagesNews() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrlsNews.add("https://i.imgur.com/cH3a6Ye.png");
        mTitlesNews.add("Test 2");
        mTimesNews.add("x2 minute");

        mImageUrlsNews.add("https://i.imgur.com/cH3a6Ye.png");
        mTitlesNews.add("Test 22");
        mTimesNews.add("x4 minute");

        mImageUrlsNews.add("https://i.imgur.com/cH3a6Ye.png");
        mTitlesNews.add("Test 23");
        mTimesNews.add("x5 minute");

        mImageUrlsNews.add("https://i.imgur.com/cH3a6Ye.png");
        mTitlesNews.add("Test 24");
        mTimesNews.add("x6 minute");

        mImageUrlsNews.add("https://i.imgur.com/cH3a6Ye.png");
        mTitlesNews.add("Test 25");
        mTimesNews.add("x8 minute");

        mImageUrlsNews.add("https://i.imgur.com/cH3a6Ye.png");
        mTitlesNews.add("Test 26");
        mTimesNews.add("x10 minute");

        initRecyclerViewNews();
    }

    private void initRecyclerViewInfo() {
        Log.d(TAG, "initRecyclerViewInfo: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerViewInfo = findViewById(R.id.recyclerViewInfo);
        recyclerViewInfo.setLayoutManager(layoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mTitlesInfo, mTimesInfo, mImageUrlsInfo);
        recyclerViewInfo.setAdapter(adapter);
    }

    private void initRecyclerViewNews() {
        Log.d(TAG, "initRecyclerViewNews: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerViewInfo = findViewById(R.id.recyclerViewNews);
        recyclerViewInfo.setLayoutManager(layoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mTitlesNews, mTimesNews, mImageUrlsNews);
        recyclerViewInfo.setAdapter(adapter);
    }


}