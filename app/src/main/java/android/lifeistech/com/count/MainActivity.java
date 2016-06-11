package android.lifeistech.com.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //変数宣言
    TextView textView;
    TextView textView2;
    TextView textView3;
    int count;
    int count2;
    int count3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //変数の初期化
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        count = 0;
        count2 = 0;
        count3 = 0;

    }

    public void add (View v){
        count = count + 1;
        textView.setText(count + "回ボタンが押されました！");

    }
    public void minus (View v){
        count = count - 1;
        textView.setText(count + "回ボタンが押されました！");
    }

    public void add2 (View v){
        count2 = count2 + 1;
        textView2.setText(count2 + "回ボタンが押されました！");
    }

    public void sum (View v){
        textView3.setText("合計の値は" + count3 + "です！");
        count3 = count + count2;

    }

 }
