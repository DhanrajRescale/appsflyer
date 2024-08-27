package jv;

/* loaded from: classes2.dex */
public final class s extends kv.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iv.a f21726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lv.k f21727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iv.e f21728c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv.q f21729d;

    public s(hv.f fVar, lv.k kVar, iv.e eVar, hv.q qVar) {
        this.f21726a = fVar;
        this.f21727b = kVar;
        this.f21728c = eVar;
        this.f21729d = qVar;
    }

    @Override // kv.b, lv.k
    public final Object b(lv.o oVar) {
        if (oVar == lv.n.f25447b) {
            return this.f21728c;
        }
        if (oVar == lv.n.f25446a) {
            return this.f21729d;
        }
        if (oVar == lv.n.f25448c) {
            return this.f21727b.b(oVar);
        }
        return oVar.h(this);
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        iv.a aVar = this.f21726a;
        if (aVar != null && mVar.a()) {
            return ((hv.f) aVar).f(mVar);
        }
        return this.f21727b.f(mVar);
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        iv.a aVar = this.f21726a;
        if (aVar != null && mVar.a()) {
            return aVar.i(mVar);
        }
        return this.f21727b.i(mVar);
    }

    @Override // kv.b, lv.k
    public final lv.q j(lv.m mVar) {
        iv.a aVar = this.f21726a;
        if (aVar != null && mVar.a()) {
            return aVar.j(mVar);
        }
        return this.f21727b.j(mVar);
    }
}
