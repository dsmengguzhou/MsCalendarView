package com.ms.awe.mscalendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

public class Calendar_Day_TextView extends TextView {

    public boolean isToday = false;
    private Paint paint = new Paint();

    public Calendar_Day_TextView(Context context) {
        super(context);
    }

    public Calendar_Day_TextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initControl();
    }

    public Calendar_Day_TextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initControl();
    }

    private void initControl() {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#ff0000"));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isToday){
            //中心点位置
            canvas.translate(getWidth() / 2, getHeight() / 2);
            canvas.drawCircle(0,0,getWidth()/2,paint);
        }
    }
}
