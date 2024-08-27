package j0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import d2.w0;
import j2.e0;
import j2.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.k0;
import p2.c0;
import p2.v;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f20571a;

    /* renamed from: b, reason: collision with root package name */
    public final g f20572b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20574d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20575e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20576f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20577g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20578h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20579i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f20580j;

    /* renamed from: k, reason: collision with root package name */
    public e0 f20581k;

    /* renamed from: l, reason: collision with root package name */
    public v f20582l;

    /* renamed from: m, reason: collision with root package name */
    public m1.d f20583m;

    /* renamed from: n, reason: collision with root package name */
    public m1.d f20584n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20573c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f20585o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f20586p = {1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f};

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f20587q = new Matrix();

    public f(a aVar, g gVar) {
        this.f20571a = aVar;
        this.f20572b = gVar;
    }

    public final void a() {
        h hVar;
        u2.h hVar2;
        CursorAnchorInfo.Builder builder;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        h hVar3 = (h) this.f20572b;
        if (!((InputMethodManager) hVar3.f20589b.getValue()).isActive(hVar3.f20588a)) {
            return;
        }
        float[] fArr = this.f20586p;
        k0.c(fArr);
        this.f20571a.invoke(new k0(fArr));
        Matrix matrix = this.f20587q;
        androidx.compose.ui.graphics.a.u(matrix, fArr);
        c0 c0Var = this.f20580j;
        Intrinsics.c(c0Var);
        v vVar = this.f20582l;
        Intrinsics.c(vVar);
        e0 e0Var = this.f20581k;
        Intrinsics.c(e0Var);
        m1.d dVar = this.f20583m;
        Intrinsics.c(dVar);
        m1.d dVar2 = this.f20584n;
        Intrinsics.c(dVar2);
        boolean z11 = this.f20576f;
        boolean z12 = this.f20577g;
        boolean z13 = this.f20578h;
        boolean z14 = this.f20579i;
        CursorAnchorInfo.Builder builder2 = this.f20585o;
        builder2.reset();
        builder2.setMatrix(matrix);
        long j10 = c0Var.f30523b;
        int e10 = f0.e(j10);
        builder2.setSelectionRange(e10, f0.d(j10));
        u2.h hVar4 = u2.h.f36681b;
        if (z11 && e10 >= 0) {
            int b10 = vVar.b(e10);
            m1.d c10 = e0Var.c(b10);
            float e11 = kotlin.ranges.d.e(c10.f27239a, s0.g.f34069a, (int) (e0Var.f20705c >> 32));
            boolean b11 = androidx.compose.foundation.text.input.internal.a.b(dVar, e11, c10.f27240b);
            boolean b12 = androidx.compose.foundation.text.input.internal.a.b(dVar, e11, c10.f27242d);
            if (e0Var.a(b10) == hVar4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!b11 && !b12) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (!b11 || !b12) {
                i12 |= 2;
            }
            if (z10) {
                i13 = i12 | 4;
            } else {
                i13 = i12;
            }
            float f10 = c10.f27240b;
            float f11 = c10.f27242d;
            hVar2 = hVar4;
            hVar = hVar3;
            builder = builder2;
            builder2.setInsertionMarkerLocation(e11, f10, f11, f11, i13);
        } else {
            hVar = hVar3;
            hVar2 = hVar4;
            builder = builder2;
        }
        if (z12) {
            int i14 = -1;
            f0 f0Var = c0Var.f30524c;
            if (f0Var != null) {
                i10 = f0.e(f0Var.f20712a);
            } else {
                i10 = -1;
            }
            if (f0Var != null) {
                i14 = f0.d(f0Var.f20712a);
            }
            if (i10 >= 0 && i10 < i14) {
                builder.setComposingText(i10, c0Var.f30522a.f20699a.subSequence(i10, i14));
                int b13 = vVar.b(i10);
                int b14 = vVar.b(i14);
                float[] fArr2 = new float[(b14 - b13) * 4];
                e0Var.f20704b.a(w0.b(b13, b14), fArr2);
                while (i10 < i14) {
                    int b15 = vVar.b(i10);
                    int i15 = (b15 - b13) * 4;
                    float f12 = fArr2[i15];
                    float f13 = fArr2[i15 + 1];
                    int i16 = b13;
                    float f14 = fArr2[i15 + 2];
                    float f15 = fArr2[i15 + 3];
                    int i17 = i14;
                    if (dVar.f27241c > f12 && f14 > dVar.f27239a && dVar.f27242d > f13 && f15 > dVar.f27240b) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (!androidx.compose.foundation.text.input.internal.a.b(dVar, f12, f13) || !androidx.compose.foundation.text.input.internal.a.b(dVar, f14, f15)) {
                        i11 |= 2;
                    }
                    if (e0Var.a(b15) == hVar2) {
                        i11 |= 4;
                    }
                    builder.addCharacterBounds(i10, f12, f13, f14, f15, i11);
                    i10++;
                    b13 = i16;
                    i14 = i17;
                    fArr2 = fArr2;
                }
            }
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 33 && z13) {
            d.a(builder, dVar2);
        }
        if (i18 >= 34 && z14) {
            e.a(builder, e0Var, dVar);
        }
        CursorAnchorInfo build = builder.build();
        h hVar5 = hVar;
        ((InputMethodManager) hVar5.f20589b.getValue()).updateCursorAnchorInfo(hVar5.f20588a, build);
        this.f20575e = false;
    }
}
