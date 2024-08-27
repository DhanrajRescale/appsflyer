package k0;

import j2.d0;
import j2.e0;
import j2.g0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.t;
import n1.x;
import o2.r;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f21858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i10) {
        super(1);
        this.f21857a = i10;
        this.f21858b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        long j10;
        int i10 = this.f21857a;
        e0 e0Var = null;
        h hVar = this.f21858b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                e0 e0Var2 = hVar.R0().f21832n;
                if (e0Var2 != null) {
                    d0 d0Var = e0Var2.f20703a;
                    j2.e eVar = d0Var.f20689a;
                    g0 g0Var = hVar.f21860o;
                    x xVar = hVar.f21869x;
                    if (xVar != null) {
                        j10 = xVar.a();
                    } else {
                        j10 = t.f28177i;
                    }
                    e0 e0Var3 = new e0(new d0(eVar, g0.e(0, 16777214, j10, 0L, 0L, 0L, g0Var, null, null, null, null), d0Var.f20691c, d0Var.f20692d, d0Var.f20693e, d0Var.f20694f, d0Var.f20695g, d0Var.f20696h, d0Var.f20697i, d0Var.f20698j), e0Var2.f20704b, e0Var2.f20705c);
                    list.add(e0Var3);
                    e0Var = e0Var3;
                }
                if (e0Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                j2.e eVar2 = (j2.e) obj;
                f T0 = hVar.T0();
                if (T0 != null) {
                    if (!Intrinsics.a(eVar2, T0.f21854b)) {
                        T0.f21854b = eVar2;
                        d dVar = T0.f21856d;
                        if (dVar != null) {
                            g0 g0Var2 = hVar.f21860o;
                            r rVar = hVar.f21861p;
                            int i11 = hVar.f21863r;
                            boolean z11 = hVar.f21864s;
                            int i12 = hVar.f21865t;
                            int i13 = hVar.f21866u;
                            List list2 = hVar.f21867v;
                            dVar.f21819a = eVar2;
                            dVar.f21820b = g0Var2;
                            dVar.f21821c = rVar;
                            dVar.f21822d = i11;
                            dVar.f21823e = z11;
                            dVar.f21824f = i12;
                            dVar.f21825g = i13;
                            dVar.f21826h = list2;
                            dVar.f21830l = null;
                            dVar.f21832n = null;
                            Unit unit = Unit.f23355a;
                        }
                    }
                } else {
                    f fVar = new f(hVar.f21859n, eVar2);
                    d dVar2 = new d(eVar2, hVar.f21860o, hVar.f21861p, hVar.f21863r, hVar.f21864s, hVar.f21865t, hVar.f21866u, hVar.f21867v);
                    dVar2.c(hVar.R0().f21829k);
                    fVar.f21856d = dVar2;
                    hVar.C.setValue(fVar);
                }
                c2.g.u(hVar);
                return Boolean.TRUE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (hVar.T0() == null) {
                    return Boolean.FALSE;
                }
                Function1 function1 = hVar.f21870y;
                if (function1 != null) {
                    f T02 = hVar.T0();
                    Intrinsics.c(T02);
                    function1.invoke(T02);
                }
                f T03 = hVar.T0();
                if (T03 != null) {
                    T03.f21855c = booleanValue;
                }
                c2.g.u(hVar);
                c2.g.t(hVar);
                c2.g.s(hVar);
                return Boolean.TRUE;
        }
    }
}
