package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint;

    public Practice8DrawArcView(Context context) {
        this(context, null);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setAntiAlias(true);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        mPaint.setStyle(Paint.Style.FILL);
        //绘制弧形
        canvas.drawArc(300, 200, 650, 500, 20, 140, false, mPaint);
        //绘制扇形
        canvas.drawArc(300, 200, 650, 500, -110, 100, true, mPaint);
        // 绘制不封口的弧形
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(300,200,650,500,180,60,false,mPaint);
    }
}
