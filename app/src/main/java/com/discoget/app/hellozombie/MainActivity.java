package com.discoget.app.hellozombie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstTextView = (TextView) findViewById(R.id.txtZombieStatus);

        Button zombieButton = (Button) findViewById(R.id.btnZombie);

        Button zapZombieButton = (Button) findViewById(R.id.zapZombieButton);

        zombieButton.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                firstTextView.setText(R.string.zombieCmment);
            }
        });

    }







    public void check_for_zombies(View view) {
    }

    public void change_text_field(View view) {

        Toast.makeText(this,"Awesome",Toast.LENGTH_SHORT).show();


    }
}
