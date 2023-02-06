package com.innocat.albert.wirecom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
public class Post extends AppCompatActivity     {


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_post);
                getSupportActionBar().setTitle("");
                // enable ActionBar app icon to behave as action to toggle nav drawer
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setHomeButtonEnabled(true);

            }

        }
