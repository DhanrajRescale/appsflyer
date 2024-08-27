package androidx.work;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: i, reason: collision with root package name */
    public static final e f2551i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2553b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2554c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2555d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2556e;

    /* renamed from: a, reason: collision with root package name */
    public v f2552a = v.f2638a;

    /* renamed from: f, reason: collision with root package name */
    public long f2557f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f2558g = -1;

    /* renamed from: h, reason: collision with root package name */
    public g f2559h = new g();

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.work.e, java.lang.Object] */
    static {
        v vVar = v.f2638a;
        g gVar = new g();
        ?? obj = new Object();
        obj.f2552a = vVar;
        obj.f2557f = -1L;
        obj.f2558g = -1L;
        new HashSet();
        obj.f2553b = false;
        obj.f2554c = false;
        obj.f2552a = vVar;
        obj.f2555d = false;
        obj.f2556e = false;
        obj.f2559h = gVar;
        obj.f2557f = -1L;
        obj.f2558g = -1L;
        f2551i = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f2553b != eVar.f2553b || this.f2554c != eVar.f2554c || this.f2555d != eVar.f2555d || this.f2556e != eVar.f2556e || this.f2557f != eVar.f2557f || this.f2558g != eVar.f2558g || this.f2552a != eVar.f2552a) {
            return false;
        }
        return this.f2559h.equals(eVar.f2559h);
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f2552a.hashCode() * 31) + (this.f2553b ? 1 : 0)) * 31) + (this.f2554c ? 1 : 0)) * 31) + (this.f2555d ? 1 : 0)) * 31) + (this.f2556e ? 1 : 0)) * 31;
        long j10 = this.f2557f;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f2558g;
        return this.f2559h.f2564a.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }
}
