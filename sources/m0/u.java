package m0;

/* loaded from: classes.dex */
public final class u implements y.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26867b;

    public /* synthetic */ u(Object obj, int i10) {
        this.f26866a = i10;
        this.f26867b = obj;
    }

    @Override // y.n0
    public final void b(float f10) {
        int i10 = this.f26866a;
        Object obj = this.f26867b;
        switch (i10) {
            case 0:
                y yVar = (y) obj;
                s sVar = yVar.f27127n;
                float f11 = yVar.f(f10);
                y yVar2 = sVar.f26751a;
                yVar2.f27123j.j(f11);
                yVar2.f27124k.j(s0.g.f34069a);
                return;
            default:
                r0.t tVar = (r0.t) obj;
                r0.p pVar = tVar.f32728m;
                float f12 = tVar.f(f10);
                r0.t tVar2 = pVar.f32664a;
                tVar2.f32724i.j(f12);
                tVar2.f32725j.j(s0.g.f34069a);
                return;
        }
    }
}
