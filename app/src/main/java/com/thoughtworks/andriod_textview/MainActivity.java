package com.thoughtworks.andriod_textview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        TextView textView = (TextView)findViewById(R.id.tv);
//        textView.setText(Html.fromHtml("你好， <font color=blue>《Andriod WorkShop》</font>"));

        /*
        第一种设置TextView的方法，就是在Avtivity中直接来创建，
        然后将创建的TextView添加到我们的页面当中。
        但是这种方式不是我们特别推荐的
        因为这样我们以后会在该方法中写很多的代码，、
        不利于我们对代码的维护
         */

//        TextView textView = new TextView(this);  //this表示只向当前的activity,以后在默认中都可以使用this.
//        textView.setText("你好 TextView");
//        setContentView(textView);

    }


}
