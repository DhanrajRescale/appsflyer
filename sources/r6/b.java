package r6;

import e5.x;
import z5.y;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final g f33347a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33348b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33349c;

    /* renamed from: d, reason: collision with root package name */
    public final j f33350d;

    /* renamed from: e, reason: collision with root package name */
    public int f33351e;

    /* renamed from: f, reason: collision with root package name */
    public long f33352f;

    /* renamed from: g, reason: collision with root package name */
    public long f33353g;

    /* renamed from: h, reason: collision with root package name */
    public long f33354h;

    /* renamed from: i, reason: collision with root package name */
    public long f33355i;

    /* renamed from: j, reason: collision with root package name */
    public long f33356j;

    /* renamed from: k, reason: collision with root package name */
    public long f33357k;

    /* renamed from: l, reason: collision with root package name */
    public long f33358l;

    public b(j jVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        yk.j.E0(z11);
        this.f33350d = jVar;
        this.f33348b = j10;
        this.f33349c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f33351e = 0;
        } else {
            this.f33352f = j13;
            this.f33351e = 4;
        }
        this.f33347a = new g();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    @Override // r6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long B(z5.q r25) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.b.B(z5.q):long");
    }

    @Override // r6.h
    public final y r() {
        if (this.f33352f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // r6.h
    public final void z(long j10) {
        this.f33354h = x.j(j10, 0L, this.f33352f - 1);
        this.f33351e = 2;
        this.f33355i = this.f33348b;
        this.f33356j = this.f33349c;
        this.f33357k = 0L;
        this.f33358l = this.f33352f;
    }
}
