package x1;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.h2;
import ut.l;
import w.z0;

/* loaded from: classes.dex */
public final class o0 extends g1.n implements i0, z, w2.b {

    /* renamed from: n, reason: collision with root package name */
    public Function2 f39898n;

    /* renamed from: o, reason: collision with root package name */
    public h2 f39899o;

    /* renamed from: s, reason: collision with root package name */
    public k f39903s;

    /* renamed from: p, reason: collision with root package name */
    public k f39900p = h0.f39855a;

    /* renamed from: q, reason: collision with root package name */
    public final v0.h f39901q = new v0.h(new m0[16]);

    /* renamed from: r, reason: collision with root package name */
    public final v0.h f39902r = new v0.h(new m0[16]);

    /* renamed from: t, reason: collision with root package name */
    public long f39904t = 0;

    public o0(Function2 function2) {
        this.f39898n = function2;
    }

    @Override // c2.w1
    public final void D() {
        k kVar = this.f39903s;
        if (kVar == null) {
            return;
        }
        List list = kVar.f39870a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(!((t) list.get(i10)).f39912d)) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    t tVar = (t) list.get(i11);
                    long j10 = tVar.f39909a;
                    long j11 = tVar.f39911c;
                    long j12 = tVar.f39910b;
                    float f10 = tVar.f39913e;
                    boolean z10 = tVar.f39912d;
                    arrayList.add(new t(j10, j12, j11, false, f10, j12, j11, z10, z10, 1, m1.c.f27233b));
                }
                k kVar2 = new k(arrayList, null);
                this.f39900p = kVar2;
                R0(kVar2, l.f39877a);
                R0(kVar2, l.f39878b);
                R0(kVar2, l.f39879c);
                this.f39903s = null;
                return;
            }
        }
    }

    @Override // c2.w1
    public final void J(k kVar, l lVar, long j10) {
        this.f39904t = j10;
        if (lVar == l.f39877a) {
            this.f39900p = kVar;
        }
        if (this.f39899o == null) {
            this.f39899o = yk.g.H(E0(), null, qu.g0.f32208d, new n0(this, null), 1);
        }
        R0(kVar, lVar);
        List list = kVar.f39870a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (!t0.t.A((t) list.get(i10))) {
                    break;
                } else {
                    i10++;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (!(!z10)) {
            kVar = null;
        }
        this.f39903s = kVar;
    }

    @Override // g1.n
    public final void J0() {
        S0();
    }

    public final Object Q0(Function2 function2, yt.a frame) {
        zt.a aVar;
        qu.i iVar = new qu.i(1, zt.f.b(frame));
        iVar.s();
        m0 completion = new m0(this, iVar);
        synchronized (this.f39901q) {
            this.f39901q.b(completion);
            Intrinsics.checkNotNullParameter(function2, "<this>");
            Intrinsics.checkNotNullParameter(completion, "completion");
            yt.a b10 = zt.f.b(zt.f.a(completion, completion, function2));
            aVar = zt.a.f42823a;
            yt.c cVar = new yt.c(aVar, b10);
            l.Companion companion = ut.l.INSTANCE;
            cVar.resumeWith(Unit.f23355a);
        }
        iVar.u(new t.g0(completion, 26));
        Object p10 = iVar.p();
        if (p10 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return p10;
    }

    public final void R0(k kVar, l lVar) {
        qu.h hVar;
        qu.h hVar2;
        synchronized (this.f39901q) {
            v0.h hVar3 = this.f39902r;
            hVar3.c(hVar3.f37655c, this.f39901q);
        }
        try {
            int ordinal = lVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                    }
                } else {
                    v0.h hVar4 = this.f39902r;
                    int i10 = hVar4.f37655c;
                    if (i10 > 0) {
                        int i11 = i10 - 1;
                        Object[] objArr = hVar4.f37653a;
                        do {
                            m0 m0Var = (m0) objArr[i11];
                            if (lVar == m0Var.f39889d && (hVar2 = m0Var.f39888c) != null) {
                                m0Var.f39888c = null;
                                l.Companion companion = ut.l.INSTANCE;
                                hVar2.resumeWith(kVar);
                            }
                            i11--;
                        } while (i11 >= 0);
                    }
                }
            }
            v0.h hVar5 = this.f39902r;
            int i12 = hVar5.f37655c;
            if (i12 > 0) {
                Object[] objArr2 = hVar5.f37653a;
                int i13 = 0;
                do {
                    m0 m0Var2 = (m0) objArr2[i13];
                    if (lVar == m0Var2.f39889d && (hVar = m0Var2.f39888c) != null) {
                        m0Var2.f39888c = null;
                        l.Companion companion2 = ut.l.INSTANCE;
                        hVar.resumeWith(kVar);
                    }
                    i13++;
                } while (i13 < i12);
            }
        } finally {
            this.f39902r.g();
        }
    }

    public final void S0() {
        h2 h2Var = this.f39899o;
        if (h2Var != null) {
            h2Var.a(new z0(4));
            this.f39899o = null;
        }
    }

    @Override // c2.w1
    public final void W() {
        S0();
    }

    @Override // w2.b
    public final float Y() {
        return c2.g.y(this).f1417r.Y();
    }

    @Override // w2.b
    public final float b() {
        return c2.g.y(this).f1417r.b();
    }

    @Override // c2.w1
    public final void w0() {
        S0();
    }
}
