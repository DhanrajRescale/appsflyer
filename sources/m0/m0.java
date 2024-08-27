package m0;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0.i1 f26467a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26468b = 64;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26469c = 36;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26470d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final b0.i1 f26471e;

    static {
        float f10 = 16;
        float f11 = 8;
        f26467a = new b0.i1(f10, f11, f10, f11);
        f26471e = new b0.i1(f11, f11, f11, f11);
    }

    public static f1 a(long j10, long j11, t0.n nVar, int i10, int i11) {
        long j12;
        long j13;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1870371134);
        if ((i11 & 1) != 0) {
            j10 = ((v0) rVar.m(x0.f27075a)).c();
        }
        long j14 = j10;
        if ((i11 & 2) != 0) {
            j11 = x0.a(j14, rVar);
        }
        long j15 = j11;
        if ((i11 & 4) != 0) {
            t0.m3 m3Var = x0.f27075a;
            j12 = androidx.compose.ui.graphics.a.n(n1.t.c(((v0) rVar.m(m3Var)).b(), 0.12f), ((v0) rVar.m(m3Var)).d());
        } else {
            j12 = 0;
        }
        if ((i11 & 8) != 0) {
            j13 = n1.t.c(((v0) rVar.m(x0.f27075a)).b(), vl.b.r(rVar));
        } else {
            j13 = 0;
        }
        f1 f1Var = new f1(j14, j15, j12, j13);
        rVar.s(false);
        return f1Var;
    }

    public static x.d0 b(t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-2091313033);
        x.d0 a10 = androidx.compose.foundation.a.a(n1.t.c(((v0) rVar.m(x0.f27075a)).b(), 0.12f), f26470d);
        rVar.s(false);
        return a10;
    }

    public static f1 c(long j10, t0.n nVar, int i10) {
        long j11;
        long j12;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(182742216);
        long j13 = 0;
        if ((i10 & 1) != 0) {
            j11 = n1.t.f28176h;
        } else {
            j11 = 0;
        }
        if ((i10 & 2) != 0) {
            j12 = ((v0) rVar.m(x0.f27075a)).c();
        } else {
            j12 = j10;
        }
        if ((i10 & 4) != 0) {
            j13 = n1.t.c(((v0) rVar.m(x0.f27075a)).b(), vl.b.r(rVar));
        }
        f1 f1Var = new f1(j11, j12, j11, j13);
        rVar.s(false);
        return f1Var;
    }
}
