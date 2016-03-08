package com.example.flome.uiupdate;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.flome.testdp.R;

public class UpdateActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
    }

    public void update(View view) {
        Message message = Message.obtain();

        new UpdateHandler().sendEmptyMessage(1);

        finish();


    }
}
