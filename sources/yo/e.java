package yo;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes2.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f41746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f41747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f41748c;

    public e(f fVar, View view, View view2) {
        this.f41748c = fVar;
        this.f41746a = view;
        this.f41747b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f41748c.c(this.f41746a, this.f41747b, valueAnimator.getAnimatedFraction());
    }
}
