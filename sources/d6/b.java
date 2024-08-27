package d6;

import b4.l;
import z5.o;
import z5.p;
import z5.q;
import z5.r;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final e5.p f13931a = new e5.p(4);

    /* renamed from: b, reason: collision with root package name */
    public final e5.p f13932b = new e5.p(9);

    /* renamed from: c, reason: collision with root package name */
    public final e5.p f13933c = new e5.p(11);

    /* renamed from: d, reason: collision with root package name */
    public final e5.p f13934d = new e5.p();

    /* renamed from: e, reason: collision with root package name */
    public final c f13935e;

    /* renamed from: f, reason: collision with root package name */
    public r f13936f;

    /* renamed from: g, reason: collision with root package name */
    public int f13937g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13938h;

    /* renamed from: i, reason: collision with root package name */
    public long f13939i;

    /* renamed from: j, reason: collision with root package name */
    public int f13940j;

    /* renamed from: k, reason: collision with root package name */
    public int f13941k;

    /* renamed from: l, reason: collision with root package name */
    public int f13942l;

    /* renamed from: m, reason: collision with root package name */
    public long f13943m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13944n;

    /* renamed from: o, reason: collision with root package name */
    public a f13945o;

    /* renamed from: p, reason: collision with root package name */
    public d f13946p;

    /* JADX WARN: Type inference failed for: r0v4, types: [d6.c, b4.l] */
    public b() {
        ?? lVar = new l(new o(), 2);
        lVar.f13947c = -9223372036854775807L;
        lVar.f13948d = new long[0];
        lVar.f13949e = new long[0];
        this.f13935e = lVar;
        this.f13937g = 1;
    }

    public final e5.p a(q qVar) {
        int i10 = this.f13942l;
        e5.p pVar = this.f13934d;
        byte[] bArr = pVar.f15036a;
        if (i10 > bArr.length) {
            pVar.D(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            pVar.F(0);
        }
        pVar.E(this.f13942l);
        qVar.readFully(pVar.f15036a, 0, this.f13942l);
        return pVar;
    }

    @Override // z5.p
    public final void d(r rVar) {
        this.f13936f = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v7, types: [d6.a, b4.l] */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(z5.q r17, mj.b r18) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.b.e(z5.q, mj.b):int");
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        if (j10 == 0) {
            this.f13937g = 1;
            this.f13938h = false;
        } else {
            this.f13937g = 3;
        }
        this.f13940j = 0;
    }

    @Override // z5.p
    public final boolean g(q qVar) {
        e5.p pVar = this.f13931a;
        z5.l lVar = (z5.l) qVar;
        lVar.b(pVar.f15036a, 0, 3, false);
        pVar.F(0);
        if (pVar.w() != 4607062) {
            return false;
        }
        lVar.b(pVar.f15036a, 0, 2, false);
        pVar.F(0);
        if ((pVar.z() & 250) != 0) {
            return false;
        }
        lVar.b(pVar.f15036a, 0, 4, false);
        pVar.F(0);
        int g10 = pVar.g();
        lVar.f42108f = 0;
        lVar.k(g10, false);
        lVar.b(pVar.f15036a, 0, 4, false);
        pVar.F(0);
        if (pVar.g() != 0) {
            return false;
        }
        return true;
    }

    @Override // z5.p
    public final void release() {
    }
}
