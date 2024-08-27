package o1;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final t.t f29406a;

    static {
        r rVar = e.f29380c;
        int i10 = rVar.f29377c;
        h hVar = new h(rVar, rVar, 1);
        m mVar = e.f29397t;
        int i11 = mVar.f29377c << 6;
        int i12 = rVar.f29377c;
        int i13 = i11 | i12;
        h hVar2 = new h(rVar, mVar, 0);
        int i14 = (i12 << 6) | mVar.f29377c;
        h hVar3 = new h(mVar, rVar, 0);
        t.t tVar = t.k.f34874a;
        t.t tVar2 = new t.t();
        tVar2.k(i10 | (i10 << 6), hVar);
        tVar2.k(i13, hVar2);
        tVar2.k(i14, hVar3);
        f29406a = tVar2;
    }
}
