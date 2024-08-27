package of;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final h f29989a;

    /* renamed from: b, reason: collision with root package name */
    public final d f29990b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29991c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29992d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29993e;

    /* renamed from: f, reason: collision with root package name */
    public final kq.e f29994f;

    public e(h hVar, kq.e eVar, nj.a aVar, int i10, String str, String str2) {
        this.f29989a = hVar;
        this.f29994f = eVar;
        this.f29990b = aVar;
        this.f29991c = i10;
        this.f29992d = str;
        this.f29993e = str2;
    }

    public final void a() {
        ((nj.a) this.f29990b).b();
    }

    public final void b(int i10, g gVar) {
        h hVar = this.f29989a;
        hVar.b(i10, gVar);
        boolean a10 = hVar.a();
        d dVar = this.f29990b;
        if (a10) {
            ((nj.a) dVar).a();
        } else {
            ((nj.a) dVar).b();
        }
    }
}
