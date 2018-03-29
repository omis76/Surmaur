package com.onkar.surmaur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.security.PublicKey;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void onAdminClick(View view) {
        Intent intent = new Intent(this, AdminPanelActivity.class);
        startActivity(intent);
    }

    public void onPublicClick(View view) {
        Intent intent = new Intent(this, PublicPanelActivity.class);
        startActivity(intent);
    }
}
