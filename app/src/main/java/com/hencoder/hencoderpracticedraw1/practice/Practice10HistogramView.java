package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint mPaint;
    private float[] mPoints = {100, 20, 100, 501, 100, 501, 900, 501};

    public Practice10HistogramView(Context context) {
        this(context, null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        //设置画布颜色
        mPaint.setStrokeWidth(2);
        mPaint.setColor(Color.WHITE);
        //画直线
        canvas.drawLines(mPoints, mPaint);

        mPaint.setTextSize(50);
        canvas.drawText("直方图", 450, 670, mPaint);

        mPaint.setTextSize(26);
        canvas.drawText("Froyo", 140, 530, mPaint);
        canvas.drawText("GB", 260, 530, mPaint);
        canvas.drawText("ICS", 355, 530, mPaint);
        canvas.drawText("JB", 460, 530, mPaint);
        canvas.drawText("KitKat", 540, 530, mPaint);
        canvas.drawText("L", 670, 530, mPaint);
        canvas.drawText("M", 770, 530, mPaint);

        //画矩形
        canvas.drawRect(140,490,220,500,mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(240,470,320,500,mPaint);
        canvas.drawRect(340,470,420,500,mPaint);
        canvas.drawRect(440,270,520,500,mPaint);
        canvas.drawRect(540,200,620,500,mPaint);
        canvas.drawRect(640,150,720,500,mPaint);
        canvas.drawRect(740,290,820,500,mPaint);


    }
}
