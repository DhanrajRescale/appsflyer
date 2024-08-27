package jn;

import d7.i0;

/* loaded from: classes2.dex */
public final class c implements fq.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f21480a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final fq.c f21481b;

    /* renamed from: c, reason: collision with root package name */
    public static final fq.c f21482c;

    /* JADX WARN: Type inference failed for: r0v0, types: [jn.c, java.lang.Object] */
    static {
        i0 a10 = fq.c.a("eventsDroppedCount");
        eb.f q10 = eb.f.q();
        q10.f15308a = 1;
        f21481b = da.e.j(q10, a10);
        i0 a11 = fq.c.a("reason");
        eb.f q11 = eb.f.q();
        q11.f15308a = 3;
        f21482c = da.e.j(q11, a11);
    }

    @Override // fq.b
    public final void encode(Object obj, Object obj2) {
        mn.d dVar = (mn.d) obj;
        fq.e eVar = (fq.e) obj2;
        eVar.b(f21481b, dVar.f27847a);
        eVar.d(f21482c, dVar.f27848b);
    }
}
