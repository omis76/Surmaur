package com.onkar.surmaur;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {

    private BottomSheetBehavior mBottomSheetBehavior1, mBottomSheetBehavior2, mBottomSheetBehavior3, mBottomSheetBehavior4, mBottomSheetBehavior5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        View bottomSheet1 = findViewById(R.id.bottom_sheet1);
        mBottomSheetBehavior1 = BottomSheetBehavior.from(bottomSheet1);
        mBottomSheetBehavior1.setState(BottomSheetBehavior.STATE_HIDDEN);

        View bottomSheet2 = findViewById(R.id.bottom_sheet2);
        mBottomSheetBehavior2 = BottomSheetBehavior.from(bottomSheet2);
        mBottomSheetBehavior2.setState(BottomSheetBehavior.STATE_HIDDEN);

        View bottomSheet3 = findViewById(R.id.bottom_sheet3);
        mBottomSheetBehavior3 = BottomSheetBehavior.from(bottomSheet3);
        mBottomSheetBehavior3.setState(BottomSheetBehavior.STATE_HIDDEN);

        View bottomSheet4 = findViewById(R.id.bottom_sheet4);
        mBottomSheetBehavior4 = BottomSheetBehavior.from(bottomSheet4);
        mBottomSheetBehavior4.setState(BottomSheetBehavior.STATE_HIDDEN);

        View bottomSheet5 = findViewById(R.id.bottom_sheet5);
        mBottomSheetBehavior5 = BottomSheetBehavior.from(bottomSheet5);
        mBottomSheetBehavior5.setState(BottomSheetBehavior.STATE_HIDDEN);
    }

    @Override
    public void onBackPressed() {
        if (mBottomSheetBehavior1.getState() == BottomSheetBehavior.STATE_EXPANDED) {
            mBottomSheetBehavior1.setState(BottomSheetBehavior.STATE_HIDDEN);
        } else {
            if (mBottomSheetBehavior2.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                mBottomSheetBehavior2.setState(BottomSheetBehavior.STATE_HIDDEN);
            } else {

                if (mBottomSheetBehavior3.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                    mBottomSheetBehavior3.setState(BottomSheetBehavior.STATE_HIDDEN);
                } else {

                    if (mBottomSheetBehavior4.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                        mBottomSheetBehavior4.setState(BottomSheetBehavior.STATE_HIDDEN);
                    } else {

                        if (mBottomSheetBehavior5.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                            mBottomSheetBehavior5.setState(BottomSheetBehavior.STATE_HIDDEN);
                        } else {
                            super.onBackPressed();
                        }
                    }
                }
            }
        }
    }

    public void onAdminClick(View view) {
        if (mBottomSheetBehavior1.getState() != BottomSheetBehavior.STATE_EXPANDED) {
            mBottomSheetBehavior1.setState(BottomSheetBehavior.STATE_EXPANDED);
        } else {
            mBottomSheetBehavior1.setState(BottomSheetBehavior.STATE_COLLAPSED);
        }
    }

    public void onRevenueClick(View view) {
        if (mBottomSheetBehavior2.getState() != BottomSheetBehavior.STATE_EXPANDED) {
            mBottomSheetBehavior2.setState(BottomSheetBehavior.STATE_EXPANDED);
        } else {
            mBottomSheetBehavior2.setState(BottomSheetBehavior.STATE_COLLAPSED);
        }
    }

    public void onPoliceClick(View view) {
        if (mBottomSheetBehavior3.getState() != BottomSheetBehavior.STATE_EXPANDED) {
            mBottomSheetBehavior3.setState(BottomSheetBehavior.STATE_EXPANDED);
        } else {
            mBottomSheetBehavior3.setState(BottomSheetBehavior.STATE_COLLAPSED);
        }
    }

    public void onMedicalClick(View view) {
        if (mBottomSheetBehavior4.getState() != BottomSheetBehavior.STATE_EXPANDED) {
            mBottomSheetBehavior4.setState(BottomSheetBehavior.STATE_EXPANDED);
        } else {
            mBottomSheetBehavior4.setState(BottomSheetBehavior.STATE_COLLAPSED);
        }
    }

    public void onFireClick(View view) {
        if (mBottomSheetBehavior5.getState() != BottomSheetBehavior.STATE_EXPANDED) {
            mBottomSheetBehavior5.setState(BottomSheetBehavior.STATE_EXPANDED);
        } else {
            mBottomSheetBehavior5.setState(BottomSheetBehavior.STATE_COLLAPSED);
        }
    }

    private void sendEmail(String emailAddress) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);

        String uriText =
                "mailto:" + emailAddress +
                        "?subject=" + Uri.encode("Mail from android app");
        emailIntent.setData(Uri.parse(uriText));

        try {
            startActivity(emailIntent);
            finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(ContactActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

    private void doCall(String contact) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + contact));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            Snackbar snackbar = Snackbar.make(findViewById(R.id.contact_main), "Please give permission to make calls", Snackbar.LENGTH_LONG);
            snackbar.show();
        }
        else {
            startActivity(intent);
        }
    }

    public void onEmailClickDC(View view) {
        sendEmail("dc-sir-hp@nic.in");
    }

    public void onOfficeClickDC(View view) {
        doCall("01702225025");
    }

    public void onEmailClickSP(View view) {
        sendEmail("sp-nah-hp@nic.in");
    }

    public void onOfficeClickSP(View view) {
        doCall("01702225002");
    }

    public void onEmailClickADM(View view) {
        sendEmail("admin-sir-hp@nic.in");
    }

    public void onOfficeClickADM(View view) {
        doCall("01702222410");
    }

    public void onEmailClickAC(View view) {
        sendEmail("ac-sir-hp@nic.in");
    }

    public void onOfficeClickAC(View view) {
        doCall("01702222546");
    }

    public void onEmailClickDRO(View view) {
        sendEmail("dro-sir-hp@nic.in");
    }

    public void onOfficeClickDRO(View view) {
        doCall("01702222463");
    }

    public void onClickSHORajgarh(View view) {
        doCall("01799222522");
    }

    public void onClickSHOShillai(View view) {
        doCall("01704222522");
    }

    public void onClickSHOSangarh(View view) {
        doCall("01702222522");
    }

    public void onClickSHOPaonta(View view) {
        doCall("01704222522");
    }

    public void onClickSHONahan(View view) {
        doCall("01702222522");
    }

    public void onMedicalCMOClick(View view) {
        doCall("0170222500");
    }

    public void onMedicalTollClick(View view) {
        doCall("108");
    }

    public void onFireOfficeClick(View view) {
        doCall("0170222500");
    }

    public void onFireTollClick(View view) {
        doCall("101");
    }
}
