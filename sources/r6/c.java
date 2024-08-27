package r6;

import e5.x;
import z5.q;
import z5.t;
import z5.u;
import z5.y;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public u f33359a;

    /* renamed from: b, reason: collision with root package name */
    public tr.e f33360b;

    /* renamed from: c, reason: collision with root package name */
    public long f33361c;

    /* renamed from: d, reason: collision with root package name */
    public long f33362d;

    @Override // r6.h
    public final long B(q qVar) {
        long j10 = this.f33362d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f33362d = -1L;
        return j11;
    }

    @Override // r6.h
    public final y r() {
        boolean z10;
        if (this.f33361c != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        return new t(this.f33359a, 0, this.f33361c);
    }

    @Override // r6.h
    public final void z(long j10) {
        long[] jArr = (long[]) this.f33360b.f36361b;
        this.f33362d = jArr[x.f(jArr, j10, true)];
    }
}
