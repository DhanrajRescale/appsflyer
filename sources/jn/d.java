package jn;

import d7.i0;

/* loaded from: classes2.dex */
public final class d implements fq.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f21483a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final fq.c f21484b;

    /* renamed from: c, reason: collision with root package name */
    public static final fq.c f21485c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jn.d] */
    static {
        i0 a10 = fq.c.a("logSource");
        eb.f q10 = eb.f.q();
        q10.f15308a = 1;
        f21484b = da.e.j(q10, a10);
        i0 a11 = fq.c.a("logEventDropped");
        eb.f q11 = eb.f.q();
        q11.f15308a = 2;
        f21485c = da.e.j(q11, a11);
    }

    @Override // fq.b
    public final void encode(Object obj, Object obj2) {
        mn.e eVar = (mn.e) obj;
        fq.e eVar2 = (fq.e) obj2;
        eVar2.d(f21484b, eVar.f27850a);
        eVar2.d(f21485c, eVar.f27851b);
    }
}
