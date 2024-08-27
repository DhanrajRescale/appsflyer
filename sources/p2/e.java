package p2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import d2.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final x1.f0 f30534a;

    /* renamed from: b, reason: collision with root package name */
    public final p f30535b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30536c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30537d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30538e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30539f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30540g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30541h;

    /* renamed from: i, reason: collision with root package name */
    public c0 f30542i;

    /* renamed from: j, reason: collision with root package name */
    public j2.e0 f30543j;

    /* renamed from: k, reason: collision with root package name */
    public v f30544k;

    /* renamed from: m, reason: collision with root package name */
    public m1.d f30546m;

    /* renamed from: n, reason: collision with root package name */
    public m1.d f30547n;

    /* renamed from: l, reason: collision with root package name */
    public Function1 f30545l = d.f30526c;

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f30548o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f30549p = {1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f};

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f30550q = new Matrix();

    public e(x1.f0 f0Var, q qVar) {
        this.f30534a = f0Var;
        this.f30535b = qVar;
    }

    public final void a() {
        q qVar;
        u2.h hVar;
        CursorAnchorInfo.Builder builder;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        q qVar2 = (q) this.f30535b;
        if (!((InputMethodManager) qVar2.f30602b.getValue()).isActive(qVar2.f30601a)) {
            return;
        }
        Function1 function1 = this.f30545l;
        float[] fArr = this.f30549p;
        function1.invoke(new n1.k0(fArr));
        d2.a0 a0Var = (d2.a0) this.f30534a;
        a0Var.B();
        n1.k0.d(fArr, a0Var.f13305e0);
        float d10 = m1.c.d(a0Var.f13313i0);
        float e10 = m1.c.e(a0Var.f13313i0);
        float[] fArr2 = a0Var.J;
        n1.k0.c(fArr2);
        n1.k0.e(fArr2, d10, e10);
        w0.v(fArr, fArr2);
        Matrix matrix = this.f30550q;
        androidx.compose.ui.graphics.a.u(matrix, fArr);
        c0 c0Var = this.f30542i;
        Intrinsics.c(c0Var);
        v vVar = this.f30544k;
        Intrinsics.c(vVar);
        j2.e0 e0Var = this.f30543j;
        Intrinsics.c(e0Var);
        m1.d dVar = this.f30546m;
        Intrinsics.c(dVar);
        m1.d dVar2 = this.f30547n;
        Intrinsics.c(dVar2);
        boolean z11 = this.f30538e;
        boolean z12 = this.f30539f;
        boolean z13 = this.f30540g;
        boolean z14 = this.f30541h;
        CursorAnchorInfo.Builder builder2 = this.f30548o;
        builder2.reset();
        builder2.setMatrix(matrix);
        long j10 = c0Var.f30523b;
        int e11 = j2.f0.e(j10);
        builder2.setSelectionRange(e11, j2.f0.d(j10));
        u2.h hVar2 = u2.h.f36681b;
        if (z11 && e11 >= 0) {
            int b10 = vVar.b(e11);
            m1.d c10 = e0Var.c(b10);
            float e12 = kotlin.ranges.d.e(c10.f27239a, s0.g.f34069a, (int) (e0Var.f20705c >> 32));
            boolean g10 = w0.g(dVar, e12, c10.f27240b);
            boolean g11 = w0.g(dVar, e12, c10.f27242d);
            if (e0Var.a(b10) == hVar2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!g10 && !g11) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (!g10 || !g11) {
                i12 |= 2;
            }
            if (z10) {
                i13 = i12 | 4;
            } else {
                i13 = i12;
            }
            float f10 = c10.f27240b;
            float f11 = c10.f27242d;
            hVar = hVar2;
            qVar = qVar2;
            builder = builder2;
            builder2.setInsertionMarkerLocation(e12, f10, f11, f11, i13);
        } else {
            qVar = qVar2;
            hVar = hVar2;
            builder = builder2;
        }
        if (z12) {
            int i14 = -1;
            j2.f0 f0Var = c0Var.f30524c;
            if (f0Var != null) {
                i10 = j2.f0.e(f0Var.f20712a);
            } else {
                i10 = -1;
            }
            if (f0Var != null) {
                i14 = j2.f0.d(f0Var.f20712a);
            }
            if (i10 >= 0 && i10 < i14) {
                builder.setComposingText(i10, c0Var.f30522a.f20699a.subSequence(i10, i14));
                int b11 = vVar.b(i10);
                int b12 = vVar.b(i14);
                float[] fArr3 = new float[(b12 - b11) * 4];
                e0Var.f20704b.a(w0.b(b11, b12), fArr3);
                while (i10 < i14) {
                    int b13 = vVar.b(i10);
                    int i15 = (b13 - b11) * 4;
                    float f12 = fArr3[i15];
                    float f13 = fArr3[i15 + 1];
                    int i16 = i14;
                    float f14 = fArr3[i15 + 2];
                    float f15 = fArr3[i15 + 3];
                    int i17 = b11;
                    if (dVar.f27241c > f12 && f14 > dVar.f27239a && dVar.f27242d > f13 && f15 > dVar.f27240b) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (!w0.g(dVar, f12, f13) || !w0.g(dVar, f14, f15)) {
                        i11 |= 2;
                    }
                    if (e0Var.a(b13) == hVar) {
                        i11 |= 4;
                    }
                    builder.addCharacterBounds(i10, f12, f13, f14, f15, i11);
                    i10++;
                    i14 = i16;
                    b11 = i17;
                    fArr3 = fArr3;
                }
            }
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 33 && z13) {
            b.a(builder, dVar2);
        }
        if (i18 >= 34 && z14) {
            c.a(builder, e0Var, dVar);
        }
        CursorAnchorInfo build = builder.build();
        q qVar3 = qVar;
        ((InputMethodManager) qVar3.f30602b.getValue()).updateCursorAnchorInfo(qVar3.f30601a, build);
        this.f30537d = false;
    }
}
