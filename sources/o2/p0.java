package o2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f29515a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f29516b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29517c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29518d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f29519e;

    public p0(s sVar, d0 d0Var, int i10, int i11, Object obj) {
        this.f29515a = sVar;
        this.f29516b = d0Var;
        this.f29517c = i10;
        this.f29518d = i11;
        this.f29519e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.a(this.f29515a, p0Var.f29515a) && Intrinsics.a(this.f29516b, p0Var.f29516b) && z.a(this.f29517c, p0Var.f29517c) && a0.a(this.f29518d, p0Var.f29518d) && Intrinsics.a(this.f29519e, p0Var.f29519e);
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        s sVar = this.f29515a;
        if (sVar == null) {
            hashCode = 0;
        } else {
            hashCode = sVar.hashCode();
        }
        int f10 = da.e.f(this.f29518d, da.e.f(this.f29517c, ((hashCode * 31) + this.f29516b.f29469a) * 31, 31), 31);
        Object obj = this.f29519e;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return f10 + i10;
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.f29515a + ", fontWeight=" + this.f29516b + ", fontStyle=" + ((Object) z.b(this.f29517c)) + ", fontSynthesis=" + ((Object) a0.b(this.f29518d)) + ", resourceLoaderCacheKey=" + this.f29519e + ')';
    }
}
