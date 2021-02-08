package demo1.xe.com.myapplication2;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewGeneralSlideActivity extends AppCompatActivity {
    private TextView mTv;
    private MyHandler mHandler = null;
    private boolean isRunThread = true;
    private int mSlideY = 20;
    private int mSlideX = 20;
    private MyThread thread = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_general_slide);
        mTv = findViewById(R.id.tv_scroll);
        mHandler = new MyHandler();
        thread = new MyThread();
    }
    public void onClickView(View view) {
        thread.start();
    }
    class MyThread extends Thread {
        @Override
        public void run() {
            super.run();
            while (isRunThread) {
                try {
                    Thread.sleep(500);
                    sendMessage();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private void sendMessage() {
        Message message = Message.obtain();
        mHandler.sendMessage(message);
    }
    class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mTv.scrollBy(0,mSlideY);
            mSlideY += 10;
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        isRunThread = false;
        if (mHandler != null) {
            mHandler.removeCallbacksAndMessages(null);
        }
    }
}
