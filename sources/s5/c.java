package s5;

import b5.v;
import e5.p;
import e5.x;
import z5.a0;
import z5.b0;
import z5.o;

/* loaded from: classes.dex */
public final class c implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f34233a;

    /* renamed from: b, reason: collision with root package name */
    public final v f34234b;

    /* renamed from: c, reason: collision with root package name */
    public final o f34235c = new o();

    /* renamed from: d, reason: collision with root package name */
    public v f34236d;

    /* renamed from: e, reason: collision with root package name */
    public b0 f34237e;

    /* renamed from: f, reason: collision with root package name */
    public long f34238f;

    public c(int i10, int i11, v vVar) {
        this.f34233a = i11;
        this.f34234b = vVar;
    }

    @Override // z5.b0
    public final int a(b5.o oVar, int i10, boolean z10) {
        b0 b0Var = this.f34237e;
        int i11 = x.f15050a;
        return b0Var.d(oVar, i10, z10);
    }

    @Override // z5.b0
    public final void b(long j10, int i10, int i11, int i12, a0 a0Var) {
        long j11 = this.f34238f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f34237e = this.f34235c;
        }
        b0 b0Var = this.f34237e;
        int i13 = x.f15050a;
        b0Var.b(j10, i10, i11, i12, a0Var);
    }

    @Override // z5.b0
    public final void c(int i10, p pVar) {
        b0 b0Var = this.f34237e;
        int i11 = x.f15050a;
        b0Var.f(i10, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    @Override // z5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(b5.v r21) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.c.e(b5.v):void");
    }
}
