package k5;

import in.juspay.services.HyperServices;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22128c;

    public /* synthetic */ j(Object obj, int i10, long j10) {
        this.f22126a = i10;
        this.f22128c = obj;
        this.f22127b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22126a;
        long j10 = this.f22127b;
        Object obj = this.f22128c;
        switch (i10) {
            case 0:
                i5.d0 d0Var = (i5.d0) ((tr.e) obj).f36362c;
                int i11 = e5.x.f15050a;
                j5.w wVar = (j5.w) d0Var.f19384a.f19472r;
                j5.b U = wVar.U();
                wVar.V(U, 1010, new j5.j(U, 0, j10));
                return;
            default:
                ((HyperServices) obj).lambda$terminate$7(j10);
                return;
        }
    }
}
