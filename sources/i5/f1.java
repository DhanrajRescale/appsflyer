package i5;

import android.util.Pair;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f1 extends b5.i1 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f19424k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f19425b;

    /* renamed from: c, reason: collision with root package name */
    public final r5.y0 f19426c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19427d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19428e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f19429f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f19430g;

    /* renamed from: h, reason: collision with root package name */
    public final b5.i1[] f19431h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f19432i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f19433j;

    public f1(b5.i1[] i1VarArr, Object[] objArr, r5.y0 y0Var) {
        this.f19426c = y0Var;
        this.f19425b = y0Var.f33333b.length;
        int length = i1VarArr.length;
        this.f19431h = i1VarArr;
        this.f19429f = new int[length];
        this.f19430g = new int[length];
        this.f19432i = objArr;
        this.f19433j = new HashMap();
        int length2 = i1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            b5.i1 i1Var = i1VarArr[i10];
            this.f19431h[i13] = i1Var;
            this.f19430g[i13] = i11;
            this.f19429f[i13] = i12;
            i11 += i1Var.p();
            i12 += this.f19431h[i13].i();
            this.f19433j.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.f19427d = i11;
        this.f19428e = i12;
    }

    @Override // b5.i1
    public final int a(boolean z10) {
        if (this.f19425b == 0) {
            return -1;
        }
        int i10 = 0;
        if (z10) {
            int[] iArr = this.f19426c.f33333b;
            if (iArr.length > 0) {
                i10 = iArr[0];
            } else {
                i10 = -1;
            }
        }
        do {
            b5.i1[] i1VarArr = this.f19431h;
            if (i1VarArr[i10].q()) {
                i10 = r(i10, z10);
            } else {
                return this.f19430g[i10] + i1VarArr[i10].a(z10);
            }
        } while (i10 != -1);
        return -1;
    }

    @Override // b5.i1
    public final int b(Object obj) {
        int intValue;
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f19433j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (b10 = this.f19431h[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.f19429f[intValue] + b10;
    }

    @Override // b5.i1
    public final int c(boolean z10) {
        int i10;
        int i11 = this.f19425b;
        if (i11 == 0) {
            return -1;
        }
        if (z10) {
            int[] iArr = this.f19426c.f33333b;
            if (iArr.length > 0) {
                i10 = iArr[iArr.length - 1];
            } else {
                i10 = -1;
            }
        } else {
            i10 = i11 - 1;
        }
        do {
            b5.i1[] i1VarArr = this.f19431h;
            if (i1VarArr[i10].q()) {
                i10 = s(i10, z10);
            } else {
                return this.f19430g[i10] + i1VarArr[i10].c(z10);
            }
        } while (i10 != -1);
        return -1;
    }

    @Override // b5.i1
    public final int e(int i10, int i11, boolean z10) {
        int[] iArr = this.f19430g;
        int i12 = 0;
        int e10 = e5.x.e(iArr, i10 + 1, false, false);
        int i13 = iArr[e10];
        b5.i1[] i1VarArr = this.f19431h;
        b5.i1 i1Var = i1VarArr[e10];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int e11 = i1Var.e(i14, i12, z10);
        if (e11 != -1) {
            return i13 + e11;
        }
        int r10 = r(e10, z10);
        while (r10 != -1 && i1VarArr[r10].q()) {
            r10 = r(r10, z10);
        }
        if (r10 != -1) {
            return i1VarArr[r10].a(z10) + iArr[r10];
        }
        if (i11 != 2) {
            return -1;
        }
        return a(z10);
    }

    @Override // b5.i1
    public final b5.g1 g(int i10, b5.g1 g1Var, boolean z10) {
        int[] iArr = this.f19429f;
        int e10 = e5.x.e(iArr, i10 + 1, false, false);
        int i11 = this.f19430g[e10];
        this.f19431h[e10].g(i10 - iArr[e10], g1Var, z10);
        g1Var.f3318c += i11;
        if (z10) {
            Object obj = this.f19432i[e10];
            Object obj2 = g1Var.f3317b;
            obj2.getClass();
            g1Var.f3317b = Pair.create(obj, obj2);
        }
        return g1Var;
    }

    @Override // b5.i1
    public final b5.g1 h(Object obj, b5.g1 g1Var) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f19433j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i10 = this.f19430g[intValue];
        this.f19431h[intValue].h(obj3, g1Var);
        g1Var.f3318c += i10;
        g1Var.f3317b = obj;
        return g1Var;
    }

    @Override // b5.i1
    public final int i() {
        return this.f19428e;
    }

    @Override // b5.i1
    public final int l(int i10, int i11, boolean z10) {
        int[] iArr = this.f19430g;
        int i12 = 0;
        int e10 = e5.x.e(iArr, i10 + 1, false, false);
        int i13 = iArr[e10];
        b5.i1[] i1VarArr = this.f19431h;
        b5.i1 i1Var = i1VarArr[e10];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int l10 = i1Var.l(i14, i12, z10);
        if (l10 != -1) {
            return i13 + l10;
        }
        int s7 = s(e10, z10);
        while (s7 != -1 && i1VarArr[s7].q()) {
            s7 = s(s7, z10);
        }
        if (s7 != -1) {
            return i1VarArr[s7].c(z10) + iArr[s7];
        }
        if (i11 != 2) {
            return -1;
        }
        return c(z10);
    }

    @Override // b5.i1
    public final Object m(int i10) {
        int[] iArr = this.f19429f;
        int e10 = e5.x.e(iArr, i10 + 1, false, false);
        return Pair.create(this.f19432i[e10], this.f19431h[e10].m(i10 - iArr[e10]));
    }

    @Override // b5.i1
    public final b5.h1 n(int i10, b5.h1 h1Var, long j10) {
        int[] iArr = this.f19430g;
        int e10 = e5.x.e(iArr, i10 + 1, false, false);
        int i11 = iArr[e10];
        int i12 = this.f19429f[e10];
        this.f19431h[e10].n(i10 - i11, h1Var, j10);
        Object obj = this.f19432i[e10];
        if (!b5.h1.f3323r.equals(h1Var.f3332a)) {
            obj = Pair.create(obj, h1Var.f3332a);
        }
        h1Var.f3332a = obj;
        h1Var.f3346o += i12;
        h1Var.f3347p += i12;
        return h1Var;
    }

    @Override // b5.i1
    public final int p() {
        return this.f19427d;
    }

    public final int r(int i10, boolean z10) {
        if (z10) {
            r5.y0 y0Var = this.f19426c;
            int i11 = y0Var.f33334c[i10] + 1;
            int[] iArr = y0Var.f33333b;
            if (i11 >= iArr.length) {
                return -1;
            }
            return iArr[i11];
        }
        if (i10 >= this.f19425b - 1) {
            return -1;
        }
        return i10 + 1;
    }

    public final int s(int i10, boolean z10) {
        if (z10) {
            r5.y0 y0Var = this.f19426c;
            int i11 = y0Var.f33334c[i10] - 1;
            if (i11 < 0) {
                return -1;
            }
            return y0Var.f33333b[i11];
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f1(java.util.List r7, r5.y0 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            b5.i1[] r0 = new b5.i1[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            i5.s0 r4 = (i5.s0) r4
            int r5 = r3 + 1
            b5.i1 r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            i5.s0 r3 = (i5.s0) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.f1.<init>(java.util.List, r5.y0):void");
    }
}
