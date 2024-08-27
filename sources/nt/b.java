package nt;

import at.o;

/* loaded from: classes2.dex */
public final class b extends at.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29125a;

    /* renamed from: b, reason: collision with root package name */
    public final o f29126b;

    /* renamed from: c, reason: collision with root package name */
    public final et.c f29127c;

    public /* synthetic */ b(o oVar, et.c cVar, int i10) {
        this.f29125a = i10;
        this.f29126b = oVar;
        this.f29127c = cVar;
    }

    @Override // at.m
    public final void b(at.n nVar) {
        int i10 = this.f29125a;
        o oVar = this.f29126b;
        switch (i10) {
            case 0:
                ((at.m) oVar).a(new a(this, nVar, 0));
                return;
            case 1:
                ((at.m) oVar).a(new c(nVar, this.f29127c));
                return;
            default:
                ((at.m) oVar).a(new a(this, nVar, 1));
                return;
        }
    }
}
