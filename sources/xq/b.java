package xq;

import yk.g;

/* loaded from: classes2.dex */
public final class b implements xs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40542a;

    /* renamed from: b, reason: collision with root package name */
    public final a f40543b;

    public /* synthetic */ b(a aVar, int i10) {
        this.f40542a = i10;
        this.f40543b = aVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = this.f40543b;
        int i10 = this.f40542a;
        switch (i10) {
            case 0:
                aVar.getClass();
                vq.a e10 = vq.a.e();
                g.h(e10);
                return e10;
            case 1:
                switch (i10) {
                    case 1:
                        mq.c cVar = aVar.f40540c;
                        g.h(cVar);
                        return cVar;
                    default:
                        mq.c cVar2 = aVar.f40541d;
                        g.h(cVar2);
                        return cVar2;
                }
            default:
                switch (i10) {
                    case 1:
                        mq.c cVar3 = aVar.f40540c;
                        g.h(cVar3);
                        return cVar3;
                    default:
                        mq.c cVar4 = aVar.f40541d;
                        g.h(cVar4);
                        return cVar4;
                }
        }
    }
}
