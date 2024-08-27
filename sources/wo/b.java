package wo;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f39356b;

    public /* synthetic */ b(k kVar, int i10) {
        this.f39355a = i10;
        this.f39356b = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f39355a;
        k kVar = this.f39356b;
        switch (i10) {
            case 0:
                kVar.f39390i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.f39390i.setScaleX(floatValue);
                kVar.f39390i.setScaleY(floatValue);
                return;
        }
    }
}
