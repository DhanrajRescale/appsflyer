package c2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x extends i1 {
    public static final n1.f X;
    public final a2 I;
    public v0 J;

    static {
        n1.f g10 = androidx.compose.ui.graphics.a.g();
        int i10 = n1.t.f28178j;
        g10.f(n1.t.f28174f);
        g10.m(1.0f);
        g10.n(1);
        X = g10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, c2.a2] */
    public x(androidx.compose.ui.node.a aVar) {
        super(aVar);
        w wVar;
        ?? nVar = new g1.n();
        nVar.f16408d = 0;
        this.I = nVar;
        nVar.f16412h = this;
        if (aVar.f1402c != null) {
            wVar = new w(this);
        } else {
            wVar = null;
        }
        this.J = wVar;
    }

    @Override // a2.q
    public final int D(int i10) {
        z zVar = this.f7721k.f1416q;
        a2.m0 a10 = zVar.a();
        androidx.compose.ui.node.a aVar = zVar.f7885a;
        return a10.d(aVar.f1422w.f7656c, aVar.l(), i10);
    }

    @Override // a2.l0
    public final a2.a1 E(long j10) {
        q0(j10);
        androidx.compose.ui.node.a aVar = this.f7721k;
        v0.h u10 = aVar.u();
        int i10 = u10.f37655c;
        if (i10 > 0) {
            Object[] objArr = u10.f37653a;
            int i11 = 0;
            do {
                ((androidx.compose.ui.node.a) objArr[i11]).f1423x.f7827o.f7783k = 3;
                i11++;
            } while (i11 < i10);
        }
        j1(aVar.f1415p.a(this, aVar.l(), j10));
        e1();
        return this;
    }

    @Override // c2.i1
    public final void R0() {
        if (this.J == null) {
            this.J = new w(this);
        }
    }

    @Override // c2.i1
    public final v0 U0() {
        return this.J;
    }

    @Override // a2.q
    public final int W(int i10) {
        z zVar = this.f7721k.f1416q;
        a2.m0 a10 = zVar.a();
        androidx.compose.ui.node.a aVar = zVar.f7885a;
        return a10.e(aVar.f1422w.f7656c, aVar.l(), i10);
    }

    @Override // c2.i1
    public final g1.n W0() {
        return this.I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((!r1) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // c2.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a1(c2.d1 r20, long r21, c2.v r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.x.a1(c2.d1, long, c2.v, boolean, boolean):void");
    }

    @Override // a2.q
    public final int e(int i10) {
        z zVar = this.f7721k.f1416q;
        a2.m0 a10 = zVar.a();
        androidx.compose.ui.node.a aVar = zVar.f7885a;
        return a10.b(aVar.f1422w.f7656c, aVar.l(), i10);
    }

    @Override // c2.i1
    public final void g1(n1.r rVar) {
        androidx.compose.ui.node.a aVar = this.f7721k;
        r1 a10 = k0.a(aVar);
        v0.h t10 = aVar.t();
        int i10 = t10.f37655c;
        if (i10 > 0) {
            Object[] objArr = t10.f37653a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar2.D()) {
                    aVar2.h(rVar);
                }
                i11++;
            } while (i11 < i10);
        }
        if (((d2.a0) a10).getShowLayoutBounds()) {
            P0(rVar, X);
        }
    }

    @Override // a2.a1
    public final void j0(long j10, float f10, Function1 function1) {
        h1(j10, f10, function1);
        if (this.f7851f) {
            return;
        }
        f1();
        this.f7721k.f1423x.f7827o.E0();
    }

    @Override // c2.u0
    public final int u0(a2.a aVar) {
        v0 v0Var = this.J;
        if (v0Var != null) {
            return v0Var.u0(aVar);
        }
        n0 n0Var = this.f7721k.f1423x.f7827o;
        boolean z10 = n0Var.f7784l;
        i0 i0Var = n0Var.f7792t;
        if (!z10) {
            q0 q0Var = n0Var.E;
            if (q0Var.f7815c == 1) {
                i0Var.f7634f = true;
                if (i0Var.f7630b) {
                    q0Var.f7817e = true;
                    q0Var.f7818f = true;
                }
            } else {
                i0Var.f7635g = true;
            }
        }
        n0Var.j().f7852g = true;
        n0Var.J();
        n0Var.j().f7852g = false;
        Integer num = (Integer) i0Var.f7637i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // a2.q
    public final int z(int i10) {
        z zVar = this.f7721k.f1416q;
        a2.m0 a10 = zVar.a();
        androidx.compose.ui.node.a aVar = zVar.f7885a;
        return a10.c(aVar.f1422w.f7656c, aVar.l(), i10);
    }
}
