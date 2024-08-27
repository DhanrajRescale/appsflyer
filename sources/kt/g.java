package kt;

/* loaded from: classes2.dex */
public final class g extends at.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23498a;

    /* renamed from: b, reason: collision with root package name */
    public final at.a f23499b;

    /* renamed from: c, reason: collision with root package name */
    public final at.l f23500c;

    public g(at.a aVar, at.l lVar, int i10) {
        this.f23498a = i10;
        this.f23499b = aVar;
        this.f23500c = lVar;
    }

    @Override // at.a
    public final void b(at.b bVar) {
        int i10 = this.f23498a;
        at.l lVar = this.f23500c;
        at.a aVar = this.f23499b;
        switch (i10) {
            case 0:
                aVar.a(new f(bVar, lVar));
                return;
            default:
                k kVar = new k(aVar, bVar);
                bVar.c(kVar);
                ct.b b10 = lVar.b(kVar);
                ft.e eVar = kVar.f23515b;
                eVar.getClass();
                ft.b.d(eVar, b10);
                return;
        }
    }
}
