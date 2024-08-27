package b0;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c2 extends g1.n implements c2.c0 {

    /* renamed from: n, reason: collision with root package name */
    public int f2843n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2844o;

    /* renamed from: p, reason: collision with root package name */
    public Function2 f2845p;

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        int j11;
        int h10;
        a2.n0 n0;
        int i10 = 0;
        if (this.f2843n != 1) {
            j11 = 0;
        } else {
            j11 = w2.a.j(j10);
        }
        if (this.f2843n == 2) {
            i10 = w2.a.i(j10);
        }
        int i11 = this.f2843n;
        int i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i11 != 1 && this.f2844o) {
            h10 = Integer.MAX_VALUE;
        } else {
            h10 = w2.a.h(j10);
        }
        if (this.f2843n == 2 || !this.f2844o) {
            i12 = w2.a.g(j10);
        }
        a2.a1 E = l0Var.E(hl.f.b(j11, h10, i10, i12));
        int f10 = kotlin.ranges.d.f(E.f29a, w2.a.j(j10), w2.a.h(j10));
        int f11 = kotlin.ranges.d.f(E.f30b, w2.a.i(j10), w2.a.g(j10));
        n0 = o0Var.n0(f10, f11, vt.p0.d(), new b2(this, f10, E, f11, o0Var));
        return n0;
    }
}
