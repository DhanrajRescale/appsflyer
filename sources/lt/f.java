package lt;

/* loaded from: classes2.dex */
public final class f extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(d dVar, int i10) {
        super(dVar);
        this.f25380c = i10;
    }

    @Override // at.c
    public final void b(at.d dVar) {
        int i10 = this.f25380c;
        at.c cVar = this.f25372b;
        switch (i10) {
            case 0:
                cVar.a(new e(dVar));
                return;
            default:
                cVar.a(new g(dVar));
                return;
        }
    }
}
