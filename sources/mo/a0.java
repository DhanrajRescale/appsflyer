package mo;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a0 extends t7.p {
    @Override // t7.p
    public final void d(t7.w wVar) {
        View view = wVar.f35536b;
        if (view instanceof TextView) {
            wVar.f35535a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // t7.p
    public final void g(t7.w wVar) {
        View view = wVar.f35536b;
        if (view instanceof TextView) {
            wVar.f35535a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // t7.p
    public final Animator k(ViewGroup viewGroup, t7.w wVar, t7.w wVar2) {
        float f10;
        if (wVar == null || wVar2 == null || !(wVar.f35536b instanceof TextView)) {
            return null;
        }
        View view = wVar2.f35536b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = wVar.f35535a;
        HashMap hashMap2 = wVar2.f35535a;
        float f11 = 1.0f;
        if (hashMap.get("android:textscale:scale") != null) {
            f10 = ((Float) hashMap.get("android:textscale:scale")).floatValue();
        } else {
            f10 = 1.0f;
        }
        if (hashMap2.get("android:textscale:scale") != null) {
            f11 = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
        }
        if (f10 == f11) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.addUpdateListener(new r7.b(1, this, textView));
        return ofFloat;
    }
}
