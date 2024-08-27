package r1;

import kotlin.jvm.internal.Intrinsics;
import n1.s0;
import ut.t;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static final kq.e f32899k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static int f32900l;

    /* renamed from: a, reason: collision with root package name */
    public final String f32901a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32902b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32903c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32904d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32905e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f32906f;

    /* renamed from: g, reason: collision with root package name */
    public final long f32907g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32908h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f32909i;

    /* renamed from: j, reason: collision with root package name */
    public final int f32910j;

    public f(String str, float f10, float f11, float f12, float f13, g0 g0Var, long j10, int i10, boolean z10) {
        int i11;
        synchronized (f32899k) {
            i11 = f32900l;
            f32900l = i11 + 1;
        }
        this.f32901a = str;
        this.f32902b = f10;
        this.f32903c = f11;
        this.f32904d = f12;
        this.f32905e = f13;
        this.f32906f = g0Var;
        this.f32907g = j10;
        this.f32908h = i10;
        this.f32909i = z10;
        this.f32910j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Intrinsics.a(this.f32901a, fVar.f32901a) && w2.e.a(this.f32902b, fVar.f32902b) && w2.e.a(this.f32903c, fVar.f32903c) && this.f32904d == fVar.f32904d && this.f32905e == fVar.f32905e && Intrinsics.a(this.f32906f, fVar.f32906f) && n1.t.d(this.f32907g, fVar.f32907g) && s0.b(this.f32908h, fVar.f32908h) && this.f32909i == fVar.f32909i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f32906f.hashCode() + v.e.a(this.f32905e, v.e.a(this.f32904d, v.e.a(this.f32903c, v.e.a(this.f32902b, this.f32901a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = n1.t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Boolean.hashCode(this.f32909i) + da.e.f(this.f32908h, v.e.c(this.f32907g, hashCode, 31), 31);
    }
}
