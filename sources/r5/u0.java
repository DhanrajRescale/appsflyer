package r5;

import android.util.SparseArray;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class u0 implements z5.b0 {
    public b5.v A;
    public b5.v B;
    public boolean C;
    public boolean D;
    public long E;

    /* renamed from: a, reason: collision with root package name */
    public final r0 f33301a;

    /* renamed from: d, reason: collision with root package name */
    public final n5.p f33304d;

    /* renamed from: e, reason: collision with root package name */
    public final n5.l f33305e;

    /* renamed from: f, reason: collision with root package name */
    public t0 f33306f;

    /* renamed from: g, reason: collision with root package name */
    public b5.v f33307g;

    /* renamed from: h, reason: collision with root package name */
    public n5.i f33308h;

    /* renamed from: p, reason: collision with root package name */
    public int f33316p;

    /* renamed from: q, reason: collision with root package name */
    public int f33317q;

    /* renamed from: r, reason: collision with root package name */
    public int f33318r;

    /* renamed from: s, reason: collision with root package name */
    public int f33319s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f33323w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f33326z;

    /* renamed from: b, reason: collision with root package name */
    public final jr.p f33302b = new Object();

    /* renamed from: i, reason: collision with root package name */
    public int f33309i = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;

    /* renamed from: j, reason: collision with root package name */
    public long[] f33310j = new long[CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT];

    /* renamed from: k, reason: collision with root package name */
    public long[] f33311k = new long[CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT];

    /* renamed from: n, reason: collision with root package name */
    public long[] f33314n = new long[CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT];

    /* renamed from: m, reason: collision with root package name */
    public int[] f33313m = new int[CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT];

    /* renamed from: l, reason: collision with root package name */
    public int[] f33312l = new int[CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT];

    /* renamed from: o, reason: collision with root package name */
    public z5.a0[] f33315o = new z5.a0[CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT];

    /* renamed from: c, reason: collision with root package name */
    public final l0.j f33303c = new l0.j(new b5.s0(29));

    /* renamed from: t, reason: collision with root package name */
    public long f33320t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f33321u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f33322v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f33325y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f33324x = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, jr.p] */
    public u0(v5.e eVar, n5.p pVar, n5.l lVar) {
        this.f33304d = pVar;
        this.f33305e = lVar;
        this.f33301a = new r0(eVar);
    }

    @Override // z5.b0
    public final int a(b5.o oVar, int i10, boolean z10) {
        r0 r0Var = this.f33301a;
        int c10 = r0Var.c(i10);
        q0 q0Var = r0Var.f33290f;
        v5.a aVar = q0Var.f33275c;
        int read = oVar.read(aVar.f37697a, ((int) (r0Var.f33291g - q0Var.f33273a)) + aVar.f37698b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = r0Var.f33291g + read;
        r0Var.f33291g = j10;
        q0 q0Var2 = r0Var.f33290f;
        if (j10 == q0Var2.f33274b) {
            r0Var.f33290f = q0Var2.f33276d;
            return read;
        }
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
    
        if (((r5.s0) ((android.util.SparseArray) r10).valueAt(((android.util.SparseArray) r10).size() - 1)).f33299a.equals(r9.B) == false) goto L44;
     */
    @Override // z5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r10, int r12, int r13, int r14, z5.a0 r15) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.u0.b(long, int, int, int, z5.a0):void");
    }

    @Override // z5.b0
    public final void c(int i10, e5.p pVar) {
        while (true) {
            r0 r0Var = this.f33301a;
            if (i10 > 0) {
                int c10 = r0Var.c(i10);
                q0 q0Var = r0Var.f33290f;
                v5.a aVar = q0Var.f33275c;
                pVar.e(aVar.f37697a, ((int) (r0Var.f33291g - q0Var.f33273a)) + aVar.f37698b, c10);
                i10 -= c10;
                long j10 = r0Var.f33291g + c10;
                r0Var.f33291g = j10;
                q0 q0Var2 = r0Var.f33290f;
                if (j10 == q0Var2.f33274b) {
                    r0Var.f33290f = q0Var2.f33276d;
                }
            } else {
                r0Var.getClass();
                return;
            }
        }
    }

    @Override // z5.b0
    public final void e(b5.v vVar) {
        b5.v vVar2;
        if (this.E != 0 && vVar.f3656p != Long.MAX_VALUE) {
            b5.u a10 = vVar.a();
            a10.f3604o = vVar.f3656p + this.E;
            vVar2 = new b5.v(a10);
        } else {
            vVar2 = vVar;
        }
        boolean z10 = false;
        this.f33326z = false;
        this.A = vVar;
        synchronized (this) {
            try {
                this.f33325y = false;
                if (!e5.x.a(vVar2, this.B)) {
                    if (((SparseArray) this.f33303c.f23774b).size() != 0) {
                        Object obj = this.f33303c.f23774b;
                        if (((s0) ((SparseArray) obj).valueAt(((SparseArray) obj).size() - 1)).f33299a.equals(vVar2)) {
                            Object obj2 = this.f33303c.f23774b;
                            this.B = ((s0) ((SparseArray) obj2).valueAt(((SparseArray) obj2).size() - 1)).f33299a;
                            b5.v vVar3 = this.B;
                            this.C = b5.r0.a(vVar3.f3652l, vVar3.f3649i);
                            this.D = false;
                            z10 = true;
                        }
                    }
                    this.B = vVar2;
                    b5.v vVar32 = this.B;
                    this.C = b5.r0.a(vVar32.f3652l, vVar32.f3649i);
                    this.D = false;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t0 t0Var = this.f33306f;
        if (t0Var != null && z10) {
            m0 m0Var = (m0) t0Var;
            m0Var.f33232p.post(m0Var.f33230n);
        }
    }

    public final long g(int i10) {
        this.f33321u = Math.max(this.f33321u, m(i10));
        this.f33316p -= i10;
        int i11 = this.f33317q + i10;
        this.f33317q = i11;
        int i12 = this.f33318r + i10;
        this.f33318r = i12;
        int i13 = this.f33309i;
        if (i12 >= i13) {
            this.f33318r = i12 - i13;
        }
        int i14 = this.f33319s - i10;
        this.f33319s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f33319s = 0;
        }
        while (true) {
            l0.j jVar = this.f33303c;
            SparseArray sparseArray = (SparseArray) jVar.f23774b;
            if (i15 >= sparseArray.size() - 1) {
                break;
            }
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((e5.d) jVar.f23775c).b(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = jVar.f23773a;
            if (i17 > 0) {
                jVar.f23773a = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f33316p == 0) {
            int i18 = this.f33318r;
            if (i18 == 0) {
                i18 = this.f33309i;
            }
            return this.f33311k[i18 - 1] + this.f33312l[r7];
        }
        return this.f33311k[this.f33318r];
    }

    public final void h(boolean z10, long j10) {
        long j11;
        int i10;
        int i11;
        r0 r0Var = this.f33301a;
        synchronized (this) {
            try {
                int i12 = this.f33316p;
                j11 = -1;
                if (i12 != 0) {
                    long[] jArr = this.f33314n;
                    int i13 = this.f33318r;
                    if (j10 >= jArr[i13]) {
                        if (z10 && (i11 = this.f33319s) != i12) {
                            i10 = i11 + 1;
                        } else {
                            i10 = i12;
                        }
                        int l10 = l(i13, i10, j10, false);
                        if (l10 != -1) {
                            j11 = g(l10);
                        }
                    }
                }
            } finally {
            }
        }
        r0Var.b(j11);
    }

    public final void i() {
        long g10;
        r0 r0Var = this.f33301a;
        synchronized (this) {
            int i10 = this.f33316p;
            if (i10 == 0) {
                g10 = -1;
            } else {
                g10 = g(i10);
            }
        }
        r0Var.b(g10);
    }

    public final long j(int i10) {
        boolean z10;
        int i11;
        int i12 = this.f33317q;
        int i13 = this.f33316p;
        int i14 = (i12 + i13) - i10;
        boolean z11 = false;
        if (i14 >= 0 && i14 <= i13 - this.f33319s) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        int i15 = this.f33316p - i14;
        this.f33316p = i15;
        this.f33322v = Math.max(this.f33321u, m(i15));
        if (i14 == 0 && this.f33323w) {
            z11 = true;
        }
        this.f33323w = z11;
        l0.j jVar = this.f33303c;
        SparseArray sparseArray = (SparseArray) jVar.f23774b;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((e5.d) jVar.f23775c).b(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i11 = Math.min(jVar.f23773a, sparseArray.size() - 1);
        } else {
            i11 = -1;
        }
        jVar.f23773a = i11;
        int i16 = this.f33316p;
        if (i16 != 0) {
            return this.f33311k[o(i16 - 1)] + this.f33312l[r9];
        }
        return 0L;
    }

    public final void k(int i10) {
        boolean z10;
        long j10 = j(i10);
        r0 r0Var = this.f33301a;
        if (j10 <= r0Var.f33291g) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        r0Var.f33291g = j10;
        int i11 = r0Var.f33286b;
        if (j10 != 0) {
            q0 q0Var = r0Var.f33288d;
            if (j10 != q0Var.f33273a) {
                while (r0Var.f33291g > q0Var.f33274b) {
                    q0Var = q0Var.f33276d;
                }
                q0 q0Var2 = q0Var.f33276d;
                q0Var2.getClass();
                r0Var.a(q0Var2);
                q0 q0Var3 = new q0(i11, q0Var.f33274b);
                q0Var.f33276d = q0Var3;
                if (r0Var.f33291g == q0Var.f33274b) {
                    q0Var = q0Var3;
                }
                r0Var.f33290f = q0Var;
                if (r0Var.f33289e == q0Var2) {
                    r0Var.f33289e = q0Var3;
                    return;
                }
                return;
            }
        }
        r0Var.a(r0Var.f33288d);
        q0 q0Var4 = new q0(i11, r0Var.f33291g);
        r0Var.f33288d = q0Var4;
        r0Var.f33289e = q0Var4;
        r0Var.f33290f = q0Var4;
    }

    public final int l(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f33314n[i10];
            if (j11 <= j10) {
                if (!z10 || (this.f33313m[i10] & 1) != 0) {
                    if (j11 == j10) {
                        return i13;
                    }
                    i12 = i13;
                }
                i10++;
                if (i10 == this.f33309i) {
                    i10 = 0;
                }
            } else {
                return i12;
            }
        }
        return i12;
    }

    public final long m(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int o10 = o(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f33314n[o10]);
            if ((this.f33313m[o10] & 1) != 0) {
                break;
            }
            o10--;
            if (o10 == -1) {
                o10 = this.f33309i - 1;
            }
        }
        return j10;
    }

    public final int n() {
        return this.f33317q + this.f33319s;
    }

    public final int o(int i10) {
        int i11 = this.f33318r + i10;
        int i12 = this.f33309i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int p(long j10, boolean z10) {
        boolean z11;
        int o10 = o(this.f33319s);
        int i10 = this.f33319s;
        int i11 = this.f33316p;
        if (i10 != i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && j10 >= this.f33314n[o10]) {
            if (j10 > this.f33322v && z10) {
                return i11 - i10;
            }
            int l10 = l(o10, i11 - i10, j10, true);
            if (l10 == -1) {
                return 0;
            }
            return l10;
        }
        return 0;
    }

    public final synchronized boolean q(boolean z10) {
        boolean z11;
        b5.v vVar;
        boolean z12 = false;
        if (this.f33319s != this.f33316p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (z10 || this.f33323w || ((vVar = this.B) != null && vVar != this.f33307g)) {
                z12 = true;
            }
            return z12;
        }
        if (((s0) this.f33303c.g(n())).f33299a != this.f33307g) {
            return true;
        }
        return r(o(this.f33319s));
    }

    public final boolean r(int i10) {
        n5.i iVar = this.f33308h;
        if (iVar != null && iVar.getState() != 4 && ((this.f33313m[i10] & 1073741824) != 0 || !this.f33308h.d())) {
            return false;
        }
        return true;
    }

    public final void s(b5.v vVar, tr.e eVar) {
        boolean z10;
        b5.r rVar;
        b5.v vVar2;
        b5.v vVar3 = this.f33307g;
        if (vVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            rVar = null;
        } else {
            rVar = vVar3.f3655o;
        }
        this.f33307g = vVar;
        b5.r rVar2 = vVar.f3655o;
        n5.p pVar = this.f33304d;
        if (pVar != null) {
            int d10 = pVar.d(vVar);
            b5.u a10 = vVar.a();
            a10.F = d10;
            vVar2 = a10.a();
        } else {
            vVar2 = vVar;
        }
        eVar.f36362c = vVar2;
        eVar.f36361b = this.f33308h;
        if (pVar == null) {
            return;
        }
        if (!z10 && e5.x.a(rVar, rVar2)) {
            return;
        }
        n5.i iVar = this.f33308h;
        n5.l lVar = this.f33305e;
        n5.i b10 = pVar.b(lVar, vVar);
        this.f33308h = b10;
        eVar.f36361b = b10;
        if (iVar != null) {
            iVar.c(lVar);
        }
    }

    public final int t(tr.e eVar, h5.f fVar, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13 = false;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        jr.p pVar = this.f33302b;
        synchronized (this) {
            try {
                fVar.f18003e = false;
                if (this.f33319s != this.f33316p) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i11 = -3;
                if (!z12) {
                    if (!z10 && !this.f33323w) {
                        b5.v vVar = this.B;
                        if (vVar == null || (!z11 && vVar == this.f33307g)) {
                        }
                        s(vVar, eVar);
                        i11 = -5;
                    }
                    fVar.f17988b = 4;
                    i11 = -4;
                } else {
                    b5.v vVar2 = ((s0) this.f33303c.g(n())).f33299a;
                    if (!z11 && vVar2 == this.f33307g) {
                        int o10 = o(this.f33319s);
                        if (!r(o10)) {
                            fVar.f18003e = true;
                        } else {
                            fVar.f17988b = this.f33313m[o10];
                            if (this.f33319s == this.f33316p - 1 && (z10 || this.f33323w)) {
                                fVar.e(536870912);
                            }
                            long j10 = this.f33314n[o10];
                            fVar.f18004f = j10;
                            if (j10 < this.f33320t) {
                                fVar.e(Integer.MIN_VALUE);
                            }
                            pVar.f21652b = this.f33312l[o10];
                            pVar.f21651a = this.f33311k[o10];
                            pVar.f21653c = this.f33315o[o10];
                            i11 = -4;
                        }
                    }
                    s(vVar2, eVar);
                    i11 = -5;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !fVar.g(4)) {
            if ((i10 & 1) != 0) {
                z13 = true;
            }
            if ((i10 & 4) == 0) {
                if (z13) {
                    r0 r0Var = this.f33301a;
                    r0.f(r0Var.f33289e, fVar, this.f33302b, r0Var.f33287c);
                } else {
                    r0 r0Var2 = this.f33301a;
                    r0Var2.f33289e = r0.f(r0Var2.f33289e, fVar, this.f33302b, r0Var2.f33287c);
                }
            }
            if (!z13) {
                this.f33319s++;
            }
        }
        return i11;
    }

    public final void u(boolean z10) {
        boolean z11;
        l0.j jVar;
        SparseArray sparseArray;
        r0 r0Var = this.f33301a;
        r0Var.a(r0Var.f33288d);
        q0 q0Var = r0Var.f33288d;
        int i10 = 0;
        if (q0Var.f33275c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        yk.j.H0(z11);
        q0Var.f33273a = 0L;
        q0Var.f33274b = r0Var.f33286b;
        q0 q0Var2 = r0Var.f33288d;
        r0Var.f33289e = q0Var2;
        r0Var.f33290f = q0Var2;
        r0Var.f33291g = 0L;
        r0Var.f33285a.a();
        this.f33316p = 0;
        this.f33317q = 0;
        this.f33318r = 0;
        this.f33319s = 0;
        this.f33324x = true;
        this.f33320t = Long.MIN_VALUE;
        this.f33321u = Long.MIN_VALUE;
        this.f33322v = Long.MIN_VALUE;
        this.f33323w = false;
        while (true) {
            jVar = this.f33303c;
            sparseArray = (SparseArray) jVar.f23774b;
            if (i10 >= sparseArray.size()) {
                break;
            }
            ((e5.d) jVar.f23775c).b(sparseArray.valueAt(i10));
            i10++;
        }
        jVar.f23773a = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f33325y = true;
        }
    }

    public final synchronized boolean v(long j10, boolean z10) {
        boolean z11;
        synchronized (this) {
            this.f33319s = 0;
            r0 r0Var = this.f33301a;
            r0Var.f33289e = r0Var.f33288d;
        }
        int o10 = o(0);
        int i10 = this.f33319s;
        int i11 = this.f33316p;
        if (i10 != i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && j10 >= this.f33314n[o10] && (j10 <= this.f33322v || z10)) {
            int l10 = l(o10, i11 - i10, j10, true);
            if (l10 == -1) {
                return false;
            }
            this.f33320t = j10;
            this.f33319s += l10;
            return true;
        }
        return false;
    }

    public final synchronized void w(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f33319s + i10 <= this.f33316p) {
                    z10 = true;
                    yk.j.E0(z10);
                    this.f33319s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        yk.j.E0(z10);
        this.f33319s += i10;
    }
}
