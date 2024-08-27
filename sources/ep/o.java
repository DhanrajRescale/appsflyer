package ep;

/* loaded from: classes2.dex */
public final class o extends l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15799c;

    public /* synthetic */ o(Object obj, int i10) {
        this.f15798b = i10;
        this.f15799c = obj;
    }

    @Override // ep.l
    public final void a() {
        switch (this.f15798b) {
            case 0:
                synchronized (((q) this.f15799c).f15808f) {
                    try {
                        if (((q) this.f15799c).f15813k.get() > 0 && ((q) this.f15799c).f15813k.decrementAndGet() > 0) {
                            ((q) this.f15799c).f15804b.k("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        q qVar = (q) this.f15799c;
                        if (qVar.f15815m != null) {
                            qVar.f15804b.k("Unbind from service.", new Object[0]);
                            q qVar2 = (q) this.f15799c;
                            qVar2.f15803a.unbindService(qVar2.f15814l);
                            Object obj = this.f15799c;
                            ((q) obj).f15809g = false;
                            ((q) obj).f15815m = null;
                            ((q) obj).f15814l = null;
                        }
                        ((q) this.f15799c).d();
                        return;
                    } finally {
                    }
                }
            default:
                l7.m mVar = (l7.m) this.f15799c;
                q qVar3 = (q) mVar.f24140b;
                qVar3.f15804b.k("unlinkToDeath", new Object[0]);
                qVar3.f15815m.asBinder().unlinkToDeath(qVar3.f15812j, 0);
                q qVar4 = (q) mVar.f24140b;
                qVar4.f15815m = null;
                qVar4.f15809g = false;
                return;
        }
    }
}
