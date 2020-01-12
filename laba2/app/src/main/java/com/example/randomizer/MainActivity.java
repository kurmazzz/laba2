package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random myRandom = new Random();
        final String words[] = { "Цветочек", "Котик", "Птичка", "Радуга", "Облако", "Сергей Вячеславович - лучший преподаватель"};
        Button buttonGenerator = (Button)findViewById(R.id.generateHandler);
        final TextView generatedView = (TextView)findViewById(R.id.generatedNumber);

        buttonGenerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                int pos = myRandom.nextInt(words.length);
                generatedView.setText(String.valueOf(words[pos]));
            }
        });
    }
}
