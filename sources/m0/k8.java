package m0;

/* loaded from: classes.dex */
public final class k8 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f26425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.k f26428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(a0.k kVar, s1 s1Var, boolean z10, boolean z11) {
        super(3);
        this.f26425a = s1Var;
        this.f26426b = z10;
        this.f26427c = z11;
        this.f26428d = kVar;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z10;
        long j10;
        t3 t3Var = (t3) obj;
        ((Number) obj3).intValue();
        t0.r rVar = (t0.r) ((t0.n) obj2);
        rVar.b0(697243846);
        if (t3Var == t3.f26835b) {
            z10 = false;
        } else {
            z10 = this.f26427c;
        }
        s1 s1Var = this.f26425a;
        s1Var.getClass();
        rVar.b0(727091888);
        t0.g1 m10 = qu.i0.m(this.f26428d, rVar, 0);
        if (!this.f26426b) {
            j10 = s1Var.f26774r;
        } else if (z10) {
            j10 = s1Var.f26775s;
        } else if (((Boolean) m10.getValue()).booleanValue()) {
            j10 = s1Var.f26772p;
        } else {
            j10 = s1Var.f26773q;
        }
        t0.g1 r02 = t0.t.r0(new n1.t(j10), rVar);
        rVar.s(false);
        long j11 = ((n1.t) r02.getValue()).f28179a;
        rVar.s(false);
        return new n1.t(j11);
    }
}
