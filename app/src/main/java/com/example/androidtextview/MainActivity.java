package com.example.androidtextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] list_name = new String[]{"Nam", "Hoa", "Lan", "Anh"};
        int i = 0;
        while (i < list_name.length) {
            TextView textView = new TextView(MainActivity.this);
            textView.setText(list_name[i]);
            Button button = new Button(MainActivity.this);
            button.setText("+");
            LinearLayout main_child = new LinearLayout(MainActivity.this);
//            main_child.setOrientation(LinearLayout.HORIZONTAL);
            main_child.addView(textView);
            main_child.addView(button);
            LinearLayout main = findViewById(R.id.page_home);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    1.0f
            );
            textView.setLayoutParams(params);
            main.addView(main_child);
            i++;
        }
    }
}
