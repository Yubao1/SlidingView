package demo1.xe.com.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.nineoldandroids.animation.ObjectAnimator;

public class Animation2Activity extends AppCompatActivity {
    private TextView mTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation2);
        mTv = findViewById(R.id.tv);
    }

    public void onClick(View view) {
        ObjectAnimator.ofFloat(mTv,"translationY",0,300).setDuration(1000).start();
    }

    public void onClick2(View view) {
        Toast.makeText(this, "点击了“可移动的属性view”", Toast.LENGTH_SHORT).show();
    }
}
