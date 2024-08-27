package x1;

import c2.i1;
import c2.w1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: b, reason: collision with root package name */
    public final g1.n f39857b;

    /* renamed from: c, reason: collision with root package name */
    public final y1.b f39858c;

    /* renamed from: d, reason: collision with root package name */
    public final t.o f39859d;

    /* renamed from: e, reason: collision with root package name */
    public i1 f39860e;

    /* renamed from: f, reason: collision with root package name */
    public k f39861f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39862g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f39863h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f39864i;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, y1.b] */
    public i(g1.n nVar) {
        this.f39857b = nVar;
        ?? obj = new Object();
        obj.f41053b = new long[2];
        this.f39858c = obj;
        this.f39859d = new t.o(2);
        this.f39863h = true;
        this.f39864i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    @Override // x1.j
    public final boolean a(t.o oVar, a2.u uVar, f fVar, boolean z10) {
        t.o oVar2;
        y1.b bVar;
        Object obj;
        boolean z11;
        boolean z12;
        boolean z13;
        k kVar;
        boolean z14;
        int i10;
        int i11;
        i iVar = this;
        t.o oVar3 = oVar;
        a2.u uVar2 = uVar;
        boolean a10 = super.a(oVar, uVar, fVar, z10);
        c2.o oVar4 = iVar.f39857b;
        if (!oVar4.f16417m) {
            return true;
        }
        ?? r82 = 0;
        while (oVar4 != 0) {
            if (oVar4 instanceof w1) {
                iVar.f39860e = c2.g.x((w1) oVar4, 16);
            } else if ((oVar4.f16407c & 16) != 0 && (oVar4 instanceof c2.o)) {
                g1.n nVar = oVar4.f7801o;
                int i12 = 0;
                oVar4 = oVar4;
                r82 = r82;
                while (nVar != null) {
                    if ((nVar.f16407c & 16) != 0) {
                        i12++;
                        r82 = r82;
                        if (i12 == 1) {
                            oVar4 = nVar;
                        } else {
                            if (r82 == 0) {
                                r82 = new v0.h(new g1.n[16]);
                            }
                            if (oVar4 != 0) {
                                r82.b(oVar4);
                                oVar4 = 0;
                            }
                            r82.b(nVar);
                        }
                    }
                    nVar = nVar.f16410f;
                    oVar4 = oVar4;
                    r82 = r82;
                }
                if (i12 == 1) {
                }
            }
            oVar4 = c2.g.f(r82);
        }
        int i13 = oVar.i();
        int i14 = 0;
        while (true) {
            oVar2 = iVar.f39859d;
            bVar = iVar.f39858c;
            if (i14 >= i13) {
                break;
            }
            long f10 = oVar3.f(i14);
            t tVar = (t) oVar3.j(i14);
            int i15 = bVar.f41052a;
            int i16 = 0;
            while (true) {
                if (i16 >= i15) {
                    break;
                }
                if (bVar.f41053b[i16] == f10) {
                    long j10 = tVar.f39915g;
                    if (m1.c.f(j10)) {
                        long j11 = tVar.f39911c;
                        if (m1.c.f(j11)) {
                            List list = tVar.f39919k;
                            if (list == null) {
                                list = vt.i0.f38321a;
                            }
                            ArrayList arrayList = new ArrayList(list.size());
                            List list2 = tVar.f39919k;
                            if (list2 == null) {
                                list2 = vt.i0.f38321a;
                            }
                            i10 = i13;
                            int size = list2.size();
                            z14 = a10;
                            int i17 = 0;
                            while (i17 < size) {
                                int i18 = size;
                                d dVar = (d) list2.get(i17);
                                long j12 = f10;
                                long j13 = dVar.f39836a;
                                i1 i1Var = iVar.f39860e;
                                Intrinsics.c(i1Var);
                                arrayList.add(new d(j13, i1Var.O(uVar2, dVar.f39837b), dVar.f39838c));
                                i17++;
                                list2 = list2;
                                size = i18;
                                j11 = j11;
                                f10 = j12;
                                i14 = i14;
                            }
                            i11 = i14;
                            i1 i1Var2 = iVar.f39860e;
                            Intrinsics.c(i1Var2);
                            long O = i1Var2.O(uVar2, j10);
                            i1 i1Var3 = iVar.f39860e;
                            Intrinsics.c(i1Var3);
                            t tVar2 = new t(tVar.f39909a, tVar.f39910b, i1Var3.O(uVar2, j11), tVar.f39912d, tVar.f39913e, tVar.f39914f, O, tVar.f39916h, tVar.f39917i, arrayList, tVar.f39918j, tVar.f39920l);
                            tVar2.f39921m = tVar.f39921m;
                            oVar2.g(f10, tVar2);
                        }
                    }
                } else {
                    i16++;
                    iVar = this;
                    uVar2 = uVar;
                }
            }
            z14 = a10;
            i10 = i13;
            i11 = i14;
            i14 = i11 + 1;
            iVar = this;
            oVar3 = oVar;
            uVar2 = uVar;
            i13 = i10;
            a10 = z14;
        }
        boolean z15 = a10;
        if (oVar2.e()) {
            bVar.f41052a = 0;
            this.f39865a.g();
            return true;
        }
        for (int i19 = bVar.f41052a - 1; -1 < i19; i19--) {
            if (oVar.d(bVar.f41053b[i19]) < 0) {
                bVar.b(i19);
            }
        }
        ArrayList arrayList2 = new ArrayList(oVar2.i());
        int i20 = oVar2.i();
        for (int i21 = 0; i21 < i20; i21++) {
            arrayList2.add(oVar2.j(i21));
        }
        k kVar2 = new k(arrayList2, fVar);
        int size2 = arrayList2.size();
        int i22 = 0;
        while (true) {
            if (i22 < size2) {
                obj = arrayList2.get(i22);
                if (fVar.a(((t) obj).f39909a)) {
                    break;
                }
                i22++;
            } else {
                obj = null;
                break;
            }
        }
        t tVar3 = (t) obj;
        if (tVar3 != null) {
            boolean z16 = tVar3.f39912d;
            if (!z10) {
                z11 = false;
                this.f39863h = false;
            } else {
                z11 = false;
                if (!this.f39863h && (z16 || tVar3.f39916h)) {
                    i1 i1Var4 = this.f39860e;
                    Intrinsics.c(i1Var4);
                    boolean b02 = t0.t.b0(tVar3, i1Var4.f31c);
                    z12 = true;
                    this.f39863h = !b02;
                    int i23 = 5;
                    if (this.f39863h == this.f39862g && (r.a(kVar2.f39873d, 3) || r.a(kVar2.f39873d, 4) || r.a(kVar2.f39873d, 5))) {
                        if (this.f39863h) {
                            i23 = 4;
                        }
                        kVar2.f39873d = i23;
                    } else if (!r.a(kVar2.f39873d, 4) && this.f39862g && !this.f39864i) {
                        kVar2.f39873d = 3;
                    } else if (r.a(kVar2.f39873d, 5) && this.f39863h && z16) {
                        kVar2.f39873d = 3;
                    }
                }
            }
            z12 = true;
            int i232 = 5;
            if (this.f39863h == this.f39862g) {
            }
            if (!r.a(kVar2.f39873d, 4)) {
            }
            if (r.a(kVar2.f39873d, 5)) {
                kVar2.f39873d = 3;
            }
        } else {
            z11 = false;
            z12 = true;
        }
        if (!z15 && r.a(kVar2.f39873d, 3) && (kVar = this.f39861f) != null) {
            ?? r22 = kVar.f39870a;
            int size3 = r22.size();
            ?? r52 = kVar2.f39870a;
            if (size3 == r52.size()) {
                int size4 = r52.size();
                for (?? r72 = z11; r72 < size4; r72++) {
                    if (m1.c.b(((t) r22.get(r72)).f39911c, ((t) r52.get(r72)).f39911c)) {
                    }
                }
                z13 = z11;
                this.f39861f = kVar2;
                return z13;
            }
        }
        z13 = z12;
        this.f39861f = kVar2;
        return z13;
    }

    @Override // x1.j
    public final void b(f fVar) {
        super.b(fVar);
        k kVar = this.f39861f;
        if (kVar == null) {
            return;
        }
        this.f39862g = this.f39863h;
        List list = kVar.f39870a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) list.get(i10);
            if (!tVar.f39912d) {
                long j10 = tVar.f39909a;
                if (!fVar.a(j10) || !this.f39863h) {
                    y1.b bVar = this.f39858c;
                    int i11 = bVar.f41052a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            break;
                        }
                        if (j10 == bVar.f41053b[i12]) {
                            bVar.b(i12);
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        this.f39863h = false;
        this.f39864i = r.a(kVar.f39873d, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [v0.h] */
    public final void d() {
        v0.h hVar = this.f39865a;
        int i10 = hVar.f37655c;
        if (i10 > 0) {
            Object[] objArr = hVar.f37653a;
            int i11 = 0;
            do {
                ((i) objArr[i11]).d();
                i11++;
            } while (i11 < i10);
        }
        c2.o oVar = this.f39857b;
        ?? r42 = 0;
        while (oVar != 0) {
            if (oVar instanceof w1) {
                ((w1) oVar).D();
            } else if ((oVar.f16407c & 16) != 0 && (oVar instanceof c2.o)) {
                g1.n nVar = oVar.f7801o;
                int i12 = 0;
                oVar = oVar;
                r42 = r42;
                while (nVar != null) {
                    if ((nVar.f16407c & 16) != 0) {
                        i12++;
                        r42 = r42;
                        if (i12 == 1) {
                            oVar = nVar;
                        } else {
                            if (r42 == 0) {
                                r42 = new v0.h(new g1.n[16]);
                            }
                            if (oVar != 0) {
                                r42.b(oVar);
                                oVar = 0;
                            }
                            r42.b(nVar);
                        }
                    }
                    nVar = nVar.f16410f;
                    oVar = oVar;
                    r42 = r42;
                }
                if (i12 == 1) {
                }
            }
            oVar = c2.g.f(r42);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean e(f fVar) {
        v0.h hVar;
        int i10;
        t.o oVar = this.f39859d;
        boolean z10 = false;
        int i11 = 0;
        z10 = false;
        if (!oVar.e()) {
            g1.n nVar = this.f39857b;
            if (nVar.f16417m) {
                k kVar = this.f39861f;
                Intrinsics.c(kVar);
                i1 i1Var = this.f39860e;
                Intrinsics.c(i1Var);
                long j10 = i1Var.f31c;
                c2.o oVar2 = nVar;
                ?? r82 = 0;
                while (oVar2 != 0) {
                    if (oVar2 instanceof w1) {
                        ((w1) oVar2).J(kVar, l.f39879c, j10);
                    } else if ((oVar2.f16407c & 16) != 0 && (oVar2 instanceof c2.o)) {
                        g1.n nVar2 = oVar2.f7801o;
                        int i12 = 0;
                        oVar2 = oVar2;
                        r82 = r82;
                        while (nVar2 != null) {
                            if ((nVar2.f16407c & 16) != 0) {
                                i12++;
                                r82 = r82;
                                if (i12 == 1) {
                                    oVar2 = nVar2;
                                } else {
                                    if (r82 == 0) {
                                        r82 = new v0.h(new g1.n[16]);
                                    }
                                    if (oVar2 != 0) {
                                        r82.b(oVar2);
                                        oVar2 = 0;
                                    }
                                    r82.b(nVar2);
                                }
                            }
                            nVar2 = nVar2.f16410f;
                            oVar2 = oVar2;
                            r82 = r82;
                        }
                        if (i12 == 1) {
                        }
                    }
                    oVar2 = c2.g.f(r82);
                }
                if (nVar.f16417m && (i10 = (hVar = this.f39865a).f37655c) > 0) {
                    Object[] objArr = hVar.f37653a;
                    do {
                        ((i) objArr[i11]).e(fVar);
                        i11++;
                    } while (i11 < i10);
                }
                z10 = true;
            }
        }
        b(fVar);
        oVar.a();
        this.f39860e = null;
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r0v3, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean f(f fVar, boolean z10) {
        v0.h hVar;
        int i10;
        if (this.f39859d.e()) {
            return false;
        }
        c2.o oVar = this.f39857b;
        if (!oVar.f16417m) {
            return false;
        }
        k kVar = this.f39861f;
        Intrinsics.c(kVar);
        i1 i1Var = this.f39860e;
        Intrinsics.c(i1Var);
        long j10 = i1Var.f31c;
        c2.o oVar2 = oVar;
        ?? r72 = 0;
        while (oVar2 != 0) {
            if (oVar2 instanceof w1) {
                ((w1) oVar2).J(kVar, l.f39877a, j10);
            } else if ((oVar2.f16407c & 16) != 0 && (oVar2 instanceof c2.o)) {
                g1.n nVar = oVar2.f7801o;
                int i11 = 0;
                oVar2 = oVar2;
                r72 = r72;
                while (nVar != null) {
                    if ((nVar.f16407c & 16) != 0) {
                        i11++;
                        r72 = r72;
                        if (i11 == 1) {
                            oVar2 = nVar;
                        } else {
                            if (r72 == 0) {
                                r72 = new v0.h(new g1.n[16]);
                            }
                            if (oVar2 != 0) {
                                r72.b(oVar2);
                                oVar2 = 0;
                            }
                            r72.b(nVar);
                        }
                    }
                    nVar = nVar.f16410f;
                    oVar2 = oVar2;
                    r72 = r72;
                }
                if (i11 == 1) {
                }
            }
            oVar2 = c2.g.f(r72);
        }
        if (oVar.f16417m && (i10 = (hVar = this.f39865a).f37655c) > 0) {
            Object[] objArr = hVar.f37653a;
            int i12 = 0;
            do {
                i iVar = (i) objArr[i12];
                Intrinsics.c(this.f39860e);
                iVar.f(fVar, z10);
                i12++;
            } while (i12 < i10);
        }
        if (oVar.f16417m) {
            ?? r14 = 0;
            while (oVar != 0) {
                if (oVar instanceof w1) {
                    ((w1) oVar).J(kVar, l.f39878b, j10);
                } else if ((oVar.f16407c & 16) != 0 && (oVar instanceof c2.o)) {
                    g1.n nVar2 = oVar.f7801o;
                    int i13 = 0;
                    oVar = oVar;
                    r14 = r14;
                    while (nVar2 != null) {
                        if ((nVar2.f16407c & 16) != 0) {
                            i13++;
                            r14 = r14;
                            if (i13 == 1) {
                                oVar = nVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new v0.h(new g1.n[16]);
                                }
                                if (oVar != 0) {
                                    r14.b(oVar);
                                    oVar = 0;
                                }
                                r14.b(nVar2);
                            }
                        }
                        nVar2 = nVar2.f16410f;
                        oVar = oVar;
                        r14 = r14;
                    }
                    if (i13 == 1) {
                    }
                }
                oVar = c2.g.f(r14);
            }
        }
        return true;
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f39857b + ", children=" + this.f39865a + ", pointerIds=" + this.f39858c + ')';
    }
}
