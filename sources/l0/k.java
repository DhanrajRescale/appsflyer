package l0;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class k implements z2.t {

    /* renamed from: a, reason: collision with root package name */
    public final l f23780a;

    /* renamed from: b, reason: collision with root package name */
    public final n f23781b;

    /* renamed from: c, reason: collision with root package name */
    public long f23782c;

    public k(l lVar, n nVar) {
        this.f23780a = lVar;
        this.f23781b = nVar;
        int i10 = m1.c.f27236e;
        this.f23782c = m1.c.f27233b;
    }

    @Override // z2.t
    public final long a(w2.i iVar, long j10, w2.k kVar, long j11) {
        int i10;
        long a10 = this.f23781b.a();
        if (!t0.t.e0(a10)) {
            a10 = this.f23782c;
        }
        this.f23782c = a10;
        int ordinal = this.f23780a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i10 = ((int) (j11 >> 32)) / 2;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i10 = (int) (j11 >> 32);
            }
        } else {
            i10 = 0;
        }
        long j12 = hl.f.j(Math.round(m1.c.d(a10)), Math.round(m1.c.e(a10)));
        int i11 = iVar.f38794a;
        int i12 = w2.h.f38792c;
        return hl.f.j((i11 + ((int) (j12 >> 32))) - i10, iVar.f38795b + ((int) (j12 & 4294967295L)));
    }
}
