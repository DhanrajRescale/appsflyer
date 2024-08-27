package ld;

import b0.p1;
import b0.z;
import c2.h1;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class f extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24554a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f24555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f24556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f24557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ArrayList arrayList, Function1 function1, g1 g1Var) {
        super(3);
        this.f24557d = arrayList;
        this.f24555b = function1;
        this.f24556c = g1Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        to.e eVar = t0.m.f35080a;
        int i10 = this.f24554a;
        ArrayList<yd.f> arrayList = this.f24557d;
        g1 g1Var = this.f24556c;
        Function1 function1 = this.f24555b;
        switch (i10) {
            case 0:
                z DropdownMenu = (z) obj;
                t0.n nVar = (t0.n) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
                if ((intValue & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                for (yd.f fVar : arrayList) {
                    t0.r rVar2 = (t0.r) nVar;
                    rVar2.b0(-862185242);
                    boolean h10 = rVar2.h(function1) | rVar2.h(fVar);
                    Object Q = rVar2.Q();
                    if (h10 || Q == eVar) {
                        Q = new c0.s(13, function1, fVar, g1Var);
                        rVar2.k0(Q);
                    }
                    rVar2.s(false);
                    pp.b.e((Function0) Q, null, false, null, null, b1.d.c(2028264300, new v.g(fVar, 10), rVar2), rVar2, 196608, 30);
                }
                return Unit.f23355a;
            default:
                p1 TopAppBar = (p1) obj;
                t0.n nVar2 = (t0.n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                if ((intValue2 & 81) == 16) {
                    t0.r rVar3 = (t0.r) nVar2;
                    if (rVar3.G()) {
                        rVar3.V();
                        return Unit.f23355a;
                    }
                }
                g1.l lVar = g1.l.f16404b;
                g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, 16, s0.g.f34069a, 11);
                t0.r rVar4 = (t0.r) nVar2;
                rVar4.b0(-1124587707);
                boolean h11 = rVar4.h(function1);
                Object Q2 = rVar4.Q();
                if (h11 || Q2 == eVar) {
                    Q2 = new h1(8, function1);
                    rVar4.k0(Q2);
                }
                rVar4.s(false);
                al.d.z(R.drawable.ic_redo_v2, null, h2.l.a(androidx.compose.foundation.a.k(x10, (Function0) Q2, 7), false, b.f24534f), 0L, rVar4, 6, 10);
                g1.o x11 = androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, 8, s0.g.f34069a, 11);
                rVar4.b0(-1124574390);
                Object Q3 = rVar4.Q();
                if (Q3 == eVar) {
                    Q3 = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var, 7, rVar4);
                }
                rVar4.s(false);
                al.d.z(R.drawable.ic_overflow_menu_vertical, null, h2.l.a(androidx.compose.foundation.a.k(x11, (Function0) Q3, 7), false, b.f24535g), 0L, rVar4, 6, 10);
                boolean booleanValue = ((Boolean) g1Var.getValue()).booleanValue();
                long f10 = hl.f.f(20, -20);
                g1.o a10 = h2.l.a(lVar, false, b.f24536h);
                rVar4.b0(-1124562993);
                Object Q4 = rVar4.Q();
                if (Q4 == eVar) {
                    Q4 = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var, 8, rVar4);
                }
                rVar4.s(false);
                pp.b.d(booleanValue, (Function0) Q4, a10, f10, null, null, b1.d.c(-260646076, new f(arrayList, function1, g1Var), rVar4), rVar4, 1575984, 48);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function1 function1, g1 g1Var, ArrayList arrayList) {
        super(3);
        this.f24555b = function1;
        this.f24556c = g1Var;
        this.f24557d = arrayList;
    }
}
