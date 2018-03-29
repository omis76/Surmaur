package com.onkar.surmaur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stay);
    }

    public void onBtnClick(View view) {
        Intent intent = new Intent(this, Stay2Activity.class);
        startActivity(intent);
    }
}
