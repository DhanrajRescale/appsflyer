package m0;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class g1 implements tu.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1.s f26193b;

    public /* synthetic */ g1(e1.s sVar, int i10) {
        this.f26192a = i10;
        this.f26193b = sVar;
    }

    @Override // tu.g
    public final /* bridge */ /* synthetic */ Object a(Object obj, yt.a aVar) {
        switch (this.f26192a) {
            case 0:
                return b((a0.j) obj);
            case 1:
                return b((a0.j) obj);
            case 2:
                return b((a0.j) obj);
            default:
                return b((a0.j) obj);
        }
    }

    public final Object b(a0.j jVar) {
        int i10 = this.f26192a;
        e1.s sVar = this.f26193b;
        switch (i10) {
            case 0:
                if (jVar instanceof a0.h) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.i) {
                    sVar.remove(((a0.i) jVar).f15a);
                } else if (jVar instanceof a0.d) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.e) {
                    sVar.remove(((a0.e) jVar).f8a);
                } else if (jVar instanceof a0.n) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.o) {
                    sVar.remove(((a0.o) jVar).f19a);
                } else if (jVar instanceof a0.m) {
                    sVar.remove(((a0.m) jVar).f17a);
                }
                return Unit.f23355a;
            case 1:
                if (jVar instanceof a0.n) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.o) {
                    sVar.remove(((a0.o) jVar).f19a);
                } else if (jVar instanceof a0.m) {
                    sVar.remove(((a0.m) jVar).f17a);
                } else if (jVar instanceof a0.b) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.c) {
                    sVar.remove(((a0.c) jVar).f7a);
                } else if (jVar instanceof a0.a) {
                    sVar.remove(((a0.a) jVar).f6a);
                }
                return Unit.f23355a;
            case 2:
                if (jVar instanceof a0.h) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.i) {
                    sVar.remove(((a0.i) jVar).f15a);
                } else if (jVar instanceof a0.d) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.e) {
                    sVar.remove(((a0.e) jVar).f8a);
                } else if (jVar instanceof a0.n) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.o) {
                    sVar.remove(((a0.o) jVar).f19a);
                } else if (jVar instanceof a0.m) {
                    sVar.remove(((a0.m) jVar).f17a);
                }
                return Unit.f23355a;
            default:
                if (jVar instanceof a0.h) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.i) {
                    sVar.remove(((a0.i) jVar).f15a);
                } else if (jVar instanceof a0.d) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.e) {
                    sVar.remove(((a0.e) jVar).f8a);
                } else if (jVar instanceof a0.n) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.o) {
                    sVar.remove(((a0.o) jVar).f19a);
                } else if (jVar instanceof a0.m) {
                    sVar.remove(((a0.m) jVar).f17a);
                } else if (jVar instanceof a0.b) {
                    sVar.add(jVar);
                } else if (jVar instanceof a0.c) {
                    sVar.remove(((a0.c) jVar).f7a);
                } else if (jVar instanceof a0.a) {
                    sVar.remove(((a0.a) jVar).f6a);
                }
                return Unit.f23355a;
        }
    }
}
