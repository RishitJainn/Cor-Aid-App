package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button news, info, schedule, helpline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        news = (Button) findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                openNews();
            }
        });

        info = (Button) findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                openInformation();
            }
        });

        schedule = (Button) findViewById(R.id.schedule);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                openSchedule();
            }
        });

        helpline = (Button) findViewById(R.id.helpline);
        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                openhelpline();
            }
        });
    }

    public void openNews() {
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }
    public void openInformation() {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
    public void openSchedule() {
        Intent intent = new Intent(this, ScheduleActivity.class);
        startActivity(intent);
    }
    public void openhelpline() {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }

}
