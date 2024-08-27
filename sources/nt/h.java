package nt;

import at.o;

/* loaded from: classes2.dex */
public final class h extends at.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29142a;

    /* renamed from: b, reason: collision with root package name */
    public final o f29143b;

    /* renamed from: c, reason: collision with root package name */
    public final at.l f29144c;

    public /* synthetic */ h(o oVar, at.l lVar, int i10) {
        this.f29142a = i10;
        this.f29143b = oVar;
        this.f29144c = lVar;
    }

    @Override // at.m
    public final void b(at.n nVar) {
        int i10 = this.f29142a;
        at.l lVar = this.f29144c;
        o oVar = this.f29143b;
        switch (i10) {
            case 0:
                ((at.m) oVar).a(new g(nVar, lVar));
                return;
            default:
                j jVar = new j(nVar, oVar);
                nVar.c(jVar);
                ct.b b10 = lVar.b(jVar);
                ft.e eVar = jVar.f29148b;
                eVar.getClass();
                ft.b.d(eVar, b10);
                return;
        }
    }
}
