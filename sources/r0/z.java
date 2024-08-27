package r0;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final b0.i1 f32821a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f32822b = 58;

    /* renamed from: c, reason: collision with root package name */
    public static final float f32823c = 40;

    static {
        float f10 = 24;
        float f11 = 8;
        f32821a = new b0.i1(f10, f11, f10, f11);
        float f12 = s0.e.f34052a;
    }

    public static y a(long j10, long j11, t0.n nVar, int i10) {
        long j12;
        long j13;
        long j14;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-339300779);
        if ((i10 & 1) != 0) {
            j12 = n1.t.f28177i;
        } else {
            j12 = j10;
        }
        if ((i10 & 2) != 0) {
            j13 = n1.t.f28177i;
        } else {
            j13 = j11;
        }
        long j15 = 0;
        if ((i10 & 4) != 0) {
            j14 = n1.t.f28177i;
        } else {
            j14 = 0;
        }
        if ((i10 & 8) != 0) {
            j15 = n1.t.f28177i;
        }
        y b10 = b((l0) rVar.m(n0.f32600a));
        long j16 = n1.t.f28177i;
        if (j12 == j16) {
            j12 = b10.f32810a;
        }
        long j17 = j12;
        if (j13 == j16) {
            j13 = b10.f32811b;
        }
        long j18 = j13;
        if (j14 == j16) {
            j14 = b10.f32812c;
        }
        long j19 = j14;
        if (j15 == j16) {
            j15 = b10.f32813d;
        }
        y yVar = new y(j17, j18, j19, j15);
        rVar.s(false);
        return yVar;
    }

    public static y b(l0 l0Var) {
        y yVar = l0Var.K;
        if (yVar == null) {
            float f10 = s0.e.f34052a;
            y yVar2 = new y(n0.c(l0Var, 26), n0.c(l0Var, s0.e.f34059h), n1.t.c(n0.c(l0Var, s0.e.f34054c), 0.12f), n1.t.c(n0.c(l0Var, s0.e.f34056e), 0.38f));
            l0Var.K = yVar2;
            return yVar2;
        }
        return yVar;
    }
}
