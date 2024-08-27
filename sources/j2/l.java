package j2;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n1.v0;
import n1.w0;
import n1.z0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final n f20730a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20731b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20732c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20733d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20734e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20735f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f20736g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f20737h;

    public l(n nVar, long j10, int i10, boolean z10) {
        boolean z11;
        m1.d dVar;
        int g10;
        this.f20730a = nVar;
        this.f20731b = i10;
        if (w2.a.j(j10) == 0 && w2.a.i(j10) == 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = nVar.f20744e;
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            float f10 = s0.g.f34069a;
            while (i11 < size) {
                q qVar = (q) arrayList2.get(i11);
                r rVar = qVar.f20752a;
                int h10 = w2.a.h(j10);
                if (w2.a.c(j10)) {
                    g10 = w2.a.g(j10) - ((int) Math.ceil(f10));
                    if (g10 < 0) {
                        g10 = 0;
                    }
                } else {
                    g10 = w2.a.g(j10);
                }
                long c10 = hl.f.c(h10, g10, 5);
                int i13 = this.f20731b - i12;
                Intrinsics.d(rVar, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
                a aVar = new a((r2.c) rVar, i13, z10, c10);
                float b10 = aVar.b() + f10;
                k2.t tVar = aVar.f20630d;
                int i14 = i12 + tVar.f21965e;
                arrayList.add(new p(aVar, qVar.f20753b, qVar.f20754c, i12, i14, f10, b10));
                if (!tVar.f21963c) {
                    i12 = i14;
                    if (i12 != this.f20731b || i11 == vt.y.f(this.f20730a.f20744e)) {
                        i11++;
                        f10 = b10;
                    }
                } else {
                    i12 = i14;
                }
                z11 = true;
                f10 = b10;
                break;
            }
            z11 = false;
            this.f20734e = f10;
            this.f20735f = i12;
            this.f20732c = z11;
            this.f20737h = arrayList;
            this.f20733d = w2.a.h(j10);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                p pVar = (p) arrayList.get(i15);
                List list = ((a) pVar.f20745a).f20632f;
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    m1.d dVar2 = (m1.d) list.get(i16);
                    if (dVar2 != null) {
                        dVar = dVar2.g(t0.t.g(s0.g.f34069a, pVar.f20750f));
                    } else {
                        dVar = null;
                    }
                    arrayList4.add(dVar);
                }
                vt.d0.m(arrayList4, arrayList3);
            }
            if (arrayList3.size() < this.f20730a.f20741b.size()) {
                int size4 = this.f20730a.f20741b.size() - arrayList3.size();
                ArrayList arrayList5 = new ArrayList(size4);
                for (int i17 = 0; i17 < size4; i17++) {
                    arrayList5.add(null);
                }
                arrayList3 = vt.g0.I(arrayList5, arrayList3);
            }
            this.f20736g = arrayList3;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public static void b(l lVar, n1.r rVar, long j10, w0 w0Var, u2.j jVar, p1.i iVar) {
        p1.h.S.getClass();
        int i10 = p1.g.f30507b;
        lVar.getClass();
        rVar.h();
        ArrayList arrayList = lVar.f20737h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            p pVar = (p) arrayList.get(i11);
            ((a) pVar.f20745a).e(rVar, j10, w0Var, jVar, iVar, i10);
            rVar.r(s0.g.f34069a, ((a) pVar.f20745a).b());
        }
        rVar.s();
    }

    public static void c(l lVar, n1.r rVar, n1.p pVar, float f10, w0 w0Var, u2.j jVar, p1.i iVar) {
        p1.h.S.getClass();
        int i10 = p1.g.f30507b;
        lVar.getClass();
        rVar.h();
        ArrayList arrayList = lVar.f20737h;
        if (arrayList.size() <= 1) {
            d2.w0.j(lVar, rVar, pVar, f10, w0Var, jVar, iVar, i10);
        } else if (pVar instanceof z0) {
            d2.w0.j(lVar, rVar, pVar, f10, w0Var, jVar, iVar, i10);
        } else if (pVar instanceof v0) {
            int size = arrayList.size();
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                p pVar2 = (p) arrayList.get(i11);
                f12 += ((a) pVar2.f20745a).b();
                f11 = Math.max(f11, ((a) pVar2.f20745a).c());
            }
            Shader b10 = ((v0) pVar).b(t0.t.j(f11, f12));
            Matrix matrix = new Matrix();
            b10.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                p pVar3 = (p) arrayList.get(i12);
                ((a) pVar3.f20745a).f(rVar, new n1.q(b10), f10, w0Var, jVar, iVar, i10);
                a aVar = (a) pVar3.f20745a;
                rVar.r(s0.g.f34069a, aVar.b());
                matrix.setTranslate(s0.g.f34069a, -aVar.b());
                b10.setLocalMatrix(matrix);
            }
        }
        rVar.s();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [iu.w, java.lang.Object] */
    public final void a(long j10, float[] fArr) {
        d(f0.e(j10));
        e(f0.d(j10));
        iu.x xVar = new iu.x();
        xVar.f20558a = 0;
        hl.f.d0(this.f20737h, j10, new x.a0(j10, fArr, xVar, new Object()));
    }

    public final void d(int i10) {
        n nVar = this.f20730a;
        if (i10 >= 0 && i10 < nVar.f20740a.f20699a.length()) {
            return;
        }
        StringBuilder n10 = a3.a.n("offset(", i10, ") is out of bounds [0, ");
        n10.append(nVar.f20740a.f20699a.length());
        n10.append(')');
        throw new IllegalArgumentException(n10.toString().toString());
    }

    public final void e(int i10) {
        n nVar = this.f20730a;
        if (i10 >= 0 && i10 <= nVar.f20740a.f20699a.length()) {
            return;
        }
        StringBuilder n10 = a3.a.n("offset(", i10, ") is out of bounds [0, ");
        n10.append(nVar.f20740a.f20699a.length());
        n10.append(']');
        throw new IllegalArgumentException(n10.toString().toString());
    }

    public final void f(int i10) {
        int i11 = this.f20735f;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')').toString());
    }
}
