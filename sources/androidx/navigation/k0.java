package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2234a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2235b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2236c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2237d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2238e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2239f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2240g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2241h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2242i;

    /* renamed from: j, reason: collision with root package name */
    public String f2243j;

    public k0(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.f2234a = z10;
        this.f2235b = z11;
        this.f2236c = i10;
        this.f2237d = z12;
        this.f2238e = z13;
        this.f2239f = i11;
        this.f2240g = i12;
        this.f2241h = i13;
        this.f2242i = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.a(k0.class, obj.getClass())) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f2234a == k0Var.f2234a && this.f2235b == k0Var.f2235b && this.f2236c == k0Var.f2236c && Intrinsics.a(this.f2243j, k0Var.f2243j) && this.f2237d == k0Var.f2237d && this.f2238e == k0Var.f2238e && this.f2239f == k0Var.f2239f && this.f2240g == k0Var.f2240g && this.f2241h == k0Var.f2241h && this.f2242i == k0Var.f2242i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((this.f2234a ? 1 : 0) * 31) + (this.f2235b ? 1 : 0)) * 31) + this.f2236c) * 31;
        String str = this.f2243j;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return ((((((((((((i11 + i10) * 31) + (this.f2237d ? 1 : 0)) * 31) + (this.f2238e ? 1 : 0)) * 31) + this.f2239f) * 31) + this.f2240g) * 31) + this.f2241h) * 31) + this.f2242i;
    }
}
