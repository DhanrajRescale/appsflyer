package m0;

/* loaded from: classes.dex */
public final class t1 implements n1.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26833b;

    public /* synthetic */ t1(Object obj, int i10) {
        this.f26832a = i10;
        this.f26833b = obj;
    }

    @Override // n1.x
    public final long a() {
        int i10 = this.f26832a;
        Object obj = this.f26833b;
        switch (i10) {
            case 0:
                v1 v1Var = (v1) obj;
                long a10 = v1Var.f26934s.a();
                if (a10 == 16) {
                    long j10 = ((m5) c2.g.p(v1Var, n5.f26535b)).f26493b;
                    if (j10 == 16) {
                        long j11 = ((n1.t) c2.g.p(v1Var, e1.f26084a)).f28179a;
                        boolean e10 = ((v0) c2.g.p(v1Var, x0.f27075a)).e();
                        float t10 = androidx.compose.ui.graphics.a.t(j11);
                        if (!e10 && t10 < 0.5d) {
                            return n1.t.f28173e;
                        }
                        return j11;
                    }
                    return j10;
                }
                return a10;
            default:
                return ((o5) obj).f26585c;
        }
    }
}
