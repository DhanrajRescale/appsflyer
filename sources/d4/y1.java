package d4;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;
import in.juspay.hypernfc.Wave;

/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13864c;

    public /* synthetic */ y1(int i10, Object obj, Object obj2) {
        this.f13862a = i10;
        this.f13863b = obj;
        this.f13864c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f13862a;
        Object obj = this.f13863b;
        switch (i10) {
            case 0:
                ((View) ((h.x0) ((t9.c) obj).f35633b).f17768j.getParent()).invalidate();
                return;
            default:
                ((Wave) obj).lambda$createRingAnimator$1((Paint) this.f13864c, valueAnimator);
                return;
        }
    }
}
