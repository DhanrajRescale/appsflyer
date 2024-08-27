package b7;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 implements z5.p {

    /* renamed from: a, reason: collision with root package name */
    public final List f3838a;

    /* renamed from: b, reason: collision with root package name */
    public final e5.p f3839b = new e5.p(new byte[9400], 0);

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f3840c;

    /* renamed from: d, reason: collision with root package name */
    public final g f3841d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f3842e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseBooleanArray f3843f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f3844g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f3845h;

    /* renamed from: i, reason: collision with root package name */
    public c6.a f3846i;

    /* renamed from: j, reason: collision with root package name */
    public z5.r f3847j;

    /* renamed from: k, reason: collision with root package name */
    public int f3848k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3849l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3850m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3851n;

    /* renamed from: o, reason: collision with root package name */
    public final i0 f3852o;

    /* renamed from: p, reason: collision with root package name */
    public int f3853p;

    public f0(e5.u uVar, g gVar) {
        this.f3841d = gVar;
        this.f3838a = Collections.singletonList(uVar);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f3843f = sparseBooleanArray;
        this.f3844g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f3842e = sparseArray;
        this.f3840c = new SparseIntArray();
        this.f3845h = new d0();
        this.f3847j = z5.r.f42115d0;
        this.f3853p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), (i0) sparseArray2.valueAt(i10));
        }
        sparseArray.put(0, new c0(new tr.e(this)));
        this.f3852o = null;
    }

    @Override // z5.p
    public final void d(z5.r rVar) {
        this.f3847j = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [c6.a, z5.i] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r5v7, types: [e.j, java.lang.Object, z5.h] */
    @Override // z5.p
    public final int e(z5.q qVar, mj.b bVar) {
        ?? r32;
        ?? r42;
        int i10;
        boolean z10;
        i0 i0Var;
        int i11;
        boolean z11;
        long j10;
        int i12;
        long j11;
        long f10 = qVar.f();
        if (this.f3849l) {
            d0 d0Var = this.f3845h;
            if (f10 != -1 && !d0Var.f3793d) {
                int i13 = this.f3853p;
                if (i13 <= 0) {
                    d0Var.a(qVar);
                    return 0;
                }
                boolean z12 = d0Var.f3795f;
                e5.p pVar = d0Var.f3792c;
                int i14 = d0Var.f3790a;
                if (!z12) {
                    long f11 = qVar.f();
                    int min = (int) Math.min(i14, f11);
                    long j12 = f11 - min;
                    if (qVar.getPosition() != j12) {
                        bVar.f27810a = j12;
                        i12 = 1;
                    } else {
                        pVar.C(min);
                        qVar.i();
                        qVar.n(pVar.f15036a, 0, min);
                        int i15 = pVar.f15037b;
                        int i16 = pVar.f15038c;
                        int i17 = i16 - 188;
                        while (true) {
                            if (i17 >= i15) {
                                byte[] bArr = pVar.f15036a;
                                int i18 = -4;
                                int i19 = 0;
                                while (true) {
                                    if (i18 > 4) {
                                        break;
                                    }
                                    int i20 = (i18 * 188) + i17;
                                    if (i20 >= i15 && i20 < i16 && bArr[i20] == 71) {
                                        i19++;
                                        if (i19 == 5) {
                                            long R = yk.g.R(i17, i13, pVar);
                                            if (R != -9223372036854775807L) {
                                                j11 = R;
                                                break;
                                            }
                                        }
                                    } else {
                                        i19 = 0;
                                    }
                                    i18++;
                                }
                                i17--;
                            } else {
                                j11 = -9223372036854775807L;
                                break;
                            }
                        }
                        d0Var.f3797h = j11;
                        d0Var.f3795f = true;
                        i12 = 0;
                    }
                } else {
                    if (d0Var.f3797h == -9223372036854775807L) {
                        d0Var.a(qVar);
                        return 0;
                    }
                    if (!d0Var.f3794e) {
                        int min2 = (int) Math.min(i14, qVar.f());
                        long j13 = 0;
                        if (qVar.getPosition() != j13) {
                            bVar.f27810a = j13;
                            i12 = 1;
                        } else {
                            pVar.C(min2);
                            qVar.i();
                            qVar.n(pVar.f15036a, 0, min2);
                            int i21 = pVar.f15037b;
                            int i22 = pVar.f15038c;
                            while (true) {
                                if (i21 < i22) {
                                    if (pVar.f15036a[i21] == 71) {
                                        j10 = yk.g.R(i21, i13, pVar);
                                        if (j10 != -9223372036854775807L) {
                                            break;
                                        }
                                    }
                                    i21++;
                                } else {
                                    j10 = -9223372036854775807L;
                                    break;
                                }
                            }
                            d0Var.f3796g = j10;
                            d0Var.f3794e = true;
                            i12 = 0;
                        }
                    } else {
                        long j14 = d0Var.f3796g;
                        if (j14 == -9223372036854775807L) {
                            d0Var.a(qVar);
                            return 0;
                        }
                        e5.u uVar = d0Var.f3791b;
                        long b10 = uVar.b(d0Var.f3797h) - uVar.b(j14);
                        d0Var.f3798i = b10;
                        if (b10 < 0) {
                            e5.m.f("TsDurationReader", "Invalid duration: " + d0Var.f3798i + ". Using TIME_UNSET instead.");
                            d0Var.f3798i = -9223372036854775807L;
                        }
                        d0Var.a(qVar);
                        return 0;
                    }
                }
                return i12;
            }
            if (!this.f3850m) {
                this.f3850m = true;
                long j15 = d0Var.f3798i;
                if (j15 != -9223372036854775807L) {
                    int i23 = this.f3853p;
                    ni.j jVar = new ni.j(13);
                    ?? obj = new Object();
                    obj.f14632a = i23;
                    obj.f14634c = d0Var.f3791b;
                    obj.f14633b = 112800;
                    obj.f14635d = new e5.p();
                    ?? iVar = new z5.i(jVar, obj, j15, j15 + 1, 0L, f10, 188L, 940);
                    this.f3846i = iVar;
                    this.f3847j.d(iVar.f42086a);
                } else {
                    this.f3847j.d(new z5.t(j15));
                }
            }
            if (this.f3851n) {
                z11 = false;
                this.f3851n = false;
                f(0L, 0L);
                if (qVar.getPosition() != 0) {
                    bVar.f27810a = 0L;
                    return 1;
                }
            } else {
                z11 = false;
            }
            r42 = 1;
            r42 = 1;
            c6.a aVar = this.f3846i;
            r32 = z11;
            if (aVar != null) {
                r32 = z11;
                if (aVar.f42088c != null) {
                    return aVar.a(qVar, bVar);
                }
            }
        } else {
            r32 = 0;
            r42 = 1;
        }
        e5.p pVar2 = this.f3839b;
        byte[] bArr2 = pVar2.f15036a;
        if (9400 - pVar2.f15037b < 188) {
            int a10 = pVar2.a();
            if (a10 > 0) {
                System.arraycopy(bArr2, pVar2.f15037b, bArr2, r32, a10);
            }
            pVar2.D(a10, bArr2);
        }
        while (pVar2.a() < 188) {
            int i24 = pVar2.f15038c;
            int read = qVar.read(bArr2, i24, 9400 - i24);
            if (read == -1) {
                return -1;
            }
            pVar2.E(i24 + read);
        }
        int i25 = pVar2.f15037b;
        int i26 = pVar2.f15038c;
        byte[] bArr3 = pVar2.f15036a;
        while (i25 < i26 && bArr3[i25] != 71) {
            i25++;
        }
        pVar2.F(i25);
        int i27 = i25 + 188;
        int i28 = pVar2.f15038c;
        if (i27 > i28) {
            return r32;
        }
        int g10 = pVar2.g();
        if ((8388608 & g10) != 0) {
            pVar2.F(i27);
            return r32;
        }
        if ((4194304 & g10) != 0) {
            i10 = r42;
        } else {
            i10 = r32;
        }
        int i29 = (2096896 & g10) >> 8;
        if ((g10 & 32) != 0) {
            z10 = r42;
        } else {
            z10 = r32;
        }
        if ((g10 & 16) != 0) {
            i0Var = (i0) this.f3842e.get(i29);
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            pVar2.F(i27);
            return r32;
        }
        int i30 = g10 & 15;
        SparseIntArray sparseIntArray = this.f3840c;
        int i31 = sparseIntArray.get(i29, i30 - 1);
        sparseIntArray.put(i29, i30);
        if (i31 == i30) {
            pVar2.F(i27);
            return r32;
        }
        if (i30 != ((i31 + r42) & 15)) {
            i0Var.d();
        }
        if (z10) {
            int u10 = pVar2.u();
            if ((pVar2.u() & 64) != 0) {
                i11 = 2;
            } else {
                i11 = r32;
            }
            i10 |= i11;
            pVar2.G(u10 - r42);
        }
        boolean z13 = this.f3849l;
        if (z13 || !this.f3844g.get(i29, r32)) {
            pVar2.E(i27);
            i0Var.a(i10, pVar2);
            pVar2.E(i28);
        }
        if (!z13 && this.f3849l && f10 != -1) {
            this.f3851n = r42;
        }
        pVar2.F(i27);
        return r32;
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        c6.a aVar;
        long j12;
        boolean z10;
        List list = this.f3838a;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            e5.u uVar = (e5.u) list.get(i11);
            synchronized (uVar) {
                j12 = uVar.f15046b;
            }
            if (j12 == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long c10 = uVar.c();
                if (c10 != -9223372036854775807L) {
                    if (c10 != 0) {
                        if (c10 == j11) {
                        }
                        uVar.d(j11);
                    }
                }
            } else {
                if (!z10) {
                }
                uVar.d(j11);
            }
        }
        if (j11 != 0 && (aVar = this.f3846i) != null) {
            aVar.c(j11);
        }
        this.f3839b.C(0);
        this.f3840c.clear();
        while (true) {
            SparseArray sparseArray = this.f3842e;
            if (i10 < sparseArray.size()) {
                ((i0) sparseArray.valueAt(i10)).d();
                i10++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(z5.q r7) {
        /*
            r6 = this;
            e5.p r0 = r6.f3839b
            byte[] r0 = r0.f15036a
            z5.l r7 = (z5.l) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.b(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.j(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.f0.g(z5.q):boolean");
    }

    @Override // z5.p
    public final void release() {
    }
}
