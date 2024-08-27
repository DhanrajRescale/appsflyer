package l5;

import b5.v;
import e5.x;
import r5.v0;

/* loaded from: classes.dex */
public final class o implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f24071a;

    /* renamed from: c, reason: collision with root package name */
    public long[] f24073c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24074d;

    /* renamed from: e, reason: collision with root package name */
    public m5.g f24075e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24076f;

    /* renamed from: g, reason: collision with root package name */
    public int f24077g;

    /* renamed from: b, reason: collision with root package name */
    public final tr.e f24072b = new tr.e(17);

    /* renamed from: h, reason: collision with root package name */
    public long f24078h = -9223372036854775807L;

    public o(m5.g gVar, v vVar, boolean z10) {
        this.f24071a = vVar;
        this.f24075e = gVar;
        this.f24073c = gVar.f27544b;
        a(gVar, z10);
    }

    public final void a(m5.g gVar, boolean z10) {
        long j10;
        int i10 = this.f24077g;
        long j11 = -9223372036854775807L;
        if (i10 == 0) {
            j10 = -9223372036854775807L;
        } else {
            j10 = this.f24073c[i10 - 1];
        }
        this.f24074d = z10;
        this.f24075e = gVar;
        long[] jArr = gVar.f27544b;
        this.f24073c = jArr;
        long j12 = this.f24078h;
        if (j12 != -9223372036854775807L) {
            int b10 = x.b(jArr, j12, true);
            this.f24077g = b10;
            if (this.f24074d && b10 == this.f24073c.length) {
                j11 = j12;
            }
            this.f24078h = j11;
            return;
        }
        if (j10 != -9223372036854775807L) {
            this.f24077g = x.b(jArr, j10, false);
        }
    }

    @Override // r5.v0
    public final void c() {
    }

    @Override // r5.v0
    public final boolean d() {
        return true;
    }

    @Override // r5.v0
    public final int e(long j10) {
        int max = Math.max(this.f24077g, x.b(this.f24073c, j10, true));
        int i10 = max - this.f24077g;
        this.f24077g = max;
        return i10;
    }

    @Override // r5.v0
    public final int f(tr.e eVar, h5.f fVar, int i10) {
        boolean z10;
        int i11 = this.f24077g;
        if (i11 == this.f24073c.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f24074d) {
            fVar.f17988b = 4;
            return -4;
        }
        if ((i10 & 2) == 0 && this.f24076f) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.f24077g = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] r10 = this.f24072b.r(this.f24075e.f27543a[i11]);
                fVar.k(r10.length);
                fVar.f18002d.put(r10);
            }
            fVar.f18004f = this.f24073c[i11];
            fVar.f17988b = 1;
            return -4;
        }
        eVar.f36362c = this.f24071a;
        this.f24076f = true;
        return -5;
    }
}
