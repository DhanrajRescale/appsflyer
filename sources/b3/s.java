package b3;

import a2.a1;
import a2.l0;
import a2.z0;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s implements k3.c {

    /* renamed from: a, reason: collision with root package name */
    public final j3.e f3144a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3145b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3146c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3147d;

    /* renamed from: e, reason: collision with root package name */
    public final u f3148e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f3149f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3150g;

    /* JADX WARN: Type inference failed for: r0v0, types: [j3.e, j3.m, j3.d] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k3.b] */
    public s(w2.b bVar) {
        ?? dVar = new j3.d(0, 0);
        dVar.f20935s0 = new ArrayList();
        dVar.f20891t0 = new h.c((j3.e) dVar);
        dVar.f20892u0 = new k3.f(dVar);
        dVar.f20894w0 = null;
        dVar.f20895x0 = false;
        dVar.f20896y0 = new c3.d();
        dVar.B0 = 0;
        dVar.C0 = 0;
        dVar.D0 = new j3.b[4];
        dVar.E0 = new j3.b[4];
        dVar.F0 = 257;
        dVar.G0 = false;
        dVar.H0 = false;
        dVar.I0 = null;
        dVar.J0 = null;
        dVar.K0 = null;
        dVar.L0 = null;
        dVar.M0 = new HashSet();
        dVar.N0 = new Object();
        dVar.f20894w0 = this;
        dVar.f20892u0.f21997h = this;
        this.f3144a = dVar;
        this.f3145b = new LinkedHashMap();
        this.f3146c = new LinkedHashMap();
        this.f3147d = new LinkedHashMap();
        this.f3148e = new u(bVar);
        this.f3149f = new int[2];
        this.f3150g = new int[2];
        new ArrayList();
    }

    public static void d(int i10, int i11, int i12, int i13, boolean z10, boolean z11, int i14, int[] iArr) {
        boolean z12;
        int i15;
        if (i10 != 0) {
            int i16 = i10 - 1;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            iArr[0] = i14;
                            iArr[1] = i14;
                            return;
                        }
                        throw new IllegalStateException(da.e.E(i10).concat(" is not supported").toString());
                    }
                    if (!z11 && ((i13 != 1 && i13 != 2) || (i13 != 2 && i12 == 1 && !z10))) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        i15 = i11;
                    } else {
                        i15 = 0;
                    }
                    iArr[0] = i15;
                    if (!z12) {
                        i11 = i14;
                    }
                    iArr[1] = i11;
                    return;
                }
                iArr[0] = 0;
                iArr[1] = i14;
                return;
            }
            iArr[0] = i11;
            iArr[1] = i11;
            return;
        }
        throw null;
    }

    @Override // k3.c
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0199  */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    @Override // k3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(j3.d r25, k3.b r26) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.s.b(j3.d, k3.b):void");
    }

    public final long c(j3.d dVar, long j10) {
        int i10;
        int i11;
        int i12;
        Object obj = dVar.f20863h0;
        String str = dVar.f20870l;
        int i13 = 0;
        if (dVar instanceof j3.l) {
            if (w2.a.f(j10)) {
                i12 = 1073741824;
            } else if (w2.a.d(j10)) {
                i12 = Integer.MIN_VALUE;
            } else {
                i12 = 0;
            }
            if (w2.a.e(j10)) {
                i13 = 1073741824;
            } else if (w2.a.c(j10)) {
                i13 = Integer.MIN_VALUE;
            }
            j3.l lVar = (j3.l) dVar;
            lVar.Y(i12, w2.a.h(j10), i13, w2.a.g(j10));
            i10 = lVar.B0;
            i11 = lVar.C0;
        } else if (obj instanceof l0) {
            a1 E = ((l0) obj).E(j10);
            this.f3145b.put(obj, E);
            i10 = E.f29a;
            i11 = E.f30b;
        } else {
            Log.w("CCL", "Nothing to measure for widget: " + str);
            long j11 = (long) 0;
            return (j11 & 4294967295L) | (j11 << 32);
        }
        return (i10 << 32) | (i11 & 4294967295L);
    }

    public final void e(z0 z0Var, List list) {
        l0 l0Var;
        a1 a1Var;
        Object obj;
        LinkedHashMap linkedHashMap = this.f3147d;
        if (linkedHashMap.isEmpty()) {
            Iterator it = this.f3144a.f20935s0.iterator();
            while (it.hasNext()) {
                j3.d dVar = (j3.d) it.next();
                Object obj2 = dVar.f20863h0;
                if (obj2 instanceof l0) {
                    g3.l lVar = dVar.f20868k;
                    j3.d dVar2 = lVar.f16514a;
                    if (dVar2 != null) {
                        lVar.f16515b = dVar2.t();
                        lVar.f16516c = dVar2.u();
                        dVar2.t();
                        dVar2.u();
                        lVar.a(dVar2.f20868k);
                    }
                    linkedHashMap.put(obj2, new g3.l(lVar));
                }
            }
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l0 l0Var2 = (l0) list.get(i10);
            if (!linkedHashMap.containsKey(l0Var2)) {
                Iterator it2 = linkedHashMap.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        l0 l0Var3 = (l0) obj;
                        if (androidx.compose.ui.layout.a.f(l0Var3) != null && Intrinsics.a(androidx.compose.ui.layout.a.f(l0Var3), androidx.compose.ui.layout.a.f(l0Var2))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                l0Var = (l0) obj;
                if (l0Var == null) {
                    continue;
                }
            } else {
                l0Var = l0Var2;
            }
            g3.l lVar2 = (g3.l) linkedHashMap.get(l0Var);
            if (lVar2 == null || (a1Var = (a1) this.f3145b.get(l0Var)) == null) {
                return;
            }
            if (!linkedHashMap.containsKey(l0Var2)) {
                int i11 = a1Var.f29a;
                int i12 = a1Var.f30b;
                if (i11 >= 0 && i12 >= 0) {
                    pp.b.B(z0Var, l0Var2.E(hl.f.Q(i11, i11, i12, i12)), lVar2);
                } else {
                    yk.j.A1("width(" + i11 + ") and height(" + i12 + ") must be >= 0");
                    throw null;
                }
            } else {
                pp.b.B(z0Var, a1Var, lVar2);
            }
        }
    }

    public final long f(long j10, w2.k kVar, n nVar, List list, int i10) {
        g3.f fVar;
        g3.f fVar2;
        boolean z10;
        HashMap hashMap;
        g3.g gVar;
        j3.j t10;
        j3.j t11;
        j jVar;
        if (w2.a.f(j10)) {
            fVar = g3.f.b(w2.a.h(j10));
        } else {
            fVar = new g3.f(g3.f.f16481i);
            int j11 = w2.a.j(j10);
            if (j11 >= 0) {
                fVar.f16486a = j11;
            }
        }
        u uVar = this.f3148e;
        uVar.f16509f.f16443d0 = fVar;
        if (w2.a.e(j10)) {
            fVar2 = g3.f.b(w2.a.g(j10));
        } else {
            fVar2 = new g3.f(g3.f.f16481i);
            int i11 = w2.a.i(j10);
            if (i11 >= 0) {
                fVar2.f16486a = i11;
            }
        }
        g3.b bVar = uVar.f16509f;
        bVar.f16445e0 = fVar2;
        g3.f fVar3 = bVar.f16443d0;
        j3.e eVar = this.f3144a;
        fVar3.a(eVar, 0);
        bVar.f16445e0.a(eVar, 1);
        uVar.f3154m = j10;
        if (kVar == w2.k.f38800b) {
            z10 = true;
        } else {
            z10 = false;
        }
        uVar.f16505b = !z10;
        this.f3145b.clear();
        this.f3146c.clear();
        this.f3147d.clear();
        boolean z11 = nVar.f3137d;
        ArrayList arrayList = nVar.f3139f;
        if (!z11 && list.size() == arrayList.size()) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object a10 = ((l0) list.get(i12)).a();
                if (a10 instanceof j) {
                    jVar = (j) a10;
                } else {
                    jVar = null;
                }
                if (Intrinsics.a(jVar, arrayList.get(i12))) {
                }
            }
            pp.b.u(uVar, list);
            eVar.T(w2.a.h(j10));
            eVar.O(w2.a.g(j10));
            eVar.f20891t0.Z(eVar);
            eVar.F0 = i10;
            c3.d.f7904q = eVar.d0(512);
            eVar.b0(eVar.F0, 0, 0, 0, 0, 0, 0);
            return hl.f.k(eVar.s(), eVar.m());
        }
        HashMap hashMap2 = uVar.f16506c;
        Iterator it = hashMap2.keySet().iterator();
        while (it.hasNext()) {
            ((g3.h) hashMap2.get(it.next())).c().E();
        }
        hashMap2.clear();
        hashMap2.put(g3.k.f16503k, bVar);
        uVar.f16507d.clear();
        uVar.f16508e.clear();
        uVar.f16511h.clear();
        uVar.f16513j = true;
        arrayList.clear();
        nVar.f3136c.c(Unit.f23355a, nVar.f3138e, new c0.s(7, list, nVar, uVar));
        nVar.f3137d = false;
        pp.b.u(uVar, list);
        eVar.f20935s0.clear();
        bVar.f16443d0.a(eVar, 0);
        bVar.f16445e0.a(eVar, 1);
        HashMap hashMap3 = uVar.f16507d;
        Iterator it2 = hashMap3.keySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            hashMap = uVar.f16506c;
            if (!hasNext) {
                break;
            }
            Object next = it2.next();
            j3.j t12 = ((g3.g) hashMap3.get(next)).t();
            if (t12 != null) {
                g3.h hVar = (g3.h) hashMap.get(next);
                if (hVar == null) {
                    hVar = uVar.b(next);
                }
                hVar.b(t12);
            }
        }
        for (Object obj : hashMap.keySet()) {
            g3.h hVar2 = (g3.h) hashMap.get(obj);
            if (hVar2 != bVar && (hVar2.d() instanceof g3.g) && (t11 = ((g3.g) hVar2.d()).t()) != null) {
                g3.h hVar3 = (g3.h) hashMap.get(obj);
                if (hVar3 == null) {
                    hVar3 = uVar.b(obj);
                }
                hVar3.b(t11);
            }
        }
        Iterator it3 = hashMap.keySet().iterator();
        while (it3.hasNext()) {
            g3.h hVar4 = (g3.h) hashMap.get(it3.next());
            if (hVar4 != bVar) {
                j3.d c10 = hVar4.c();
                c10.f20867j0 = hVar4.getKey().toString();
                c10.V = null;
                if (hVar4.d() instanceof h3.g) {
                    hVar4.a();
                }
                eVar.W(c10);
            } else {
                hVar4.b(eVar);
            }
        }
        Iterator it4 = hashMap3.keySet().iterator();
        while (it4.hasNext()) {
            g3.g gVar2 = (g3.g) hashMap3.get(it4.next());
            if (gVar2.t() != null) {
                Iterator it5 = gVar2.f16495m0.iterator();
                while (it5.hasNext()) {
                    gVar2.t().W(((g3.h) hashMap.get(it5.next())).c());
                }
                gVar2.a();
            } else {
                gVar2.a();
            }
        }
        Iterator it6 = hashMap.keySet().iterator();
        while (it6.hasNext()) {
            g3.h hVar5 = (g3.h) hashMap.get(it6.next());
            if (hVar5 != bVar && (hVar5.d() instanceof g3.g) && (t10 = (gVar = (g3.g) hVar5.d()).t()) != null) {
                Iterator it7 = gVar.f16495m0.iterator();
                while (it7.hasNext()) {
                    Object next2 = it7.next();
                    g3.h hVar6 = (g3.h) hashMap.get(next2);
                    if (hVar6 != null) {
                        t10.W(hVar6.c());
                    } else if (next2 instanceof g3.h) {
                        t10.W(((g3.h) next2).c());
                    } else {
                        System.out.println("couldn't find reference for " + next2);
                    }
                }
                hVar5.a();
            }
        }
        for (Object obj2 : hashMap.keySet()) {
            g3.h hVar7 = (g3.h) hashMap.get(obj2);
            hVar7.a();
            j3.d c11 = hVar7.c();
            if (c11 != null && obj2 != null) {
                c11.f20870l = obj2.toString();
            }
        }
        eVar.T(w2.a.h(j10));
        eVar.O(w2.a.g(j10));
        eVar.f20891t0.Z(eVar);
        eVar.F0 = i10;
        c3.d.f7904q = eVar.d0(512);
        eVar.b0(eVar.F0, 0, 0, 0, 0, 0, 0);
        return hl.f.k(eVar.s(), eVar.m());
    }
}
