package com.onkar.surmaur;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Stay2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stay2);
    }

    public void onBtnClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(((TextView)view).getText());
        builder.setItems(new String[]{"Circuit House", "PWD Rest House", "IPH Rest House", "Kandi Rest House"}, null);
        builder.setNegativeButton("Ok", null);

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
