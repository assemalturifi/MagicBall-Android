package com.example.assemalturifi.magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView ballDisplay;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        upView();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int ballArray[] = {R.drawable.ball1,
                        R.drawable.ball2,
                        R.drawable.ball3,
                        R.drawable.ball4,
                        R.drawable.ball5};

                Random random = new Random();

                int number=random.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]);



            }
        });



    }
    public void upView(){
        ballDisplay = findViewById(R.id.image8Ball);
        btn = findViewById(R.id.askbtn);

    }
}
