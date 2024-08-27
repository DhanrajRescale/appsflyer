package b0;

import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
public final class w0 extends x0 {

    /* renamed from: n, reason: collision with root package name */
    public int f3029n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3030o;

    @Override // b0.x0, c2.c0
    public final int F(a2.r rVar, a2.q qVar, int i10) {
        if (this.f3029n == 1) {
            return qVar.W(i10);
        }
        return qVar.e(i10);
    }

    @Override // b0.x0
    public final long Q0(a2.l0 l0Var, long j10) {
        int e10;
        if (this.f3029n == 1) {
            e10 = l0Var.W(w2.a.h(j10));
        } else {
            e10 = l0Var.e(w2.a.h(j10));
        }
        if (e10 < 0) {
            e10 = 0;
        }
        if (e10 >= 0) {
            return hl.f.Q(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, e10, e10);
        }
        yk.j.A1("height(" + e10 + ") must be >= 0");
        throw null;
    }

    @Override // b0.x0
    public final boolean R0() {
        return this.f3030o;
    }

    @Override // b0.x0, c2.c0
    public final int l(a2.r rVar, a2.q qVar, int i10) {
        if (this.f3029n == 1) {
            return qVar.W(i10);
        }
        return qVar.e(i10);
    }
}
