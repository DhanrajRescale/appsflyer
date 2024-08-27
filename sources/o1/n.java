package o1;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f29417b;

    public /* synthetic */ n(r rVar, int i10) {
        this.f29416a = i10;
        this.f29417b = rVar;
    }

    @Override // o1.j
    public final double h(double d10) {
        int i10 = this.f29416a;
        r rVar = this.f29417b;
        switch (i10) {
            case 0:
                return kotlin.ranges.d.d(rVar.f29432k.h(d10), rVar.f29426e, rVar.f29427f);
            default:
                return rVar.f29435n.h(kotlin.ranges.d.d(d10, rVar.f29426e, rVar.f29427f));
        }
    }
}
