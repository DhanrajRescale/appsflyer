package k7;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class a0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22270b;

    public /* synthetic */ a0(Object obj, int i10) {
        this.f22269a = i10;
        this.f22270b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f22269a;
        Object obj = this.f22270b;
        switch (i10) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                b0 b0Var = (b0) obj;
                b0Var.f22281c.setAlpha(floatValue);
                b0Var.f22282d.setAlpha(floatValue);
                b0Var.f22297s.invalidate();
                return;
            default:
                ((h0) obj).f22388m = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
