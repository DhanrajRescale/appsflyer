package w;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i2 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final t.s f38544a;

    /* renamed from: b, reason: collision with root package name */
    public final t.t f38545b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38546c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f38547d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f38548e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f38549f;

    /* renamed from: g, reason: collision with root package name */
    public t f38550g;

    /* renamed from: h, reason: collision with root package name */
    public t f38551h;

    /* renamed from: i, reason: collision with root package name */
    public t f38552i;

    /* renamed from: j, reason: collision with root package name */
    public t f38553j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f38554k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f38555l;

    /* renamed from: m, reason: collision with root package name */
    public x f38556m;

    public i2(t.s sVar, t.t tVar, int i10, com.google.firebase.messaging.m mVar) {
        this.f38544a = sVar;
        this.f38545b = tVar;
        this.f38546c = i10;
        this.f38547d = mVar;
    }

    public final int b(int i10) {
        int i11;
        t.s sVar = this.f38544a;
        int i12 = sVar.f34898b;
        int i13 = 0;
        if (i12 >= 0) {
            int i14 = i12 - 1;
            while (true) {
                if (i13 <= i14) {
                    i11 = (i13 + i14) >>> 1;
                    int e10 = sVar.e(i11);
                    if (e10 < i10) {
                        i13 = i11 + 1;
                    } else {
                        if (e10 <= i10) {
                            break;
                        }
                        i14 = i11 - 1;
                    }
                } else {
                    i11 = -(i13 + 1);
                    break;
                }
            }
            if (i11 < -1) {
                return -(i11 + 2);
            }
            return i11;
        }
        e.w("fromIndex(0) > toIndex(" + i12 + ')');
        throw null;
    }

    @Override // w.a2
    public final t e(long j10, t tVar, t tVar2, t tVar3) {
        int i10;
        t tVar4 = tVar;
        t tVar5 = tVar2;
        int i11 = 0;
        int g10 = (int) kotlin.ranges.d.g((j10 / 1000000) - 0, 0L, i());
        t.t tVar6 = this.f38545b;
        if (tVar6.b(g10)) {
            Object g11 = tVar6.g(g10);
            Intrinsics.c(g11);
            return ((h2) g11).f38518a;
        }
        if (g10 >= this.f38546c) {
            return tVar5;
        }
        if (g10 <= 0) {
            return tVar4;
        }
        j(tVar4, tVar5, tVar3);
        if (this.f38556m != null) {
            float h10 = h(b(g10), g10, false);
            x xVar = this.f38556m;
            if (xVar != null) {
                float[] fArr = this.f38554k;
                if (fArr != null) {
                    w[][] wVarArr = xVar.f38724a;
                    float f10 = wVarArr[0][0].f38704a;
                    if (h10 >= f10 && h10 <= wVarArr[wVarArr.length - 1][0].f38705b) {
                        int length = wVarArr.length;
                        int i12 = 0;
                        boolean z10 = false;
                        while (i12 < length) {
                            int i13 = i11;
                            int i14 = i13;
                            while (i13 < fArr.length) {
                                w wVar = wVarArr[i12][i14];
                                if (h10 <= wVar.f38705b) {
                                    if (wVar.f38721r) {
                                        float f11 = wVar.f38704a;
                                        float f12 = wVar.f38714k;
                                        float f13 = wVar.f38708e;
                                        float f14 = wVar.f38706c;
                                        fArr[i13] = nn.d.b(f13, f14, (h10 - f11) * f12, f14);
                                        float f15 = (h10 - f11) * f12;
                                        float f16 = wVar.f38709f;
                                        float f17 = wVar.f38707d;
                                        fArr[i13 + 1] = nn.d.b(f16, f17, f15, f17);
                                    } else {
                                        wVar.c(h10);
                                        w wVar2 = wVarArr[i12][i14];
                                        fArr[i13] = (wVar2.f38715l * wVar2.f38711h) + wVar2.f38717n;
                                        fArr[i13 + 1] = (wVar2.f38716m * wVar2.f38712i) + wVar2.f38718o;
                                    }
                                    z10 = true;
                                }
                                i13 += 2;
                                i14++;
                            }
                            if (z10) {
                                break;
                            }
                            i12++;
                            i11 = 0;
                        }
                    } else {
                        if (h10 > wVarArr[wVarArr.length - 1][0].f38705b) {
                            i10 = wVarArr.length - 1;
                            f10 = wVarArr[wVarArr.length - 1][0].f38705b;
                        } else {
                            i10 = 0;
                        }
                        float f18 = h10 - f10;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < fArr.length) {
                            w wVar3 = wVarArr[i10][i16];
                            if (wVar3.f38721r) {
                                float f19 = wVar3.f38704a;
                                float f20 = wVar3.f38714k;
                                float f21 = wVar3.f38708e;
                                float f22 = wVar3.f38706c;
                                fArr[i15] = (wVar3.f38717n * f18) + nn.d.b(f21, f22, (f10 - f19) * f20, f22);
                                float f23 = (f10 - f19) * f20;
                                float f24 = wVar3.f38709f;
                                float f25 = wVar3.f38707d;
                                fArr[i15 + 1] = (wVar3.f38718o * f18) + nn.d.b(f24, f25, f23, f25);
                            } else {
                                wVar3.c(f10);
                                w wVar4 = wVarArr[i10][i16];
                                fArr[i15] = (wVar4.a() * f18) + (wVar4.f38715l * wVar4.f38711h) + wVar4.f38717n;
                                w wVar5 = wVarArr[i10][i16];
                                fArr[i15 + 1] = (wVar5.b() * f18) + (wVar5.f38716m * wVar5.f38712i) + wVar5.f38718o;
                            }
                            i15 += 2;
                            i16++;
                        }
                    }
                    float[] fArr2 = this.f38554k;
                    if (fArr2 != null) {
                        int length2 = fArr2.length;
                        for (int i17 = 0; i17 < length2; i17++) {
                            t tVar7 = this.f38550g;
                            if (tVar7 != null) {
                                float[] fArr3 = this.f38554k;
                                if (fArr3 != null) {
                                    tVar7.e(i17, fArr3[i17]);
                                } else {
                                    Intrinsics.k("posArray");
                                    throw null;
                                }
                            } else {
                                Intrinsics.k("valueVector");
                                throw null;
                            }
                        }
                        t tVar8 = this.f38550g;
                        if (tVar8 != null) {
                            return tVar8;
                        }
                        Intrinsics.k("valueVector");
                        throw null;
                    }
                    Intrinsics.k("posArray");
                    throw null;
                }
                Intrinsics.k("posArray");
                throw null;
            }
            Intrinsics.k("arcSpline");
            throw null;
        }
        int b10 = b(g10);
        float h11 = h(b10, g10, true);
        t.s sVar = this.f38544a;
        int e10 = sVar.e(b10);
        if (tVar6.b(e10)) {
            Object g12 = tVar6.g(e10);
            Intrinsics.c(g12);
            tVar4 = ((h2) g12).f38518a;
        }
        int e11 = sVar.e(b10 + 1);
        if (tVar6.b(e11)) {
            Object g13 = tVar6.g(e11);
            Intrinsics.c(g13);
            tVar5 = ((h2) g13).f38518a;
        }
        t tVar9 = this.f38550g;
        if (tVar9 != null) {
            int b11 = tVar9.b();
            for (int i18 = 0; i18 < b11; i18++) {
                t tVar10 = this.f38550g;
                if (tVar10 != null) {
                    float a10 = tVar4.a(i18);
                    float a11 = tVar5.a(i18);
                    y1 y1Var = z1.f38739a;
                    tVar10.e(i18, (a11 * h11) + ((1 - h11) * a10));
                } else {
                    Intrinsics.k("valueVector");
                    throw null;
                }
            }
            t tVar11 = this.f38550g;
            if (tVar11 != null) {
                return tVar11;
            }
            Intrinsics.k("valueVector");
            throw null;
        }
        Intrinsics.k("valueVector");
        throw null;
    }

    @Override // w.a2
    public final t f(long j10, t tVar, t tVar2, t tVar3) {
        int i10 = 0;
        long g10 = kotlin.ranges.d.g((j10 / 1000000) - 0, 0L, i());
        if (g10 < 0) {
            return tVar3;
        }
        j(tVar, tVar2, tVar3);
        if (this.f38556m != null) {
            int i11 = (int) g10;
            float h10 = h(b(i11), i11, false);
            x xVar = this.f38556m;
            if (xVar != null) {
                float[] fArr = this.f38555l;
                if (fArr != null) {
                    w[][] wVarArr = xVar.f38724a;
                    float f10 = wVarArr[0][0].f38704a;
                    if (h10 < f10) {
                        h10 = f10;
                    } else if (h10 > wVarArr[wVarArr.length - 1][0].f38705b) {
                        h10 = wVarArr[wVarArr.length - 1][0].f38705b;
                    }
                    int length = wVarArr.length;
                    boolean z10 = false;
                    for (int i12 = 0; i12 < length; i12++) {
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < fArr.length) {
                            w wVar = wVarArr[i12][i14];
                            if (h10 <= wVar.f38705b) {
                                if (wVar.f38721r) {
                                    fArr[i13] = wVar.f38717n;
                                    fArr[i13 + 1] = wVar.f38718o;
                                } else {
                                    wVar.c(h10);
                                    fArr[i13] = wVarArr[i12][i14].a();
                                    fArr[i13 + 1] = wVarArr[i12][i14].b();
                                }
                                z10 = true;
                            }
                            i13 += 2;
                            i14++;
                        }
                        if (z10) {
                            break;
                        }
                    }
                    float[] fArr2 = this.f38555l;
                    if (fArr2 != null) {
                        int length2 = fArr2.length;
                        while (i10 < length2) {
                            t tVar4 = this.f38551h;
                            if (tVar4 != null) {
                                float[] fArr3 = this.f38555l;
                                if (fArr3 != null) {
                                    tVar4.e(i10, fArr3[i10]);
                                    i10++;
                                } else {
                                    Intrinsics.k("slopeArray");
                                    throw null;
                                }
                            } else {
                                Intrinsics.k("velocityVector");
                                throw null;
                            }
                        }
                        t tVar5 = this.f38551h;
                        if (tVar5 != null) {
                            return tVar5;
                        }
                        Intrinsics.k("velocityVector");
                        throw null;
                    }
                    Intrinsics.k("slopeArray");
                    throw null;
                }
                Intrinsics.k("slopeArray");
                throw null;
            }
            Intrinsics.k("arcSpline");
            throw null;
        }
        t e10 = e((g10 - 1) * 1000000, tVar, tVar2, tVar3);
        t e11 = e(g10 * 1000000, tVar, tVar2, tVar3);
        int b10 = e10.b();
        while (i10 < b10) {
            t tVar6 = this.f38551h;
            if (tVar6 != null) {
                tVar6.e(i10, (e10.a(i10) - e11.a(i10)) * 1000.0f);
                i10++;
            } else {
                Intrinsics.k("velocityVector");
                throw null;
            }
        }
        t tVar7 = this.f38551h;
        if (tVar7 != null) {
            return tVar7;
        }
        Intrinsics.k("velocityVector");
        throw null;
    }

    @Override // w.c2
    public final int g() {
        return 0;
    }

    public final float h(int i10, int i11, boolean z10) {
        d0 d0Var;
        float f10;
        t.s sVar = this.f38544a;
        if (i10 >= sVar.f34898b - 1) {
            f10 = i11;
        } else {
            int e10 = sVar.e(i10);
            int e11 = sVar.e(i10 + 1);
            if (i11 == e10) {
                f10 = e10;
            } else {
                int i12 = e11 - e10;
                h2 h2Var = (h2) this.f38545b.g(e10);
                if (h2Var == null || (d0Var = h2Var.f38519b) == null) {
                    d0Var = this.f38547d;
                }
                float f11 = i12;
                float b10 = d0Var.b((i11 - e10) / f11);
                if (z10) {
                    return b10;
                }
                f10 = (f11 * b10) + e10;
            }
        }
        return f10 / ((float) 1000);
    }

    @Override // w.c2
    public final int i() {
        return this.f38546c;
    }

    public final void j(t tVar, t tVar2, t tVar3) {
        boolean z10;
        float[] fArr;
        float[] fArr2;
        e eVar;
        int i10;
        if (this.f38556m != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t tVar4 = this.f38550g;
        t.t tVar5 = this.f38545b;
        t.s sVar = this.f38544a;
        if (tVar4 == null) {
            t c10 = tVar.c();
            Intrinsics.d(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f38550g = c10;
            t c11 = tVar3.c();
            Intrinsics.d(c11, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f38551h = c11;
            int i11 = sVar.f34898b;
            float[] fArr3 = new float[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                fArr3[i12] = sVar.e(i12) / ((float) 1000);
            }
            this.f38549f = fArr3;
            int i13 = sVar.f34898b;
            int[] iArr = new int[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                h2 h2Var = (h2) tVar5.g(sVar.e(i14));
                v vVar = v.f38700k;
                if (h2Var == null || (eVar = h2Var.f38520c) == null) {
                    eVar = vVar;
                }
                if (!Intrinsics.a(eVar, vVar)) {
                    z10 = true;
                }
                if (Intrinsics.a(eVar, v.f38698i)) {
                    i10 = 5;
                } else if (Intrinsics.a(eVar, v.f38699j)) {
                    i10 = 4;
                } else {
                    Intrinsics.a(eVar, vVar);
                    i10 = 0;
                }
                iArr[i14] = i10;
            }
            this.f38548e = iArr;
        }
        if (!z10) {
            return;
        }
        if (this.f38556m != null) {
            t tVar6 = this.f38552i;
            if (tVar6 != null) {
                if (Intrinsics.a(tVar6, tVar)) {
                    t tVar7 = this.f38553j;
                    if (tVar7 != null) {
                        if (Intrinsics.a(tVar7, tVar2)) {
                            return;
                        }
                    } else {
                        Intrinsics.k("lastTargetValue");
                        throw null;
                    }
                }
            } else {
                Intrinsics.k("lastInitialValue");
                throw null;
            }
        }
        this.f38552i = tVar;
        this.f38553j = tVar2;
        int b10 = tVar.b() + (tVar.b() % 2);
        this.f38554k = new float[b10];
        this.f38555l = new float[b10];
        int i15 = sVar.f34898b;
        float[][] fArr4 = new float[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            int e10 = sVar.e(i16);
            if (e10 == 0) {
                if (!tVar5.b(e10)) {
                    fArr2 = new float[b10];
                    for (int i17 = 0; i17 < b10; i17++) {
                        fArr2[i17] = tVar.a(i17);
                    }
                } else {
                    fArr = new float[b10];
                    Object g10 = tVar5.g(e10);
                    Intrinsics.c(g10);
                    h2 h2Var2 = (h2) g10;
                    for (int i18 = 0; i18 < b10; i18++) {
                        fArr[i18] = h2Var2.f38518a.a(i18);
                    }
                    fArr2 = fArr;
                }
            } else {
                if (e10 == this.f38546c) {
                    if (!tVar5.b(e10)) {
                        fArr2 = new float[b10];
                        for (int i19 = 0; i19 < b10; i19++) {
                            fArr2[i19] = tVar2.a(i19);
                        }
                    } else {
                        fArr = new float[b10];
                        Object g11 = tVar5.g(e10);
                        Intrinsics.c(g11);
                        h2 h2Var3 = (h2) g11;
                        for (int i20 = 0; i20 < b10; i20++) {
                            fArr[i20] = h2Var3.f38518a.a(i20);
                        }
                    }
                } else {
                    fArr = new float[b10];
                    Object g12 = tVar5.g(e10);
                    Intrinsics.c(g12);
                    h2 h2Var4 = (h2) g12;
                    for (int i21 = 0; i21 < b10; i21++) {
                        fArr[i21] = h2Var4.f38518a.a(i21);
                    }
                }
                fArr2 = fArr;
            }
            fArr4[i16] = fArr2;
        }
        int[] iArr2 = this.f38548e;
        if (iArr2 != null) {
            float[] fArr5 = this.f38549f;
            if (fArr5 != null) {
                this.f38556m = new x(iArr2, fArr5, fArr4);
                return;
            } else {
                Intrinsics.k("times");
                throw null;
            }
        }
        Intrinsics.k("modes");
        throw null;
    }
}
