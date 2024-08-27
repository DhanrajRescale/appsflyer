package jn;

import d7.i0;

/* loaded from: classes2.dex */
public final class a implements fq.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f21473a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final fq.c f21474b;

    /* renamed from: c, reason: collision with root package name */
    public static final fq.c f21475c;

    /* renamed from: d, reason: collision with root package name */
    public static final fq.c f21476d;

    /* renamed from: e, reason: collision with root package name */
    public static final fq.c f21477e;

    /* JADX WARN: Type inference failed for: r0v0, types: [jn.a, java.lang.Object] */
    static {
        i0 a10 = fq.c.a("window");
        eb.f q10 = eb.f.q();
        q10.f15308a = 1;
        f21474b = da.e.j(q10, a10);
        i0 a11 = fq.c.a("logSourceMetrics");
        eb.f q11 = eb.f.q();
        q11.f15308a = 2;
        f21475c = da.e.j(q11, a11);
        i0 a12 = fq.c.a("globalMetrics");
        eb.f q12 = eb.f.q();
        q12.f15308a = 3;
        f21476d = da.e.j(q12, a12);
        i0 a13 = fq.c.a("appNamespace");
        eb.f q13 = eb.f.q();
        q13.f15308a = 4;
        f21477e = da.e.j(q13, a13);
    }

    @Override // fq.b
    public final void encode(Object obj, Object obj2) {
        mn.a aVar = (mn.a) obj;
        fq.e eVar = (fq.e) obj2;
        eVar.d(f21474b, aVar.f27833a);
        eVar.d(f21475c, aVar.f27834b);
        eVar.d(f21476d, aVar.f27835c);
        eVar.d(f21477e, aVar.f27836d);
    }
}
