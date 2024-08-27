package k0;

import a2.q;
import c2.c0;
import c2.s;
import c2.z1;
import g1.n;
import h2.u;
import i0.l1;
import j2.g0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.x;
import o2.r;
import t0.n1;
import t0.o3;
import t0.t;

/* loaded from: classes.dex */
public final class h extends n implements c0, s, z1 {
    public d A;
    public g B;
    public final n1 C = t.n0(null, o3.f35116a);

    /* renamed from: n, reason: collision with root package name */
    public j2.e f21859n;

    /* renamed from: o, reason: collision with root package name */
    public g0 f21860o;

    /* renamed from: p, reason: collision with root package name */
    public r f21861p;

    /* renamed from: q, reason: collision with root package name */
    public Function1 f21862q;

    /* renamed from: r, reason: collision with root package name */
    public int f21863r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21864s;

    /* renamed from: t, reason: collision with root package name */
    public int f21865t;

    /* renamed from: u, reason: collision with root package name */
    public int f21866u;

    /* renamed from: v, reason: collision with root package name */
    public List f21867v;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f21868w;

    /* renamed from: x, reason: collision with root package name */
    public x f21869x;

    /* renamed from: y, reason: collision with root package name */
    public Function1 f21870y;

    /* renamed from: z, reason: collision with root package name */
    public Map f21871z;

    public h(j2.e eVar, g0 g0Var, r rVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, x xVar, Function1 function13) {
        this.f21859n = eVar;
        this.f21860o = g0Var;
        this.f21861p = rVar;
        this.f21862q = function1;
        this.f21863r = i10;
        this.f21864s = z10;
        this.f21865t = i11;
        this.f21866u = i12;
        this.f21867v = list;
        this.f21868w = function12;
        this.f21869x = xVar;
        this.f21870y = function13;
    }

    @Override // c2.z1
    public final boolean E() {
        return true;
    }

    @Override // c2.c0
    public final int F(a2.r rVar, q qVar, int i10) {
        return S0(rVar).a(i10, rVar.getLayoutDirection());
    }

    public final void Q0(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (!this.f16417m) {
            return;
        }
        if (z11 || (z10 && this.B != null)) {
            c2.g.u(this);
        }
        if (z11 || z12 || z13) {
            d R0 = R0();
            j2.e eVar = this.f21859n;
            g0 g0Var = this.f21860o;
            r rVar = this.f21861p;
            int i10 = this.f21863r;
            boolean z14 = this.f21864s;
            int i11 = this.f21865t;
            int i12 = this.f21866u;
            List list = this.f21867v;
            R0.f21819a = eVar;
            R0.f21820b = g0Var;
            R0.f21821c = rVar;
            R0.f21822d = i10;
            R0.f21823e = z14;
            R0.f21824f = i11;
            R0.f21825g = i12;
            R0.f21826h = list;
            R0.f21830l = null;
            R0.f21832n = null;
            c2.g.t(this);
            c2.g.s(this);
        }
        if (z10) {
            c2.g.s(this);
        }
    }

    public final d R0() {
        if (this.A == null) {
            this.A = new d(this.f21859n, this.f21860o, this.f21861p, this.f21863r, this.f21864s, this.f21865t, this.f21866u, this.f21867v);
        }
        d dVar = this.A;
        Intrinsics.c(dVar);
        return dVar;
    }

    public final d S0(w2.b bVar) {
        d dVar;
        f T0 = T0();
        if (T0 != null && T0.f21855c && (dVar = T0.f21856d) != null) {
            dVar.c(bVar);
            return dVar;
        }
        d R0 = R0();
        R0.c(bVar);
        return R0;
    }

    public final f T0() {
        return (f) this.C.getValue();
    }

    public final boolean U0(Function1 function1, Function1 function12, Function1 function13) {
        boolean z10;
        if (!Intrinsics.a(this.f21862q, function1)) {
            this.f21862q = function1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (!Intrinsics.a(this.f21868w, function12)) {
            this.f21868w = function12;
            z10 = true;
        }
        if (!Intrinsics.a(null, null)) {
            z10 = true;
        }
        if (!Intrinsics.a(this.f21870y, function13)) {
            this.f21870y = function13;
            return true;
        }
        return z10;
    }

    public final boolean V0(g0 g0Var, List list, int i10, int i11, boolean z10, r rVar, int i12) {
        boolean z11 = !this.f21860o.c(g0Var);
        this.f21860o = g0Var;
        if (!Intrinsics.a(this.f21867v, list)) {
            this.f21867v = list;
            z11 = true;
        }
        if (this.f21866u != i10) {
            this.f21866u = i10;
            z11 = true;
        }
        if (this.f21865t != i11) {
            this.f21865t = i11;
            z11 = true;
        }
        if (this.f21864s != z10) {
            this.f21864s = z10;
            z11 = true;
        }
        if (!Intrinsics.a(this.f21861p, rVar)) {
            this.f21861p = rVar;
            z11 = true;
        }
        if (!kp.j.N(this.f21863r, i12)) {
            this.f21863r = i12;
            return true;
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    @Override // c2.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a2.n0 a(a2.o0 r8, a2.l0 r9, long r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.h.a(a2.o0, a2.l0, long):a2.n0");
    }

    @Override // c2.c0
    public final int d0(a2.r rVar, q qVar, int i10) {
        return l1.q(S0(rVar).d(rVar.getLayoutDirection()).c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e4, code lost:
    
        if (r0.b(r0.f20699a.length()) == false) goto L60;
     */
    @Override // c2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(p1.e r14) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.h.e(p1.e):void");
    }

    @Override // c2.c0
    public final int l(a2.r rVar, q qVar, int i10) {
        return S0(rVar).a(i10, rVar.getLayoutDirection());
    }

    @Override // c2.z1
    public final void n(h2.j jVar) {
        g gVar = this.B;
        if (gVar == null) {
            gVar = new g(this, 0);
            this.B = gVar;
        }
        j2.e eVar = this.f21859n;
        ou.g[] gVarArr = h2.t.f17908a;
        jVar.h(h2.r.f17903w, vt.x.a(eVar));
        f T0 = T0();
        if (T0 != null) {
            j2.e eVar2 = T0.f21854b;
            u uVar = h2.r.f17904x;
            ou.g[] gVarArr2 = h2.t.f17908a;
            ou.g gVar2 = gVarArr2[11];
            uVar.a(jVar, eVar2);
            boolean z10 = T0.f21855c;
            u uVar2 = h2.r.f17905y;
            ou.g gVar3 = gVarArr2[12];
            uVar2.a(jVar, Boolean.valueOf(z10));
        }
        jVar.h(h2.i.f17833i, new h2.a(null, new g(this, 1)));
        jVar.h(h2.i.f17834j, new h2.a(null, new g(this, 2)));
        jVar.h(h2.i.f17835k, new h2.a(null, new x.a(this, 14)));
        h2.t.c(jVar, gVar);
    }

    @Override // c2.c0
    public final int u0(a2.r rVar, q qVar, int i10) {
        return l1.q(S0(rVar).d(rVar.getLayoutDirection()).b());
    }
}
