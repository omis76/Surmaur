package com.onkar.surmaur;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AdminPanelActivity extends AppCompatActivity {

    private EditText userNameText, passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);
        userNameText = findViewById(R.id.username_edit_text);
        passwordText = findViewById(R.id.password_edit_text);
    }

    public void onLoginClick(View view) {
        if (userNameText.getText().toString().equals("test") && passwordText.getText().toString().equals("test")) {
            Intent intent = new Intent(this, AdminMailActivity.class);
            startActivity(intent);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Invalid Credentials");
            builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    userNameText.setText("");
                    passwordText.setText("");
                }
            });
            builder.create().show();
        }
    }
}
