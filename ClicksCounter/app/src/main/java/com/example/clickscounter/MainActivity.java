package com.example.clickscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display(int num){
        TextView quantity = (TextView) findViewById(R.id.textView);
        quantity.setText(""+num);
    }

    public void submitCount(View view){
        count+=1;
        display(count);
    }
}
