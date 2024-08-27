package c2;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends v0 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7868q = 1;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i1 f7869r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(d0 d0Var) {
        super(d0Var);
        this.f7869r = d0Var;
    }

    @Override // a2.q
    public final int D(int i10) {
        switch (this.f7868q) {
            case 0:
                z zVar = this.f7860k.f7721k.f1416q;
                a2.m0 a10 = zVar.a();
                androidx.compose.ui.node.a aVar = zVar.f7885a;
                return a10.d(aVar.f1422w.f7656c, aVar.k(), i10);
            default:
                d0 d0Var = (d0) this.f7869r;
                c0 c0Var = d0Var.I;
                i1 i1Var = d0Var.f7722l;
                Intrinsics.c(i1Var);
                v0 U0 = i1Var.U0();
                Intrinsics.c(U0);
                return c0Var.d0(this, U0, i10);
        }
    }

    @Override // a2.l0
    public final a2.a1 E(long j10) {
        switch (this.f7868q) {
            case 0:
                q0(j10);
                i1 i1Var = this.f7860k;
                v0.h u10 = i1Var.f7721k.u();
                int i10 = u10.f37655c;
                if (i10 > 0) {
                    Object[] objArr = u10.f37653a;
                    int i11 = 0;
                    do {
                        m0 m0Var = ((androidx.compose.ui.node.a) objArr[i11]).f1423x.f7828p;
                        Intrinsics.c(m0Var);
                        m0Var.f7761i = 3;
                        i11++;
                    } while (i11 < i10);
                }
                androidx.compose.ui.node.a aVar = i1Var.f7721k;
                v0.K0(this, aVar.f1415p.a(this, aVar.k(), j10));
                return this;
            default:
                d0 d0Var = (d0) this.f7869r;
                q0(j10);
                d0Var.getClass();
                c0 c0Var = d0Var.I;
                i1 i1Var2 = d0Var.f7722l;
                Intrinsics.c(i1Var2);
                v0 U0 = i1Var2.U0();
                Intrinsics.c(U0);
                v0.K0(this, c0Var.a(this, U0, j10));
                return this;
        }
    }

    @Override // a2.q
    public final int W(int i10) {
        switch (this.f7868q) {
            case 0:
                z zVar = this.f7860k.f7721k.f1416q;
                a2.m0 a10 = zVar.a();
                androidx.compose.ui.node.a aVar = zVar.f7885a;
                return a10.e(aVar.f1422w.f7656c, aVar.k(), i10);
            default:
                d0 d0Var = (d0) this.f7869r;
                c0 c0Var = d0Var.I;
                i1 i1Var = d0Var.f7722l;
                Intrinsics.c(i1Var);
                v0 U0 = i1Var.U0();
                Intrinsics.c(U0);
                return c0Var.l(this, U0, i10);
        }
    }

    @Override // a2.q
    public final int e(int i10) {
        switch (this.f7868q) {
            case 0:
                z zVar = this.f7860k.f7721k.f1416q;
                a2.m0 a10 = zVar.a();
                androidx.compose.ui.node.a aVar = zVar.f7885a;
                return a10.b(aVar.f1422w.f7656c, aVar.k(), i10);
            default:
                d0 d0Var = (d0) this.f7869r;
                c0 c0Var = d0Var.I;
                i1 i1Var = d0Var.f7722l;
                Intrinsics.c(i1Var);
                v0 U0 = i1Var.U0();
                Intrinsics.c(U0);
                return c0Var.F(this, U0, i10);
        }
    }

    @Override // c2.u0
    public final int u0(a2.a aVar) {
        int i10;
        LinkedHashMap linkedHashMap = this.f7865p;
        switch (this.f7868q) {
            case 0:
                m0 m0Var = this.f7860k.f7721k.f1423x.f7828p;
                Intrinsics.c(m0Var);
                boolean z10 = m0Var.f7762j;
                r0 r0Var = m0Var.f7769q;
                if (!z10) {
                    q0 q0Var = m0Var.f7776x;
                    if (q0Var.f7815c == 2) {
                        r0Var.f7634f = true;
                        if (r0Var.f7630b) {
                            q0Var.f7820h = true;
                            q0Var.f7821i = true;
                        }
                    } else {
                        r0Var.f7635g = true;
                    }
                }
                v0 v0Var = m0Var.j().J;
                if (v0Var != null) {
                    v0Var.f7852g = true;
                }
                m0Var.J();
                v0 v0Var2 = m0Var.j().J;
                if (v0Var2 != null) {
                    v0Var2.f7852g = false;
                }
                Integer num = (Integer) r0Var.f7637i.get(aVar);
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = Integer.MIN_VALUE;
                }
                linkedHashMap.put(aVar, Integer.valueOf(i10));
                return i10;
            default:
                int c10 = g.c(this, aVar);
                linkedHashMap.put(aVar, Integer.valueOf(c10));
                return c10;
        }
    }

    @Override // a2.q
    public final int z(int i10) {
        switch (this.f7868q) {
            case 0:
                z zVar = this.f7860k.f7721k.f1416q;
                a2.m0 a10 = zVar.a();
                androidx.compose.ui.node.a aVar = zVar.f7885a;
                return a10.c(aVar.f1422w.f7656c, aVar.k(), i10);
            default:
                d0 d0Var = (d0) this.f7869r;
                c0 c0Var = d0Var.I;
                i1 i1Var = d0Var.f7722l;
                Intrinsics.c(i1Var);
                v0 U0 = i1Var.U0();
                Intrinsics.c(U0);
                return c0Var.u0(this, U0, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar) {
        super(xVar);
        this.f7869r = xVar;
    }
}
