package x;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k extends c2.o implements c2.w1, v1.c, l1.c, c2.z1, c2.m, b2.f {
    public a0.h A;
    public a0.l D;
    public boolean E;

    /* renamed from: p, reason: collision with root package name */
    public a0.l f39602p;

    /* renamed from: q, reason: collision with root package name */
    public n1 f39603q;

    /* renamed from: r, reason: collision with root package name */
    public String f39604r;

    /* renamed from: s, reason: collision with root package name */
    public h2.g f39605s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f39606t;

    /* renamed from: u, reason: collision with root package name */
    public Function0 f39607u;

    /* renamed from: w, reason: collision with root package name */
    public final x0 f39609w;

    /* renamed from: x, reason: collision with root package name */
    public x1.i0 f39610x;

    /* renamed from: y, reason: collision with root package name */
    public c2.n f39611y;

    /* renamed from: z, reason: collision with root package name */
    public a0.n f39612z;

    /* renamed from: v, reason: collision with root package name */
    public final t0 f39608v = new g1.n();
    public final LinkedHashMap B = new LinkedHashMap();
    public long C = m1.c.f27233b;

    /* JADX WARN: Type inference failed for: r2v1, types: [g1.n, x.t0] */
    public k(a0.l lVar, n1 n1Var, boolean z10, String str, h2.g gVar, Function0 function0) {
        boolean z11;
        this.f39602p = lVar;
        this.f39603q = n1Var;
        this.f39604r = str;
        this.f39605s = gVar;
        this.f39606t = z10;
        this.f39607u = function0;
        this.f39609w = new x0(lVar);
        a0.l lVar2 = this.f39602p;
        this.D = lVar2;
        if (lVar2 == null && this.f39603q != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z11;
    }

    @Override // c2.z1
    public final boolean A0() {
        return true;
    }

    @Override // c2.w1
    public final void D() {
        a0.h hVar;
        a0.l lVar = this.f39602p;
        if (lVar != null && (hVar = this.A) != null) {
            lVar.b(new a0.i(hVar));
        }
        this.A = null;
        x1.i0 i0Var = this.f39610x;
        if (i0Var != null) {
            ((x1.o0) i0Var).D();
        }
    }

    @Override // g1.n
    public final void I0() {
        if (!this.E) {
            W0();
        }
        if (this.f39606t) {
            Q0(this.f39608v);
            Q0(this.f39609w);
        }
    }

    @Override // c2.w1
    public final void J(x1.k kVar, x1.l lVar, long j10) {
        long j11 = hl.f.j(((int) (j10 >> 32)) / 2, ((int) (j10 & 4294967295L)) / 2);
        int i10 = w2.h.f38792c;
        this.C = t0.t.g((int) (j11 >> 32), (int) (j11 & 4294967295L));
        W0();
        if (this.f39606t && lVar == x1.l.f39878b) {
            int i11 = kVar.f39873d;
            if (x1.r.a(i11, 4)) {
                yk.g.H(E0(), null, null, new h(this, null), 3);
            } else if (x1.r.a(i11, 5)) {
                yk.g.H(E0(), null, null, new i(this, null), 3);
            }
        }
        if (this.f39610x == null) {
            j jVar = new j(this, null);
            x1.k kVar2 = x1.h0.f39855a;
            x1.o0 o0Var = new x1.o0(jVar);
            Q0(o0Var);
            this.f39610x = o0Var;
        }
        x1.i0 i0Var = this.f39610x;
        if (i0Var != null) {
            ((x1.o0) i0Var).J(kVar, lVar, j10);
        }
    }

    @Override // g1.n
    public final void J0() {
        V0();
    }

    public void T0(h2.j jVar) {
    }

    public abstract Object U0(x1.z zVar, yt.a aVar);

    public final void V0() {
        a0.l lVar = this.f39602p;
        LinkedHashMap linkedHashMap = this.B;
        if (lVar != null) {
            a0.n nVar = this.f39612z;
            if (nVar != null) {
                lVar.b(new a0.m(nVar));
            }
            a0.h hVar = this.A;
            if (hVar != null) {
                lVar.b(new a0.i(hVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                lVar.b(new a0.m((a0.n) it.next()));
            }
        }
        this.f39612z = null;
        this.A = null;
        linkedHashMap.clear();
    }

    public final void W0() {
        n1 n1Var;
        if (this.f39611y == null && (n1Var = this.f39603q) != null) {
            if (this.f39602p == null) {
                this.f39602p = new a0.l();
            }
            this.f39609w.T0(this.f39602p);
            a0.l lVar = this.f39602p;
            Intrinsics.c(lVar);
            c2.n a10 = n1Var.a(lVar);
            Q0(a10);
            this.f39611y = a10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r4.f39611y == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r6 = r4.f39611y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r6 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r4.E != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        r3.T0(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (r6 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        R0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r4.f39611y = null;
        W0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
    
        if (r0 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X0(a0.l r5, x.n1 r6, boolean r7, java.lang.String r8, h2.g r9, kotlin.jvm.functions.Function0 r10) {
        /*
            r4 = this;
            a0.l r0 = r4.D
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r5)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L13
            r4.V0()
            r4.D = r5
            r4.f39602p = r5
            r0 = r2
            goto L14
        L13:
            r0 = r1
        L14:
            x.n1 r3 = r4.f39603q
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r6)
            if (r3 != 0) goto L1f
            r4.f39603q = r6
            r0 = r2
        L1f:
            boolean r6 = r4.f39606t
            x.x0 r3 = r4.f39609w
            if (r6 == r7) goto L3b
            x.t0 r6 = r4.f39608v
            if (r7 == 0) goto L30
            r4.Q0(r6)
            r4.Q0(r3)
            goto L39
        L30:
            r4.R0(r6)
            r4.R0(r3)
            r4.V0()
        L39:
            r4.f39606t = r7
        L3b:
            r4.f39604r = r8
            r4.f39605s = r9
            r4.f39607u = r10
            boolean r6 = r4.E
            a0.l r7 = r4.D
            if (r7 != 0) goto L4d
            x.n1 r8 = r4.f39603q
            if (r8 == 0) goto L4d
            r8 = r2
            goto L4e
        L4d:
            r8 = r1
        L4e:
            if (r6 == r8) goto L60
            if (r7 != 0) goto L57
            x.n1 r6 = r4.f39603q
            if (r6 == 0) goto L57
            r1 = r2
        L57:
            r4.E = r1
            if (r1 != 0) goto L60
            c2.n r6 = r4.f39611y
            if (r6 != 0) goto L60
            goto L62
        L60:
            if (r0 == 0) goto L75
        L62:
            c2.n r6 = r4.f39611y
            if (r6 != 0) goto L6a
            boolean r7 = r4.E
            if (r7 != 0) goto L75
        L6a:
            if (r6 == 0) goto L6f
            r4.R0(r6)
        L6f:
            r6 = 0
            r4.f39611y = r6
            r4.W0()
        L75:
            r3.T0(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.k.X0(a0.l, x.n1, boolean, java.lang.String, h2.g, kotlin.jvm.functions.Function0):void");
    }

    @Override // v1.c
    public final boolean g(KeyEvent keyEvent) {
        return false;
    }

    @Override // l1.c
    public final void i(l1.s sVar) {
        if (sVar.a()) {
            W0();
        }
        this.f39609w.i(sVar);
    }

    @Override // c2.z1
    public final void n(h2.j jVar) {
        h2.g gVar = this.f39605s;
        if (gVar != null) {
            h2.t.f(jVar, gVar.f17821a);
        }
        String str = this.f39604r;
        a aVar = new a(this, 0);
        ou.g[] gVarArr = h2.t.f17908a;
        jVar.h(h2.i.f17826b, new h2.a(str, aVar));
        if (!this.f39606t) {
            jVar.h(h2.r.f17890j, Unit.f23355a);
        }
        this.f39609w.n(jVar);
        T0(jVar);
    }

    @Override // v1.c
    public final boolean z(KeyEvent keyEvent) {
        W0();
        boolean z10 = this.f39606t;
        LinkedHashMap linkedHashMap = this.B;
        if (z10) {
            int i10 = j0.f39596b;
            if (yk.j.S0(androidx.compose.ui.input.key.a.b(keyEvent), 2) && j0.a(keyEvent)) {
                if (linkedHashMap.containsKey(new v1.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode())))) {
                    return false;
                }
                a0.n nVar = new a0.n(this.C);
                linkedHashMap.put(new v1.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode())), nVar);
                if (this.f39602p != null) {
                    yk.g.H(E0(), null, null, new f(this, nVar, null), 3);
                }
                return true;
            }
        }
        if (!this.f39606t) {
            return false;
        }
        int i11 = j0.f39596b;
        if (!yk.j.S0(androidx.compose.ui.input.key.a.b(keyEvent), 1) || !j0.a(keyEvent)) {
            return false;
        }
        a0.n nVar2 = (a0.n) linkedHashMap.remove(new v1.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode())));
        if (nVar2 != null && this.f39602p != null) {
            yk.g.H(E0(), null, null, new g(this, nVar2, null), 3);
        }
        this.f39607u.mo2invoke();
        return true;
    }
}
