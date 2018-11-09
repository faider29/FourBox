package com.example.faide.fourbox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class second_activity extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondbox);
    }
    public void size (View view){
        Intent intent = new Intent(second_activity.this,MainActivity.class);
        startActivity(intent);
    }
}
