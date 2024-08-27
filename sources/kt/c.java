package kt;

/* loaded from: classes2.dex */
public final class c extends at.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23489a;

    /* renamed from: b, reason: collision with root package name */
    public final at.a f23490b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23491c;

    public c(at.a aVar, Object obj, int i10) {
        this.f23489a = i10;
        this.f23490b = aVar;
        this.f23491c = obj;
    }

    @Override // at.a
    public final void b(at.b bVar) {
        int i10 = this.f23489a;
        Object obj = this.f23491c;
        at.a aVar = this.f23490b;
        switch (i10) {
            case 0:
                aVar.a(new b((at.a) obj, bVar));
                return;
            case 1:
                aVar.a(new a(this, bVar, 1));
                return;
            default:
                j jVar = new j(bVar, (et.d) obj);
                bVar.c(jVar);
                aVar.a(jVar);
                return;
        }
    }
}
