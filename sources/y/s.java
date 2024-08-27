package y;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends g1.n implements f0.h, c2.b0 {

    /* renamed from: n, reason: collision with root package name */
    public g1 f40922n;

    /* renamed from: o, reason: collision with root package name */
    public d2 f40923o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f40924p;

    /* renamed from: q, reason: collision with root package name */
    public o f40925q;

    /* renamed from: s, reason: collision with root package name */
    public a2.u f40927s;

    /* renamed from: t, reason: collision with root package name */
    public a2.u f40928t;

    /* renamed from: u, reason: collision with root package name */
    public m1.d f40929u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40930v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f40932x;

    /* renamed from: y, reason: collision with root package name */
    public final l3 f40933y;

    /* renamed from: r, reason: collision with root package name */
    public final l f40926r = new l();

    /* renamed from: w, reason: collision with root package name */
    public long f40931w = 0;

    public s(g1 g1Var, d2 d2Var, boolean z10, o oVar) {
        this.f40922n = g1Var;
        this.f40923o = d2Var;
        this.f40924p = z10;
        this.f40925q = oVar;
        this.f40933y = new l3(this.f40925q.b());
    }

    public static final float Q0(s sVar) {
        m1.d dVar;
        float a10;
        int compare;
        if (w2.j.a(sVar.f40931w, 0L)) {
            return s0.g.f34069a;
        }
        v0.h hVar = sVar.f40926r.f40834a;
        int i10 = hVar.f37655c;
        m1.d dVar2 = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = hVar.f37653a;
            dVar = null;
            while (true) {
                m1.d dVar3 = (m1.d) ((p) objArr[i11]).f40880a.mo2invoke();
                if (dVar3 != null) {
                    long j10 = t0.t.j(dVar3.c(), dVar3.b());
                    long i12 = hl.f.i1(sVar.f40931w);
                    int ordinal = sVar.f40922n.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            compare = Float.compare(m1.f.e(j10), m1.f.e(i12));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        compare = Float.compare(m1.f.c(j10), m1.f.c(i12));
                    }
                    if (compare <= 0) {
                        dVar = dVar3;
                    } else if (dVar == null) {
                        dVar = dVar3;
                    }
                }
                i11--;
                if (i11 < 0) {
                    break;
                }
            }
        } else {
            dVar = null;
        }
        if (dVar == null) {
            if (sVar.f40930v) {
                dVar2 = sVar.R0();
            }
            if (dVar2 == null) {
                return s0.g.f34069a;
            }
            dVar = dVar2;
        }
        long i13 = hl.f.i1(sVar.f40931w);
        int ordinal2 = sVar.f40922n.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                o oVar = sVar.f40925q;
                float f10 = dVar.f27241c;
                float f11 = dVar.f27239a;
                a10 = oVar.a(f11, f10 - f11, m1.f.e(i13));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            o oVar2 = sVar.f40925q;
            float f12 = dVar.f27242d;
            float f13 = dVar.f27240b;
            a10 = oVar2.a(f13, f12 - f13, m1.f.c(i13));
        }
        return a10;
    }

    public final m1.d R0() {
        a2.u uVar;
        a2.u uVar2 = this.f40927s;
        if (uVar2 != null) {
            if (!uVar2.m()) {
                uVar2 = null;
            }
            if (uVar2 != null && (uVar = this.f40928t) != null) {
                if (!uVar.m()) {
                    uVar = null;
                }
                if (uVar != null) {
                    return uVar2.i(uVar, false);
                }
            }
        }
        return null;
    }

    public final boolean S0(long j10, m1.d dVar) {
        long U0 = U0(j10, dVar);
        if (Math.abs(m1.c.d(U0)) <= 0.5f && Math.abs(m1.c.e(U0)) <= 0.5f) {
            return true;
        }
        return false;
    }

    public final void T0() {
        if (!this.f40932x) {
            yk.g.H(E0(), null, qu.g0.f32208d, new r(this, null), 1);
            return;
        }
        throw new IllegalStateException("launchAnimation called when previous animation was running".toString());
    }

    public final long U0(long j10, m1.d dVar) {
        long i12 = hl.f.i1(j10);
        int ordinal = this.f40922n.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                o oVar = this.f40925q;
                float f10 = dVar.f27241c;
                float f11 = dVar.f27239a;
                return t0.t.g(oVar.a(f11, f10 - f11, m1.f.e(i12)), s0.g.f34069a);
            }
            throw new NoWhenBranchMatchedException();
        }
        o oVar2 = this.f40925q;
        float f12 = dVar.f27242d;
        float f13 = dVar.f27240b;
        return t0.t.g(s0.g.f34069a, oVar2.a(f13, f12 - f13, m1.f.c(i12)));
    }

    @Override // c2.b0
    public final void g0(c2.i1 i1Var) {
        this.f40927s = i1Var;
    }

    @Override // c2.b0
    public final void m(long j10) {
        int f10;
        m1.d R0;
        long j11 = this.f40931w;
        this.f40931w = j10;
        int ordinal = this.f40922n.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                f10 = Intrinsics.f((int) (j10 >> 32), (int) (j11 >> 32));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            f10 = Intrinsics.f((int) (j10 & 4294967295L), (int) (4294967295L & j11));
        }
        if (f10 < 0 && (R0 = R0()) != null) {
            m1.d dVar = this.f40929u;
            if (dVar == null) {
                dVar = R0;
            }
            if (!this.f40932x && !this.f40930v && S0(j11, dVar) && !S0(j10, R0)) {
                this.f40930v = true;
                T0();
            }
            this.f40929u = R0;
        }
    }
}
