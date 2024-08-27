package x;

import kotlin.jvm.internal.Intrinsics;
import ut.t;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f39786a;

    /* renamed from: b, reason: collision with root package name */
    public final b0.h1 f39787b;

    public y1() {
        long d10 = androidx.compose.ui.graphics.a.d(4284900966L);
        float f10 = 0;
        float f11 = 0;
        b0.i1 i1Var = new b0.i1(f10, f11, f10, f11);
        this.f39786a = d10;
        this.f39787b = i1Var;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.a(y1.class, cls)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        y1 y1Var = (y1) obj;
        if (n1.t.d(this.f39786a, y1Var.f39786a) && Intrinsics.a(this.f39787b, y1Var.f39787b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = n1.t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return this.f39787b.hashCode() + (Long.hashCode(this.f39786a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        v.e.t(this.f39786a, sb2, ", drawPadding=");
        sb2.append(this.f39787b);
        sb2.append(')');
        return sb2.toString();
    }
}
