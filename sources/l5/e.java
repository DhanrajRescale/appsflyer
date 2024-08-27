package l5;

import b5.e0;
import b5.g1;
import b5.i1;
import b5.k0;
import e5.x;

/* loaded from: classes.dex */
public final class e extends i1 {

    /* renamed from: b, reason: collision with root package name */
    public final long f24012b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24013c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24014d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24015e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24016f;

    /* renamed from: g, reason: collision with root package name */
    public final long f24017g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24018h;

    /* renamed from: i, reason: collision with root package name */
    public final m5.c f24019i;

    /* renamed from: j, reason: collision with root package name */
    public final k0 f24020j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f24021k;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, m5.c cVar, k0 k0Var, e0 e0Var) {
        boolean z10;
        boolean z11 = cVar.f27516d;
        if (e0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z11 == z10);
        this.f24012b = j10;
        this.f24013c = j11;
        this.f24014d = j12;
        this.f24015e = i10;
        this.f24016f = j13;
        this.f24017g = j14;
        this.f24018h = j15;
        this.f24019i = cVar;
        this.f24020j = k0Var;
        this.f24021k = e0Var;
    }

    @Override // b5.i1
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f24015e) < 0 || intValue >= i()) {
            return -1;
        }
        return intValue;
    }

    @Override // b5.i1
    public final g1 g(int i10, g1 g1Var, boolean z10) {
        String str;
        yk.j.G0(i10, i());
        Integer num = null;
        m5.c cVar = this.f24019i;
        if (z10) {
            str = cVar.a(i10).f27547a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.f24015e + i10);
        }
        long c10 = cVar.c(i10);
        long F = x.F(cVar.a(i10).f27548b - cVar.a(0).f27548b) - this.f24016f;
        g1Var.getClass();
        g1Var.j(str, num, 0, c10, F, b5.b.f3203g, false);
        return g1Var;
    }

    @Override // b5.i1
    public final int i() {
        return this.f24019i.f27525m.size();
    }

    @Override // b5.i1
    public final Object m(int i10) {
        yk.j.G0(i10, i());
        return Integer.valueOf(this.f24015e + i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ba  */
    @Override // b5.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b5.h1 n(int r26, b5.h1 r27, long r28) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.e.n(int, b5.h1, long):b5.h1");
    }

    @Override // b5.i1
    public final int p() {
        return 1;
    }
}
