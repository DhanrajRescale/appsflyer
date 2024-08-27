package b5;

import java.util.Collections;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class k0 implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final k0 f3381g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f3382h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f3383i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f3384j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f3385k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f3386l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f3387m;

    /* renamed from: n, reason: collision with root package name */
    public static final i5.w f3388n;

    /* renamed from: a, reason: collision with root package name */
    public final String f3389a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f3390b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f3391c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f3392d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f3393e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f3394f;

    /* JADX WARN: Type inference failed for: r13v0, types: [b5.z, b5.a0] */
    static {
        y yVar = new y();
        lp.l0 l0Var = lp.o0.f25025b;
        lp.j1 j1Var = lp.j1.f24998e;
        Collections.emptyList();
        lp.j1 j1Var2 = lp.j1.f24998e;
        f3381g = new k0(HttpUrl.FRAGMENT_ENCODE_SET, new z(yVar), null, new e0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), n0.I, g0.f3304c);
        int i10 = e5.x.f15050a;
        f3382h = Integer.toString(0, 36);
        f3383i = Integer.toString(1, 36);
        f3384j = Integer.toString(2, 36);
        f3385k = Integer.toString(3, 36);
        f3386l = Integer.toString(4, 36);
        f3387m = Integer.toString(5, 36);
        f3388n = new i5.w(20);
    }

    public k0(String str, a0 a0Var, f0 f0Var, e0 e0Var, n0 n0Var, g0 g0Var) {
        this.f3389a = str;
        this.f3390b = f0Var;
        this.f3391c = e0Var;
        this.f3392d = n0Var;
        this.f3393e = a0Var;
        this.f3394f = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (e5.x.a(this.f3389a, k0Var.f3389a) && this.f3393e.equals(k0Var.f3393e) && e5.x.a(this.f3390b, k0Var.f3390b) && e5.x.a(this.f3391c, k0Var.f3391c) && e5.x.a(this.f3392d, k0Var.f3392d) && e5.x.a(this.f3394f, k0Var.f3394f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3389a.hashCode() * 31;
        f0 f0Var = this.f3390b;
        if (f0Var != null) {
            i10 = f0Var.hashCode();
        } else {
            i10 = 0;
        }
        return this.f3394f.hashCode() + ((this.f3392d.hashCode() + ((this.f3393e.hashCode() + ((this.f3391c.hashCode() + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
