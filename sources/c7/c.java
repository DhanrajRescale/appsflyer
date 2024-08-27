package c7;

import androidx.media3.common.ParserException;
import b5.u;
import b5.v;
import e5.x;
import k3.o;
import z5.b0;
import z5.q;
import z5.r;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final r f8029a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f8030b;

    /* renamed from: c, reason: collision with root package name */
    public final o f8031c;

    /* renamed from: d, reason: collision with root package name */
    public final v f8032d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8033e;

    /* renamed from: f, reason: collision with root package name */
    public long f8034f;

    /* renamed from: g, reason: collision with root package name */
    public int f8035g;

    /* renamed from: h, reason: collision with root package name */
    public long f8036h;

    public c(r rVar, b0 b0Var, o oVar, String str, int i10) {
        this.f8029a = rVar;
        this.f8030b = b0Var;
        this.f8031c = oVar;
        int i11 = (oVar.f22018a * oVar.f22021d) / 8;
        int i12 = oVar.f22020c;
        if (i12 == i11) {
            int i13 = oVar.f22019b;
            int i14 = i13 * i11;
            int i15 = i14 * 8;
            int max = Math.max(i11, i14 / 10);
            this.f8033e = max;
            u uVar = new u();
            uVar.f3600k = str;
            uVar.f3595f = i15;
            uVar.f3596g = i15;
            uVar.f3601l = max;
            uVar.f3613x = oVar.f22018a;
            uVar.f3614y = i13;
            uVar.f3615z = i10;
            this.f8032d = new v(uVar);
            return;
        }
        throw ParserException.a("Expected block size: " + i11 + "; got: " + i12, null);
    }

    @Override // c7.b
    public final void a(long j10) {
        this.f8034f = j10;
        this.f8035g = 0;
        this.f8036h = 0L;
    }

    @Override // c7.b
    public final boolean b(q qVar, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.f8035g) < (i11 = this.f8033e)) {
            int a10 = this.f8030b.a(qVar, (int) Math.min(i11 - i10, j11), true);
            if (a10 == -1) {
                j11 = 0;
            } else {
                this.f8035g += a10;
                j11 -= a10;
            }
        }
        int i12 = this.f8031c.f22020c;
        int i13 = this.f8035g / i12;
        if (i13 > 0) {
            long L = this.f8034f + x.L(this.f8036h, 1000000L, r1.f22019b);
            int i14 = i13 * i12;
            int i15 = this.f8035g - i14;
            this.f8030b.b(L, 1, i14, i15, null);
            this.f8036h += i13;
            this.f8035g = i15;
        }
        if (j11 <= 0) {
            return true;
        }
        return false;
    }

    @Override // c7.b
    public final void c(int i10, long j10) {
        this.f8029a.d(new e(this.f8031c, 1, i10, j10));
        this.f8030b.e(this.f8032d);
    }
}
