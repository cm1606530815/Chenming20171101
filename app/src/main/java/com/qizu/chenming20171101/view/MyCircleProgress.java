package com.qizu.chenming20171101.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jiuhao on 2017/11/01.
 * data 2017/11/01
 * time 下午 02:48
 */

public class MyCircleProgress extends View{
    private Paint mPaint;
    private boolean runing = true ;

    private int progress = 0 ;

    public MyCircleProgress(Context context) {
        super(context);
    }

    public MyCircleProgress(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        //设置画笔的颜色
        mPaint.setColor(Color.GREEN);
        //设置画笔 填充是空心的
        mPaint.setStyle(Paint.Style.STROKE);
        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true){


                    if(progress > 360){
                        return;
                    }
                    postInvalidate();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    progress += 2 ;

                }

            }
        }).start();
    }

    public MyCircleProgress(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int x =  getWidth() / 2 ;
        int y = getHeight() / 2 ;

        int radius =  200 ;


        //设置画笔的粗细
        mPaint.setStrokeWidth(30);
        //定义一个区域
        RectF rectF = new RectF(x-radius,y-radius,x+radius,y+radius);
        //画弧
//       useCentor  true 从中心点开始画 false 中心点不现实
        canvas.drawArc(rectF,-90,progress,false,mPaint);


        int text = (int) ((float)progress / 360  * 100 );

//        measureText  测量字符串的宽度
        float textWidth =  mPaint.measureText(text+"%");
        Rect rextText = new Rect();
//        rextText.height() 获取字符串的高度
        mPaint.getTextBounds(text+"%",0,(text+"%").length(),rextText);


        mPaint.setTextSize(30);
        mPaint.setStrokeWidth(1);
        //画文字

        canvas.drawText(text+"%",x-textWidth/2,y+rextText.height()/2,mPaint);
    }
}
