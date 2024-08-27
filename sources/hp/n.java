package hp;

/* loaded from: classes2.dex */
public final class n extends l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18647f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18648g;

    public /* synthetic */ n(Object obj, int i10) {
        this.f18647f = i10;
        this.f18648g = obj;
    }

    @Override // hp.l
    public final void b() {
        int i10 = this.f18647f;
        Object obj = this.f18648g;
        switch (i10) {
            case 0:
                o oVar = (o) obj;
                if (oVar.f18662m != null) {
                    oVar.f18651b.a("Unbind from service.", new Object[0]);
                    oVar.f18650a.unbindService(oVar.f18661l);
                    oVar.f18656g = false;
                    oVar.f18662m = null;
                    oVar.f18661l = null;
                }
                oVar.b();
                return;
            default:
                l7.m mVar = (l7.m) obj;
                o oVar2 = (o) mVar.f24140b;
                oVar2.f18651b.a("unlinkToDeath", new Object[0]);
                oVar2.f18662m.asBinder().unlinkToDeath(oVar2.f18659j, 0);
                o oVar3 = (o) mVar.f24140b;
                oVar3.f18662m = null;
                oVar3.f18656g = false;
                return;
        }
    }
}
