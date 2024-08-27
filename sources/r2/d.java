package r2;

import android.graphics.Shader;
import android.text.TextPaint;
import c2.o0;
import kotlin.jvm.internal.Intrinsics;
import n1.p;
import n1.v0;
import n1.w0;
import n1.z0;
import p1.i;
import p1.k;
import p1.m;
import t0.j0;
import t0.t;
import u2.j;

/* loaded from: classes.dex */
public final class d extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public final n1.f f33038a;

    /* renamed from: b, reason: collision with root package name */
    public j f33039b;

    /* renamed from: c, reason: collision with root package name */
    public w0 f33040c;

    /* renamed from: d, reason: collision with root package name */
    public p f33041d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f33042e;

    /* renamed from: f, reason: collision with root package name */
    public m1.f f33043f;

    /* renamed from: g, reason: collision with root package name */
    public i f33044g;

    public d(float f10) {
        super(1);
        ((TextPaint) this).density = f10;
        this.f33038a = new n1.f(this);
        this.f33039b = j.f36684b;
        this.f33040c = w0.f28204d;
    }

    public final void a(p pVar, long j10, float f10) {
        m1.f fVar;
        n1.f fVar2 = this.f33038a;
        Shader shader = null;
        if (pVar == null) {
            this.f33042e = null;
            this.f33041d = null;
            this.f33043f = null;
            fVar2.j(null);
            return;
        }
        if (pVar instanceof z0) {
            long h12 = yk.j.h1(((z0) pVar).f28221a, f10);
            if (h12 != 16) {
                fVar2.f(h12);
                this.f33042e = null;
                this.f33041d = null;
                this.f33043f = null;
                fVar2.j(null);
                return;
            }
            return;
        }
        if (pVar instanceof v0) {
            if ((!Intrinsics.a(this.f33041d, pVar) || (fVar = this.f33043f) == null || !m1.f.b(fVar.f27254a, j10)) && j10 != 9205357640488583168L) {
                this.f33041d = pVar;
                this.f33043f = new m1.f(j10);
                this.f33042e = t.N(new o0(pVar, 1, j10));
            }
            j0 j0Var = this.f33042e;
            if (j0Var != null) {
                shader = (Shader) j0Var.getValue();
            }
            fVar2.j(shader);
            hl.f.O0(this, f10);
        }
    }

    public final void b(i iVar) {
        if (iVar != null && !Intrinsics.a(this.f33044g, iVar)) {
            this.f33044g = iVar;
            boolean a10 = Intrinsics.a(iVar, k.f30509a);
            n1.f fVar = this.f33038a;
            if (a10) {
                fVar.n(0);
                return;
            }
            if (iVar instanceof m) {
                fVar.n(1);
                m mVar = (m) iVar;
                fVar.m(mVar.f30511a);
                fVar.f28130a.setStrokeMiter(mVar.f30512b);
                fVar.l(mVar.f30514d);
                fVar.k(mVar.f30513c);
                fVar.i(mVar.f30515e);
            }
        }
    }

    public final void c(w0 w0Var) {
        if (w0Var != null && !Intrinsics.a(this.f33040c, w0Var)) {
            this.f33040c = w0Var;
            if (Intrinsics.a(w0Var, w0.f28204d)) {
                clearShadowLayer();
                return;
            }
            w0 w0Var2 = this.f33040c;
            float f10 = w0Var2.f28207c;
            if (f10 == s0.g.f34069a) {
                f10 = Float.MIN_VALUE;
            }
            setShadowLayer(f10, m1.c.d(w0Var2.f28206b), m1.c.e(this.f33040c.f28206b), androidx.compose.ui.graphics.a.y(this.f33040c.f28205a));
        }
    }

    public final void d(j jVar) {
        if (jVar != null && !Intrinsics.a(this.f33039b, jVar)) {
            this.f33039b = jVar;
            setUnderlineText(jVar.a(j.f36685c));
            setStrikeThruText(this.f33039b.a(j.f36686d));
        }
    }
}
