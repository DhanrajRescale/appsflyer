package ej;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15526a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15527b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15528c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15529d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15530e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f15531f;

    public q0(int i10, int i11, int i12, int i13, int i14, Class actionClass) {
        Intrinsics.checkNotNullParameter(actionClass, "actionClass");
        this.f15526a = i10;
        this.f15527b = i11;
        this.f15528c = i12;
        this.f15529d = i13;
        this.f15530e = i14;
        this.f15531f = actionClass;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f15526a == q0Var.f15526a && this.f15527b == q0Var.f15527b && this.f15528c == q0Var.f15528c && this.f15529d == q0Var.f15529d && this.f15530e == q0Var.f15530e && Intrinsics.a(this.f15531f, q0Var.f15531f);
    }

    public final int hashCode() {
        return this.f15531f.hashCode() + da.e.f(this.f15530e, da.e.f(this.f15529d, da.e.f(this.f15528c, da.e.f(this.f15527b, Integer.hashCode(this.f15526a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "SubscriptionStatusUI(toolbarTitle=" + this.f15526a + ", illustration=" + this.f15527b + ", title=" + this.f15528c + ", message=" + this.f15529d + ", actionTitle=" + this.f15530e + ", actionClass=" + this.f15531f + ")";
    }
}
