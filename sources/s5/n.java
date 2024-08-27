package s5;

import b5.v;
import com.google.android.gms.common.api.Api;
import g5.t;
import r5.u0;
import z5.b0;

/* loaded from: classes.dex */
public final class n extends a {

    /* renamed from: o, reason: collision with root package name */
    public final int f34296o;

    /* renamed from: p, reason: collision with root package name */
    public final v f34297p;

    /* renamed from: q, reason: collision with root package name */
    public long f34298q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34299r;

    public n(g5.f fVar, g5.i iVar, v vVar, int i10, Object obj, long j10, long j11, long j12, int i11, v vVar2) {
        super(fVar, iVar, vVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f34296o = i11;
        this.f34297p = vVar2;
    }

    @Override // s5.a
    public final boolean c() {
        return this.f34299r;
    }

    @Override // v5.m
    public final void e() {
        t tVar = this.f34257i;
        b bVar = this.f34229m;
        yk.j.I0(bVar);
        for (u0 u0Var : bVar.f34232b) {
            if (u0Var.E != 0) {
                u0Var.E = 0L;
                u0Var.f33326z = true;
            }
        }
        b0 a10 = bVar.a(this.f34296o);
        a10.e(this.f34297p);
        try {
            long o10 = tVar.o(this.f34250b.b(this.f34298q));
            if (o10 != -1) {
                o10 += this.f34298q;
            }
            z5.l lVar = new z5.l(this.f34257i, this.f34298q, o10);
            for (int i10 = 0; i10 != -1; i10 = a10.a(lVar, Api.BaseClientBuilder.API_PRIORITY_OTHER, true)) {
                this.f34298q += i10;
            }
            a10.b(this.f34255g, 1, (int) this.f34298q, 0, null);
            vl.b.h(tVar);
            this.f34299r = true;
        } catch (Throwable th2) {
            vl.b.h(tVar);
            throw th2;
        }
    }

    @Override // v5.m
    public final void f() {
    }
}
