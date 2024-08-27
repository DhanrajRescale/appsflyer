package nt;

import at.o;

/* loaded from: classes2.dex */
public final class f extends at.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29135a;

    /* renamed from: b, reason: collision with root package name */
    public final o f29136b;

    /* renamed from: c, reason: collision with root package name */
    public final et.d f29137c;

    public /* synthetic */ f(o oVar, et.d dVar, int i10) {
        this.f29135a = i10;
        this.f29137c = dVar;
        this.f29136b = oVar;
    }

    @Override // at.m
    public final void b(at.n nVar) {
        int i10 = this.f29135a;
        o oVar = this.f29136b;
        et.d dVar = this.f29137c;
        switch (i10) {
            case 0:
                ((at.m) oVar).a(new e(nVar, dVar));
                return;
            default:
                ((at.m) oVar).a(new a(nVar, dVar));
                return;
        }
    }
}
