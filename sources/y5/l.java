package y5;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {

    /* renamed from: c, reason: collision with root package name */
    public final j f41221c;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f41223e;

    /* renamed from: a, reason: collision with root package name */
    public final PointF f41219a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final PointF f41220b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final float f41222d = 25.0f;

    /* renamed from: f, reason: collision with root package name */
    public volatile float f41224f = 3.1415927f;

    public l(Context context, j jVar) {
        this.f41221c = jVar;
        this.f41223e = new GestureDetector(context, this);
    }

    @Override // y5.c
    public final void a(float[] fArr, float f10) {
        this.f41224f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f41219a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f41219a.x) / this.f41222d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f41219a;
        float f12 = (y10 - pointF.y) / this.f41222d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f41224f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f41220b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = (cos * f12) + (sin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        j jVar = this.f41221c;
        PointF pointF3 = this.f41220b;
        synchronized (jVar) {
            float f14 = pointF3.y;
            jVar.f41202g = f14;
            Matrix.setRotateM(jVar.f41200e, 0, -f14, (float) Math.cos(jVar.f41203h), (float) Math.sin(jVar.f41203h), s0.g.f34069a);
            Matrix.setRotateM(jVar.f41201f, 0, -pointF3.x, s0.g.f34069a, 1.0f, s0.g.f34069a);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f41221c.f41206k.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f41223e.onTouchEvent(motionEvent);
    }
}
