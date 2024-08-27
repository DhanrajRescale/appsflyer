package o0;

import a2.m0;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d2.s1;
import el.l;
import g1.o;
import i0.y2;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;
import t0.m;
import t0.m2;
import t0.n;
import t0.o3;
import t0.p;
import t0.p0;
import t0.r;
import t0.r1;
import t0.x1;
import w.r0;
import x.z;
import y.q0;
import z2.t;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f29353a = new p0(o3.f35116a, f.f29348c);

    public static final void a(Function0 function0, t tVar, Function2 function2, n nVar, int i10, int i11) {
        Function0 function02;
        int i12;
        int i13;
        int i14;
        int i15;
        Function0 function03;
        AccessibilityManager accessibilityManager;
        boolean z10;
        to.e eVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Function0 function04;
        r rVar = (r) nVar;
        rVar.c0(-707851182);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            function02 = function0;
        } else if ((i10 & 6) == 0) {
            function02 = function0;
            if (rVar.j(function02)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            function02 = function0;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.h(tVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (rVar.j(function2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        int i17 = i12;
        if ((i17 & 147) == 146 && rVar.G()) {
            rVar.V();
            function04 = function02;
        } else {
            if (i16 != 0) {
                function03 = null;
            } else {
                function03 = function02;
            }
            View view = (View) rVar.m(AndroidCompositionLocals_androidKt.f1433g);
            w2.b bVar = (w2.b) rVar.m(s1.f13620e);
            String str = (String) rVar.m(f29353a);
            w2.k kVar = (w2.k) rVar.m(s1.f13626k);
            Object systemService = ((Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b)).getSystemService("accessibility");
            if (systemService instanceof AccessibilityManager) {
                accessibilityManager = (AccessibilityManager) systemService;
            } else {
                accessibilityManager = null;
            }
            p M0 = al.d.M0(rVar);
            g1 r02 = t0.t.r0(function2, rVar);
            AccessibilityManager accessibilityManager2 = accessibilityManager;
            UUID uuid = (UUID) l.y0(new Object[0], null, f.f29347b, rVar, 3072, 6);
            rVar.b0(741193017);
            boolean h10 = rVar.h(accessibilityManager2);
            Object Q = rVar.Q();
            to.e eVar2 = m.f35080a;
            if (!h10 && Q != eVar2) {
                eVar = eVar2;
            } else {
                if (accessibilityManager2 != null && accessibilityManager2.isTouchExplorationEnabled()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eVar = eVar2;
                k kVar2 = new k(function03, view, z10, bVar, tVar, uuid);
                q0 q0Var = new q0(6, kVar2, r02);
                Object obj = b1.d.f3079a;
                b1.c cVar = new b1.c(q0Var, true, -1115941656);
                kVar2.setParentCompositionContext(M0);
                kVar2.f29366t.setValue(cVar);
                kVar2.f29367u = true;
                rVar.k0(kVar2);
                Q = kVar2;
            }
            k kVar3 = (k) Q;
            rVar.s(false);
            rVar.b0(741194046);
            boolean j10 = rVar.j(kVar3);
            int i18 = i17 & 14;
            if (i18 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean h11 = j10 | z11 | rVar.h(str) | rVar.h(kVar);
            Object Q2 = rVar.Q();
            to.e eVar3 = eVar;
            if (h11 || Q2 == eVar3) {
                w.a aVar = new w.a(kVar3, function03, str, kVar, 7);
                rVar.k0(aVar);
                Q2 = aVar;
            }
            rVar.s(false);
            t0.t.c(kVar3, (Function1) Q2, rVar);
            rVar.b0(741194413);
            boolean j11 = rVar.j(kVar3);
            if (i18 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean h12 = j11 | z12 | rVar.h(str) | rVar.h(kVar);
            Object Q3 = rVar.Q();
            if (h12 || Q3 == eVar3) {
                r0 r0Var = new r0(kVar3, function03, str, kVar, 1);
                rVar.k0(r0Var);
                Q3 = r0Var;
            }
            rVar.s(false);
            t0.t.i((Function0) Q3, rVar);
            rVar.b0(741194640);
            boolean j12 = rVar.j(kVar3);
            if ((i17 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z15 = j12 | z13;
            Object Q4 = rVar.Q();
            if (z15 || Q4 == eVar3) {
                Q4 = new z(19, kVar3, tVar);
                rVar.k0(Q4);
            }
            rVar.s(false);
            t0.t.c(tVar, (Function1) Q4, rVar);
            g1.l lVar = g1.l.f16404b;
            rVar.b0(741195023);
            boolean j13 = rVar.j(kVar3);
            Object Q5 = rVar.Q();
            if (!j13 && Q5 != eVar3) {
                z14 = false;
            } else {
                z14 = false;
                Q5 = new d(kVar3, 0);
                rVar.k0(Q5);
            }
            rVar.s(z14);
            o k10 = androidx.compose.ui.layout.a.k(lVar, (Function1) Q5);
            rVar.b0(741195492);
            boolean j14 = rVar.j(kVar3) | rVar.h(kVar);
            Object Q6 = rVar.Q();
            if (j14 || Q6 == eVar3) {
                Q6 = new y2(1, kVar3, kVar);
                rVar.k0(Q6);
            }
            m0 m0Var = (m0) Q6;
            rVar.s(false);
            rVar.b0(-1323940314);
            int i19 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j15 = androidx.compose.ui.layout.a.j(k10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, m0Var, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i19))) {
                    nn.d.s(i19, rVar, i19, iVar);
                }
                nn.d.q(0, j15, new m2(rVar), rVar, 2058660585);
                v.e.x(rVar, false, true, false);
                function04 = function03;
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 4, function04, tVar, function2);
        }
    }
}
