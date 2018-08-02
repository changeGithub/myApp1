package com.example.gentoo.myapplication1;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TextViewActivity1 extends AppCompatActivity {

    private TextView mTv4;
    private Button mBtnTextView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_view_1);
            //指定对应的.xml文件
        mTv4= findViewById(R.id.tv_3);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mTv4.getPaint().setAntiAlias(true);//去除锯齿

        //打印本activity的信息。
        TextView text__ =findViewById(R.id.textviewactivity);
        text__.setText(this.toString());
        //打印本activity的当前栈结构的id。
        TextView text__id =findViewById(R.id.textviewactivity_id);
        text__id.setText("current task id: " + this.getTaskId());

        mBtnTextView1 = findViewById(R.id.tv_11);
        mBtnTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到TextView演示界面
                Intent intent = new Intent(TextViewActivity1.this,MainActivity.class);
                TextViewActivity1.this.startActivity(intent);
            }
        });
    }
}
