package demo1.xe.com.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class AnimationActivity extends AppCompatActivity {
    private TextView mTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        mTv = findViewById(R.id.tv);
    }

    public void onClick(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.view_translate);
        mTv.startAnimation(animation);
    }

    public void onClick2(View view) {
        Toast.makeText(this, "点击了“可移动的传统view” ", Toast.LENGTH_SHORT).show();
    }
}
