package demo1.xe.com.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_scroll_by:
                Intent intent = new Intent(this,ViewGeneralSlideActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_traditional_animation:
                Intent intent2 = new Intent(this,AnimationActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_object_animation:
                Intent intent3 = new Intent(this,Animation2Activity.class);
                startActivity(intent3);
                break;
            case R.id.btn_change_layout_parameter:
                Intent intent4 = new Intent(this,ChangeLayoutParameterActivity.class);
                startActivity(intent4);
                break;
            case R.id.btn_use_layout:
                Intent intent5 = new Intent(this,UseLayoutActivity.class);
                startActivity(intent5);
                break;
        }
    }
}
