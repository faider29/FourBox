package com.example.faide.fourbox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class third_activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdbox);
    }
    public void size (View view){
        Intent intent = new Intent(third_activity.this, MainActivity.class);
        startActivity(intent);
    }

}
