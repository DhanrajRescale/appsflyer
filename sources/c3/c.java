package c3;

import h8.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public final b f7902d;

    /* renamed from: a, reason: collision with root package name */
    public g f7899a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f7900b = s0.g.f34069a;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7901c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f7903e = false;

    public c(h hVar) {
        this.f7902d = new a(this, hVar);
    }

    public final void a(d dVar, int i10) {
        this.f7902d.a(dVar.j(i10), 1.0f);
        this.f7902d.a(dVar.j(i10), -1.0f);
    }

    public final void b(g gVar, g gVar2, g gVar3, int i10) {
        boolean z10;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f7900b = i10;
            if (z10) {
                this.f7902d.a(gVar, 1.0f);
                this.f7902d.a(gVar2, -1.0f);
                this.f7902d.a(gVar3, -1.0f);
                return;
            }
        }
        this.f7902d.a(gVar, -1.0f);
        this.f7902d.a(gVar2, 1.0f);
        this.f7902d.a(gVar3, 1.0f);
    }

    public final void c(g gVar, g gVar2, g gVar3, int i10) {
        boolean z10;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f7900b = i10;
            if (z10) {
                this.f7902d.a(gVar, 1.0f);
                this.f7902d.a(gVar2, -1.0f);
                this.f7902d.a(gVar3, 1.0f);
                return;
            }
        }
        this.f7902d.a(gVar, -1.0f);
        this.f7902d.a(gVar2, 1.0f);
        this.f7902d.a(gVar3, -1.0f);
    }

    public g d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        if (this.f7899a == null && this.f7900b == s0.g.f34069a && this.f7902d.b() == 0) {
            return true;
        }
        return false;
    }

    public final g f(boolean[] zArr, g gVar) {
        int i10;
        int b10 = this.f7902d.b();
        g gVar2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < b10; i11++) {
            float e10 = this.f7902d.e(i11);
            if (e10 < s0.g.f34069a) {
                g c10 = this.f7902d.c(i11);
                if ((zArr == null || !zArr[c10.f7929b]) && c10 != gVar && (((i10 = c10.f7939l) == 3 || i10 == 4) && e10 < f10)) {
                    f10 = e10;
                    gVar2 = c10;
                }
            }
        }
        return gVar2;
    }

    public final void g(g gVar) {
        g gVar2 = this.f7899a;
        if (gVar2 != null) {
            this.f7902d.a(gVar2, -1.0f);
            this.f7899a.f7930c = -1;
            this.f7899a = null;
        }
        float h10 = this.f7902d.h(gVar, true) * (-1.0f);
        this.f7899a = gVar;
        if (h10 == 1.0f) {
            return;
        }
        this.f7900b /= h10;
        this.f7902d.k(h10);
    }

    public final void h(d dVar, g gVar, boolean z10) {
        if (gVar != null && gVar.f7933f) {
            float f10 = this.f7902d.f(gVar);
            this.f7900b = (gVar.f7932e * f10) + this.f7900b;
            this.f7902d.h(gVar, z10);
            if (z10) {
                gVar.b(this);
            }
            if (this.f7902d.b() == 0) {
                this.f7903e = true;
                dVar.f7906b = true;
            }
        }
    }

    public void i(d dVar, c cVar, boolean z10) {
        float g10 = this.f7902d.g(cVar, z10);
        this.f7900b = (cVar.f7900b * g10) + this.f7900b;
        if (z10) {
            cVar.f7899a.b(this);
        }
        if (this.f7899a != null && this.f7902d.b() == 0) {
            this.f7903e = true;
            dVar.f7906b = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            c3.g r0 = r10.f7899a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            c3.g r1 = r10.f7899a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = jr.h.r(r0, r1)
            float r1 = r10.f7900b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = da.e.p(r0)
            float r1 = r10.f7900b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            c3.b r5 = r10.f7902d
            int r5 = r5.b()
        L3c:
            if (r4 >= r5) goto L9c
            c3.b r6 = r10.f7902d
            c3.g r6 = r6.c(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            c3.b r7 = r10.f7902d
            float r7 = r7.e(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = jr.h.r(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = jr.h.r(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = jr.h.r(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = jr.h.r(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = jr.h.r(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.c.toString():java.lang.String");
    }
}
