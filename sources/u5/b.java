package u5;

import android.os.SystemClock;
import b5.j1;
import e5.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lp.c1;
import lp.f1;
import lp.g0;
import lp.h1;
import lp.k0;
import lp.o0;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public final v5.c f36744g;

    /* renamed from: h, reason: collision with root package name */
    public final long f36745h;

    /* renamed from: i, reason: collision with root package name */
    public final long f36746i;

    /* renamed from: j, reason: collision with root package name */
    public final long f36747j;

    /* renamed from: k, reason: collision with root package name */
    public final int f36748k;

    /* renamed from: l, reason: collision with root package name */
    public final int f36749l;

    /* renamed from: m, reason: collision with root package name */
    public final float f36750m;

    /* renamed from: n, reason: collision with root package name */
    public final float f36751n;

    /* renamed from: o, reason: collision with root package name */
    public final o0 f36752o;

    /* renamed from: p, reason: collision with root package name */
    public final e5.b f36753p;

    /* renamed from: q, reason: collision with root package name */
    public float f36754q;

    /* renamed from: r, reason: collision with root package name */
    public int f36755r;

    /* renamed from: s, reason: collision with root package name */
    public int f36756s;

    /* renamed from: t, reason: collision with root package name */
    public long f36757t;

    /* renamed from: u, reason: collision with root package name */
    public s5.a f36758u;

    public b(j1 j1Var, int[] iArr, int i10, v5.c cVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, o0 o0Var, e5.b bVar) {
        super(j1Var, iArr);
        v5.c cVar2;
        long j13;
        if (j12 < j10) {
            e5.m.f("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            cVar2 = cVar;
            j13 = j10;
        } else {
            cVar2 = cVar;
            j13 = j12;
        }
        this.f36744g = cVar2;
        this.f36745h = j10 * 1000;
        this.f36746i = j11 * 1000;
        this.f36747j = j13 * 1000;
        this.f36748k = i11;
        this.f36749l = i12;
        this.f36750m = f10;
        this.f36751n = f11;
        this.f36752o = o0.q(o0Var);
        this.f36753p = bVar;
        this.f36754q = 1.0f;
        this.f36756s = 0;
        this.f36757t = -9223372036854775807L;
    }

    public static lp.j1 u(q[] qVarArr) {
        int i10;
        int i11;
        lp.j1 e02;
        int i12;
        double d10;
        long j10;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i10 = 1;
            if (i14 >= qVarArr.length) {
                break;
            }
            q qVar = qVarArr[i14];
            if (qVar != null && qVar.f36837b.length > 1) {
                k0 p10 = o0.p();
                p10.b0(new a(0L, 0L));
                arrayList.add(p10);
            } else {
                arrayList.add(null);
            }
            i14++;
        }
        int length = qVarArr.length;
        long[][] jArr = new long[length];
        for (int i15 = 0; i15 < qVarArr.length; i15++) {
            q qVar2 = qVarArr[i15];
            if (qVar2 == null) {
                jArr[i15] = new long[0];
            } else {
                int[] iArr = qVar2.f36837b;
                jArr[i15] = new long[iArr.length];
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    long j11 = qVar2.f36836a.f3379d[iArr[i16]].f3648h;
                    long[] jArr2 = jArr[i15];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i16] = j11;
                }
                Arrays.sort(jArr[i15]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i17 = 0; i17 < length; i17++) {
            long[] jArr4 = jArr[i17];
            if (jArr4.length == 0) {
                j10 = 0;
            } else {
                j10 = jArr4[0];
            }
            jArr3[i17] = j10;
        }
        v(arrayList, jArr3);
        h1 h1Var = h1.f24991a;
        h1Var.getClass();
        f1 t02 = new c1(h1Var).m().t0();
        int i18 = 0;
        while (i18 < length) {
            long[] jArr5 = jArr[i18];
            if (jArr5.length <= i10) {
                i12 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i19 = i13;
                while (true) {
                    long[] jArr6 = jArr[i18];
                    double d11 = 0.0d;
                    if (i19 >= jArr6.length) {
                        break;
                    }
                    int i20 = length;
                    long j12 = jArr6[i19];
                    if (j12 != -1) {
                        d11 = Math.log(j12);
                    }
                    dArr[i19] = d11;
                    i19++;
                    length = i20;
                }
                i12 = length;
                int i21 = length2 - 1;
                double d12 = dArr[i21] - dArr[0];
                int i22 = 0;
                while (i22 < i21) {
                    double d13 = dArr[i22];
                    i22++;
                    double d14 = (d13 + dArr[i22]) * 0.5d;
                    if (d12 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = (d14 - dArr[0]) / d12;
                    }
                    t02.c(Double.valueOf(d10), Integer.valueOf(i18));
                }
            }
            i18++;
            length = i12;
            i13 = 0;
            i10 = 1;
        }
        lp.t tVar = t02.f25061b;
        if (tVar == null) {
            i11 = 0;
            tVar = new lp.t(t02, 0);
            t02.f25061b = tVar;
        } else {
            i11 = 0;
        }
        o0 q10 = o0.q(tVar);
        for (int i23 = i11; i23 < q10.size(); i23++) {
            int intValue = ((Integer) q10.get(i23)).intValue();
            int i24 = iArr2[intValue] + 1;
            iArr2[intValue] = i24;
            jArr3[intValue] = jArr[intValue][i24];
            v(arrayList, jArr3);
        }
        for (int i25 = i11; i25 < qVarArr.length; i25++) {
            if (arrayList.get(i25) != null) {
                jArr3[i25] = jArr3[i25] * 2;
            }
        }
        v(arrayList, jArr3);
        k0 p11 = o0.p();
        for (int i26 = i11; i26 < arrayList.size(); i26++) {
            k0 k0Var = (k0) arrayList.get(i26);
            if (k0Var == null) {
                e02 = o0.t();
            } else {
                e02 = k0Var.e0();
            }
            p11.b0(e02);
        }
        return p11.e0();
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k0 k0Var = (k0) arrayList.get(i10);
            if (k0Var != null) {
                k0Var.a0(new a(j10, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        s5.a aVar = (s5.a) g0.f(list);
        long j10 = aVar.f34255g;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = aVar.f34256h;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j11 - j10;
    }

    @Override // u5.s
    public final int d() {
        return this.f36755r;
    }

    @Override // u5.c, u5.s
    public final void h() {
        this.f36757t = -9223372036854775807L;
        this.f36758u = null;
    }

    @Override // u5.c, u5.s
    public final int j(long j10, List list) {
        s5.a aVar;
        int i10;
        int i11;
        ((e5.r) this.f36753p).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f36757t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((s5.a) g0.f(list)).equals(this.f36758u))) {
            return list.size();
        }
        this.f36757t = elapsedRealtime;
        if (list.isEmpty()) {
            aVar = null;
        } else {
            aVar = (s5.a) g0.f(list);
        }
        this.f36758u = aVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long v10 = x.v(((s5.a) list.get(size - 1)).f34255g - j10, this.f36754q);
        long j12 = this.f36747j;
        if (v10 < j12) {
            return size;
        }
        x(list);
        b5.v vVar = this.f36762d[w(elapsedRealtime)];
        for (int i12 = 0; i12 < size; i12++) {
            s5.a aVar2 = (s5.a) list.get(i12);
            b5.v vVar2 = aVar2.f34252d;
            if (x.v(aVar2.f34255g - j10, this.f36754q) >= j12 && vVar2.f3648h < vVar.f3648h && (i10 = vVar2.f3658r) != -1 && i10 <= this.f36749l && (i11 = vVar2.f3657q) != -1 && i11 <= this.f36748k && i10 < vVar.f3658r) {
                return i12;
            }
        }
        return size;
    }

    @Override // u5.c, u5.s
    public final void k() {
        this.f36758u = null;
    }

    @Override // u5.s
    public final int m() {
        return this.f36756s;
    }

    @Override // u5.c, u5.s
    public final void o(float f10) {
        this.f36754q = f10;
    }

    @Override // u5.s
    public final Object p() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    @Override // u5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(long r14, long r16, long r18, java.util.List r20, s5.m[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            e5.b r2 = r0.f36753p
            e5.r r2 = (e5.r) r2
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f36755r
            int r5 = r1.length
            if (r4 >= r5) goto L29
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L29
            int r4 = r0.f36755r
            r1 = r1[r4]
            long r4 = r1.d()
            long r6 = r1.b()
        L27:
            long r4 = r4 - r6
            goto L45
        L29:
            int r4 = r1.length
            r5 = 0
        L2b:
            if (r5 >= r4) goto L41
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3e
            long r4 = r6.d()
            long r6 = r6.b()
            goto L27
        L3e:
            int r5 = r5 + 1
            goto L2b
        L41:
            long r4 = x(r20)
        L45:
            int r1 = r0.f36756s
            if (r1 != 0) goto L53
            r1 = 1
            r0.f36756s = r1
            int r1 = r13.w(r2)
            r0.f36755r = r1
            return
        L53:
            int r6 = r0.f36755r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5e
            r7 = r8
            goto L6a
        L5e:
            java.lang.Object r7 = lp.g0.f(r20)
            s5.a r7 = (s5.a) r7
            b5.v r7 = r7.f34252d
            int r7 = r13.e(r7)
        L6a:
            if (r7 == r8) goto L75
            java.lang.Object r1 = lp.g0.f(r20)
            s5.a r1 = (s5.a) r1
            int r1 = r1.f34253e
            r6 = r7
        L75:
            int r7 = r13.w(r2)
            if (r7 == r6) goto Lb9
            boolean r2 = r13.a(r6, r2)
            if (r2 != 0) goto Lb9
            b5.v[] r2 = r0.f36762d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.f36745h
            if (r10 != 0) goto L93
            goto La5
        L93:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L9a
            long r4 = r18 - r4
            goto L9c
        L9a:
            r4 = r18
        L9c:
            float r4 = (float) r4
            float r5 = r0.f36751n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La5:
            int r2 = r2.f3648h
            int r3 = r3.f3648h
            if (r2 <= r3) goto Lb0
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lb0
            goto Lb8
        Lb0:
            if (r2 >= r3) goto Lb9
            long r2 = r0.f36746i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb9
        Lb8:
            r7 = r6
        Lb9:
            if (r7 != r6) goto Lbc
            goto Lbd
        Lbc:
            r1 = 3
        Lbd:
            r0.f36756s = r1
            r0.f36755r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.b.r(long, long, long, java.util.List, s5.m[]):void");
    }

    public final int w(long j10) {
        long j11;
        v5.h hVar = (v5.h) this.f36744g;
        synchronized (hVar) {
            j11 = hVar.f37735l;
        }
        long j12 = ((float) j11) * this.f36750m;
        this.f36744g.getClass();
        long j13 = ((float) j12) / this.f36754q;
        if (!this.f36752o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.f36752o.size() - 1 && ((a) this.f36752o.get(i10)).f36742a < j13) {
                i10++;
            }
            a aVar = (a) this.f36752o.get(i10 - 1);
            a aVar2 = (a) this.f36752o.get(i10);
            long j14 = aVar.f36742a;
            float f10 = ((float) (j13 - j14)) / ((float) (aVar2.f36742a - j14));
            j13 = aVar.f36743b + (f10 * ((float) (aVar2.f36743b - r1)));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f36760b; i12++) {
            if (j10 == Long.MIN_VALUE || !a(i12, j10)) {
                if (g(i12).f3648h <= j13) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }
}
