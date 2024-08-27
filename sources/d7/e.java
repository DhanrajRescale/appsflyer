package d7;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14005b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f14004a = i10;
        this.f14005b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f14004a;
        Object obj = this.f14005b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                fVar.getClass();
                fVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.invalidate(fVar.f14010a);
                return;
            case 1:
                co.c cVar = (co.c) obj;
                ColorDrawable colorDrawable = co.c.f8290z;
                cVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.f8300j.setAlpha((int) (255.0f * floatValue));
                cVar.f8314x = floatValue;
                return;
            default:
                zo.i iVar = (zo.i) obj;
                iVar.getClass();
                iVar.f42640d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
