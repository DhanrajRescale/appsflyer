package s9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import j9.b0;
import j9.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m9.r;
import m9.s;
import m9.u;
import okhttp3.HttpUrl;
import t.o;
import w.k;

/* loaded from: classes.dex */
public final class j extends b {
    public final StringBuilder C;
    public final RectF D;
    public final Matrix E;
    public final h F;
    public final h G;
    public final HashMap H;
    public final o I;
    public final ArrayList J;
    public final s K;
    public final y L;
    public final j9.i M;
    public final m9.e N;
    public u O;
    public final m9.e P;
    public u Q;
    public final m9.i R;
    public u S;
    public final m9.i T;
    public u U;
    public u V;
    public u W;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [m9.e, m9.s] */
    public j(y yVar, e eVar) {
        super(yVar, eVar);
        q9.a aVar;
        q9.a aVar2;
        bk.c cVar;
        bk.c cVar2;
        this.C = new StringBuilder(2);
        this.D = new RectF();
        this.E = new Matrix();
        this.F = new h(0);
        this.G = new h(1);
        this.H = new HashMap();
        this.I = new o((Object) null);
        this.J = new ArrayList();
        this.L = yVar;
        this.M = eVar.f34378b;
        ?? eVar2 = new m9.e((List) eVar.f34393q.f3178b);
        this.K = eVar2;
        eVar2.a(this);
        g(eVar2);
        h8.h hVar = eVar.f34394r;
        if (hVar != null && (cVar2 = (bk.c) hVar.f18056b) != null) {
            m9.e a10 = cVar2.a();
            this.N = a10;
            a10.a(this);
            g(a10);
        }
        if (hVar != null && (cVar = (bk.c) hVar.f18057c) != null) {
            m9.e a11 = cVar.a();
            this.P = a11;
            a11.a(this);
            g(a11);
        }
        if (hVar != null && (aVar2 = (q9.a) hVar.f18058d) != null) {
            m9.e a12 = aVar2.a();
            this.R = (m9.i) a12;
            a12.a(this);
            g(a12);
        }
        if (hVar != null && (aVar = (q9.a) hVar.f18059e) != null) {
            m9.e a13 = aVar.a();
            this.T = (m9.i) a13;
            a13.a(this);
            g(a13);
        }
    }

    public static void t(String str, h hVar, Canvas canvas) {
        if (hVar.getColor() == 0) {
            return;
        }
        if (hVar.getStyle() == Paint.Style.STROKE && hVar.getStrokeWidth() == s0.g.f34069a) {
            return;
        }
        canvas.drawText(str, 0, str.length(), s0.g.f34069a, s0.g.f34069a, (Paint) hVar);
    }

    public static void u(Path path, h hVar, Canvas canvas) {
        if (hVar.getColor() == 0) {
            return;
        }
        if (hVar.getStyle() == Paint.Style.STROKE && hVar.getStrokeWidth() == s0.g.f34069a) {
            return;
        }
        canvas.drawPath(path, hVar);
    }

    public static void w(Canvas canvas, p9.b bVar, int i10, float f10) {
        float f11;
        float f12;
        PointF pointF = bVar.f30782l;
        PointF pointF2 = bVar.f30783m;
        float c10 = w9.f.c();
        float f13 = s0.g.f34069a;
        if (pointF == null) {
            f11 = 0.0f;
        } else {
            f11 = (bVar.f30776f * c10) + pointF.y;
        }
        float f14 = (i10 * bVar.f30776f * c10) + f11;
        if (pointF == null) {
            f12 = 0.0f;
        } else {
            f12 = pointF.x;
        }
        if (pointF2 != null) {
            f13 = pointF2.x;
        }
        int e10 = k.e(bVar.f30774d);
        if (e10 != 0) {
            if (e10 != 1) {
                if (e10 == 2) {
                    canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f14);
                    return;
                }
                return;
            }
            canvas.translate((f12 + f13) - f10, f14);
            return;
        }
        canvas.translate(f12, f14);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [x9.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p9.b] */
    @Override // s9.b, p9.f
    public final void c(x9.c cVar, Object obj) {
        super.c(cVar, obj);
        if (obj == b0.f21105a) {
            u uVar = this.O;
            if (uVar != null) {
                p(uVar);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            u uVar2 = new u(cVar, null);
            this.O = uVar2;
            uVar2.a(this);
            g(this.O);
            return;
        }
        if (obj == b0.f21106b) {
            u uVar3 = this.Q;
            if (uVar3 != null) {
                p(uVar3);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            u uVar4 = new u(cVar, null);
            this.Q = uVar4;
            uVar4.a(this);
            g(this.Q);
            return;
        }
        if (obj == b0.f21123s) {
            u uVar5 = this.S;
            if (uVar5 != null) {
                p(uVar5);
            }
            if (cVar == null) {
                this.S = null;
                return;
            }
            u uVar6 = new u(cVar, null);
            this.S = uVar6;
            uVar6.a(this);
            g(this.S);
            return;
        }
        if (obj == b0.f21124t) {
            u uVar7 = this.U;
            if (uVar7 != null) {
                p(uVar7);
            }
            if (cVar == null) {
                this.U = null;
                return;
            }
            u uVar8 = new u(cVar, null);
            this.U = uVar8;
            uVar8.a(this);
            g(this.U);
            return;
        }
        if (obj == b0.F) {
            u uVar9 = this.V;
            if (uVar9 != null) {
                p(uVar9);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            u uVar10 = new u(cVar, null);
            this.V = uVar10;
            uVar10.a(this);
            g(this.V);
            return;
        }
        if (obj == b0.M) {
            u uVar11 = this.W;
            if (uVar11 != null) {
                p(uVar11);
            }
            if (cVar == null) {
                this.W = null;
                return;
            }
            u uVar12 = new u(cVar, null);
            this.W = uVar12;
            uVar12.a(this);
            g(this.W);
            return;
        }
        if (obj == b0.O) {
            s sVar = this.K;
            sVar.getClass();
            sVar.k(new r(new Object(), cVar, new Object()));
        }
    }

    @Override // s9.b, l9.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        j9.i iVar = this.M;
        rectF.set(s0.g.f34069a, s0.g.f34069a, iVar.f21175j.width(), iVar.f21175j.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03e2  */
    @Override // s9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.graphics.Canvas r28, android.graphics.Matrix r29, int r30) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.j.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [s9.i, java.lang.Object] */
    public final i v(int i10) {
        ArrayList arrayList = this.J;
        for (int size = arrayList.size(); size < i10; size++) {
            ?? obj = new Object();
            obj.f34401a = HttpUrl.FRAGMENT_ENCODE_SET;
            obj.f34402b = s0.g.f34069a;
            arrayList.add(obj);
        }
        return (i) arrayList.get(i10 - 1);
    }

    public final List x(String str, float f10, p9.c cVar, float f11, float f12, boolean z10) {
        float measureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (z10) {
                p9.d dVar = (p9.d) this.M.f21172g.e(p9.d.a(charAt, cVar.f30784a, cVar.f30786c));
                if (dVar != null) {
                    measureText = (w9.f.c() * ((float) dVar.f30790c) * f11) + f12;
                }
            } else {
                measureText = this.F.measureText(str.substring(i13, i13 + 1)) + f12;
            }
            if (charAt == ' ') {
                z11 = true;
                f15 = measureText;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = measureText;
            } else {
                f14 += measureText;
            }
            f13 += measureText;
            if (f10 > s0.g.f34069a && f13 >= f10 && charAt != ' ') {
                i10++;
                i v10 = v(i10);
                if (i12 == i11) {
                    v10.f34401a = str.substring(i11, i13).trim();
                    v10.f34402b = (f13 - measureText) - ((r10.length() - r8.length()) * f15);
                    i11 = i13;
                    i12 = i11;
                    f13 = measureText;
                    f14 = f13;
                } else {
                    v10.f34401a = str.substring(i11, i12 - 1).trim();
                    v10.f34402b = ((f13 - f14) - ((r8.length() - r14.length()) * f15)) - f15;
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > s0.g.f34069a) {
            i10++;
            i v11 = v(i10);
            v11.f34401a = str.substring(i11);
            v11.f34402b = f13;
        }
        return this.J.subList(0, i10);
    }
}
