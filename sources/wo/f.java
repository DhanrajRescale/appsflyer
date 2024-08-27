package wo;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import mo.c0;

/* loaded from: classes2.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f39362b;

    public /* synthetic */ f(k kVar, int i10) {
        this.f39361a = i10;
        this.f39362b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        int i10 = this.f39361a;
        k kVar = this.f39362b;
        switch (i10) {
            case 0:
                if (kVar.f39390i != null && (context = kVar.f39389h) != null) {
                    int height = c0.d(context).height();
                    int[] iArr = new int[2];
                    j jVar = kVar.f39390i;
                    jVar.getLocationOnScreen(iArr);
                    int height2 = (height - (jVar.getHeight() + iArr[1])) + ((int) jVar.getTranslationY());
                    int i11 = kVar.f39399r;
                    if (height2 >= i11) {
                        kVar.f39400s = i11;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w(k.B, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    int i12 = kVar.f39399r;
                    kVar.f39400s = i12;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (i12 - height2) + marginLayoutParams.bottomMargin;
                    jVar.requestLayout();
                    return;
                }
                return;
            case 1:
                kVar.c();
                return;
            default:
                j jVar2 = kVar.f39390i;
                if (jVar2 != null) {
                    ViewParent parent = jVar2.getParent();
                    j jVar3 = kVar.f39390i;
                    if (parent != null) {
                        jVar3.setVisibility(0);
                    }
                    if (jVar3.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(s0.g.f34069a, 1.0f);
                        ofFloat.setInterpolator(kVar.f39385d);
                        ofFloat.addUpdateListener(new b(kVar, 0));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(kVar.f39387f);
                        ofFloat2.addUpdateListener(new b(kVar, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(kVar.f39382a);
                        animatorSet.addListener(new c(kVar, 1));
                        animatorSet.start();
                        return;
                    }
                    int height3 = jVar3.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = jVar3.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    jVar3.setTranslationY(height3);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(height3, 0);
                    valueAnimator.setInterpolator(kVar.f39386e);
                    valueAnimator.setDuration(kVar.f39384c);
                    valueAnimator.addListener(new c(kVar, 0));
                    valueAnimator.addUpdateListener(new d(kVar, height3));
                    valueAnimator.start();
                    return;
                }
                return;
        }
    }
}
