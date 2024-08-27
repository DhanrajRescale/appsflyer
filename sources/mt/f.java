package mt;

/* loaded from: classes2.dex */
public final class f extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28009b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(at.f fVar, Object obj, int i10) {
        super(fVar);
        this.f28009b = i10;
        this.f28010c = obj;
    }

    @Override // at.e
    public final void f(at.g gVar) {
        int i10 = this.f28009b;
        at.f fVar = this.f27994a;
        Object obj = this.f28010c;
        switch (i10) {
            case 0:
                ((at.e) fVar).e(new e(gVar, (et.e) obj, 0));
                return;
            case 1:
                ((at.e) fVar).e(new e(gVar, (et.d) obj, 1));
                return;
            default:
                r rVar = new r(gVar);
                gVar.c(rVar);
                ft.b.e(rVar, ((at.l) obj).b(new m.j(22, this, rVar)));
                return;
        }
    }
}
