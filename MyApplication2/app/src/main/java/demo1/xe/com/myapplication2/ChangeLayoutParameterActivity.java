package demo1.xe.com.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ChangeLayoutParameterActivity extends AppCompatActivity {
    TextView mTv;
    View mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_layout_parameter);
        mTv = findViewById(R.id.tv);
        mView = findViewById(R.id.view);
    }
    public void onClick(View view) {
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) mTv.getLayoutParams();
        params.leftMargin += 200;
        params.width += 200;
        mTv.requestLayout();
    }
    public void onClick2(View view) {
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) mView.getLayoutParams();
        params.width += 200;
        mView.requestLayout();
    }
    public void onClick3(View view) {
        Toast.makeText(this,"点击了“改变布局参数可移动的第一个View” ",Toast.LENGTH_SHORT).show();
    }

    public void onClick4(View view) {
        Toast.makeText(this,"点击了“改变布局参数可移动的第二个View” ",Toast.LENGTH_SHORT).show();
    }
}
