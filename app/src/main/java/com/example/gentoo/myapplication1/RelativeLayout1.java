package com.example.gentoo.myapplication1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RelativeLayout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout_1);
         Button mBtn_RelativeLayout1_1;
        //接收 传入的 值（键值对）
        Intent intentE=getIntent();
        String value = intentE.getStringExtra("testIntent");

//一个Intent再两个Activity之间传递数据，这两个Activity可以不在同一个应用程序当中，SMS短信功能 这个Action是Android自带的。
        Uri uri = Uri.parse("smsto://0800000123");
        Intent intent2=new Intent(Intent.ACTION_SENDTO,uri);
        intent2.putExtra("sms_body","The SMS text");
        startActivity(intent2);

        //打印本activity的信息。
        TextView text__ =findViewById(R.id.relativelayoutactivity);
        text__.setText(this.toString());
        //打印本activity的当前栈结构的id。
        TextView text__id =findViewById(R.id.relativelayoutactivity_id);
        text__id.setText("current task id: " + this.getTaskId());

        mBtn_RelativeLayout1_1 = findViewById(R.id.mbtn_relativelayout1_2);
        mBtn_RelativeLayout1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelativeLayout1.this,MainActivity.class);
                RelativeLayout1.this.startActivity(intent);
            }
        });
    }




}
