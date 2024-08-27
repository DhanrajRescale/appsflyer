package jn;

import d7.i0;

/* loaded from: classes2.dex */
public final class g implements fq.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f21490a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final fq.c f21491b;

    /* renamed from: c, reason: collision with root package name */
    public static final fq.c f21492c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jn.g] */
    static {
        i0 a10 = fq.c.a("startMs");
        eb.f q10 = eb.f.q();
        q10.f15308a = 1;
        f21491b = da.e.j(q10, a10);
        i0 a11 = fq.c.a("endMs");
        eb.f q11 = eb.f.q();
        q11.f15308a = 2;
        f21492c = da.e.j(q11, a11);
    }

    @Override // fq.b
    public final void encode(Object obj, Object obj2) {
        mn.h hVar = (mn.h) obj;
        fq.e eVar = (fq.e) obj2;
        eVar.b(f21491b, hVar.f27856a);
        eVar.b(f21492c, hVar.f27857b);
    }
}
