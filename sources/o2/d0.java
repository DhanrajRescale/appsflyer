package o2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f29460b;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f29461c;

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f29462d;

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f29463e;

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f29464f;

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f29465g;

    /* renamed from: h, reason: collision with root package name */
    public static final d0 f29466h;

    /* renamed from: i, reason: collision with root package name */
    public static final d0 f29467i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f29468j;

    /* renamed from: a, reason: collision with root package name */
    public final int f29469a;

    static {
        d0 d0Var = new d0(100);
        d0 d0Var2 = new d0(200);
        d0 d0Var3 = new d0(300);
        d0 d0Var4 = new d0(400);
        f29460b = d0Var4;
        d0 d0Var5 = new d0(500);
        f29461c = d0Var5;
        d0 d0Var6 = new d0(600);
        f29462d = d0Var6;
        d0 d0Var7 = new d0(700);
        d0 d0Var8 = new d0(800);
        d0 d0Var9 = new d0(900);
        f29463e = d0Var3;
        f29464f = d0Var4;
        f29465g = d0Var5;
        f29466h = d0Var7;
        f29467i = d0Var9;
        f29468j = vt.y.g(d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9);
    }

    public d0(int i10) {
        this.f29469a = i10;
        if (1 <= i10 && i10 < 1001) {
        } else {
            throw new IllegalArgumentException(jr.h.n("Font weight can be in range [1, 1000]. Current value: ", i10).toString());
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(d0 d0Var) {
        return Intrinsics.f(this.f29469a, d0Var.f29469a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        if (this.f29469a == ((d0) obj).f29469a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29469a;
    }

    public final String toString() {
        return a3.a.i(new StringBuilder("FontWeight(weight="), this.f29469a, ')');
    }
}
