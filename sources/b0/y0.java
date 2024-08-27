package b0;

import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
public final class y0 extends x0 {

    /* renamed from: n, reason: collision with root package name */
    public int f3040n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3041o;

    @Override // b0.x0
    public final long Q0(a2.l0 l0Var, long j10) {
        int D;
        if (this.f3040n == 1) {
            D = l0Var.z(w2.a.g(j10));
        } else {
            D = l0Var.D(w2.a.g(j10));
        }
        if (D < 0) {
            D = 0;
        }
        if (D >= 0) {
            return hl.f.Q(D, D, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        yk.j.A1("width(" + D + ") must be >= 0");
        throw null;
    }

    @Override // b0.x0
    public final boolean R0() {
        return this.f3041o;
    }

    @Override // b0.x0, c2.c0
    public final int d0(a2.r rVar, a2.q qVar, int i10) {
        if (this.f3040n == 1) {
            return qVar.z(i10);
        }
        return qVar.D(i10);
    }

    @Override // b0.x0, c2.c0
    public final int u0(a2.r rVar, a2.q qVar, int i10) {
        if (this.f3040n == 1) {
            return qVar.z(i10);
        }
        return qVar.D(i10);
    }
}
