package com.example.quote;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    TextView textView4;
    Button button2;
    ArrayList<String> quote = new ArrayList<>();
    int currentIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView4 = findViewById(R.id.textView4);
        button2 = findViewById(R.id.button2);

        quote.add("You still have a lot of time to make yourself be what you want.");
        quote.add("In order to be irreplaceable one must always be different.");
        quote.add("We are not what we know but what we are willing to learn.");
        quote.add("Love yourself first and everything else falls into line.");
        quote.add("The most incredible beauty and the most satisfying way of life come from affirming your own uniqueness.");
        quote.add("I am the only me in this world, and I don't want to change to try to become someone else.");
        quote.add("Life is 10% of what happens to you and 90% of how you react to it.");
        quote.add("Simplicity is the ultimate sophistication.");
        quote.add("It's not happiness that brings us gratitude. It's gratitude that brings us happiness.");
        quote.add("Be thankful for what you have; you'll end up having more.");

        textView4.setText(quote.get(currentIndex));
        button2.setOnClickListener(View_v -> {
            currentIndex++;

            if (currentIndex < quote.size()) {
                textView4.setText(quote.get(currentIndex));
            }

            else{
                button2.setEnabled((false));
                button2.setText("No Available Quote.");
            }

        });
    }
}