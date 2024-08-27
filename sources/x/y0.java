package x;

import android.view.accessibility.AccessibilityNodeInfo;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.PositionItem;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import d2.b3;
import d2.z2;
import i0.s2;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import t0.l3;
import t0.u2;

/* loaded from: classes.dex */
public final class y0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i10, Object obj, Object obj2) {
        super(0);
        this.f39783a = i10;
        this.f39784b = obj;
        this.f39785c = obj2;
    }

    public final Double a() {
        double d10;
        Double marginPrice;
        int i10 = this.f39783a;
        double d11 = 0.0d;
        Object obj = this.f39785c;
        Object obj2 = this.f39784b;
        switch (i10) {
            case 21:
                double doubleValue = ((Number) ((l3) ((iu.z) obj2).f20560a).getValue()).doubleValue();
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto = (FnoOrderInfoResponseDto) ((l3) obj).getValue();
                if (fnoOrderInfoResponseDto != null && (marginPrice = fnoOrderInfoResponseDto.getMarginPrice()) != null) {
                    d10 = marginPrice.doubleValue();
                } else {
                    d10 = 0.0d;
                }
                double d12 = doubleValue * d10;
                if (d12 >= 0.0d) {
                    d11 = d12;
                }
                return Double.valueOf(d11);
            default:
                double marginPrice2 = ((OptionContract) obj).getMarginPrice() * ((Number) ((l3) obj2).getValue()).doubleValue();
                if (marginPrice2 >= 0.0d) {
                    d11 = marginPrice2;
                }
                return Double.valueOf(d11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [v0.h] */
    public final void d() {
        a2.z0 placementScope;
        float f10;
        float f11;
        h2.o oVar;
        androidx.compose.ui.node.a aVar;
        hb.d dVar;
        String str;
        int i10 = this.f39783a;
        Object obj = this.f39784b;
        Object obj2 = this.f39785c;
        switch (i10) {
            case 0:
                ((iu.z) obj).f20560a = c2.g.p((z0) obj2, a2.y0.f132a);
                return;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 11:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                Function2 function2 = (Function2) obj;
                if (function2 != null) {
                    hb.g gVar = (hb.g) obj2;
                    Intrinsics.c(gVar);
                    function2.invoke(gVar.f18172b, gVar.f18173c);
                    return;
                }
                return;
            case 3:
                p2.c0 c0Var = (p2.c0) obj;
                t0.g1 g1Var = (t0.g1) obj2;
                if (j2.f0.a(c0Var.f30523b, ((p2.c0) g1Var.getValue()).f30523b)) {
                    if (Intrinsics.a(c0Var.f30524c, ((p2.c0) g1Var.getValue()).f30524c)) {
                        return;
                    }
                }
                g1Var.setValue(c0Var);
                return;
            case 7:
                t0.c1 c1Var = (t0.c1) obj2;
                c1Var.getClass();
                c1Var.getClass();
                c1Var.getClass();
                t0.r.b((t0.r) obj, null, null);
                return;
            case 8:
                v0.c cVar = (v0.c) obj;
                t0.e0 e0Var = (t0.e0) obj2;
                Object[] objArr = cVar.f37645b;
                int i11 = cVar.f37644a;
                for (int i12 = 0; i12 < i11; i12++) {
                    Object obj3 = objArr[i12];
                    Intrinsics.d(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    ((t0.y) e0Var).z(obj3);
                }
                return;
            case 9:
                ((k1.c) obj).f21892p.invoke((k1.d) obj2);
                return;
            case 10:
                ((iu.z) obj).f20560a = ((l1.t) obj2).Q0();
                return;
            case 12:
                c2.b1 b1Var = ((androidx.compose.ui.node.a) obj2).f1422w;
                iu.z zVar = (iu.z) obj;
                if ((b1Var.f7658e.f16408d & 8) != 0) {
                    for (g1.n nVar = b1Var.f7657d; nVar != null; nVar = nVar.f16409e) {
                        if ((nVar.f16407c & 8) != 0) {
                            c2.o oVar2 = nVar;
                            ?? r62 = 0;
                            while (oVar2 != 0) {
                                if (oVar2 instanceof c2.z1) {
                                    c2.z1 z1Var = (c2.z1) oVar2;
                                    if (z1Var.E()) {
                                        h2.j jVar = new h2.j();
                                        zVar.f20560a = jVar;
                                        jVar.f17852c = true;
                                    }
                                    if (z1Var.A0()) {
                                        ((h2.j) zVar.f20560a).f17851b = true;
                                    }
                                    z1Var.n((h2.j) zVar.f20560a);
                                } else if ((oVar2.f16407c & 8) != 0 && (oVar2 instanceof c2.o)) {
                                    g1.n nVar2 = oVar2.f7801o;
                                    int i13 = 0;
                                    oVar2 = oVar2;
                                    r62 = r62;
                                    while (nVar2 != null) {
                                        if ((nVar2.f16407c & 8) != 0) {
                                            i13++;
                                            r62 = r62;
                                            if (i13 == 1) {
                                                oVar2 = nVar2;
                                            } else {
                                                if (r62 == 0) {
                                                    r62 = new v0.h(new g1.n[16]);
                                                }
                                                if (oVar2 != 0) {
                                                    r62.b(oVar2);
                                                    oVar2 = 0;
                                                }
                                                r62.b(nVar2);
                                            }
                                        }
                                        nVar2 = nVar2.f16410f;
                                        oVar2 = oVar2;
                                        r62 = r62;
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                oVar2 = c2.g.f(r62);
                            }
                        }
                    }
                    return;
                }
                return;
            case 13:
                c2.q0 q0Var = (c2.q0) obj;
                c2.i1 i1Var = q0Var.a().f7723m;
                if (i1Var == null || (placementScope = i1Var.f7853h) == null) {
                    placementScope = ((d2.a0) c2.k0.a(q0Var.f7813a)).getPlacementScope();
                }
                c2.n0 n0Var = (c2.n0) obj2;
                Function1 function1 = n0Var.A;
                if (function1 == null) {
                    c2.i1 a10 = q0Var.a();
                    long j10 = n0Var.B;
                    float f12 = n0Var.C;
                    placementScope.getClass();
                    a2.z0.e(a10, j10, f12);
                    return;
                }
                c2.i1 a11 = q0Var.a();
                long j11 = n0Var.B;
                float f13 = n0Var.C;
                placementScope.getClass();
                a2.z0.l(a11, j11, f13, function1);
                return;
            case 14:
                Function1 e10 = ((c2.v1) obj).f7866a.e();
                if (e10 != null) {
                    c2.u0 u0Var = (c2.u0) obj2;
                    u0Var.getClass();
                    e10.invoke(new c2.t0(u0Var));
                    return;
                }
                return;
            case 15:
                n1.u0 u0Var2 = c2.i1.D;
                ((c2.i1) obj).Q0((n1.r) obj2);
                return;
            case 16:
                d2.a0 a0Var = (d2.a0) obj;
                y2.k kVar = (y2.k) obj2;
                a0Var.getAndroidViewsHandler$ui_release().removeViewInLayout(kVar);
                HashMap<androidx.compose.ui.node.a, y2.k> layoutNodeToHolder = a0Var.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                androidx.compose.ui.node.a remove = a0Var.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(kVar);
                zq.f.w(layoutNodeToHolder);
                layoutNodeToHolder.remove(remove);
                kVar.setImportantForAccessibility(0);
                return;
            case 17:
                z2 z2Var = (z2) obj;
                h2.h hVar = z2Var.f13705e;
                h2.h hVar2 = z2Var.f13706f;
                Float f14 = z2Var.f13703c;
                Float f15 = z2Var.f13704d;
                if (hVar != null && f14 != null) {
                    f10 = ((Number) hVar.f17822a.mo2invoke()).floatValue() - f14.floatValue();
                } else {
                    f10 = 0.0f;
                }
                if (hVar2 != null && f15 != null) {
                    f11 = ((Number) hVar2.f17822a.mo2invoke()).floatValue() - f15.floatValue();
                } else {
                    f11 = 0.0f;
                }
                if (f10 != s0.g.f34069a || f11 != s0.g.f34069a) {
                    d2.r0 r0Var = (d2.r0) obj2;
                    t.s sVar = d2.r0.N;
                    int D = r0Var.D(z2Var.f13701a);
                    b3 b3Var = (b3) r0Var.s().g(r0Var.f13588n);
                    if (b3Var != null) {
                        try {
                            AccessibilityNodeInfo accessibilityNodeInfo = r0Var.f13589o;
                            if (accessibilityNodeInfo != null) {
                                accessibilityNodeInfo.setBoundsInScreen(r0Var.k(b3Var));
                                Unit unit = Unit.f23355a;
                            }
                        } catch (IllegalStateException unused) {
                            Unit unit2 = Unit.f23355a;
                        }
                    }
                    r0Var.f13578d.invalidate();
                    b3 b3Var2 = (b3) r0Var.s().g(D);
                    if (b3Var2 != null && (oVar = b3Var2.f13370a) != null && (aVar = oVar.f17861c) != null) {
                        if (hVar != null) {
                            r0Var.f13591q.k(D, hVar);
                        }
                        if (hVar2 != null) {
                            r0Var.f13592r.k(D, hVar2);
                        }
                        r0Var.z(aVar);
                    }
                }
                if (hVar != null) {
                    z2Var.f13703c = (Float) hVar.f17822a.mo2invoke();
                }
                if (hVar2 != null) {
                    z2Var.f13704d = (Float) hVar2.f17822a.mo2invoke();
                    return;
                }
                return;
            case 18:
                u2 u2Var = (u2) ((t0.e1) obj);
                u2Var.j((u2Var.i() + 1) % ((Object[]) obj2).length);
                return;
            case 19:
                androidx.navigation.q qVar = (androidx.navigation.q) obj2;
                Iterator it = ((Iterable) qVar.f2283f.f36547a.getValue()).iterator();
                while (it.hasNext()) {
                    qVar.b((androidx.navigation.n) it.next());
                }
                return;
            case 24:
                ((Function1) obj).invoke((gb.e) obj2);
                return;
            case 25:
                ((Function1) obj).invoke((hb.y) obj2);
                return;
            case 26:
                ((t0.g1) obj2).setValue(vb.o.f37928b);
                ((Function0) obj).mo2invoke();
                return;
            case 27:
                hb.i iVar = ((hb.u) obj).f18230a.f18228e.f18194d;
                if (iVar != null && (dVar = iVar.f18184b) != null && (str = dVar.f18156a) != null) {
                    ((Function1) obj2).invoke(str);
                    return;
                }
                return;
            case 28:
                ((t0.g1) obj).setValue(null);
                ((t0.g1) obj2).setValue(Boolean.valueOf(!((Boolean) r5.getValue()).booleanValue()));
                return;
        }
    }

    public final Integer e() {
        int i10 = this.f39783a;
        Object obj = this.f39785c;
        Object obj2 = this.f39784b;
        switch (i10) {
            case 20:
                return Integer.valueOf(((Number) ((l3) obj).getValue()).intValue() - ((PositionItem) obj2).getLots());
            default:
                return Integer.valueOf(((Number) ((t0.g1) obj2).getValue()).intValue() - ((PositionItem) obj).getLots());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        long j10;
        int i10;
        long j11;
        s2 d10;
        i0.z1 z1Var;
        j2.e eVar;
        i0.z1 z1Var2;
        j2.e eVar2 = null;
        int i11 = this.f39783a;
        Object obj = this.f39785c;
        Object obj2 = this.f39784b;
        switch (i11) {
            case 0:
                d();
                return Unit.f23355a;
            case 1:
                e0.u uVar = (e0.u) ((l3) obj2).getValue();
                e0.j0 j0Var = (e0.j0) obj;
                return new e0.w(j0Var, uVar, new d0.r0((IntRange) j0Var.f14718d.f14654f.getValue(), uVar));
            case 2:
                m1.d dVar = (m1.d) obj2;
                if (dVar == null) {
                    a2.u Q0 = ((f0.g) obj).Q0();
                    if (Q0 == null) {
                        return null;
                    }
                    return t0.t.F0(hl.f.i1(Q0.q()));
                }
                return dVar;
            case 3:
                d();
                return Unit.f23355a;
            case 4:
                switch (i11) {
                    case 4:
                        ((i0.q1) obj2).f19154u.invoke(new p2.n(((p2.o) obj).f30600e));
                        return Boolean.TRUE;
                    default:
                        a3.a.u(obj2);
                        throw null;
                }
            case 5:
            case 11:
            default:
                d();
                return Unit.f23355a;
            case 6:
                l0.v0 v0Var = (l0.v0) obj2;
                long j12 = ((w2.j) ((t0.g1) obj).getValue()).f38798a;
                m1.c i12 = v0Var.i();
                if (i12 != null) {
                    i0.q1 q1Var = v0Var.f23839d;
                    if (q1Var != null && (z1Var2 = q1Var.f19134a) != null) {
                        eVar2 = z1Var2.f19292a;
                    }
                    if (eVar2 != null && eVar2.f20699a.length() != 0) {
                        i0.z0 z0Var = (i0.z0) v0Var.f23849n.getValue();
                        if (z0Var == null) {
                            i10 = -1;
                        } else {
                            i10 = l0.y0.f23873a[z0Var.ordinal()];
                        }
                        if (i10 != -1) {
                            if (i10 != 1 && i10 != 2) {
                                if (i10 == 3) {
                                    long j13 = v0Var.k().f30523b;
                                    int i13 = j2.f0.f20711c;
                                    j11 = j13 & 4294967295L;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                long j14 = v0Var.k().f30523b;
                                int i14 = j2.f0.f20711c;
                                j11 = j14 >> 32;
                            }
                            int i15 = (int) j11;
                            i0.q1 q1Var2 = v0Var.f23839d;
                            if (q1Var2 != null && (d10 = q1Var2.d()) != null) {
                                i0.q1 q1Var3 = v0Var.f23839d;
                                if (q1Var3 != null && (z1Var = q1Var3.f19134a) != null && (eVar = z1Var.f19292a) != null) {
                                    int f10 = kotlin.ranges.d.f(v0Var.f23837b.b(i15), 0, eVar.f20699a.length());
                                    float d11 = m1.c.d(d10.d(i12.f27237a));
                                    j2.e0 e0Var = d10.f19194a;
                                    int f11 = e0Var.f(f10);
                                    float h10 = e0Var.h(f11);
                                    float i16 = e0Var.i(f11);
                                    float e10 = kotlin.ranges.d.e(d11, Math.min(h10, i16), Math.max(h10, i16));
                                    if (Math.abs(d11 - e10) > ((int) (j12 >> 32)) / 2) {
                                        j10 = m1.c.f27235d;
                                    } else {
                                        float k10 = e0Var.k(f11);
                                        j10 = t0.t.g(e10, ((e0Var.d(f11) - k10) / 2) + k10);
                                    }
                                } else {
                                    j10 = m1.c.f27235d;
                                }
                            } else {
                                j10 = m1.c.f27235d;
                            }
                        } else {
                            j10 = m1.c.f27235d;
                        }
                    } else {
                        j10 = m1.c.f27235d;
                    }
                } else {
                    j10 = m1.c.f27235d;
                }
                return new m1.c(j10);
            case 7:
                d();
                return Unit.f23355a;
            case 8:
                d();
                return Unit.f23355a;
            case 9:
                d();
                return Unit.f23355a;
            case 10:
                d();
                return Unit.f23355a;
            case 12:
                d();
                return Unit.f23355a;
            case 13:
                d();
                return Unit.f23355a;
            case 14:
                d();
                return Unit.f23355a;
            case 15:
                d();
                return Unit.f23355a;
            case 16:
                d();
                return Unit.f23355a;
            case 17:
                d();
                return Unit.f23355a;
            case 18:
                d();
                return Unit.f23355a;
            case 19:
                d();
                return Unit.f23355a;
            case 20:
                return e();
            case 21:
                return a();
            case 22:
                return e();
            case 23:
                return a();
            case 24:
                d();
                return Unit.f23355a;
            case 25:
                d();
                return Unit.f23355a;
            case 26:
                d();
                return Unit.f23355a;
            case 27:
                d();
                return Unit.f23355a;
            case 28:
                d();
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(androidx.compose.ui.node.a aVar, iu.z zVar) {
        super(0);
        this.f39783a = 12;
        this.f39785c = aVar;
        this.f39784b = zVar;
    }
}
