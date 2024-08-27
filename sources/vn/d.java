package vn;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import t.j0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f38186a = new j0();

    /* renamed from: b, reason: collision with root package name */
    public final j0 f38187b = new j0();

    public static d a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return b(resourceId, context);
        }
        return null;
    }

    public static d b(int i10, Context context) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [vn.e, java.lang.Object] */
    public static d c(ArrayList arrayList) {
        d dVar = new d();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                dVar.f38187b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = a.f38182c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = a.f38183d;
                    }
                } else {
                    interpolator = a.f38181b;
                }
                ?? obj = new Object();
                obj.f38191d = 0;
                obj.f38192e = 1;
                obj.f38188a = startDelay;
                obj.f38189b = duration;
                obj.f38190c = interpolator;
                obj.f38191d = objectAnimator.getRepeatCount();
                obj.f38192e = objectAnimator.getRepeatMode();
                dVar.f38186a.put(propertyName, obj);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return dVar;
    }

    public final e d(String str) {
        j0 j0Var = this.f38186a;
        if (j0Var.get(str) != null) {
            return (e) j0Var.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return this.f38186a.equals(((d) obj).f38186a);
    }

    public final int hashCode() {
        return this.f38186a.hashCode();
    }

    public final String toString() {
        return "\n" + d.class.getName() + UrlTreeKt.componentParamPrefixChar + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f38186a + "}\n";
    }
}
