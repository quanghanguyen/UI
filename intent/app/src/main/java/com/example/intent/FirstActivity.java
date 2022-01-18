package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

 //Sử dụng Intent để chuyển đổi qua Activity khác
        Button testbutton = (Button) findViewById(R.id.btnClickme);
        testbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://oxii.vn"));
                startActivity(intent);

            }



        });

        //intent implicit đến trình duyệt của điện thoại

//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com"));
//        startActivity(intent);


    }
}