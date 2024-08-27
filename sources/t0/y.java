package t0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y implements e0, j2, y1 {

    /* renamed from: a, reason: collision with root package name */
    public final v f35250a;

    /* renamed from: b, reason: collision with root package name */
    public final f f35251b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f35252c = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final Object f35253d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final t.c0 f35254e;

    /* renamed from: f, reason: collision with root package name */
    public final o2 f35255f;

    /* renamed from: g, reason: collision with root package name */
    public final v0.i f35256g;

    /* renamed from: h, reason: collision with root package name */
    public final t.d0 f35257h;

    /* renamed from: i, reason: collision with root package name */
    public final v0.i f35258i;

    /* renamed from: j, reason: collision with root package name */
    public final u0.a f35259j;

    /* renamed from: k, reason: collision with root package name */
    public final u0.a f35260k;

    /* renamed from: l, reason: collision with root package name */
    public final v0.i f35261l;

    /* renamed from: m, reason: collision with root package name */
    public v0.a f35262m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35263n;

    /* renamed from: o, reason: collision with root package name */
    public y f35264o;

    /* renamed from: p, reason: collision with root package name */
    public int f35265p;

    /* renamed from: q, reason: collision with root package name */
    public final d9.j f35266q;

    /* renamed from: r, reason: collision with root package name */
    public final r f35267r;

    /* renamed from: s, reason: collision with root package name */
    public final CoroutineContext f35268s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f35269t;

    /* renamed from: u, reason: collision with root package name */
    public Function2 f35270u;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, d9.j] */
    public y(v vVar, c2.e2 e2Var) {
        this.f35250a = vVar;
        this.f35251b = e2Var;
        t.c0 c0Var = new t.c0(new t.d0());
        this.f35254e = c0Var;
        o2 o2Var = new o2();
        if (vVar.c()) {
            o2Var.f35115j = new t.t();
        }
        if (vVar.e()) {
            o2Var.e();
        }
        this.f35255f = o2Var;
        this.f35256g = new v0.i();
        this.f35257h = new t.d0();
        this.f35258i = new v0.i();
        u0.a aVar = new u0.a();
        this.f35259j = aVar;
        u0.a aVar2 = new u0.a();
        this.f35260k = aVar2;
        this.f35261l = new v0.i();
        this.f35262m = new v0.a();
        ?? obj = new Object();
        obj.f14236a = false;
        this.f35266q = obj;
        r rVar = new r(e2Var, vVar, o2Var, c0Var, aVar, aVar2, this);
        vVar.m(rVar);
        this.f35267r = rVar;
        boolean z10 = vVar instanceof f2;
        b1.c cVar = k.f35072a;
    }

    @Override // t0.u
    public final void a() {
        boolean z10;
        synchronized (this.f35253d) {
            try {
                r rVar = this.f35267r;
                if (!rVar.E) {
                    if (!this.f35269t) {
                        this.f35269t = true;
                        b1.c cVar = k.f35073b;
                        u0.a aVar = rVar.K;
                        if (aVar != null) {
                            j(aVar);
                        }
                        if (this.f35255f.f35107b > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 || (!this.f35254e.f34843a.b())) {
                            x xVar = new x(this.f35254e);
                            if (z10) {
                                this.f35251b.getClass();
                                q2 h10 = this.f35255f.h();
                                try {
                                    t.t0(h10, xVar);
                                    Unit unit = Unit.f23355a;
                                    h10.e(true);
                                    this.f35251b.clear();
                                    this.f35251b.g();
                                    xVar.b();
                                } catch (Throwable th2) {
                                    h10.e(false);
                                    throw th2;
                                }
                            }
                            xVar.a();
                        }
                        r rVar2 = this.f35267r;
                        rVar2.getClass();
                        Trace.beginSection("Compose:Composer.dispose");
                        try {
                            rVar2.f35167b.p(rVar2);
                            rVar2.D.f24251a.clear();
                            rVar2.f35183r.clear();
                            rVar2.f35170e.f36603b.b0();
                            rVar2.f35186u = null;
                            rVar2.f35166a.clear();
                            Unit unit2 = Unit.f23355a;
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                    Unit unit3 = Unit.f23355a;
                } else {
                    al.d.f1("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f35250a.q(this);
    }

    @Override // t0.y1
    public final void b() {
        this.f35263n = true;
    }

    @Override // t0.y1
    public final void c(Object obj) {
        x1 D;
        int i10;
        r rVar = this.f35267r;
        if (rVar.f35191z <= 0 && (D = rVar.D()) != null) {
            int i11 = D.f35242a | 1;
            D.f35242a = i11;
            if ((i11 & 32) == 0) {
                t.y yVar = D.f35247f;
                if (yVar == null) {
                    yVar = new t.y();
                    D.f35247f = yVar;
                }
                int i12 = D.f35246e;
                int c10 = yVar.c(obj);
                if (c10 < 0) {
                    c10 = ~c10;
                    i10 = -1;
                } else {
                    i10 = yVar.f34927c[c10];
                }
                yVar.f34926b[c10] = obj;
                yVar.f34927c[c10] = i12;
                if (i10 != D.f35246e) {
                    if (obj instanceof k0) {
                        t.z zVar = D.f35248g;
                        if (zVar == null) {
                            zVar = new t.z();
                            D.f35248g = zVar;
                        }
                        zVar.l(obj, ((j0) ((k0) obj)).j().f35051f);
                    }
                } else {
                    return;
                }
            }
            if (obj instanceof e1.z) {
                ((e1.z) obj).f(1);
            }
            this.f35256g.a(obj, D);
            if (obj instanceof k0) {
                v0.i iVar = this.f35258i;
                iVar.c(obj);
                t.y yVar2 = ((j0) ((k0) obj)).j().f35050e;
                Object[] objArr = yVar2.f34926b;
                long[] jArr = yVar2.f34925a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr[i13];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((255 & j10) < 128) {
                                    e1.y yVar3 = (e1.y) objArr[(i13 << 3) + i15];
                                    if (yVar3 instanceof e1.z) {
                                        ((e1.z) yVar3).f(1);
                                    }
                                    iVar.a(yVar3, obj);
                                }
                                j10 >>= 8;
                            }
                            if (i14 != 8) {
                                return;
                            }
                        }
                        if (i13 != length) {
                            i13++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // t0.y1
    public final int d(x1 x1Var, Object obj) {
        y yVar;
        int i10 = x1Var.f35242a;
        if ((i10 & 2) != 0) {
            x1Var.f35242a = i10 | 4;
        }
        d dVar = x1Var.f35244c;
        if (dVar != null && dVar.a()) {
            if (!this.f35255f.i(dVar)) {
                synchronized (this.f35253d) {
                    yVar = this.f35264o;
                }
                if (yVar != null) {
                    r rVar = yVar.f35267r;
                    if (rVar.E && rVar.g0(x1Var, obj)) {
                        return 4;
                    }
                }
                return 1;
            }
            if (x1Var.f35245d != null) {
                return u(x1Var, dVar, obj);
            }
        }
        return 1;
    }

    @Override // t0.u
    public final void e(Function2 function2) {
        o((b1.c) function2);
    }

    public final void f() {
        this.f35252c.set(null);
        this.f35259j.f36603b.b0();
        this.f35260k.f36603b.b0();
        t.c0 c0Var = this.f35254e;
        if (!c0Var.f34843a.b()) {
            new x(c0Var).a();
        }
    }

    public final t.d0 g(t.d0 d0Var, Object obj, boolean z10) {
        t.d0 d0Var2;
        int i10;
        Object f10 = this.f35256g.f37656a.f(obj);
        if (f10 != null) {
            boolean z11 = f10 instanceof t.d0;
            t.d0 d0Var3 = this.f35257h;
            v0.i iVar = this.f35261l;
            if (z11) {
                t.d0 d0Var4 = (t.d0) f10;
                Object[] objArr = d0Var4.f34863b;
                long[] jArr = d0Var4.f34862a;
                int length = jArr.length - 2;
                t.d0 d0Var5 = d0Var;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j10 & 255) < 128) {
                                    x1 x1Var = (x1) objArr[(i11 << 3) + i14];
                                    if (!iVar.b(obj, x1Var) && x1Var.b(obj) != 1) {
                                        if (x1Var.f35248g != null && !z10) {
                                            d0Var3.d(x1Var);
                                        } else {
                                            if (d0Var5 == null) {
                                                d0Var5 = new t.d0();
                                            }
                                            d0Var5.d(x1Var);
                                        }
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = i12;
                                }
                                j10 >>= i10;
                                i14++;
                                i12 = i10;
                            }
                            if (i13 != i12) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
                return d0Var5;
            }
            x1 x1Var2 = (x1) f10;
            if (!iVar.b(obj, x1Var2) && x1Var2.b(obj) != 1) {
                if (x1Var2.f35248g != null && !z10) {
                    d0Var3.d(x1Var2);
                } else {
                    if (d0Var == null) {
                        d0Var2 = new t.d0();
                    } else {
                        d0Var2 = d0Var;
                    }
                    d0Var2.d(x1Var2);
                    return d0Var2;
                }
            }
        }
        return d0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01da, code lost:
    
        if (r12.a(r3) == true) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022b, code lost:
    
        if (r9.b() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0250, code lost:
    
        if (r12.a(r8) != true) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.Set r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.y.h(java.util.Set, boolean):void");
    }

    public final void i() {
        synchronized (this.f35253d) {
            try {
                j(this.f35259j);
                r();
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f35254e.f34843a.b()) {
                            new x(this.f35254e).a();
                        }
                        throw th2;
                    } catch (Exception e10) {
                        f();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0147, code lost:
    
        if (((t0.x1) r12).a() == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(u0.a r32) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.y.j(u0.a):void");
    }

    public final void k() {
        synchronized (this.f35253d) {
            try {
                if (this.f35260k.f36603b.e0()) {
                    j(this.f35260k);
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f35254e.f34843a.b()) {
                            new x(this.f35254e).a();
                        }
                        throw th2;
                    } catch (Exception e10) {
                        f();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void l() {
        synchronized (this.f35253d) {
            try {
                this.f35267r.f35186u = null;
                if (!this.f35254e.f34843a.b()) {
                    new x(this.f35254e).a();
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f35254e.f34843a.b()) {
                            new x(this.f35254e).a();
                        }
                        throw th2;
                    } catch (Exception e10) {
                        f();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r8.b() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        r1.j(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
    
        if (r13.f37656a.b((t0.k0) r8) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.y.m():void");
    }

    public final void n(b1.c cVar) {
        try {
            synchronized (this.f35253d) {
                q();
                v0.a aVar = this.f35262m;
                this.f35262m = new v0.a();
                try {
                    if (!this.f35266q.f14236a) {
                        this.f35250a.i();
                        Intrinsics.a(null, null);
                    }
                    r rVar = this.f35267r;
                    if (rVar.f35170e.f36603b.d0()) {
                        rVar.q(aVar, cVar);
                    } else {
                        t.F("Expected applyChanges() to have been called");
                        throw null;
                    }
                } catch (Exception e10) {
                    this.f35262m = aVar;
                    throw e10;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f35254e.f34843a.b()) {
                    new x(this.f35254e).a();
                }
                throw th2;
            } catch (Exception e11) {
                f();
                throw e11;
            }
        }
    }

    public final void o(b1.c cVar) {
        if (!this.f35269t) {
            this.f35250a.a(this, cVar);
        } else {
            al.d.f1("The composition is disposed");
            throw null;
        }
    }

    public final void p() {
        boolean z10;
        f fVar = this.f35251b;
        o2 o2Var = this.f35255f;
        if (o2Var.f35107b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t.c0 c0Var = this.f35254e;
        if (z10 || (!c0Var.f34843a.b())) {
            Trace.beginSection("Compose:deactivate");
            try {
                x xVar = new x(c0Var);
                if (z10) {
                    fVar.getClass();
                    q2 h10 = o2Var.h();
                    try {
                        t.L(h10, xVar);
                        Unit unit = Unit.f23355a;
                        h10.e(true);
                        fVar.g();
                        xVar.b();
                    } catch (Throwable th2) {
                        h10.e(false);
                        throw th2;
                    }
                }
                xVar.a();
                Unit unit2 = Unit.f23355a;
                Trace.endSection();
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        }
        this.f35256g.f37656a.a();
        this.f35258i.f37656a.a();
        v0.a aVar = this.f35262m;
        aVar.f37642c = 0;
        vt.t.m(aVar.f37640a);
        vt.t.m(aVar.f37641b);
        this.f35259j.f36603b.b0();
        r rVar = this.f35267r;
        rVar.D.f24251a.clear();
        rVar.f35183r.clear();
        rVar.f35170e.f36603b.b0();
        rVar.f35186u = null;
    }

    public final void q() {
        AtomicReference atomicReference = this.f35252c;
        Object obj = z.f35276a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!Intrinsics.a(andSet, obj)) {
                if (andSet instanceof Set) {
                    h((Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        h(set, true);
                    }
                    return;
                }
                t.G("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            t.G("pending composition has not been applied");
            throw null;
        }
    }

    public final void r() {
        AtomicReference atomicReference = this.f35252c;
        Object andSet = atomicReference.getAndSet(null);
        if (!Intrinsics.a(andSet, z.f35276a)) {
            if (andSet instanceof Set) {
                h((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    h(set, false);
                }
                return;
            }
            if (andSet == null) {
                t.G("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw null;
            }
            t.G("corrupt pendingModifications drain: " + atomicReference);
            throw null;
        }
    }

    public final void s(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                ((c1) ((Pair) arrayList.get(i10)).f23353a).getClass();
                if (!Intrinsics.a(null, this)) {
                    break;
                } else {
                    i10++;
                }
            } else {
                z10 = true;
                break;
            }
        }
        t.u0(z10);
        try {
            r rVar = this.f35267r;
            rVar.getClass();
            try {
                rVar.H(arrayList);
                rVar.k();
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                rVar.a();
                throw th2;
            }
        } finally {
        }
    }

    public final void t() {
        x1 x1Var;
        y1 y1Var;
        synchronized (this.f35253d) {
            try {
                for (Object obj : this.f35255f.f35108c) {
                    if (obj instanceof x1) {
                        x1Var = (x1) obj;
                    } else {
                        x1Var = null;
                    }
                    if (x1Var != null && (y1Var = x1Var.f35243b) != null) {
                        y1Var.d(x1Var, null);
                    }
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:4:0x0003, B:6:0x0008, B:9:0x0014, B:11:0x0018, B:13:0x001e, B:18:0x003d, B:20:0x0043, B:26:0x004e, B:27:0x0054, B:29:0x005c, B:31:0x0064, B:32:0x0068, B:41:0x002c, B:42:0x0031, B:43:0x0032, B:44:0x0037), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u(t0.x1 r7, t0.d r8, java.lang.Object r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f35253d
            monitor-enter(r0)
            t0.y r1 = r6.f35264o     // Catch: java.lang.Throwable -> L38
            r2 = 0
            if (r1 == 0) goto L3a
            t0.o2 r3 = r6.f35255f     // Catch: java.lang.Throwable -> L38
            int r4 = r6.f35265p     // Catch: java.lang.Throwable -> L38
            boolean r5 = r3.f35111f     // Catch: java.lang.Throwable -> L38
            r5 = r5 ^ 1
            if (r5 == 0) goto L32
            if (r4 < 0) goto L2c
            int r5 = r3.f35107b     // Catch: java.lang.Throwable -> L38
            if (r4 >= r5) goto L2c
            boolean r5 = r3.i(r8)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L3a
            int[] r3 = r3.f35106a     // Catch: java.lang.Throwable -> L38
            int r3 = dp.b.D0(r3, r4)     // Catch: java.lang.Throwable -> L38
            int r3 = r3 + r4
            int r5 = r8.f34969a     // Catch: java.lang.Throwable -> L38
            if (r4 > r5) goto L3a
            if (r5 >= r3) goto L3a
            goto L3b
        L2c:
            java.lang.String r7 = "Invalid group index"
            t0.t.F(r7)     // Catch: java.lang.Throwable -> L38
            throw r2     // Catch: java.lang.Throwable -> L38
        L32:
            java.lang.String r7 = "Writer is active"
            t0.t.F(r7)     // Catch: java.lang.Throwable -> L38
            throw r2     // Catch: java.lang.Throwable -> L38
        L38:
            r7 = move-exception
            goto L8c
        L3a:
            r1 = r2
        L3b:
            if (r1 != 0) goto L75
            t0.r r3 = r6.f35267r     // Catch: java.lang.Throwable -> L38
            boolean r4 = r3.E     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L4c
            boolean r3 = r3.g0(r7, r9)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L4c
            monitor-exit(r0)
            r7 = 4
            return r7
        L4c:
            if (r9 != 0) goto L54
            v0.a r3 = r6.f35262m     // Catch: java.lang.Throwable -> L38
            r3.c(r7, r2)     // Catch: java.lang.Throwable -> L38
            goto L75
        L54:
            v0.a r2 = r6.f35262m     // Catch: java.lang.Throwable -> L38
            int r3 = r2.a(r7)     // Catch: java.lang.Throwable -> L38
            if (r3 < 0) goto L68
            java.lang.Object r2 = r2.b(r7)     // Catch: java.lang.Throwable -> L38
            v0.c r2 = (v0.c) r2     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L75
            r2.add(r9)     // Catch: java.lang.Throwable -> L38
            goto L75
        L68:
            v0.c r3 = new v0.c     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
            r3.add(r9)     // Catch: java.lang.Throwable -> L38
            kotlin.Unit r4 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> L38
            r2.c(r7, r3)     // Catch: java.lang.Throwable -> L38
        L75:
            monitor-exit(r0)
            if (r1 == 0) goto L7d
            int r7 = r1.u(r7, r8, r9)
            return r7
        L7d:
            t0.v r7 = r6.f35250a
            r7.j(r6)
            t0.r r7 = r6.f35267r
            boolean r7 = r7.E
            if (r7 == 0) goto L8a
            r7 = 3
            goto L8b
        L8a:
            r7 = 2
        L8b:
            return r7
        L8c:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.y.u(t0.x1, t0.d, java.lang.Object):int");
    }

    public final void v(Object obj) {
        Object f10 = this.f35256g.f37656a.f(obj);
        if (f10 != null) {
            boolean z10 = f10 instanceof t.d0;
            v0.i iVar = this.f35261l;
            if (z10) {
                t.d0 d0Var = (t.d0) f10;
                Object[] objArr = d0Var.f34863b;
                long[] jArr = d0Var.f34862a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    x1 x1Var = (x1) objArr[(i10 << 3) + i12];
                                    if (x1Var.b(obj) == 4) {
                                        iVar.a(obj, x1Var);
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                return;
                            }
                        }
                        if (i10 != length) {
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                x1 x1Var2 = (x1) f10;
                if (x1Var2.b(obj) == 4) {
                    iVar.a(obj, x1Var2);
                }
            }
        }
    }

    public final boolean w(v0.c cVar) {
        Object[] objArr = cVar.f37645b;
        int i10 = cVar.f37644a;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            Intrinsics.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (this.f35256g.f37656a.b(obj) || this.f35258i.f37656a.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean x() {
        boolean K;
        synchronized (this.f35253d) {
            try {
                q();
                try {
                    v0.a aVar = this.f35262m;
                    this.f35262m = new v0.a();
                    try {
                        if (!this.f35266q.f14236a) {
                            this.f35250a.i();
                            Intrinsics.a(null, null);
                        }
                        K = this.f35267r.K(aVar);
                        if (!K) {
                            r();
                        }
                    } catch (Exception e10) {
                        this.f35262m = aVar;
                        throw e10;
                    }
                } catch (Throwable th2) {
                    try {
                        if (!this.f35254e.f34843a.b()) {
                            new x(this.f35254e).a();
                        }
                        throw th2;
                    } catch (Exception e11) {
                        f();
                        throw e11;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void y(v0.c cVar) {
        v0.c cVar2;
        while (true) {
            Object obj = this.f35252c.get();
            if (obj == null || Intrinsics.a(obj, z.f35276a)) {
                cVar2 = cVar;
            } else if (obj instanceof Set) {
                cVar2 = new Set[]{obj, cVar};
            } else if (obj instanceof Object[]) {
                Set[] setArr = (Set[]) obj;
                Intrinsics.checkNotNullParameter(setArr, "<this>");
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = cVar;
                cVar2 = copyOf;
            } else {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.f35252c).toString());
            }
            AtomicReference atomicReference = this.f35252c;
            while (!atomicReference.compareAndSet(obj, cVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f35253d) {
                    r();
                    Unit unit = Unit.f23355a;
                }
                return;
            }
            return;
        }
    }

    public final void z(Object obj) {
        synchronized (this.f35253d) {
            try {
                v(obj);
                Object f10 = this.f35258i.f37656a.f(obj);
                if (f10 != null) {
                    if (f10 instanceof t.d0) {
                        t.d0 d0Var = (t.d0) f10;
                        Object[] objArr = d0Var.f34863b;
                        long[] jArr = d0Var.f34862a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j10 = jArr[i10];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((255 & j10) < 128) {
                                            v((k0) objArr[(i10 << 3) + i12]);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    }
                                }
                                if (i10 == length) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        v((k0) f10);
                    }
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
