package androidx.compose.foundation;

import a0.l;
import android.content.Context;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d2.s;
import d2.s1;
import d2.w0;
import g1.o;
import h0.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n1.p;
import n1.s0;
import n1.x0;
import n1.z0;
import t0.m;
import t0.n;
import t0.r;
import t0.t;
import t0.x1;
import w.t1;
import w2.k;
import x.a2;
import x.d0;
import x.e0;
import x.g0;
import x.h2;
import x.j1;
import x.k0;
import x.m2;
import x.n1;
import x.o2;
import x.y1;
import x.z1;
import y.d2;
import y.g1;

/* loaded from: classes.dex */
public abstract class a {
    public static final d0 a(long j10, float f10) {
        return new d0(f10, new z0(j10));
    }

    public static final void b(o oVar, Function1 function1, n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        r rVar = (r) nVar;
        rVar.c0(-932836462);
        if ((i10 & 6) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(function1)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && rVar.G()) {
            rVar.V();
        } else {
            androidx.compose.foundation.layout.a.c(androidx.compose.ui.draw.a.d(oVar, function1), rVar);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t1(oVar, function1, i10, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(q1.b r18, java.lang.String r19, g1.o r20, g1.d r21, a2.l r22, float r23, n1.u r24, t0.n r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a.c(q1.b, java.lang.String, g1.o, g1.d, a2.l, float, n1.u, t0.n, int, int):void");
    }

    public static o d(o oVar, p pVar, g gVar, int i10) {
        float f10;
        x0 x0Var = gVar;
        if ((i10 & 2) != 0) {
            x0Var = s0.f28162a;
        }
        x0 x0Var2 = x0Var;
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        } else {
            f10 = s0.g.f34069a;
        }
        return oVar.g(new BackgroundElement(0L, pVar, f10, x0Var2, 1));
    }

    public static final o e(o oVar, long j10, x0 x0Var) {
        return oVar.g(new BackgroundElement(j10, null, 1.0f, x0Var, 2));
    }

    public static /* synthetic */ o f(o oVar, long j10) {
        return e(oVar, j10, s0.f28162a);
    }

    public static final o g(o oVar, float f10, long j10, g gVar) {
        return h(f10, oVar, new z0(j10), gVar);
    }

    public static final o h(float f10, o oVar, p pVar, x0 x0Var) {
        return oVar.g(new BorderModifierNodeElement(f10, pVar, x0Var));
    }

    public static final void i(long j10, g1 g1Var) {
        if (g1Var == g1.f40723a) {
            if (w2.a.g(j10) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        } else if (w2.a.h(j10) != Integer.MAX_VALUE) {
        } else {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }

    public static o j(o oVar, l lVar, j1 j1Var, boolean z10, h2.g gVar, Function0 function0, int i10) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return w0.s(oVar, l(z10, lVar, j1Var, new b(z10, null, gVar, function0)));
    }

    public static o k(o oVar, Function0 function0, int i10) {
        boolean z10 = true;
        if ((i10 & 1) == 0) {
            z10 = false;
        }
        return t.H(oVar, s.f13613k, new e0(z10, null, null, function0));
    }

    public static final o l(boolean z10, l lVar, j1 j1Var, Function2 function2) {
        o H;
        boolean z11 = j1Var instanceof n1;
        o oVar = g1.l.f16404b;
        if (z11) {
            H = (o) function2.invoke(lVar, j1Var);
        } else if (j1Var == null) {
            H = (o) function2.invoke(lVar, null);
        } else if (lVar != null) {
            H = e.a(oVar, lVar, j1Var).g((o) function2.invoke(lVar, null));
        } else {
            H = t.H(oVar, s.f13613k, new v.o(1, j1Var, function2));
        }
        if (z10) {
            oVar = FocusTargetNode$FocusTargetElement.f1359b;
        }
        return H.g(oVar);
    }

    public static o m(o oVar, Function0 function0, Function0 function02) {
        return t.H(oVar, s.f13613k, new g0(null, null, null, function0, null, function02, true));
    }

    public static o n(o oVar, o2 o2Var) {
        return t.H(oVar, s.f13613k, new m2(o2Var, null, false, false, true));
    }

    public static final o2 o(n nVar) {
        r rVar = (r) nVar;
        rVar.b0(-1464256199);
        Object[] objArr = new Object[0];
        d1.r rVar2 = o2.f39652i;
        rVar.b0(122203105);
        boolean f10 = rVar.f(0);
        Object Q = rVar.Q();
        if (f10 || Q == m.f35080a) {
            Q = new h2(0);
            rVar.k0(Q);
        }
        rVar.s(false);
        o2 o2Var = (o2) el.l.y0(objArr, rVar2, (Function0) Q, rVar, 0, 4);
        rVar.s(false);
        return o2Var;
    }

    public static final o p(o oVar, d2 d2Var, g1 g1Var, boolean z10, boolean z11, y.x0 x0Var, l lVar, e0.p pVar, n nVar, int i10) {
        y.o oVar2;
        a2 a2Var;
        o oVar3;
        r rVar = (r) nVar;
        rVar.b0(-1677817431);
        if ((i10 & 64) != 0) {
            y.o.f40871a.getClass();
            oVar2 = y.n.f40865c;
        } else {
            oVar2 = pVar;
        }
        rVar.b0(1809802212);
        o oVar4 = x.s.f39705a;
        rVar.b0(-1476348564);
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        y1 y1Var = (y1) rVar.m(z1.f39793a);
        if (y1Var != null) {
            rVar.b0(-1325722563);
            boolean h10 = rVar.h(context) | rVar.h(y1Var);
            Object Q = rVar.Q();
            if (h10 || Q == m.f35080a) {
                Q = new x.p(context, y1Var);
                rVar.k0(Q);
            }
            rVar.s(false);
            a2Var = (x.p) Q;
        } else {
            a2Var = x.x1.f39776b;
        }
        rVar.s(false);
        rVar.s(false);
        g1 g1Var2 = g1.f40723a;
        if (g1Var == g1Var2) {
            oVar3 = k0.f39615c;
        } else {
            oVar3 = k0.f39614b;
        }
        o g10 = oVar.g(oVar3).g(a2Var.b());
        boolean z12 = !z11;
        if (((k) rVar.m(s1.f13626k)) == k.f38800b && g1Var != g1Var2) {
            z12 = z11;
        }
        o b10 = androidx.compose.foundation.gestures.a.b(g10, d2Var, g1Var, a2Var, z10, z12, x0Var, lVar, oVar2);
        rVar.s(false);
        return b10;
    }

    public static final long q(long j10, float f10) {
        return t.a(Math.max(s0.g.f34069a, m1.a.b(j10) - f10), Math.max(s0.g.f34069a, m1.a.c(j10) - f10));
    }

    public static o r(o oVar, o2 o2Var) {
        return t.H(oVar, s.f13613k, new m2(o2Var, null, false, true, true));
    }
}
