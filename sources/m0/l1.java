package m0;

/* loaded from: classes.dex */
public final class l1 implements t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f26444a = new Object();

    public final long a(long j10, float f10, t0.n nVar, int i10) {
        v0 v0Var = (v0) ((t0.r) nVar).m(x0.f27075a);
        if (Float.compare(f10, 0) > 0 && !v0Var.e()) {
            t0.m3 m3Var = u2.f26875a;
            return androidx.compose.ui.graphics.a.n(n1.t.c(x0.a(j10, nVar), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f), j10);
        }
        return j10;
    }
}
