package tr;

/* loaded from: classes2.dex */
public final class b extends at.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36355a;

    /* renamed from: b, reason: collision with root package name */
    public final at.e f36356b;

    public /* synthetic */ b(d dVar, int i10) {
        this.f36355a = i10;
        this.f36356b = dVar;
    }

    @Override // at.e
    public final void f(at.g gVar) {
        int i10 = this.f36355a;
        at.e eVar = this.f36356b;
        switch (i10) {
            case 0:
                eVar.e(new a(gVar));
                return;
            default:
                eVar.e(new f(gVar));
                return;
        }
    }
}
