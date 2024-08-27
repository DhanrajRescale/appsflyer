package wo;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f39359a;

    public d(k kVar, int i10) {
        this.f39359a = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        v4.b bVar = k.f39378w;
        this.f39359a.f39390i.setTranslationY(intValue);
    }
}
