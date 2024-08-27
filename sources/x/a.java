package x;

import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39488b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i10) {
        super(0);
        this.f39487a = i10;
        this.f39488b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        m1.d R0;
        qu.h v10;
        v0.h hVar;
        e1.v vVar;
        boolean z10;
        int i10 = 2;
        int i11 = 0;
        boolean z11 = true;
        switch (this.f39487a) {
            case 4:
                y.s sVar = (y.s) this.f39488b;
                y.l lVar = sVar.f40926r;
                while (lVar.f40834a.l()) {
                    v0.h hVar2 = lVar.f40834a;
                    if (!hVar2.k()) {
                        m1.d dVar = (m1.d) ((y.p) hVar2.f37653a[hVar2.f37655c - 1]).f40880a.mo2invoke();
                        if (dVar == null || sVar.S0(sVar.f40931w, dVar)) {
                            qu.h hVar3 = ((y.p) hVar2.n(hVar2.f37655c - 1)).f40881b;
                            Unit unit = Unit.f23355a;
                            l.Companion companion = ut.l.INSTANCE;
                            hVar3.resumeWith(unit);
                        } else {
                            if (sVar.f40930v && (R0 = sVar.R0()) != null && sVar.S0(sVar.f40931w, R0)) {
                                sVar.f40930v = false;
                            }
                            sVar.f40933y.f40852e = y.s.Q0(sVar);
                            return;
                        }
                    } else {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                }
                if (sVar.f40930v) {
                    sVar.f40930v = false;
                }
                sVar.f40933y.f40852e = y.s.Q0(sVar);
                return;
            case 6:
                c2.g.p((y.c2) this.f39488b, d2.s1.f13620e);
                return;
            case 8:
                ((g0.d) this.f39488b).G.invoke(Boolean.valueOf(!r0.F));
                return;
            case 17:
                ((q0.a) this.f39488b).f31462j.setValue(Boolean.valueOf(!((Boolean) r0.f31462j.getValue()).booleanValue()));
                return;
            case 18:
                c2.g.s((q0.b) this.f39488b);
                return;
            case 20:
                t0.f2 f2Var = (t0.f2) this.f39488b;
                synchronized (f2Var.f34999b) {
                    v10 = f2Var.v();
                    if (((t0.z1) f2Var.f35015r.getValue()).compareTo(t0.z1.f35279b) <= 0) {
                        Throwable th2 = f2Var.f35001d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th2);
                        throw cancellationException;
                    }
                }
                if (v10 != null) {
                    l.Companion companion2 = ut.l.INSTANCE;
                    v10.resumeWith(Unit.f23355a);
                    return;
                }
                return;
            case 21:
                break;
            case 22:
                ((l1.t) this.f39488b).Q0();
                return;
            case 23:
                r1.j0 j0Var = (r1.j0) this.f39488b;
                if (j0Var.f32960k == j0Var.f32957h.i()) {
                    j0Var.f32957h.j(j0Var.f32957h.i() + 1);
                    return;
                }
                return;
            case 26:
                a2.i0 a10 = ((a2.j1) this.f39488b).a();
                androidx.compose.ui.node.a aVar = a10.f70a;
                if (a10.f83n != aVar.o().size()) {
                    Iterator it = a10.f75f.entrySet().iterator();
                    while (it.hasNext()) {
                        ((a2.a0) ((Map.Entry) it.next()).getValue()).f26d = true;
                    }
                    if (!aVar.f1423x.f7816d) {
                        androidx.compose.ui.node.a.S(aVar, false, 3);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                b2.e eVar = (b2.e) this.f39488b;
                eVar.f3095f = false;
                HashSet hashSet = new HashSet();
                v0.h hVar4 = eVar.f3093d;
                int i12 = hVar4.f37655c;
                v0.h hVar5 = eVar.f3094e;
                if (i12 > 0) {
                    Object[] objArr = hVar4.f37653a;
                    int i13 = 0;
                    do {
                        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i13];
                        b2.c cVar = (b2.c) hVar5.f37653a[i13];
                        g1.n nVar = aVar2.f1422w.f7658e;
                        if (nVar.f16417m) {
                            b2.e.b(nVar, cVar, hashSet);
                        }
                        i13++;
                    } while (i13 < i12);
                }
                hVar4.g();
                hVar5.g();
                v0.h hVar6 = eVar.f3091b;
                int i14 = hVar6.f37655c;
                v0.h hVar7 = eVar.f3092c;
                if (i14 > 0) {
                    Object[] objArr2 = hVar6.f37653a;
                    do {
                        c2.d dVar2 = (c2.d) objArr2[i11];
                        b2.c cVar2 = (b2.c) hVar7.f37653a[i11];
                        if (dVar2.f16417m) {
                            b2.e.b(dVar2, cVar2, hashSet);
                        }
                        i11++;
                    } while (i11 < i14);
                }
                hVar6.g();
                hVar7.g();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((c2.d) it2.next()).S0();
                }
                return;
            case 28:
                c2.q0 q0Var = ((androidx.compose.ui.node.a) this.f39488b).f1423x;
                q0Var.f7827o.f7794v = true;
                c2.m0 m0Var = q0Var.f7828p;
                if (m0Var != null) {
                    m0Var.f7771s = true;
                    return;
                }
                return;
            default:
                c2.n0 n0Var = (c2.n0) this.f39488b;
                c2.q0 q0Var2 = n0Var.E;
                q0Var2.f7823k = 0;
                v0.h u10 = q0Var2.f7813a.u();
                int i15 = u10.f37655c;
                if (i15 > 0) {
                    Object[] objArr3 = u10.f37653a;
                    int i16 = 0;
                    do {
                        c2.n0 n0Var2 = ((androidx.compose.ui.node.a) objArr3[i16]).f1423x.f7827o;
                        n0Var2.f7779g = n0Var2.f7780h;
                        n0Var2.f7780h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        n0Var2.f7791s = false;
                        if (n0Var2.f7783k == 2) {
                            n0Var2.f7783k = 3;
                        }
                        i16++;
                    } while (i16 < i15);
                }
                n0Var.L(c2.f.f7677f);
                n0Var.j().F0().d();
                androidx.compose.ui.node.a aVar3 = n0Var.E.f7813a;
                v0.h u11 = aVar3.u();
                int i17 = u11.f37655c;
                if (i17 > 0) {
                    Object[] objArr4 = u11.f37653a;
                    do {
                        androidx.compose.ui.node.a aVar4 = (androidx.compose.ui.node.a) objArr4[i11];
                        if (aVar4.f1423x.f7827o.f7779g != aVar4.s()) {
                            aVar3.J();
                            aVar3.x();
                            if (aVar4.s() == Integer.MAX_VALUE) {
                                aVar4.f1423x.f7827o.A0();
                            }
                        }
                        i11++;
                    } while (i11 < i17);
                }
                n0Var.L(c2.f.f7678g);
                return;
        }
        while (true) {
            e1.v vVar2 = (e1.v) this.f39488b;
            v0.h hVar8 = vVar2.f14937f;
            synchronized (hVar8) {
                try {
                    if (!vVar2.f14934c) {
                        vVar2.f14934c = z11;
                        try {
                            v0.h hVar9 = vVar2.f14937f;
                            int i18 = hVar9.f37655c;
                            if (i18 > 0) {
                                try {
                                    Object[] objArr5 = hVar9.f37653a;
                                    int i19 = i11;
                                    while (true) {
                                        try {
                                            e1.u uVar = (e1.u) objArr5[i19];
                                            t.d0 d0Var = uVar.f14926g;
                                            Object[] objArr6 = d0Var.f34863b;
                                            long[] jArr = d0Var.f34862a;
                                            int length = jArr.length - i10;
                                            if (length >= 0) {
                                                int i20 = i11;
                                                hVar = hVar8;
                                                while (true) {
                                                    try {
                                                        long j10 = jArr[i20];
                                                        vVar = vVar2;
                                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i21 = 8;
                                                            int i22 = 8 - ((~(i20 - length)) >>> 31);
                                                            for (int i23 = i11; i23 < i22; i23++) {
                                                                if ((j10 & 255) < 128) {
                                                                    try {
                                                                        uVar.f14920a.invoke(objArr6[(i20 << 3) + i23]);
                                                                        i21 = 8;
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        vVar2 = vVar;
                                                                        vVar2.f14934c = false;
                                                                        throw th;
                                                                    }
                                                                }
                                                                j10 >>= i21;
                                                            }
                                                            if (i22 != i21) {
                                                            }
                                                        }
                                                        if (i20 != length) {
                                                            i20++;
                                                            vVar2 = vVar;
                                                            i11 = 0;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        vVar = vVar2;
                                                    }
                                                }
                                            } else {
                                                vVar = vVar2;
                                                hVar = hVar8;
                                            }
                                            d0Var.e();
                                            i19++;
                                            if (i19 >= i18) {
                                                vVar2 = vVar;
                                                z10 = 0;
                                            } else {
                                                hVar8 = hVar;
                                                vVar2 = vVar;
                                                i10 = 2;
                                                i11 = 0;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            hVar = hVar8;
                                            vVar2.f14934c = false;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    vVar = vVar2;
                                    hVar = hVar8;
                                }
                            } else {
                                hVar = hVar8;
                                z10 = i11;
                            }
                            try {
                                vVar2.f14934c = z10;
                            } catch (Throwable th7) {
                                th = th7;
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    } else {
                        hVar = hVar8;
                    }
                    Unit unit2 = Unit.f23355a;
                    if (!e1.v.a((e1.v) this.f39488b)) {
                        return;
                    }
                    i10 = 2;
                    i11 = 0;
                    z11 = true;
                } catch (Throwable th9) {
                    th = th9;
                    hVar = hVar8;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x012a, code lost:
    
        if (r0.Q0().f23901a != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00fa, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0099, code lost:
    
        if (r0.Q0().f23901a != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009b, code lost:
    
        r0 = androidx.compose.ui.focus.a.C(r0);
     */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean mo2invoke() {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.a.mo2invoke():java.lang.Boolean");
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f39487a;
        Object obj = this.f39488b;
        switch (i10) {
            case 0:
                return mo2invoke();
            case 1:
                return mo2invoke();
            case 2:
                return mo2invoke();
            case 3:
                return mo2invoke();
            case 4:
                a();
                return Unit.f23355a;
            case 5:
                return mo2invoke();
            case 6:
                a();
                return Unit.f23355a;
            case 7:
                return new d0.o0((d1.n) obj, vt.p0.d());
            case 8:
                a();
                return Unit.f23355a;
            case 9:
                return ((i0.q1) obj).d();
            case 10:
                return new i0.q2((y.g1) obj, s0.g.f34069a);
            case 11:
                w2.i iVar = (w2.i) obj;
                return new w2.h(hl.f.j(iVar.f38794a, iVar.f38795b));
            case 12:
                Object systemService = ((j0.h) obj).f20588a.getContext().getSystemService("input_method");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 13:
                return new BaseInputConnection(((j0.r) obj).f20605a, false);
            case 14:
                return mo2invoke();
            case 15:
                return mo2invoke();
            case 16:
                return mo2invoke();
            case 17:
                a();
                return Unit.f23355a;
            case 18:
                a();
                return Unit.f23355a;
            case 19:
                HashMap hashMap = new HashMap();
                t0.q1 q1Var = (t0.q1) obj;
                int size = q1Var.f35137a.size();
                for (int i11 = 0; i11 < size; i11++) {
                    t0.w0 w0Var = (t0.w0) q1Var.f35137a.get(i11);
                    Object obj2 = w0Var.f35226b;
                    int i12 = w0Var.f35225a;
                    Object v0Var = obj2 != null ? new t0.v0(Integer.valueOf(i12), w0Var.f35226b) : Integer.valueOf(i12);
                    Object obj3 = hashMap.get(v0Var);
                    if (obj3 == null) {
                        obj3 = new LinkedHashSet();
                        hashMap.put(v0Var, obj3);
                    }
                    ((LinkedHashSet) obj3).add(w0Var);
                }
                return hashMap;
            case 20:
                a();
                return Unit.f23355a;
            case 21:
                a();
                return Unit.f23355a;
            case 22:
                a();
                return Unit.f23355a;
            case 23:
                a();
                return Unit.f23355a;
            case 24:
                switch (i10) {
                    case 24:
                        return ((w1.d) obj).f38759c;
                    default:
                        return ((w1.g) obj).Q0();
                }
            case 25:
                switch (i10) {
                    case 24:
                        return ((w1.d) obj).f38759c;
                    default:
                        return ((w1.g) obj).Q0();
                }
            case 26:
                a();
                return Unit.f23355a;
            case 27:
                a();
                return Unit.f23355a;
            case 28:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
