package c3;

import d2.p0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: f, reason: collision with root package name */
    public g[] f7924f;

    /* renamed from: g, reason: collision with root package name */
    public g[] f7925g;

    /* renamed from: h, reason: collision with root package name */
    public int f7926h;

    /* renamed from: i, reason: collision with root package name */
    public h.c f7927i;

    @Override // c3.c
    public final g d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f7926h; i11++) {
            g[] gVarArr = this.f7924f;
            g gVar = gVarArr[i11];
            if (!zArr[gVar.f7929b]) {
                h.c cVar = this.f7927i;
                cVar.f17583b = gVar;
                int i12 = 8;
                if (i10 == -1) {
                    while (i12 >= 0) {
                        float f10 = ((g) cVar.f17583b).f7935h[i12];
                        if (f10 <= s0.g.f34069a) {
                            if (f10 < s0.g.f34069a) {
                                i10 = i11;
                                break;
                            }
                            i12--;
                        }
                    }
                } else {
                    g gVar2 = gVarArr[i10];
                    while (true) {
                        if (i12 >= 0) {
                            float f11 = gVar2.f7935h[i12];
                            float f12 = ((g) cVar.f17583b).f7935h[i12];
                            if (f12 == f11) {
                                i12--;
                            } else if (f12 >= f11) {
                            }
                        }
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f7924f[i10];
    }

    @Override // c3.c
    public final boolean e() {
        return this.f7926h == 0;
    }

    @Override // c3.c
    public final void i(d dVar, c cVar, boolean z10) {
        g gVar = cVar.f7899a;
        if (gVar == null) {
            return;
        }
        b bVar = cVar.f7902d;
        int b10 = bVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            g c10 = bVar.c(i10);
            float e10 = bVar.e(i10);
            h.c cVar2 = this.f7927i;
            cVar2.f17583b = c10;
            boolean z11 = c10.f7928a;
            float[] fArr = gVar.f7935h;
            if (z11) {
                boolean z12 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = ((g) cVar2.f17583b).f7935h;
                    float f10 = (fArr[i11] * e10) + fArr2[i11];
                    fArr2[i11] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((g) cVar2.f17583b).f7935h[i11] = 0.0f;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    ((f) cVar2.f17585d).k((g) cVar2.f17583b);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = fArr[i12];
                    if (f11 != s0.g.f34069a) {
                        float f12 = f11 * e10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((g) cVar2.f17583b).f7935h[i12] = f12;
                    } else {
                        ((g) cVar2.f17583b).f7935h[i12] = 0.0f;
                    }
                }
                j(c10);
            }
            this.f7900b = (cVar.f7900b * e10) + this.f7900b;
        }
        k(gVar);
    }

    public final void j(g gVar) {
        int i10;
        int i11 = this.f7926h + 1;
        g[] gVarArr = this.f7924f;
        if (i11 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.f7924f = gVarArr2;
            this.f7925g = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.f7924f;
        int i12 = this.f7926h;
        gVarArr3[i12] = gVar;
        int i13 = i12 + 1;
        this.f7926h = i13;
        if (i13 > 1 && gVarArr3[i12].f7929b > gVar.f7929b) {
            int i14 = 0;
            while (true) {
                i10 = this.f7926h;
                if (i14 >= i10) {
                    break;
                }
                this.f7925g[i14] = this.f7924f[i14];
                i14++;
            }
            Arrays.sort(this.f7925g, 0, i10, new p0(this, 1));
            for (int i15 = 0; i15 < this.f7926h; i15++) {
                this.f7924f[i15] = this.f7925g[i15];
            }
        }
        gVar.f7928a = true;
        gVar.a(this);
    }

    public final void k(g gVar) {
        int i10 = 0;
        while (i10 < this.f7926h) {
            if (this.f7924f[i10] == gVar) {
                while (true) {
                    int i11 = this.f7926h;
                    if (i10 < i11 - 1) {
                        g[] gVarArr = this.f7924f;
                        int i12 = i10 + 1;
                        gVarArr[i10] = gVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f7926h = i11 - 1;
                        gVar.f7928a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // c3.c
    public final String toString() {
        String str = " goal -> (" + this.f7900b + ") : ";
        for (int i10 = 0; i10 < this.f7926h; i10++) {
            g gVar = this.f7924f[i10];
            h.c cVar = this.f7927i;
            cVar.f17583b = gVar;
            str = str + cVar + " ";
        }
        return str;
    }
}
