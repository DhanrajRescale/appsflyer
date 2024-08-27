package r7;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33409c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f33407a = i10;
        this.f33409c = obj;
        this.f33408b = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f33407a;
        Object obj = this.f33408b;
        switch (i10) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = (e) this.f33409c;
                d dVar = (d) obj;
                eVar.getClass();
                e.d(floatValue, dVar);
                eVar.a(floatValue, dVar, false);
                eVar.invalidateSelf();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(floatValue2);
                textView.setScaleY(floatValue2);
                return;
        }
    }
}
