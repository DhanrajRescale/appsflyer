package b5;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 implements k {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3281i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f3282j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f3283k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f3284l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f3285m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f3286n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f3287o;

    /* renamed from: p, reason: collision with root package name */
    public static final i5.w f3288p;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3289a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3290b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f3291c;

    /* renamed from: d, reason: collision with root package name */
    public final x f3292d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3293e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3294f;

    /* renamed from: g, reason: collision with root package name */
    public final lp.o0 f3295g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3296h;

    static {
        int i10 = e5.x.f15050a;
        f3281i = Integer.toString(0, 36);
        f3282j = Integer.toString(1, 36);
        f3283k = Integer.toString(2, 36);
        f3284l = Integer.toString(3, 36);
        f3285m = Integer.toString(4, 36);
        f3286n = Integer.toString(5, 36);
        f3287o = Integer.toString(6, 36);
        f3288p = new i5.w(25);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, lp.o0 o0Var, Object obj) {
        this.f3289a = uri;
        this.f3290b = str;
        this.f3291c = c0Var;
        this.f3292d = xVar;
        this.f3293e = list;
        this.f3294f = str2;
        this.f3295g = o0Var;
        lp.k0 p10 = lp.o0.p();
        for (int i10 = 0; i10 < o0Var.size(); i10++) {
            p10.b0(i0.a(((j0) o0Var.get(i10)).a()));
        }
        p10.e0();
        this.f3296h = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f3289a.equals(f0Var.f3289a) && e5.x.a(this.f3290b, f0Var.f3290b) && e5.x.a(this.f3291c, f0Var.f3291c) && e5.x.a(this.f3292d, f0Var.f3292d) && this.f3293e.equals(f0Var.f3293e) && e5.x.a(this.f3294f, f0Var.f3294f) && this.f3295g.equals(f0Var.f3295g) && e5.x.a(this.f3296h, f0Var.f3296h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f3289a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3290b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 + hashCode) * 31;
        c0 c0Var = this.f3291c;
        if (c0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        x xVar = this.f3292d;
        if (xVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = xVar.hashCode();
        }
        int hashCode6 = (this.f3293e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f3294f;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int hashCode7 = (this.f3295g.hashCode() + ((hashCode6 + hashCode4) * 31)) * 31;
        Object obj = this.f3296h;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode7 + i10;
    }
}
