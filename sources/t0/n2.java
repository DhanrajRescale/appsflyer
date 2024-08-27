package t0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final o2 f35085a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f35086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35087c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f35088d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35089e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35090f;

    /* renamed from: g, reason: collision with root package name */
    public int f35091g;

    /* renamed from: h, reason: collision with root package name */
    public int f35092h;

    /* renamed from: i, reason: collision with root package name */
    public int f35093i;

    /* renamed from: j, reason: collision with root package name */
    public final t0 f35094j;

    /* renamed from: k, reason: collision with root package name */
    public int f35095k;

    /* renamed from: l, reason: collision with root package name */
    public int f35096l;

    /* renamed from: m, reason: collision with root package name */
    public int f35097m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35098n;

    public n2(o2 o2Var) {
        this.f35085a = o2Var;
        this.f35086b = o2Var.f35106a;
        int i10 = o2Var.f35107b;
        this.f35087c = i10;
        this.f35088d = o2Var.f35108c;
        this.f35089e = o2Var.f35109d;
        this.f35092h = i10;
        this.f35093i = -1;
        this.f35094j = new t0();
    }

    public final d a(int i10) {
        ArrayList arrayList = this.f35085a.f35113h;
        int H1 = dp.b.H1(arrayList, i10, this.f35087c);
        if (H1 < 0) {
            d dVar = new d(i10);
            arrayList.add(-(H1 + 1), dVar);
            return dVar;
        }
        return (d) arrayList.get(H1);
    }

    public final Object b(int[] iArr, int i10) {
        int X0;
        if (dp.b.E0(iArr, i10)) {
            int i11 = i10 * 5;
            if (i11 >= iArr.length) {
                X0 = iArr.length;
            } else {
                X0 = dp.b.X0(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
            }
            return this.f35088d[X0];
        }
        return m.f35080a;
    }

    public final void c() {
        int i10;
        this.f35090f = true;
        o2 o2Var = this.f35085a;
        o2Var.getClass();
        if (this.f35085a == o2Var && (i10 = o2Var.f35110e) > 0) {
            o2Var.f35110e = i10 - 1;
        } else {
            t.F("Unexpected reader close()");
            throw null;
        }
    }

    public final void d() {
        boolean z10;
        int D0;
        int C0;
        if (this.f35095k == 0) {
            if (this.f35091g == this.f35092h) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = this.f35093i;
                int[] iArr = this.f35086b;
                int K0 = dp.b.K0(iArr, i10);
                this.f35093i = K0;
                int i11 = this.f35087c;
                if (K0 < 0) {
                    D0 = i11;
                } else {
                    D0 = dp.b.D0(iArr, K0) + K0;
                }
                this.f35092h = D0;
                int a10 = this.f35094j.a();
                if (a10 < 0) {
                    this.f35096l = 0;
                    this.f35097m = 0;
                    return;
                }
                this.f35096l = a10;
                if (K0 >= i11 - 1) {
                    C0 = this.f35089e;
                } else {
                    C0 = dp.b.C0(iArr, K0 + 1);
                }
                this.f35097m = C0;
                return;
            }
            t.F("endGroup() not called at the end of a group");
            throw null;
        }
    }

    public final Object e() {
        int i10 = this.f35091g;
        if (i10 < this.f35092h) {
            return b(this.f35086b, i10);
        }
        return 0;
    }

    public final int f() {
        int i10 = this.f35091g;
        if (i10 < this.f35092h) {
            return this.f35086b[i10 * 5];
        }
        return 0;
    }

    public final Object g(int i10, int i11) {
        int i12;
        int[] iArr = this.f35086b;
        int L0 = dp.b.L0(iArr, i10);
        int i13 = i10 + 1;
        if (i13 < this.f35087c) {
            i12 = iArr[(i13 * 5) + 4];
        } else {
            i12 = this.f35089e;
        }
        int i14 = L0 + i11;
        if (i14 < i12) {
            return this.f35088d[i14];
        }
        return m.f35080a;
    }

    public final Object h() {
        int i10;
        if (this.f35095k <= 0 && (i10 = this.f35096l) < this.f35097m) {
            this.f35098n = true;
            this.f35096l = i10 + 1;
            return this.f35088d[i10];
        }
        this.f35098n = false;
        return m.f35080a;
    }

    public final Object i(int i10) {
        int[] iArr = this.f35086b;
        if (dp.b.G0(iArr, i10)) {
            if (dp.b.G0(iArr, i10)) {
                return this.f35088d[iArr[(i10 * 5) + 4]];
            }
            return m.f35080a;
        }
        return null;
    }

    public final Object j(int[] iArr, int i10) {
        if (dp.b.F0(iArr, i10)) {
            int i11 = i10 * 5;
            return this.f35088d[dp.b.X0(iArr[i11 + 1] >> 30) + iArr[i11 + 4]];
        }
        return null;
    }

    public final void k(int i10) {
        boolean z10;
        int i11;
        if (this.f35095k == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f35091g = i10;
            int[] iArr = this.f35086b;
            int i12 = this.f35087c;
            if (i10 < i12) {
                i11 = dp.b.K0(iArr, i10);
            } else {
                i11 = -1;
            }
            this.f35093i = i11;
            if (i11 < 0) {
                this.f35092h = i12;
            } else {
                this.f35092h = dp.b.D0(iArr, i11) + i11;
            }
            this.f35096l = 0;
            this.f35097m = 0;
            return;
        }
        t.F("Cannot reposition while in an empty region");
        throw null;
    }

    public final int l() {
        boolean z10;
        int i10 = 1;
        if (this.f35095k == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = this.f35091g;
            int[] iArr = this.f35086b;
            if (!dp.b.G0(iArr, i11)) {
                i10 = dp.b.J0(iArr, this.f35091g);
            }
            int i12 = this.f35091g;
            this.f35091g = dp.b.D0(iArr, i12) + i12;
            return i10;
        }
        t.F("Cannot skip while in an empty region");
        throw null;
    }

    public final void m() {
        boolean z10;
        if (this.f35095k == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f35091g = this.f35092h;
            this.f35096l = 0;
            this.f35097m = 0;
            return;
        }
        t.F("Cannot skip the enclosing group while in an empty region");
        throw null;
    }

    public final void n() {
        boolean z10;
        int C0;
        if (this.f35095k <= 0) {
            int i10 = this.f35093i;
            int i11 = this.f35091g;
            int[] iArr = this.f35086b;
            if (dp.b.K0(iArr, i11) == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i12 = this.f35096l;
                int i13 = this.f35097m;
                t0 t0Var = this.f35094j;
                if (i12 == 0 && i13 == 0) {
                    t0Var.b(-1);
                } else {
                    t0Var.b(i12);
                }
                this.f35093i = i11;
                this.f35092h = dp.b.D0(iArr, i11) + i11;
                int i14 = i11 + 1;
                this.f35091g = i14;
                this.f35096l = dp.b.L0(iArr, i11);
                if (i11 >= this.f35087c - 1) {
                    C0 = this.f35089e;
                } else {
                    C0 = dp.b.C0(iArr, i14);
                }
                this.f35097m = C0;
                return;
            }
            al.d.e1("Invalid slot table detected");
            throw null;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f35091g);
        sb2.append(", key=");
        sb2.append(f());
        sb2.append(", parent=");
        sb2.append(this.f35093i);
        sb2.append(", end=");
        return a3.a.i(sb2, this.f35092h, ')');
    }
}
