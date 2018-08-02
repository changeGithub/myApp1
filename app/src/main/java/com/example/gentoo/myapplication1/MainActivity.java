package com.example.gentoo.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    public void showToast(View v){
        Toast.makeText(MainActivity.this,"mBtn_RelativeLayout1被点击了",Toast.LENGTH_SHORT).show();
    }//这里是再.xml文件里面对应的方法，一般不用
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //布局文件


        //打印本activity的信息。
        TextView text__ =findViewById(R.id.mainactivity);
        text__.setText(this.toString());
        //打印本activity的当前栈结构的id。
        TextView text__id =findViewById(R.id.mainactivity_id);
        text__id.setText("current task id: " + this.getTaskId());

        Button mBtn_TextView;
         Button mBtn_RelativeLayout1;
         Button mBtn_EditText;
        Button mBtn_list_1;

        mBtn_TextView = findViewById(R.id.btn_textview_1);
        mBtn_TextView.setOnClickListener(new View.OnClickListener() {
           // @Override

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TextViewActivity1.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"TextView被点击了",Toast.LENGTH_SHORT).show();
            }
        });

        mBtn_RelativeLayout1 = findViewById(R.id.mbtn_relativelayout1);
        mBtn_RelativeLayout1.setOnClickListener(new View.OnClickListener() {
        //    @Override
            public void onClick(View v) {
                //生成一个Intent对象
                Intent intentE=new Intent();
                intentE.putExtra("testIntent","123");

                Intent intent = new Intent(MainActivity.this,RelativeLayout1.class);
                MainActivity.this.startActivity(intent);
            }
        });
        mBtn_EditText=findViewById(R.id.mbtn_et3);
        mBtn_EditText.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {

                //生成一个Intent对象
                Intent intentE=new Intent();
                intentE.putExtra("testIntent_1","123");
                intentE.putExtra("testIntent_2","456");
                Intent intent=new Intent(MainActivity.this, EditText_1_Activity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        mBtn_list_1=findViewById(R.id.mbtn_list_1);
        mBtn_list_1.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {

                //生成一个Intent对象
                Intent intentE=new Intent();
                intentE.putExtra("testIntent_1","123");
                intentE.putExtra("testIntent_2","456");
                Intent intent=new Intent(MainActivity.this, listview_Activity.class);
                MainActivity.this.startActivity(intent);
            }
        });

       /* // Example of a call to a native method
        TextView tv =  findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());*/
    }
//
//    /**
//     * A native method that is implemented by the 'native-lib' native library,
//     * which is packaged with this application.
//     */
//    public native String stringFromJNI(); //method stringFromJNI();  never used
}
