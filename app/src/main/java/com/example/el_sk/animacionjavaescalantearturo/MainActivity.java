package com.example.el_sk.animacionjavaescalantearturo;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.faceIcon);
    }

    public void onButtonClick(View v) {

        imageView.animate()
                .scaleX(2)
                .scaleY(2)
                .rotationX(220)
                .rotationY(220)
                .translationX(200)
                .translationY(200)
                .setDuration(3000)
                .alpha(0)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        imageView.animate()
                                .scaleX(1)
                                .scaleY(1)
                                .rotationX(1)
                                .rotationY(1)
                                .translationX(1)
                                .translationY(1)
                                .setDuration(1)
                                .alpha(1);


                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
    }
}

