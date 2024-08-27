package b6;

import ck.i;
import e5.x;
import z5.p;
import z5.q;
import z5.r;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: c, reason: collision with root package name */
    public int f3707c;

    /* renamed from: e, reason: collision with root package name */
    public c f3709e;

    /* renamed from: h, reason: collision with root package name */
    public long f3712h;

    /* renamed from: i, reason: collision with root package name */
    public e f3713i;

    /* renamed from: m, reason: collision with root package name */
    public int f3717m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3718n;

    /* renamed from: a, reason: collision with root package name */
    public final e5.p f3705a = new e5.p(12);

    /* renamed from: b, reason: collision with root package name */
    public final i f3706b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public r f3708d = new yq.b(0);

    /* renamed from: g, reason: collision with root package name */
    public e[] f3711g = new e[0];

    /* renamed from: k, reason: collision with root package name */
    public long f3715k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f3716l = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f3714j = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f3710f = -9223372036854775807L;

    @Override // z5.p
    public final void d(r rVar) {
        this.f3707c = 0;
        this.f3708d = rVar;
        this.f3712h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(z5.q r22, mj.b r23) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.e(z5.q, mj.b):int");
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        this.f3712h = -1L;
        this.f3713i = null;
        for (e eVar : this.f3711g) {
            if (eVar.f3736j == 0) {
                eVar.f3734h = 0;
            } else {
                eVar.f3734h = eVar.f3738l[x.f(eVar.f3737k, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f3711g.length == 0) {
                this.f3707c = 0;
                return;
            } else {
                this.f3707c = 3;
                return;
            }
        }
        this.f3707c = 6;
    }

    @Override // z5.p
    public final boolean g(q qVar) {
        e5.p pVar = this.f3705a;
        qVar.n(pVar.f15036a, 0, 12);
        pVar.F(0);
        if (pVar.i() != 1179011410) {
            return false;
        }
        pVar.G(4);
        if (pVar.i() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // z5.p
    public final void release() {
    }
}
