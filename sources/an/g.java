package an;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import cn.h;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class g extends b {

    /* renamed from: e, reason: collision with root package name */
    public cn.d f789e;

    /* renamed from: f, reason: collision with root package name */
    public float f790f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f791g;

    /* renamed from: h, reason: collision with root package name */
    public long f792h;

    /* renamed from: i, reason: collision with root package name */
    public float f793i;

    /* JADX WARN: Type inference failed for: r3v0, types: [an.f, java.lang.Object] */
    public final void a(float f10, float f11) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ArrayList arrayList = this.f791g;
        float m10 = ((sm.c) this.f786d).m(f10, f11);
        ?? obj = new Object();
        obj.f787a = currentAnimationTimeMillis;
        obj.f788b = m10;
        arrayList.add(obj);
        for (int size = arrayList.size(); size - 2 > 0 && currentAnimationTimeMillis - ((f) arrayList.get(0)).f787a > 1000; size--) {
            arrayList.remove(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ((sm.c) this.f786d).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sm.c cVar = (sm.c) this.f786d;
        cVar.getOnChartGestureListener();
        if (!cVar.f34697c) {
            return false;
        }
        wm.c e10 = cVar.e(motionEvent.getX(), motionEvent.getY());
        sm.b bVar = this.f786d;
        if (e10 != null && !e10.a(this.f784b)) {
            bVar.g(e10);
            this.f784b = e10;
            return true;
        }
        bVar.g(null);
        this.f784b = null;
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        float abs;
        if (this.f785c.onTouchEvent(motionEvent)) {
            return true;
        }
        sm.b bVar = this.f786d;
        sm.c cVar = (sm.c) bVar;
        if (cVar.H) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            ArrayList arrayList = this.f791g;
            cn.d dVar = this.f789e;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (cVar.f34698d) {
                            a(x10, y10);
                        }
                        if (this.f783a == 0) {
                            float f10 = x10 - dVar.f8247b;
                            float f11 = y10 - dVar.f8248c;
                            if (((float) Math.sqrt((f11 * f11) + (f10 * f10))) > h.c(8.0f)) {
                                this.f783a = 6;
                                ViewParent parent = cVar.getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                this.f786d.getOnChartGestureListener();
                            }
                        }
                        if (this.f783a == 6) {
                            cVar.setRotationAngle(cVar.m(x10, y10) - this.f790f);
                            cVar.invalidate();
                        }
                        this.f786d.getOnChartGestureListener();
                    }
                } else {
                    if (cVar.f34698d) {
                        this.f793i = s0.g.f34069a;
                        a(x10, y10);
                        if (arrayList.isEmpty()) {
                            abs = 0.0f;
                        } else {
                            f fVar = (f) arrayList.get(0);
                            f fVar2 = (f) jr.h.l(arrayList, 1);
                            f fVar3 = fVar;
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                fVar3 = (f) arrayList.get(size);
                                if (fVar3.f788b != fVar2.f788b) {
                                    break;
                                }
                            }
                            float f12 = ((float) (fVar2.f787a - fVar.f787a)) / 1000.0f;
                            if (f12 == s0.g.f34069a) {
                                f12 = 0.1f;
                            }
                            if (fVar2.f788b >= fVar3.f788b) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (Math.abs(r7 - r10) > 270.0d) {
                                z10 = !z10;
                            }
                            float f13 = fVar2.f788b;
                            float f14 = fVar.f788b;
                            if (f13 - f14 > 180.0d) {
                                fVar.f788b = (float) (f14 + 360.0d);
                            } else if (f14 - f13 > 180.0d) {
                                fVar2.f788b = (float) (f13 + 360.0d);
                            }
                            abs = Math.abs((fVar2.f788b - fVar.f788b) / f12);
                            if (!z10) {
                                abs = -abs;
                            }
                        }
                        this.f793i = abs;
                        if (abs != s0.g.f34069a) {
                            this.f792h = AnimationUtils.currentAnimationTimeMillis();
                            DisplayMetrics displayMetrics = h.f8264a;
                            bVar.postInvalidateOnAnimation();
                        }
                    }
                    ViewParent parent2 = cVar.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(false);
                    }
                    this.f783a = 0;
                    this.f786d.getOnChartGestureListener();
                }
            } else {
                this.f786d.getOnChartGestureListener();
                this.f793i = s0.g.f34069a;
                arrayList.clear();
                if (cVar.f34698d) {
                    a(x10, y10);
                }
                this.f790f = cVar.m(x10, y10) - cVar.getRawRotationAngle();
                dVar.f8247b = x10;
                dVar.f8248c = y10;
            }
        }
        return true;
    }
}
