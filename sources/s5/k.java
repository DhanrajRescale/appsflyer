package s5;

import b5.v;
import g5.t;
import r5.u0;

/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: o, reason: collision with root package name */
    public final int f34286o;

    /* renamed from: p, reason: collision with root package name */
    public final long f34287p;

    /* renamed from: q, reason: collision with root package name */
    public final g f34288q;

    /* renamed from: r, reason: collision with root package name */
    public long f34289r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f34290s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f34291t;

    public k(g5.f fVar, g5.i iVar, v vVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, g gVar) {
        super(fVar, iVar, vVar, i10, obj, j10, j11, j12, j13, j14);
        this.f34286o = i11;
        this.f34287p = j15;
        this.f34288q = gVar;
    }

    @Override // s5.a
    public final long b() {
        return this.f34226j + this.f34286o;
    }

    @Override // s5.a
    public final boolean c() {
        return this.f34291t;
    }

    @Override // v5.m
    public final void e() {
        boolean z10;
        long j10;
        if (this.f34289r == 0) {
            b bVar = this.f34229m;
            yk.j.I0(bVar);
            long j11 = this.f34287p;
            for (u0 u0Var : bVar.f34232b) {
                if (u0Var.E != j11) {
                    u0Var.E = j11;
                    u0Var.f33326z = true;
                }
            }
            g gVar = this.f34288q;
            long j12 = this.f34227k;
            long j13 = -9223372036854775807L;
            if (j12 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j12 - this.f34287p;
            }
            long j14 = this.f34228l;
            if (j14 != -9223372036854775807L) {
                j13 = j14 - this.f34287p;
            }
            ((d) gVar).a(bVar, j10, j13);
        }
        try {
            g5.i b10 = this.f34250b.b(this.f34289r);
            t tVar = this.f34257i;
            z5.l lVar = new z5.l(tVar, b10.f16574f, tVar.o(b10));
            while (!this.f34290s) {
                try {
                    int e10 = ((d) this.f34288q).f34240a.e(lVar, d.f34239j);
                    if (e10 != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yk.j.H0(z10);
                    if (e10 != 0) {
                        break;
                    }
                } finally {
                    this.f34289r = lVar.f42106d - this.f34250b.f16574f;
                }
            }
            vl.b.h(this.f34257i);
            this.f34291t = !this.f34290s;
        } catch (Throwable th2) {
            vl.b.h(this.f34257i);
            throw th2;
        }
    }

    @Override // v5.m
    public final void f() {
        this.f34290s = true;
    }
}
