package jn;

import d7.i0;

/* loaded from: classes2.dex */
public final class f implements fq.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f21487a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final fq.c f21488b;

    /* renamed from: c, reason: collision with root package name */
    public static final fq.c f21489c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jn.f] */
    static {
        i0 a10 = fq.c.a("currentCacheSizeBytes");
        eb.f q10 = eb.f.q();
        q10.f15308a = 1;
        f21488b = da.e.j(q10, a10);
        i0 a11 = fq.c.a("maxCacheSizeBytes");
        eb.f q11 = eb.f.q();
        q11.f15308a = 2;
        f21489c = da.e.j(q11, a11);
    }

    @Override // fq.b
    public final void encode(Object obj, Object obj2) {
        mn.g gVar = (mn.g) obj;
        fq.e eVar = (fq.e) obj2;
        eVar.b(f21488b, gVar.f27854a);
        eVar.b(f21489c, gVar.f27855b);
    }
}
