package com.example.akshay_20.bucky21_gestures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{

    private TextView akshayText;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        akshayText =(TextView)findViewById(R.id.textView);
        this.gestureDetector= new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);


    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        akshayText.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        akshayText.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        akshayText.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        akshayText.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        akshayText.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        akshayText.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        akshayText.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        akshayText.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        akshayText.setText("onFling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
