package ko;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class m extends k {
    public StateListAnimator K;

    @Override // ko.k
    public final float e() {
        return this.f23346s.getElevation();
    }

    @Override // ko.k
    public final void f(Rect rect) {
        if (((FloatingActionButton) this.f23347t.f24937b).f11358k) {
            super.f(rect);
            return;
        }
        if (this.f23333f) {
            FloatingActionButton floatingActionButton = this.f23346s;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i10 = this.f23338k;
            if (sizeDimension < i10) {
                int sizeDimension2 = (i10 - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // ko.k
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        to.h s7 = s();
        this.f23329b = s7;
        s7.setTintList(colorStateList);
        if (mode != null) {
            this.f23329b.setTintMode(mode);
        }
        to.h hVar = this.f23329b;
        FloatingActionButton floatingActionButton = this.f23346s;
        hVar.k(floatingActionButton.getContext());
        if (i10 > 0) {
            Context context = floatingActionButton.getContext();
            to.l lVar = this.f23328a;
            lVar.getClass();
            a aVar = new a(lVar);
            int color = r3.k.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = r3.k.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = r3.k.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = r3.k.getColor(context, R.color.design_fab_stroke_end_outer_color);
            aVar.f23289i = color;
            aVar.f23290j = color2;
            aVar.f23291k = color3;
            aVar.f23292l = color4;
            float f10 = i10;
            if (aVar.f23288h != f10) {
                aVar.f23288h = f10;
                aVar.f23282b.setStrokeWidth(f10 * 1.3333f);
                aVar.f23294n = true;
                aVar.invalidateSelf();
            }
            if (colorStateList != null) {
                aVar.f23293m = colorStateList.getColorForState(aVar.getState(), aVar.f23293m);
            }
            aVar.f23296p = colorStateList;
            aVar.f23294n = true;
            aVar.invalidateSelf();
            this.f23331d = aVar;
            a aVar2 = this.f23331d;
            aVar2.getClass();
            to.h hVar2 = this.f23329b;
            hVar2.getClass();
            drawable = new LayerDrawable(new Drawable[]{aVar2, hVar2});
        } else {
            this.f23331d = null;
            drawable = this.f23329b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ro.a.c(colorStateList2), drawable, null);
        this.f23330c = rippleDrawable;
        this.f23332e = rippleDrawable;
    }

    @Override // ko.k
    public final void h() {
    }

    @Override // ko.k
    public final void i() {
        q();
    }

    @Override // ko.k
    public final void j(int[] iArr) {
    }

    @Override // ko.k
    public final void k(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f23346s;
        if (floatingActionButton.getStateListAnimator() == this.K) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(k.E, r(f10, f12));
            stateListAnimator.addState(k.F, r(f10, f11));
            stateListAnimator.addState(k.G, r(f10, f11));
            stateListAnimator.addState(k.H, r(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            if (i10 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, s0.g.f34069a).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(k.f23327z);
            stateListAnimator.addState(k.I, animatorSet);
            stateListAnimator.addState(k.J, r(s0.g.f34069a, s0.g.f34069a));
            this.K = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // ko.k
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.f23330c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ro.a.c(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // ko.k
    public final boolean o() {
        if (!((FloatingActionButton) this.f23347t.f24937b).f11358k && (!this.f23333f || this.f23346s.getSizeDimension() >= this.f23338k)) {
            return false;
        }
        return true;
    }

    @Override // ko.k
    public final void p() {
    }

    public final AnimatorSet r(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f23346s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(k.f23327z);
        return animatorSet;
    }

    public final to.h s() {
        to.l lVar = this.f23328a;
        lVar.getClass();
        return new to.h(lVar);
    }
}
