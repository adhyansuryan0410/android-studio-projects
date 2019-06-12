package com.example.tipcalculator;

import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private EditText mEditAmount;
    private EditText mEditPercentage;
    private Button mDone;
    private double tip_res;
    private CoordinatorLayout mSnackBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditAmount = findViewById(R.id.total_amount);
        mEditPercentage = findViewById(R.id.tip_percentage);
        mDone = findViewById(R.id.done);
        mSnackBarLayout = findViewById(R.id.snackbarcontainer);

        mDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double amount = Double.parseDouble(mEditAmount.getText().toString());
                double tip_per = Double.parseDouble(mEditPercentage.getText().toString());
                tip_res = (amount * tip_per) / 100;
                Log.d(TAG, "onClick() called with: v = [" + tip_res + "]");
                final Snackbar snackbar = Snackbar.make(mSnackBarLayout,
                        "Tip is: "+tip_res,
                        Snackbar.LENGTH_INDEFINITE);

                TextView tv = (TextView)(snackbar.getView()).findViewById(android.support.design.R.id.snackbar_text);
                tv.setTextColor(Color.WHITE);


                snackbar.show();

            }
        });
    }


}
