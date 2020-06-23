package com.mdtusarmolla.durekothaw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView titel, text1, text2, text3;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        titel = findViewById(R.id.titleId);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        value = getIntent().getIntExtra("value", 1);
        setText(value);
    }

    public void setText(int value) {
        if (value == 1) {
            titel.setText(getResources().getString(R.string.chapter1));
            text1.setText(getResources().getString(R.string.chapter1a));
            text2.setText(getResources().getString(R.string.chapter1b));
            text3.setText(getResources().getString(R.string.chapter1c));
        }
        
        if (value == 2) {
            titel.setText(getResources().getString(R.string.chapter2));
            text1.setText(getResources().getString(R.string.chapter2a));
            text2.setText(getResources().getString(R.string.chapter2b));
            text3.setText(getResources().getString(R.string.chapter2c));
        }
   if (value == 3) {
            titel.setText(getResources().getString(R.string.chapter3));
            text1.setText(getResources().getString(R.string.chapter3a));
            text2.setText(getResources().getString(R.string.chapter3b));
            text3.setText(getResources().getString(R.string.chapter3c));
        }
   if (value == 4) {
            titel.setText(getResources().getString(R.string.chapter4));
            text1.setText(getResources().getString(R.string.chapter4a));
            text2.setText(getResources().getString(R.string.chapter4b));
            text3.setText(getResources().getString(R.string.chapter4c));
        }
   if (value == 5) {
            titel.setText(getResources().getString(R.string.chapter5));
            text1.setText(getResources().getString(R.string.chapter5a));
            text2.setText(getResources().getString(R.string.chapter5b));
            text3.setText(getResources().getString(R.string.chapter5c));
        }
   if (value == 6) {
            titel.setText(getResources().getString(R.string.chapter6));
            text1.setText(getResources().getString(R.string.chapter6a));
            text2.setText(getResources().getString(R.string.chapter6b));
            text3.setText(getResources().getString(R.string.chapter6c));
        }
   if (value == 7) {
            titel.setText(getResources().getString(R.string.chapter7));
            text1.setText(getResources().getString(R.string.chapter7a));
            text2.setText(getResources().getString(R.string.chapter7b));
            text3.setText(getResources().getString(R.string.chapter7c));
        }
   if (value == 8) {
            titel.setText(getResources().getString(R.string.chapter8));
            text1.setText(getResources().getString(R.string.chapter8a));
            text2.setText(getResources().getString(R.string.chapter8b));
            text3.setText(getResources().getString(R.string.chapter8c));
        }
   if (value == 9) {
            titel.setText(getResources().getString(R.string.chapter9));
            text1.setText(getResources().getString(R.string.chapter9a));
            text2.setText(getResources().getString(R.string.chapter9b));
            text3.setText(getResources().getString(R.string.chapter9c));
        }
   if (value == 10) {
            titel.setText(getResources().getString(R.string.chapter10));
            text1.setText(getResources().getString(R.string.chapter10a));
            text2.setText(getResources().getString(R.string.chapter10b));
            text3.setText(getResources().getString(R.string.chapter10c));
        }
   if (value == 11) {
            titel.setText(getResources().getString(R.string.chapter11));
            text1.setText(getResources().getString(R.string.chapter11a));
            text2.setText(getResources().getString(R.string.chapter11b));
            text3.setText(getResources().getString(R.string.chapter11c));
        }
   if (value == 12) {
            titel.setText(getResources().getString(R.string.chapter12));
            text1.setText(getResources().getString(R.string.chapter12a));
            text2.setText(getResources().getString(R.string.chapter12b));
            text3.setText(getResources().getString(R.string.chapter12c));
        }
   if (value == 13) {
            titel.setText(getResources().getString(R.string.chapter13));
            text1.setText(getResources().getString(R.string.chapter13a));
            text2.setText(getResources().getString(R.string.chapter13b));
            text3.setText(getResources().getString(R.string.chapter13c));
        }
   if (value == 14) {
            titel.setText(getResources().getString(R.string.chapter14));
            text1.setText(getResources().getString(R.string.chapter14a));
            text2.setText(getResources().getString(R.string.chapter14b));
            text3.setText(getResources().getString(R.string.chapter14c));
        }
   if (value == 15) {
            titel.setText(getResources().getString(R.string.chapter15));
            text1.setText(getResources().getString(R.string.chapter15a));
            text2.setText(getResources().getString(R.string.chapter15b));
            text3.setText(getResources().getString(R.string.chapter15c));
        }
   if (value == 16) {
            titel.setText(getResources().getString(R.string.chapter16));
            text1.setText(getResources().getString(R.string.chapter16a));
            text2.setText(getResources().getString(R.string.chapter16b));
            text3.setText(getResources().getString(R.string.chapter16c));
        }
   if (value == 17) {
            titel.setText(getResources().getString(R.string.chapter17));
            text1.setText(getResources().getString(R.string.chapter17a));
            text2.setText(getResources().getString(R.string.chapter17b));
            text3.setText(getResources().getString(R.string.chapter17c));
        }
   if (value == 18) {
            titel.setText(getResources().getString(R.string.chapter18));
            text1.setText(getResources().getString(R.string.chapter18a));
            text2.setText(getResources().getString(R.string.chapter18b));
            text3.setText(getResources().getString(R.string.chapter18c));
        }
   if (value == 19) {
            titel.setText(getResources().getString(R.string.chapter19));
            text1.setText(getResources().getString(R.string.chapter19a));
            text2.setText(getResources().getString(R.string.chapter19b));
            text3.setText(getResources().getString(R.string.chapter19c));
        }
   if (value == 20) {
            titel.setText(getResources().getString(R.string.chapter20));
            text1.setText(getResources().getString(R.string.chapter20a));
            text2.setText(getResources().getString(R.string.chapter20b));
            text3.setText(getResources().getString(R.string.chapter20c));
        }
   if (value == 21) {
            titel.setText(getResources().getString(R.string.chapter21));
            text1.setText(getResources().getString(R.string.chapter21a));
            text2.setText(getResources().getString(R.string.chapter21b));
            text3.setText(getResources().getString(R.string.chapter21c));
        }
   if (value == 22) {
            titel.setText(getResources().getString(R.string.chapter22));
            text1.setText(getResources().getString(R.string.chapter22a));
            text2.setText(getResources().getString(R.string.chapter22b));
            text3.setText(getResources().getString(R.string.chapter22c));
        }
   if (value == 23) {
            titel.setText(getResources().getString(R.string.chapter23));
            text1.setText(getResources().getString(R.string.chapter23a));
            text2.setText(getResources().getString(R.string.chapter23b));
            text3.setText(getResources().getString(R.string.chapter23c));
        }
   if (value == 24) {
            titel.setText(getResources().getString(R.string.chapter24));
            text1.setText(getResources().getString(R.string.chapter24a));
            text2.setText(getResources().getString(R.string.chapter24b));
            text3.setText(getResources().getString(R.string.chapter24c));
        }
   if (value == 25) {
            titel.setText(getResources().getString(R.string.chapter25));
            text1.setText(getResources().getString(R.string.chapter25a));
            text2.setText(getResources().getString(R.string.chapter25b));
            text3.setText(getResources().getString(R.string.chapter25c));
        }
   if (value == 26) {
            titel.setText(getResources().getString(R.string.chapter26));
            text1.setText(getResources().getString(R.string.chapter26a));
            text2.setText(getResources().getString(R.string.chapter26b));
            text3.setText(getResources().getString(R.string.chapter26c));
        }
   if (value == 27) {
            titel.setText(getResources().getString(R.string.chapter27));
            text1.setText(getResources().getString(R.string.chapter27a));
            text2.setText(getResources().getString(R.string.chapter27b));
            text3.setText(getResources().getString(R.string.chapter27c));
        }
   if (value == 28) {
            titel.setText(getResources().getString(R.string.chapter28));
            text1.setText(getResources().getString(R.string.chapter28a));
            text2.setText(getResources().getString(R.string.chapter28b));
            text3.setText(getResources().getString(R.string.chapter28c));
        }
   if (value == 29) {
            titel.setText(getResources().getString(R.string.chapter29));
            text1.setText(getResources().getString(R.string.chapter29a));
            text2.setText(getResources().getString(R.string.chapter29b));
            text3.setText(getResources().getString(R.string.chapter29c));
        }
   if (value == 30) {
            titel.setText(getResources().getString(R.string.chapter30));
            text1.setText(getResources().getString(R.string.chapter30a));
            text2.setText(getResources().getString(R.string.chapter30b));
            text3.setText(getResources().getString(R.string.chapter30c));
        }
   if (value == 31) {
            titel.setText(getResources().getString(R.string.chapter31));
            text1.setText(getResources().getString(R.string.chapter31a));
            text2.setText(getResources().getString(R.string.chapter31b));
            text3.setText(getResources().getString(R.string.chapter31c));
        }
   if (value == 32) {
            titel.setText(getResources().getString(R.string.chapter32));
            text1.setText(getResources().getString(R.string.chapter32a));
            text2.setText(getResources().getString(R.string.chapter32b));
            text3.setText(getResources().getString(R.string.chapter32c));
        }
   if (value == 35) {
            titel.setText(getResources().getString(R.string.chapter35));
            text1.setText(getResources().getString(R.string.chapter35a));
            text2.setText(getResources().getString(R.string.chapter35b));
            text3.setText(getResources().getString(R.string.chapter35c));
        }
   if (value == 33) {
            titel.setText(getResources().getString(R.string.chapter33));
            text1.setText(getResources().getString(R.string.chapter33a));
            text2.setText(getResources().getString(R.string.chapter33b));
            text3.setText(getResources().getString(R.string.chapter33c));
        }
   if (value == 34) {
            titel.setText(getResources().getString(R.string.chapter34));
            text1.setText(getResources().getString(R.string.chapter34a));
            text2.setText(getResources().getString(R.string.chapter34b));
            text3.setText(getResources().getString(R.string.chapter34c));
        }
   if (value == 35) {
            titel.setText(getResources().getString(R.string.chapter35));
            text1.setText(getResources().getString(R.string.chapter35a));
            text2.setText(getResources().getString(R.string.chapter35b));
            text3.setText(getResources().getString(R.string.chapter35c));
        }


    }
}
