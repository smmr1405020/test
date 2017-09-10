package com.example.asus.test;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private Button button;
    private TextView text;
    private GestureDetectorCompat ges;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        text =(TextView) findViewById(R.id.text);

        ges = new GestureDetectorCompat(this,this);
        ges.setOnDoubleTapListener(this);

        button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        text.setText("You Clicked Me!");
                    }
                }

        );

        button.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View v) {
                        text.setText("You Long Clicked Me!");
                        return true;
                    }
                }
        );

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        text.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        text.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        text.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        text.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        text.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        text.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        text.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        text.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        text.setText("onFling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        ges.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

}
