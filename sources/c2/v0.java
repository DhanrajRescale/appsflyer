package c2;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class v0 extends u0 implements a2.l0 {

    /* renamed from: k, reason: collision with root package name */
    public final i1 f7860k;

    /* renamed from: m, reason: collision with root package name */
    public LinkedHashMap f7862m;

    /* renamed from: o, reason: collision with root package name */
    public a2.n0 f7864o;

    /* renamed from: l, reason: collision with root package name */
    public long f7861l = w2.h.f38791b;

    /* renamed from: n, reason: collision with root package name */
    public final a2.k0 f7863n = new a2.k0(this);

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f7865p = new LinkedHashMap();

    public v0(i1 i1Var) {
        this.f7860k = i1Var;
    }

    public static final void K0(v0 v0Var, a2.n0 n0Var) {
        Unit unit;
        LinkedHashMap linkedHashMap;
        if (n0Var != null) {
            v0Var.getClass();
            v0Var.l0(hl.f.k(n0Var.b(), n0Var.a()));
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit == null) {
            v0Var.l0(0L);
        }
        if (!Intrinsics.a(v0Var.f7864o, n0Var) && n0Var != null && ((((linkedHashMap = v0Var.f7862m) != null && !linkedHashMap.isEmpty()) || (!n0Var.c().isEmpty())) && !Intrinsics.a(n0Var.c(), v0Var.f7862m))) {
            m0 m0Var = v0Var.f7860k.f7721k.f1423x.f7828p;
            Intrinsics.c(m0Var);
            m0Var.f7769q.g();
            LinkedHashMap linkedHashMap2 = v0Var.f7862m;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                v0Var.f7862m = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(n0Var.c());
        }
        v0Var.f7864o = n0Var;
    }

    @Override // c2.u0
    public final u0 A0() {
        i1 i1Var = this.f7860k.f7722l;
        if (i1Var != null) {
            return i1Var.U0();
        }
        return null;
    }

    @Override // c2.u0
    public final a2.u B0() {
        return this.f7863n;
    }

    @Override // c2.u0
    public final boolean C0() {
        return this.f7864o != null;
    }

    @Override // c2.u0
    public final androidx.compose.ui.node.a E0() {
        return this.f7860k.f7721k;
    }

    @Override // c2.u0
    public final a2.n0 F0() {
        a2.n0 n0Var = this.f7864o;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // c2.u0
    public final u0 G0() {
        i1 i1Var = this.f7860k.f7723m;
        if (i1Var != null) {
            return i1Var.U0();
        }
        return null;
    }

    @Override // c2.u0
    public final long H0() {
        return this.f7861l;
    }

    @Override // c2.u0
    public final void J0() {
        j0(this.f7861l, s0.g.f34069a, null);
    }

    public final void L0(long j10) {
        if (!w2.h.a(this.f7861l, j10)) {
            this.f7861l = j10;
            i1 i1Var = this.f7860k;
            m0 m0Var = i1Var.f7721k.f1423x.f7828p;
            if (m0Var != null) {
                m0Var.A0();
            }
            u0.I0(i1Var);
        }
        if (!this.f7852g) {
            w0(new v1(F0(), this));
        }
    }

    public final long M0(v0 v0Var) {
        long j10 = w2.h.f38791b;
        v0 v0Var2 = this;
        while (!Intrinsics.a(v0Var2, v0Var)) {
            long j11 = v0Var2.f7861l;
            j10 = hl.f.j(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)));
            i1 i1Var = v0Var2.f7860k.f7723m;
            Intrinsics.c(i1Var);
            v0Var2 = i1Var.U0();
            Intrinsics.c(v0Var2);
        }
        return j10;
    }

    @Override // w2.b
    public final float Y() {
        return this.f7860k.Y();
    }

    @Override // a2.p0, a2.q
    public final Object a() {
        return this.f7860k.a();
    }

    @Override // c2.u0, a2.r
    public final boolean a0() {
        return true;
    }

    @Override // w2.b
    public final float b() {
        return this.f7860k.b();
    }

    @Override // a2.r
    public final w2.k getLayoutDirection() {
        return this.f7860k.f7721k.f1418s;
    }

    @Override // a2.a1
    public final void j0(long j10, float f10, Function1 function1) {
        L0(j10);
        if (this.f7851f) {
            return;
        }
        w wVar = (w) this;
        switch (wVar.f7868q) {
            case 0:
                m0 m0Var = wVar.f7860k.f7721k.f1423x.f7828p;
                Intrinsics.c(m0Var);
                m0Var.C0();
                return;
            default:
                wVar.F0().d();
                return;
        }
    }
}
