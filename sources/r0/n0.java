package r0;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0.m3 f32600a = new t0.a0(m0.f32573b);

    /* renamed from: b, reason: collision with root package name */
    public static final t0.m3 f32601b = new t0.a0(m0.f32574c);

    public static final long a(l0 l0Var, long j10) {
        if (n1.t.d(j10, l0Var.f32529a)) {
            return l0Var.f32530b;
        }
        if (n1.t.d(j10, l0Var.f32534f)) {
            return l0Var.f32535g;
        }
        if (n1.t.d(j10, l0Var.f32538j)) {
            return l0Var.f32539k;
        }
        if (n1.t.d(j10, l0Var.f32542n)) {
            return l0Var.f32543o;
        }
        if (n1.t.d(j10, l0Var.f32551w)) {
            return l0Var.f32552x;
        }
        if (n1.t.d(j10, l0Var.f32531c)) {
            return l0Var.f32532d;
        }
        if (n1.t.d(j10, l0Var.f32536h)) {
            return l0Var.f32537i;
        }
        if (n1.t.d(j10, l0Var.f32540l)) {
            return l0Var.f32541m;
        }
        if (n1.t.d(j10, l0Var.f32553y)) {
            return l0Var.f32554z;
        }
        if (n1.t.d(j10, l0Var.f32549u)) {
            return l0Var.f32550v;
        }
        boolean d10 = n1.t.d(j10, l0Var.f32544p);
        long j11 = l0Var.f32545q;
        if (!d10) {
            if (n1.t.d(j10, l0Var.f32546r)) {
                return l0Var.f32547s;
            }
            if (!n1.t.d(j10, l0Var.D) && !n1.t.d(j10, l0Var.F) && !n1.t.d(j10, l0Var.G) && !n1.t.d(j10, l0Var.H) && !n1.t.d(j10, l0Var.I) && !n1.t.d(j10, l0Var.J)) {
                int i10 = n1.t.f28178j;
                return n1.t.f28177i;
            }
        }
        return j11;
    }

    public static final long b(long j10, t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        long a10 = a((l0) rVar.m(f32600a), j10);
        if (a10 == n1.t.f28177i) {
            return ((n1.t) rVar.m(s0.f32699a)).f28179a;
        }
        return a10;
    }

    public static final long c(l0 l0Var, int i10) {
        if (i10 != 0) {
            switch (i10 - 1) {
                case 0:
                    return l0Var.f32542n;
                case 1:
                    return l0Var.f32551w;
                case 2:
                    return l0Var.f32553y;
                case 3:
                    return l0Var.f32550v;
                case 4:
                    return l0Var.f32533e;
                case 5:
                    return l0Var.f32549u;
                case 6:
                    return l0Var.f32543o;
                case 7:
                    return l0Var.f32552x;
                case 8:
                    return l0Var.f32554z;
                case 9:
                    return l0Var.f32530b;
                case 10:
                    return l0Var.f32532d;
                case 11:
                case 12:
                case 15:
                case 16:
                case 21:
                case 22:
                case 27:
                case 28:
                case 32:
                case 33:
                default:
                    return n1.t.f28177i;
                case 13:
                    return l0Var.f32535g;
                case 14:
                    return l0Var.f32537i;
                case 17:
                    return l0Var.f32545q;
                case 18:
                    return l0Var.f32547s;
                case 19:
                    return l0Var.f32539k;
                case 20:
                    return l0Var.f32541m;
                case 23:
                    return l0Var.A;
                case 24:
                    return l0Var.B;
                case 25:
                    return l0Var.f32529a;
                case 26:
                    return l0Var.f32531c;
                case 29:
                    return l0Var.C;
                case 30:
                    return l0Var.f32534f;
                case 31:
                    return l0Var.f32536h;
                case 34:
                    return l0Var.f32544p;
                case 35:
                    return l0Var.D;
                case 36:
                    return l0Var.F;
                case 37:
                    return l0Var.G;
                case 38:
                    return l0Var.H;
                case 39:
                    return l0Var.I;
                case 40:
                    return l0Var.J;
                case 41:
                    return l0Var.E;
                case 42:
                    return l0Var.f32548t;
                case 43:
                    return l0Var.f32546r;
                case 44:
                    return l0Var.f32538j;
                case 45:
                    return l0Var.f32540l;
            }
        }
        throw null;
    }

    public static final long d(int i10, t0.n nVar) {
        return c((l0) ((t0.r) nVar).m(f32600a), i10);
    }

    public static final long e(l0 l0Var, float f10) {
        if (w2.e.a(f10, 0)) {
            return l0Var.f32544p;
        }
        return androidx.compose.ui.graphics.a.n(n1.t.c(l0Var.f32548t, ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f), l0Var.f32544p);
    }
}
