package r0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final j2.g0 f32649a;

    /* renamed from: b, reason: collision with root package name */
    public final j2.g0 f32650b;

    /* renamed from: c, reason: collision with root package name */
    public final j2.g0 f32651c;

    /* renamed from: d, reason: collision with root package name */
    public final j2.g0 f32652d;

    /* renamed from: e, reason: collision with root package name */
    public final j2.g0 f32653e;

    /* renamed from: f, reason: collision with root package name */
    public final j2.g0 f32654f;

    /* renamed from: g, reason: collision with root package name */
    public final j2.g0 f32655g;

    /* renamed from: h, reason: collision with root package name */
    public final j2.g0 f32656h;

    /* renamed from: i, reason: collision with root package name */
    public final j2.g0 f32657i;

    /* renamed from: j, reason: collision with root package name */
    public final j2.g0 f32658j;

    /* renamed from: k, reason: collision with root package name */
    public final j2.g0 f32659k;

    /* renamed from: l, reason: collision with root package name */
    public final j2.g0 f32660l;

    /* renamed from: m, reason: collision with root package name */
    public final j2.g0 f32661m;

    /* renamed from: n, reason: collision with root package name */
    public final j2.g0 f32662n;

    /* renamed from: o, reason: collision with root package name */
    public final j2.g0 f32663o;

    public o3() {
        j2.g0 g0Var = s0.n.f34162d;
        j2.g0 g0Var2 = s0.n.f34163e;
        j2.g0 g0Var3 = s0.n.f34164f;
        j2.g0 g0Var4 = s0.n.f34165g;
        j2.g0 g0Var5 = s0.n.f34166h;
        j2.g0 g0Var6 = s0.n.f34167i;
        j2.g0 g0Var7 = s0.n.f34171m;
        j2.g0 g0Var8 = s0.n.f34172n;
        j2.g0 g0Var9 = s0.n.f34173o;
        j2.g0 g0Var10 = s0.n.f34159a;
        j2.g0 g0Var11 = s0.n.f34160b;
        j2.g0 g0Var12 = s0.n.f34161c;
        j2.g0 g0Var13 = s0.n.f34168j;
        j2.g0 g0Var14 = s0.n.f34169k;
        j2.g0 g0Var15 = s0.n.f34170l;
        this.f32649a = g0Var;
        this.f32650b = g0Var2;
        this.f32651c = g0Var3;
        this.f32652d = g0Var4;
        this.f32653e = g0Var5;
        this.f32654f = g0Var6;
        this.f32655g = g0Var7;
        this.f32656h = g0Var8;
        this.f32657i = g0Var9;
        this.f32658j = g0Var10;
        this.f32659k = g0Var11;
        this.f32660l = g0Var12;
        this.f32661m = g0Var13;
        this.f32662n = g0Var14;
        this.f32663o = g0Var15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        if (Intrinsics.a(this.f32649a, o3Var.f32649a) && Intrinsics.a(this.f32650b, o3Var.f32650b) && Intrinsics.a(this.f32651c, o3Var.f32651c) && Intrinsics.a(this.f32652d, o3Var.f32652d) && Intrinsics.a(this.f32653e, o3Var.f32653e) && Intrinsics.a(this.f32654f, o3Var.f32654f) && Intrinsics.a(this.f32655g, o3Var.f32655g) && Intrinsics.a(this.f32656h, o3Var.f32656h) && Intrinsics.a(this.f32657i, o3Var.f32657i) && Intrinsics.a(this.f32658j, o3Var.f32658j) && Intrinsics.a(this.f32659k, o3Var.f32659k) && Intrinsics.a(this.f32660l, o3Var.f32660l) && Intrinsics.a(this.f32661m, o3Var.f32661m) && Intrinsics.a(this.f32662n, o3Var.f32662n) && Intrinsics.a(this.f32663o, o3Var.f32663o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32663o.hashCode() + jr.h.f(this.f32662n, jr.h.f(this.f32661m, jr.h.f(this.f32660l, jr.h.f(this.f32659k, jr.h.f(this.f32658j, jr.h.f(this.f32657i, jr.h.f(this.f32656h, jr.h.f(this.f32655g, jr.h.f(this.f32654f, jr.h.f(this.f32653e, jr.h.f(this.f32652d, jr.h.f(this.f32651c, jr.h.f(this.f32650b, this.f32649a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.f32649a + ", displayMedium=" + this.f32650b + ",displaySmall=" + this.f32651c + ", headlineLarge=" + this.f32652d + ", headlineMedium=" + this.f32653e + ", headlineSmall=" + this.f32654f + ", titleLarge=" + this.f32655g + ", titleMedium=" + this.f32656h + ", titleSmall=" + this.f32657i + ", bodyLarge=" + this.f32658j + ", bodyMedium=" + this.f32659k + ", bodySmall=" + this.f32660l + ", labelLarge=" + this.f32661m + ", labelMedium=" + this.f32662n + ", labelSmall=" + this.f32663o + ')';
    }
}
