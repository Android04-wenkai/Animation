package edu.feicui.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;

public class FirstActivity extends AppCompatActivity {
ImageButton img_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        img_btn= (ImageButton) findViewById(R.id.img_btn);
        ScaleAnimation sa=new ScaleAnimation(1,0,1,0);
        sa.setDuration(4000);
//        img_btn.startAnimation(sa);
        RotateAnimation ra=new RotateAnimation(0, 270);
        ra.setDuration(3000);
//        img_btn.startAnimation(ra);
        Animation a=AnimationUtils.loadAnimation(this, R.anim.anim);

        img_btn.startAnimation(a);
    }
}
