package android.com.testgradle;

import android.app.Activity;

import android.com.mylibrary.ConstantsLIbrary;
import android.com.mylibrary2.Constant;
import android.com.mylibrary4.Constant4;
import android.os.Bundle;
import android.widget.TextView;

import com.umeng.socialize.common.SocializeConstants;

public class MainActivity extends Activity {
    private TextView t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.text1);
        t1.setText("包名："+this.getPackageName());
        t2 = (TextView) findViewById(R.id.text2);
        t2.setText("来自BuildConfig："+BuildConfig.TEXT);
        t3 = (TextView) findViewById(R.id.text3);
        t3.setText("来自library1："+ConstantsLIbrary.result);
        t4 = (TextView) findViewById(R.id.text4);
        t4.setText("来自来自library1："+ConstantsLIbrary.getlivrary2);
        t5 = (TextView) findViewById(R.id.text5);
        t5.setText("来自library2："+Constant.text);
        t6 = (TextView) findViewById(R.id.text6);
        t6.setText("来自jar："+SocializeConstants.SDK_VERSION);
        t7 = (TextView) findViewById(R.id.text7);
        t7.setText("来自library3："+android.com.mylibrary3.Constant.result3);
        t8 = (TextView) findViewById(R.id.text8);
        t8.setText("来自library4："+Constant4.result);
    }
}
