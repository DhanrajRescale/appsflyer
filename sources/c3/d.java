package c3;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import h8.h;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f7904q = false;

    /* renamed from: d, reason: collision with root package name */
    public final f f7908d;

    /* renamed from: m, reason: collision with root package name */
    public final h f7917m;

    /* renamed from: p, reason: collision with root package name */
    public c f7920p;

    /* renamed from: a, reason: collision with root package name */
    public int f7905a = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7906b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f7907c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f7909e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f7910f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7912h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean[] f7913i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f7914j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f7915k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f7916l = 32;

    /* renamed from: n, reason: collision with root package name */
    public g[] f7918n = new g[CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT];

    /* renamed from: o, reason: collision with root package name */
    public int f7919o = 0;

    /* renamed from: g, reason: collision with root package name */
    public c[] f7911g = new c[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [c3.f, c3.c] */
    public d() {
        s();
        h hVar = new h(3);
        this.f7917m = hVar;
        ?? cVar = new c(hVar);
        cVar.f7924f = new g[128];
        cVar.f7925g = new g[128];
        cVar.f7926h = 0;
        cVar.f7927i = new h.c((f) cVar, (f) cVar);
        this.f7908d = cVar;
        this.f7920p = new c(hVar);
    }

    public static int n(j3.c cVar) {
        g gVar = cVar.f20847i;
        if (gVar != null) {
            return (int) (gVar.f7932e + 0.5f);
        }
        return 0;
    }

    public final g a(int i10) {
        g gVar = (g) ((e) this.f7917m.f18058d).c();
        if (gVar == null) {
            gVar = new g(i10);
            gVar.f7939l = i10;
        } else {
            gVar.c();
            gVar.f7939l = i10;
        }
        int i11 = this.f7919o;
        int i12 = this.f7905a;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.f7905a = i13;
            this.f7918n = (g[]) Arrays.copyOf(this.f7918n, i13);
        }
        g[] gVarArr = this.f7918n;
        int i14 = this.f7919o;
        this.f7919o = i14 + 1;
        gVarArr[i14] = gVar;
        return gVar;
    }

    public final void b(g gVar, g gVar2, int i10, float f10, g gVar3, g gVar4, int i11, int i12) {
        c l10 = l();
        if (gVar2 == gVar3) {
            l10.f7902d.a(gVar, 1.0f);
            l10.f7902d.a(gVar4, 1.0f);
            l10.f7902d.a(gVar2, -2.0f);
        } else if (f10 == 0.5f) {
            l10.f7902d.a(gVar, 1.0f);
            l10.f7902d.a(gVar2, -1.0f);
            l10.f7902d.a(gVar3, -1.0f);
            l10.f7902d.a(gVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                l10.f7900b = (-i10) + i11;
            }
        } else if (f10 <= s0.g.f34069a) {
            l10.f7902d.a(gVar, -1.0f);
            l10.f7902d.a(gVar2, 1.0f);
            l10.f7900b = i10;
        } else if (f10 >= 1.0f) {
            l10.f7902d.a(gVar4, -1.0f);
            l10.f7902d.a(gVar3, 1.0f);
            l10.f7900b = -i11;
        } else {
            float f11 = 1.0f - f10;
            l10.f7902d.a(gVar, f11 * 1.0f);
            l10.f7902d.a(gVar2, f11 * (-1.0f));
            l10.f7902d.a(gVar3, (-1.0f) * f10);
            l10.f7902d.a(gVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                l10.f7900b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            l10.a(this, i12);
        }
        c(l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
    
        if (r5.f7938k <= 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c6, code lost:
    
        if (r5.f7938k <= 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00db, code lost:
    
        if (r5.f7938k <= 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00de, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e8, code lost:
    
        if (r5.f7938k <= 1) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(c3.c r17) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.d.c(c3.c):void");
    }

    public final void d(g gVar, int i10) {
        int i11 = gVar.f7930c;
        if (i11 == -1) {
            gVar.d(this, i10);
            for (int i12 = 0; i12 < this.f7907c + 1; i12++) {
                g gVar2 = ((g[]) this.f7917m.f18059e)[i12];
            }
            return;
        }
        if (i11 != -1) {
            c cVar = this.f7911g[i11];
            if (cVar.f7903e) {
                cVar.f7900b = i10;
                return;
            }
            if (cVar.f7902d.b() == 0) {
                cVar.f7903e = true;
                cVar.f7900b = i10;
                return;
            }
            c l10 = l();
            if (i10 < 0) {
                l10.f7900b = i10 * (-1);
                l10.f7902d.a(gVar, 1.0f);
            } else {
                l10.f7900b = i10;
                l10.f7902d.a(gVar, -1.0f);
            }
            c(l10);
            return;
        }
        c l11 = l();
        l11.f7899a = gVar;
        float f10 = i10;
        gVar.f7932e = f10;
        l11.f7900b = f10;
        l11.f7903e = true;
        c(l11);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(c3.g r6, c3.g r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L15
            boolean r1 = r7.f7933f
            if (r1 == 0) goto L15
            int r1 = r6.f7930c
            r2 = -1
            if (r1 != r2) goto L15
            float r7 = r7.f7932e
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L15:
            c3.c r1 = r5.l()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L37
            if (r8 >= 0) goto L25
            int r8 = r8 * (-1)
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            float r8 = (float) r8
            r1.f7900b = r8
            if (r4 != 0) goto L2c
            goto L37
        L2c:
            c3.b r8 = r1.f7902d
            r8.a(r6, r2)
            c3.b r6 = r1.f7902d
            r6.a(r7, r3)
            goto L41
        L37:
            c3.b r8 = r1.f7902d
            r8.a(r6, r3)
            c3.b r6 = r1.f7902d
            r6.a(r7, r2)
        L41:
            if (r9 == r0) goto L46
            r1.a(r5, r9)
        L46:
            r5.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.d.e(c3.g, c3.g, int, int):void");
    }

    public final void f(g gVar, g gVar2, int i10, int i11) {
        c l10 = l();
        g m10 = m();
        m10.f7931d = 0;
        l10.b(gVar, gVar2, m10, i10);
        if (i11 != 8) {
            l10.f7902d.a(j(i11), (int) (l10.f7902d.f(m10) * (-1.0f)));
        }
        c(l10);
    }

    public final void g(g gVar, g gVar2, int i10, int i11) {
        c l10 = l();
        g m10 = m();
        m10.f7931d = 0;
        l10.c(gVar, gVar2, m10, i10);
        if (i11 != 8) {
            l10.f7902d.a(j(i11), (int) (l10.f7902d.f(m10) * (-1.0f)));
        }
        c(l10);
    }

    public final void h(c cVar) {
        int i10;
        if (cVar.f7903e) {
            cVar.f7899a.d(this, cVar.f7900b);
        } else {
            c[] cVarArr = this.f7911g;
            int i11 = this.f7915k;
            cVarArr[i11] = cVar;
            g gVar = cVar.f7899a;
            gVar.f7930c = i11;
            this.f7915k = i11 + 1;
            gVar.e(this, cVar);
        }
        if (this.f7906b) {
            int i12 = 0;
            while (i12 < this.f7915k) {
                if (this.f7911g[i12] == null) {
                    System.out.println("WTF");
                }
                c cVar2 = this.f7911g[i12];
                if (cVar2 != null && cVar2.f7903e) {
                    cVar2.f7899a.d(this, cVar2.f7900b);
                    ((e) this.f7917m.f18057c).b(cVar2);
                    this.f7911g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f7915k;
                        if (i13 >= i10) {
                            break;
                        }
                        c[] cVarArr2 = this.f7911g;
                        int i15 = i13 - 1;
                        c cVar3 = cVarArr2[i13];
                        cVarArr2[i15] = cVar3;
                        g gVar2 = cVar3.f7899a;
                        if (gVar2.f7930c == i13) {
                            gVar2.f7930c = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f7911g[i14] = null;
                    }
                    this.f7915k = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f7906b = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.f7915k; i10++) {
            c cVar = this.f7911g[i10];
            cVar.f7899a.f7932e = cVar.f7900b;
        }
    }

    public final g j(int i10) {
        if (this.f7914j + 1 >= this.f7910f) {
            o();
        }
        g a10 = a(4);
        int i11 = this.f7907c + 1;
        this.f7907c = i11;
        this.f7914j++;
        a10.f7929b = i11;
        a10.f7931d = i10;
        ((g[]) this.f7917m.f18059e)[i11] = a10;
        f fVar = this.f7908d;
        fVar.f7927i.f17583b = a10;
        float[] fArr = a10.f7935h;
        Arrays.fill(fArr, s0.g.f34069a);
        fArr[a10.f7931d] = 1.0f;
        fVar.j(a10);
        return a10;
    }

    public final g k(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f7914j + 1 >= this.f7910f) {
            o();
        }
        if (obj instanceof j3.c) {
            j3.c cVar = (j3.c) obj;
            gVar = cVar.f20847i;
            if (gVar == null) {
                cVar.k();
                gVar = cVar.f20847i;
            }
            int i10 = gVar.f7929b;
            h hVar = this.f7917m;
            if (i10 == -1 || i10 > this.f7907c || ((g[]) hVar.f18059e)[i10] == null) {
                if (i10 != -1) {
                    gVar.c();
                }
                int i11 = this.f7907c + 1;
                this.f7907c = i11;
                this.f7914j++;
                gVar.f7929b = i11;
                gVar.f7939l = 1;
                ((g[]) hVar.f18059e)[i11] = gVar;
            }
        }
        return gVar;
    }

    public final c l() {
        h hVar = this.f7917m;
        c cVar = (c) ((e) hVar.f18057c).c();
        if (cVar == null) {
            return new c(hVar);
        }
        cVar.f7899a = null;
        cVar.f7902d.clear();
        cVar.f7900b = s0.g.f34069a;
        cVar.f7903e = false;
        return cVar;
    }

    public final g m() {
        if (this.f7914j + 1 >= this.f7910f) {
            o();
        }
        g a10 = a(3);
        int i10 = this.f7907c + 1;
        this.f7907c = i10;
        this.f7914j++;
        a10.f7929b = i10;
        ((g[]) this.f7917m.f18059e)[i10] = a10;
        return a10;
    }

    public final void o() {
        int i10 = this.f7909e * 2;
        this.f7909e = i10;
        this.f7911g = (c[]) Arrays.copyOf(this.f7911g, i10);
        h hVar = this.f7917m;
        hVar.f18059e = (g[]) Arrays.copyOf((g[]) hVar.f18059e, this.f7909e);
        int i11 = this.f7909e;
        this.f7913i = new boolean[i11];
        this.f7910f = i11;
        this.f7916l = i11;
    }

    public final void p() {
        f fVar = this.f7908d;
        if (fVar.e()) {
            i();
            return;
        }
        if (this.f7912h) {
            for (int i10 = 0; i10 < this.f7915k; i10++) {
                if (!this.f7911g[i10].f7903e) {
                    q(fVar);
                    return;
                }
            }
            i();
            return;
        }
        q(fVar);
    }

    public final void q(f fVar) {
        int i10 = 0;
        while (true) {
            if (i10 >= this.f7915k) {
                break;
            }
            c cVar = this.f7911g[i10];
            int i11 = 1;
            if (cVar.f7899a.f7939l != 1) {
                float f10 = cVar.f7900b;
                float f11 = s0.g.f34069a;
                if (f10 < s0.g.f34069a) {
                    boolean z10 = false;
                    int i12 = 0;
                    while (!z10) {
                        i12 += i11;
                        float f12 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < this.f7915k) {
                            c cVar2 = this.f7911g[i15];
                            if (cVar2.f7899a.f7939l != i11 && !cVar2.f7903e && cVar2.f7900b < f11) {
                                int b10 = cVar2.f7902d.b();
                                int i17 = 0;
                                while (i17 < b10) {
                                    g c10 = cVar2.f7902d.c(i17);
                                    float f13 = cVar2.f7902d.f(c10);
                                    if (f13 > f11) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f14 = c10.f7934g[i18] / f13;
                                            if ((f14 < f12 && i18 == i16) || i18 > i16) {
                                                i16 = i18;
                                                i14 = c10.f7929b;
                                                i13 = i15;
                                                f12 = f14;
                                            }
                                        }
                                    }
                                    i17++;
                                    f11 = s0.g.f34069a;
                                }
                            }
                            i15++;
                            f11 = s0.g.f34069a;
                            i11 = 1;
                        }
                        if (i13 != -1) {
                            c cVar3 = this.f7911g[i13];
                            cVar3.f7899a.f7930c = -1;
                            cVar3.g(((g[]) this.f7917m.f18059e)[i14]);
                            g gVar = cVar3.f7899a;
                            gVar.f7930c = i13;
                            gVar.e(this, cVar3);
                        } else {
                            z10 = true;
                        }
                        if (i12 > this.f7914j / 2) {
                            z10 = true;
                        }
                        f11 = s0.g.f34069a;
                        i11 = 1;
                    }
                }
            }
            i10++;
        }
        r(fVar);
        i();
    }

    public final void r(c cVar) {
        for (int i10 = 0; i10 < this.f7914j; i10++) {
            this.f7913i[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f7914j * 2) {
                return;
            }
            g gVar = cVar.f7899a;
            if (gVar != null) {
                this.f7913i[gVar.f7929b] = true;
            }
            g d10 = cVar.d(this.f7913i);
            if (d10 != null) {
                boolean[] zArr = this.f7913i;
                int i12 = d10.f7929b;
                if (zArr[i12]) {
                    return;
                } else {
                    zArr[i12] = true;
                }
            }
            if (d10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f7915k; i14++) {
                    c cVar2 = this.f7911g[i14];
                    if (cVar2.f7899a.f7939l != 1 && !cVar2.f7903e && cVar2.f7902d.j(d10)) {
                        float f11 = cVar2.f7902d.f(d10);
                        if (f11 < s0.g.f34069a) {
                            float f12 = (-cVar2.f7900b) / f11;
                            if (f12 < f10) {
                                i13 = i14;
                                f10 = f12;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    c cVar3 = this.f7911g[i13];
                    cVar3.f7899a.f7930c = -1;
                    cVar3.g(d10);
                    g gVar2 = cVar3.f7899a;
                    gVar2.f7930c = i13;
                    gVar2.e(this, cVar3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f7915k; i10++) {
            c cVar = this.f7911g[i10];
            if (cVar != null) {
                ((e) this.f7917m.f18057c).b(cVar);
            }
            this.f7911g[i10] = null;
        }
    }

    public final void t() {
        h hVar;
        int i10 = 0;
        while (true) {
            hVar = this.f7917m;
            g[] gVarArr = (g[]) hVar.f18059e;
            if (i10 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i10];
            if (gVar != null) {
                gVar.c();
            }
            i10++;
        }
        e eVar = (e) hVar.f18058d;
        g[] gVarArr2 = this.f7918n;
        int i11 = this.f7919o;
        eVar.getClass();
        if (i11 > gVarArr2.length) {
            i11 = gVarArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            g gVar2 = gVarArr2[i12];
            int i13 = eVar.f7923c;
            Object[] objArr = eVar.f7922b;
            if (i13 < objArr.length) {
                objArr[i13] = gVar2;
                eVar.f7923c = i13 + 1;
            }
        }
        this.f7919o = 0;
        Arrays.fill((g[]) hVar.f18059e, (Object) null);
        this.f7907c = 0;
        f fVar = this.f7908d;
        fVar.f7926h = 0;
        fVar.f7900b = s0.g.f34069a;
        this.f7914j = 1;
        for (int i14 = 0; i14 < this.f7915k; i14++) {
            c cVar = this.f7911g[i14];
        }
        s();
        this.f7915k = 0;
        this.f7920p = new c(hVar);
    }
}
