package androidx.fragment.app;

import android.transition.Transition;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: c, reason: collision with root package name */
    public final Object f1725c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1726d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f2 operation, y3.g signal, boolean z10, boolean z11) {
        super(operation, signal);
        Object exitTransition;
        boolean z12;
        Object obj;
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        e2 e2Var = operation.f1696a;
        e2 e2Var2 = e2.f1679b;
        g0 g0Var = operation.f1698c;
        if (e2Var == e2Var2) {
            if (z10) {
                exitTransition = g0Var.getReenterTransition();
            } else {
                exitTransition = g0Var.getEnterTransition();
            }
        } else if (z10) {
            exitTransition = g0Var.getReturnTransition();
        } else {
            exitTransition = g0Var.getExitTransition();
        }
        this.f1725c = exitTransition;
        if (operation.f1696a == e2Var2) {
            if (z10) {
                z12 = g0Var.getAllowReturnTransitionOverlap();
            } else {
                z12 = g0Var.getAllowEnterTransitionOverlap();
            }
        } else {
            z12 = true;
        }
        this.f1726d = z12;
        if (z11) {
            if (z10) {
                obj = g0Var.getSharedElementReturnTransition();
            } else {
                obj = g0Var.getSharedElementEnterTransition();
            }
        } else {
            obj = null;
        }
        this.f1727e = obj;
    }

    public final x1 c() {
        Object obj = this.f1725c;
        x1 d10 = d(obj);
        Object obj2 = this.f1727e;
        x1 d11 = d(obj2);
        if (d10 != null && d11 != null && d10 != d11) {
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f1723a.f1698c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }
        if (d10 == null) {
            return d11;
        }
        return d10;
    }

    public final x1 d(Object obj) {
        if (obj == null) {
            return null;
        }
        v1 v1Var = q1.f1817a;
        if (obj instanceof Transition) {
            return v1Var;
        }
        x1 x1Var = q1.f1818b;
        if (x1Var != null && x1Var.e(obj)) {
            return x1Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1723a.f1698c + " is not a valid framework Transition or AndroidX Transition");
    }
}
