package com.example.gentoo.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditText_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏标题栏的几个方法，，必须放到setContentView();的前面。。
        //requestWindowFeature(Window.FEATURE_NO_TITLE);  //必须要放在setContentView();的前面。。
        //setTheme(android.R.style.Theme_Holo_Light_NoActionBar);  //_Fullscreen);  //必须要放在setContentView();的前面。。
            //这个Fullscreen会把顶部信息栏也隐藏，因为满屏嘛，做游戏的时候才会用到

        setContentView(R.layout.activity_edit_text_1_);
        //隐藏标题栏的几种方法
        getSupportActionBar().hide();//如果使用了支持库，然后你必须使用getSupportActionBar()，而不是getActionBar()，继承AppCompactActivity()而不是继承Activity。
        getWindow().setFlags(Window.FEATURE_NO_TITLE,Window.FEATURE_NO_TITLE); //(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            //setFlags(int Flags,int mask);

        //接收 传入的 值（键值对）
        Intent intentE=getIntent();
        String user = intentE.getStringExtra("testIntent_1");
        String passWord = intentE.getStringExtra("testIntent_2");
    //打印本activity的信息。
        TextView text__ =findViewById(R.id.edittext_1_activity);
        text__.setText(this.toString());
        //打印本activity的当前栈结构的id。
        TextView text__id =findViewById(R.id.edittext_1_activity_id);
        text__id.setText("current task id: " + this.getTaskId());

        Button btn_et1=findViewById(R.id.btn_et1);
        btn_et1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EditText_1_Activity.this,MainActivity.class);
                EditText_1_Activity.this.startActivity(intent);
                //点击 login按钮 弹出
                Toast.makeText(EditText_1_Activity.this,"登陆成功",Toast.LENGTH_SHORT).show();

            }
        });
        EditText et_1;
//        EditText et_2;
        et_1=findViewById(R.id.et_1);
//        et_2=findViewById(R.id.et_2);
//        et_1.setText(user);
//        et_2.setText(passWord);
        //监听 输入内容/
        et_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("editText",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
