package x5;

import e5.x;
import i5.d0;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40058a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f40059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f40060c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40061d;

    public /* synthetic */ t(e eVar, int i10, long j10) {
        this.f40059b = eVar;
        this.f40061d = i10;
        this.f40060c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f40058a;
        int i11 = this.f40061d;
        long j10 = this.f40060c;
        e eVar = this.f40059b;
        switch (i10) {
            case 0:
                w wVar = (w) eVar.f39981b;
                int i12 = x.f15050a;
                j5.w wVar2 = (j5.w) ((d0) wVar).f19384a.f19472r;
                j5.b S = wVar2.S(wVar2.f21014d.f21009e);
                wVar2.V(S, 1018, new j5.d(S, i11, j10));
                return;
            default:
                w wVar3 = (w) eVar.f39981b;
                int i13 = x.f15050a;
                j5.w wVar4 = (j5.w) ((d0) wVar3).f19384a.f19472r;
                j5.b S2 = wVar4.S(wVar4.f21014d.f21009e);
                wVar4.V(S2, 1021, new j5.d(S2, j10, i11));
                return;
        }
    }

    public /* synthetic */ t(e eVar, long j10, int i10) {
        this.f40059b = eVar;
        this.f40060c = j10;
        this.f40061d = i10;
    }
}
