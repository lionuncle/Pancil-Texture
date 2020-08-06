package com.lionuncle.pancildrawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PaintView extends View {

////    public static int BRUSH_SIZE = 20;
////    public static final int DEFAULT_COLOR = Color.RED;
////    public static final int DEFAULT_BG_COLOR = Color.WHITE;
////    private static final float TOUCH_TOLERANCE = 4;
////    private float mX, mY;
////    private Path mPath;
////    private Paint mPaint;
////    private ArrayList<FingerPath> paths = new ArrayList<>();
////    private int currentColor;
////    private int backgroundColor = DEFAULT_BG_COLOR;
////    private int strokeWidth;
////    private boolean emboss;
////    private boolean blur;
////    private MaskFilter mEmboss;
////    private MaskFilter mBlur;
////    private Bitmap mBitmap;
////    private Canvas mCanvas;
////    private Paint mBitmapPaint = new Paint(Paint.DITHER_FLAG);
//    //pancil
//    private Bitmap mBitmapBrush;
//    private Vector2 mBitmapBrushDimensions;
//
//    private List<Vector2> mPositions = new ArrayList<Vector2>(100);
//
//    private static final class Vector2 {
//        public Vector2(double x, double y) {
//            this.x = x;
//            this.y = y;
//        }
//
//        public final double x;
//        public final double y;
//    }
//    public PaintView(Context context) {
//        this(context, null);
//        mBitmapBrush = BitmapFactory.decodeResource(context.getResources(), R.drawable.texture);
//        //mBitmapBrushDimensions = new Vector2(mBitmapBrush.getWidth(), mBitmapBrush.getHeight());
//        mBitmapBrushDimensions = new Vector2(1, 1);
//
//        setBackgroundColor(0xffffffff);
//    }
//
//    public PaintView(Context context, AttributeSet attrs) {
//        super(context, attrs);
////        mPaint = new Paint();
////        mPaint.setAntiAlias(true);
////        mPaint.setDither(true);
////        mPaint.setColor(DEFAULT_COLOR);
////        mPaint.setStyle(Paint.Style.STROKE);
////        mPaint.setStrokeJoin(Paint.Join.ROUND);
////        mPaint.setStrokeCap(Paint.Cap.ROUND);
////        mPaint.setXfermode(null);
////        mPaint.setAlpha(0xff);
////
////        mEmboss = new EmbossMaskFilter(new float[] {1, 1, 1}, 0.4f, 6, 3.5f);
////        mBlur = new BlurMaskFilter(5, BlurMaskFilter.Blur.NORMAL);
//    }
//
//    public void init(DisplayMetrics metrics) {
//        int height = metrics.heightPixels;
//        int width = metrics.widthPixels;
//
////        mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
////        mCanvas = new Canvas(mBitmap);
////
////        currentColor = DEFAULT_COLOR;
////        strokeWidth = BRUSH_SIZE;
//    }
//
////    public void normal() {
////        emboss = false;
////        blur = false;
////    }
////
////    public void emboss() {
////        emboss = true;
////        blur = false;
////    }
////
////    public void blur() {
////        emboss = false;
////        blur = true;
////    }
////
////    public void clear() {
////        backgroundColor = DEFAULT_BG_COLOR;
////        paths.clear();
////        normal();
////        invalidate();
////    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        canvas.save();
//        //mCanvas.drawColor(backgroundColor);
//
//        for (Vector2 pos : mPositions) {
//            canvas.drawBitmap(mBitmapBrush, pos.x, pos.y, null);
//        }
////        for (FingerPath fp : paths) {
////            mPaint.setColor(fp.color);
////            mPaint.setStrokeWidth(fp.strokeWidth);
////            mPaint.setMaskFilter(null);
////
////            if (fp.emboss)
////                mPaint.setMaskFilter(mEmboss);
////            else if (fp.blur)
////                mPaint.setMaskFilter(mBlur);
////
////            mCanvas.drawPath(fp.path, mPaint);
////
////        }
//
//        //canvas.drawBitmap(mBitmap, 0, 0, mBitmapPaint);
//        canvas.restore();
//    }
//
////    private void touchStart(float x, float y) {
////        mPath = new Path();
////        FingerPath fp = new FingerPath(currentColor, emboss, blur, strokeWidth, mPath);
////        paths.add(fp);
////
////        mPath.reset();
////        mPath.moveTo(x, y);
////        mX = x;
////        mY = y;
////    }
//
////    private void touchMove(float x, float y) {
////        float dx = Math.abs(x - mX);
////        float dy = Math.abs(y - mY);
////
////        if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE) {
////            mPath.quadTo(mX, mY, (x + mX) / 2, (y + mY) / 2);
////            mX = x;
////            mY = y;
////        }
////    }
////
////    private void touchUp() {
////        mPath.lineTo(mX, mY);
////    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
////        float x = event.getX();
////        float y = event.getY();
////
////        switch(event.getAction()) {
////            case MotionEvent.ACTION_DOWN :
////                touchStart(x, y);
////                invalidate();
////                break;
////            case MotionEvent.ACTION_MOVE :
////                touchMove(x, y);
////                invalidate();
////                break;
////            case MotionEvent.ACTION_UP :
////                touchUp();
////                invalidate();
////                break;
////        }
////
////        return true;
//        int action = event.getAction();
//        switch (action) {
//            case MotionEvent.ACTION_MOVE:
//                final float posX = event.getX();
//                final float posY = event.getY();
//                mBitmapBrush = BitmapFactory.decodeResource(getResources(), R.drawable.texture);
//                mBitmapBrushDimensions = new Vector2(0.1,0.1);
//                mPositions.add(new Vector2(posX - mBitmapBrushDimensions.x / 2, posY - mBitmapBrushDimensions.y / 2));
//                invalidate();
//        }
//
//        return true;
//    }
private Bitmap mBitmapBrush;
    private Vector2 mBitmapBrushDimensions;

    private List<Vector2> mPositions = new ArrayList<Vector2>(100);

    private static final class Vector2 {
        public Vector2(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public final float x;
        public final float y;
    }

    public PaintView(Context context) {
        super(context);

// load your brush here
        mBitmapBrush = BitmapFactory.decodeResource(context.getResources(), R.drawable.texturee);
        Toast.makeText(context, "X: "+ mBitmapBrush.getWidth()+" Y:"+mBitmapBrush.getHeight(), Toast.LENGTH_SHORT).show();
        mBitmapBrushDimensions = new Vector2(1, 1);

        setBackgroundColor(0xffffffff);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (Vector2 pos : mPositions) {
            canvas.drawBitmap(mBitmapBrush, pos.x, pos.y, null);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_MOVE:
                final float posX = event.getX();
                final float posY = event.getY();
                mPositions.add(new Vector2(posX - mBitmapBrushDimensions.x / 2, posY - mBitmapBrushDimensions.y / 2));
                invalidate();
        }

        return true;
    }
}