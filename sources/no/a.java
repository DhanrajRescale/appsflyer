package no;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f29002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f29003b;

    public a(c cVar, float f10) {
        this.f29003b = cVar;
        this.f29002a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f29003b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f29002a);
    }
}
