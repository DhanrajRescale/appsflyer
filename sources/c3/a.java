package c3;

import h8.h;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final c f7890b;

    /* renamed from: c, reason: collision with root package name */
    public final h f7891c;

    /* renamed from: a, reason: collision with root package name */
    public int f7889a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f7892d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f7893e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f7894f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f7895g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f7896h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f7897i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7898j = false;

    public a(c cVar, h hVar) {
        this.f7890b = cVar;
        this.f7891c = hVar;
    }

    @Override // c3.b
    public final void a(g gVar, float f10) {
        if (f10 == s0.g.f34069a) {
            h(gVar, true);
            return;
        }
        int i10 = this.f7896h;
        c cVar = this.f7890b;
        if (i10 == -1) {
            this.f7896h = 0;
            this.f7895g[0] = f10;
            this.f7893e[0] = gVar.f7929b;
            this.f7894f[0] = -1;
            gVar.f7938k++;
            gVar.a(cVar);
            this.f7889a++;
            if (!this.f7898j) {
                int i11 = this.f7897i + 1;
                this.f7897i = i11;
                int[] iArr = this.f7893e;
                if (i11 >= iArr.length) {
                    this.f7898j = true;
                    this.f7897i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f7889a; i13++) {
            int i14 = this.f7893e[i10];
            int i15 = gVar.f7929b;
            if (i14 == i15) {
                this.f7895g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f7894f[i10];
        }
        int i16 = this.f7897i;
        int i17 = i16 + 1;
        if (this.f7898j) {
            int[] iArr2 = this.f7893e;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f7893e;
        if (i16 >= iArr3.length && this.f7889a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f7893e;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.f7893e;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f7892d * 2;
            this.f7892d = i19;
            this.f7898j = false;
            this.f7897i = i16 - 1;
            this.f7895g = Arrays.copyOf(this.f7895g, i19);
            this.f7893e = Arrays.copyOf(this.f7893e, this.f7892d);
            this.f7894f = Arrays.copyOf(this.f7894f, this.f7892d);
        }
        this.f7893e[i16] = gVar.f7929b;
        this.f7895g[i16] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f7894f;
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            this.f7894f[i16] = this.f7896h;
            this.f7896h = i16;
        }
        gVar.f7938k++;
        gVar.a(cVar);
        int i20 = this.f7889a + 1;
        this.f7889a = i20;
        if (!this.f7898j) {
            this.f7897i++;
        }
        int[] iArr7 = this.f7893e;
        if (i20 >= iArr7.length) {
            this.f7898j = true;
        }
        if (this.f7897i >= iArr7.length) {
            this.f7898j = true;
            this.f7897i = iArr7.length - 1;
        }
    }

    @Override // c3.b
    public final int b() {
        return this.f7889a;
    }

    @Override // c3.b
    public final g c(int i10) {
        int i11 = this.f7896h;
        for (int i12 = 0; i11 != -1 && i12 < this.f7889a; i12++) {
            if (i12 == i10) {
                return ((g[]) this.f7891c.f18059e)[this.f7893e[i11]];
            }
            i11 = this.f7894f[i11];
        }
        return null;
    }

    @Override // c3.b
    public final void clear() {
        int i10 = this.f7896h;
        for (int i11 = 0; i10 != -1 && i11 < this.f7889a; i11++) {
            g gVar = ((g[]) this.f7891c.f18059e)[this.f7893e[i10]];
            if (gVar != null) {
                gVar.b(this.f7890b);
            }
            i10 = this.f7894f[i10];
        }
        this.f7896h = -1;
        this.f7897i = -1;
        this.f7898j = false;
        this.f7889a = 0;
    }

    @Override // c3.b
    public final void d() {
        int i10 = this.f7896h;
        for (int i11 = 0; i10 != -1 && i11 < this.f7889a; i11++) {
            float[] fArr = this.f7895g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f7894f[i10];
        }
    }

    @Override // c3.b
    public final float e(int i10) {
        int i11 = this.f7896h;
        for (int i12 = 0; i11 != -1 && i12 < this.f7889a; i12++) {
            if (i12 == i10) {
                return this.f7895g[i11];
            }
            i11 = this.f7894f[i11];
        }
        return s0.g.f34069a;
    }

    @Override // c3.b
    public final float f(g gVar) {
        int i10 = this.f7896h;
        for (int i11 = 0; i10 != -1 && i11 < this.f7889a; i11++) {
            if (this.f7893e[i10] == gVar.f7929b) {
                return this.f7895g[i10];
            }
            i10 = this.f7894f[i10];
        }
        return s0.g.f34069a;
    }

    @Override // c3.b
    public final float g(c cVar, boolean z10) {
        float f10 = f(cVar.f7899a);
        h(cVar.f7899a, z10);
        b bVar = cVar.f7902d;
        int b10 = bVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            g c10 = bVar.c(i10);
            i(c10, bVar.f(c10) * f10, z10);
        }
        return f10;
    }

    @Override // c3.b
    public final float h(g gVar, boolean z10) {
        int i10 = this.f7896h;
        if (i10 == -1) {
            return s0.g.f34069a;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f7889a) {
            if (this.f7893e[i10] == gVar.f7929b) {
                if (i10 == this.f7896h) {
                    this.f7896h = this.f7894f[i10];
                } else {
                    int[] iArr = this.f7894f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    gVar.b(this.f7890b);
                }
                gVar.f7938k--;
                this.f7889a--;
                this.f7893e[i10] = -1;
                if (this.f7898j) {
                    this.f7897i = i10;
                }
                return this.f7895g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f7894f[i10];
        }
        return s0.g.f34069a;
    }

    @Override // c3.b
    public final void i(g gVar, float f10, boolean z10) {
        if (f10 > -0.001f && f10 < 0.001f) {
            return;
        }
        int i10 = this.f7896h;
        c cVar = this.f7890b;
        if (i10 == -1) {
            this.f7896h = 0;
            this.f7895g[0] = f10;
            this.f7893e[0] = gVar.f7929b;
            this.f7894f[0] = -1;
            gVar.f7938k++;
            gVar.a(cVar);
            this.f7889a++;
            if (!this.f7898j) {
                int i11 = this.f7897i + 1;
                this.f7897i = i11;
                int[] iArr = this.f7893e;
                if (i11 >= iArr.length) {
                    this.f7898j = true;
                    this.f7897i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f7889a; i13++) {
            int i14 = this.f7893e[i10];
            int i15 = gVar.f7929b;
            if (i14 == i15) {
                float[] fArr = this.f7895g;
                float f11 = fArr[i10] + f10;
                if (f11 > -0.001f && f11 < 0.001f) {
                    f11 = 0.0f;
                }
                fArr[i10] = f11;
                if (f11 == s0.g.f34069a) {
                    if (i10 == this.f7896h) {
                        this.f7896h = this.f7894f[i10];
                    } else {
                        int[] iArr2 = this.f7894f;
                        iArr2[i12] = iArr2[i10];
                    }
                    if (z10) {
                        gVar.b(cVar);
                    }
                    if (this.f7898j) {
                        this.f7897i = i10;
                    }
                    gVar.f7938k--;
                    this.f7889a--;
                    return;
                }
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f7894f[i10];
        }
        int i16 = this.f7897i;
        int i17 = i16 + 1;
        if (this.f7898j) {
            int[] iArr3 = this.f7893e;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f7893e;
        if (i16 >= iArr4.length && this.f7889a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f7893e;
                if (i18 >= iArr5.length) {
                    break;
                }
                if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr6 = this.f7893e;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f7892d * 2;
            this.f7892d = i19;
            this.f7898j = false;
            this.f7897i = i16 - 1;
            this.f7895g = Arrays.copyOf(this.f7895g, i19);
            this.f7893e = Arrays.copyOf(this.f7893e, this.f7892d);
            this.f7894f = Arrays.copyOf(this.f7894f, this.f7892d);
        }
        this.f7893e[i16] = gVar.f7929b;
        this.f7895g[i16] = f10;
        if (i12 != -1) {
            int[] iArr7 = this.f7894f;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f7894f[i16] = this.f7896h;
            this.f7896h = i16;
        }
        gVar.f7938k++;
        gVar.a(cVar);
        this.f7889a++;
        if (!this.f7898j) {
            this.f7897i++;
        }
        int i20 = this.f7897i;
        int[] iArr8 = this.f7893e;
        if (i20 >= iArr8.length) {
            this.f7898j = true;
            this.f7897i = iArr8.length - 1;
        }
    }

    @Override // c3.b
    public final boolean j(g gVar) {
        int i10 = this.f7896h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f7889a; i11++) {
            if (this.f7893e[i10] == gVar.f7929b) {
                return true;
            }
            i10 = this.f7894f[i10];
        }
        return false;
    }

    @Override // c3.b
    public final void k(float f10) {
        int i10 = this.f7896h;
        for (int i11 = 0; i10 != -1 && i11 < this.f7889a; i11++) {
            float[] fArr = this.f7895g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f7894f[i10];
        }
    }

    public final String toString() {
        int i10 = this.f7896h;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        for (int i11 = 0; i10 != -1 && i11 < this.f7889a; i11++) {
            StringBuilder p10 = da.e.p(jr.h.r(str, " -> "));
            p10.append(this.f7895g[i10]);
            p10.append(" : ");
            StringBuilder p11 = da.e.p(p10.toString());
            p11.append(((g[]) this.f7891c.f18059e)[this.f7893e[i10]]);
            str = p11.toString();
            i10 = this.f7894f[i10];
        }
        return str;
    }
}
