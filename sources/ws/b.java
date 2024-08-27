package ws;

import android.animation.ObjectAnimator;
import android.view.ScaleGestureDetector;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import m.w;

/* loaded from: classes2.dex */
public final class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f39416a;

    public b(w wVar) {
        this.f39416a = wVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        Intrinsics.e(detector, "detector");
        a aVar = (a) this.f39416a.f25765f;
        float scaleFactor = detector.getScaleFactor();
        h hVar = (h) ((c) aVar).f39419c;
        ObjectAnimator objectAnimator = hVar.f39437c;
        objectAnimator.cancel();
        objectAnimator.setDuration(0L);
        objectAnimator.setInterpolator(null);
        View view = hVar.f39435a;
        objectAnimator.setFloatValues(view.getScaleX() * scaleFactor);
        objectAnimator.start();
        ObjectAnimator objectAnimator2 = hVar.f39438d;
        objectAnimator2.cancel();
        objectAnimator2.setDuration(0L);
        objectAnimator2.setInterpolator(null);
        objectAnimator2.setFloatValues(view.getScaleY() * scaleFactor);
        objectAnimator2.start();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        Intrinsics.e(detector, "detector");
        return super.onScaleBegin(detector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        Intrinsics.e(detector, "detector");
        super.onScaleEnd(detector);
        h hVar = (h) ((c) ((a) this.f39416a.f25765f)).f39419c;
        View view = hVar.f39435a;
        float scaleX = view.getScaleX();
        float f10 = hVar.f39436b;
        ObjectAnimator objectAnimator = hVar.f39437c;
        if (scaleX < 1.0f) {
            objectAnimator.cancel();
            h.a(objectAnimator);
            objectAnimator.setFloatValues(1.0f);
            objectAnimator.start();
        } else if (f10 < view.getScaleX()) {
            objectAnimator.cancel();
            h.a(objectAnimator);
            objectAnimator.setFloatValues(f10);
            objectAnimator.start();
        }
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimator2 = hVar.f39438d;
        if (scaleY < 1.0f) {
            objectAnimator2.cancel();
            h.a(objectAnimator2);
            objectAnimator2.setFloatValues(1.0f);
            objectAnimator2.start();
            return;
        }
        if (f10 < view.getScaleY()) {
            objectAnimator2.cancel();
            h.a(objectAnimator2);
            objectAnimator2.setFloatValues(f10);
            objectAnimator2.start();
        }
    }
}
