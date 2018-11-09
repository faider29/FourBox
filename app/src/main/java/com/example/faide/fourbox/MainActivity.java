package com.example.faide.fourbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


    }

    public void size(View view) {

            switch (view.getId()) {
                case  R.id.v1:
                Intent intent = new Intent(MainActivity.this, first_activity.class);
                startActivity(intent);

                Toast.makeText(this, "Нажмите для уменьшения", Toast.LENGTH_LONG).show();
                break;
                case R.id.v2:

                Intent intent2 = new Intent(MainActivity.this, second_activity.class);
                startActivity(intent2);

                Toast.makeText(this, "Нажмите для уменьшения", Toast.LENGTH_LONG).show();
                break;

                case R.id.v3:
                Intent intent3 = new Intent(MainActivity.this, third_activity.class);
                startActivity(intent3);

                Toast.makeText(this, "Нажмите для уменьшения", Toast.LENGTH_LONG).show();
                break;

                case R.id.v4:
                Intent intent4 = new Intent(MainActivity.this, fourth_activity.class);
                startActivity(intent4);

                Toast.makeText(this, "Нажмите для уменьшения", Toast.LENGTH_LONG).show();
                break;
            }
        }
}
