package com.example.student.lani;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

public class MainActivity extends Activity {
    TextView quantityTextView;
    int numberOfGloss = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantityTextView = findViewById(R.id.quantity);

    }
    private void displayQuantity(int number) {
        quantityTextView.setText("Quantity: " + number);
    }

    public void increase(View view){
        numberOfGloss ++;
        displayQuantity(numberOfGloss);

    }
}
