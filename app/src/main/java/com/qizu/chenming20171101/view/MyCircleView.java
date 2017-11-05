package com.qizu.chenming20171101.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by jiuhao on 2017/11/01.
 * data 2017/11/01
 * time 下午 02:23
 */

public class MyCircleView extends View{

    private Paint mPaint;
    private int cx = 200;
    private int cy = 200;


    public MyCircleView(Context context) {
        super(context);
    }

    public MyCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(10);
    }

    public MyCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
    switch (event.getAction()){
        case MotionEvent.ACTION_DOWN:
            System.out.println("event ACTION_DOWN = " + event.getRawX() + "  " + event.getRawY());
            break;

        case MotionEvent.ACTION_MOVE:

            System.out.println("event ACTION_MOVE = " + event.getRawX() + "  " + event.getRawY());

            cx = (int) event.getX() ;
            cy =(int) event.getY();
            //刷新
            invalidate();
            break;

        case MotionEvent.ACTION_UP:

            System.out.println("event ACTION_UP = " + event.getRawX() + "  " + event.getRawY());
            break;
    }


        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(cx,cy,200,mPaint);
    }
}
