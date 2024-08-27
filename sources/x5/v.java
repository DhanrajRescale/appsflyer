package x5;

import e5.x;
import i5.d0;
import i5.g0;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f40067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i5.g f40068c;

    public /* synthetic */ v(e eVar, i5.g gVar, int i10) {
        this.f40066a = i10;
        this.f40067b = eVar;
        this.f40068c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40066a) {
            case 0:
                w wVar = (w) this.f40067b.f39981b;
                int i10 = x.f15050a;
                g0 g0Var = ((d0) wVar).f19384a;
                g0Var.getClass();
                j5.w wVar2 = (j5.w) g0Var.f19472r;
                j5.b U = wVar2.U();
                wVar2.V(U, 1015, new j5.h(U, this.f40068c, 0));
                return;
            default:
                e eVar = this.f40067b;
                i5.g gVar = this.f40068c;
                eVar.getClass();
                synchronized (gVar) {
                }
                w wVar3 = (w) eVar.f39981b;
                int i11 = x.f15050a;
                j5.w wVar4 = (j5.w) ((d0) wVar3).f19384a.f19472r;
                j5.b S = wVar4.S(wVar4.f21014d.f21009e);
                wVar4.V(S, 1020, new j5.h(S, gVar, 3));
                return;
        }
    }
}
