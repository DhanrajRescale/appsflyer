package b0;

import java.util.List;

/* loaded from: classes.dex */
public final class s1 implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f2998a = new Object();

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        int i10;
        a2.n0 n0;
        int i11 = 0;
        if (w2.a.f(j10)) {
            i10 = w2.a.h(j10);
        } else {
            i10 = 0;
        }
        if (w2.a.e(j10)) {
            i11 = w2.a.g(j10);
        }
        n0 = o0Var.n0(i10, i11, vt.p0.d(), q.f2978f);
        return n0;
    }
}
