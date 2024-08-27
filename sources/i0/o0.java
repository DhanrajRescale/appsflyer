package i0;

/* loaded from: classes.dex */
public final class o0 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p2.v f19081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2.c0 f19083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f19084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1 f19085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p2.v vVar, boolean z10, p2.c0 c0Var, l0.v0 v0Var, q1 q1Var) {
        super(3);
        this.f19081a = vVar;
        this.f19082b = z10;
        this.f19083c = c0Var;
        this.f19084d = v0Var;
        this.f19085e = q1Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        p2.v vVar = this.f19081a;
        if (!booleanValue) {
            intValue = vVar.a(intValue);
        }
        if (!booleanValue) {
            intValue2 = vVar.a(intValue2);
        }
        boolean z10 = false;
        if (this.f19082b) {
            p2.c0 c0Var = this.f19083c;
            long j10 = c0Var.f30523b;
            int i10 = j2.f0.f20711c;
            if (intValue != ((int) (j10 >> 32)) || intValue2 != ((int) (j10 & 4294967295L))) {
                int min = Math.min(intValue, intValue2);
                a1 a1Var = a1.f18782a;
                l0.v0 v0Var = this.f19084d;
                if (min >= 0) {
                    int max = Math.max(intValue, intValue2);
                    j2.e eVar = c0Var.f30522a;
                    if (max <= eVar.f20699a.length()) {
                        if (!booleanValue && intValue != intValue2) {
                            v0Var.h(true);
                        } else {
                            v0Var.r(false);
                            v0Var.o(a1Var);
                        }
                        this.f19085e.f19153t.invoke(new p2.c0(eVar, d2.w0.b(intValue, intValue2), (j2.f0) null));
                        z10 = true;
                    }
                }
                v0Var.r(false);
                v0Var.o(a1Var);
            }
        }
        return Boolean.valueOf(z10);
    }
}
