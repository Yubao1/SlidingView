package demo1.xe.com.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class UseLayoutActivity extends AppCompatActivity {
    TextView mTv;
    private int lastX,lastY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_layout);
        mTv = findViewById(R.id.tv);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                lastX = x;
                lastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                int offsetX = x - lastX;
                int offsetY = y - lastY;

                mTv.layout(mTv.getLeft()+offsetX,
                        mTv.getTop()+offsetY,
                        mTv.getRight()+offsetX,
                        mTv.getBottom()+offsetY);
                lastX = x;
                lastY = y;
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return true;
    }

    public void onClick(View v){
        Toast.makeText(this," 点击了 “使用 Layout移动View” 按钮 ",Toast.LENGTH_SHORT).show();
    }
}
