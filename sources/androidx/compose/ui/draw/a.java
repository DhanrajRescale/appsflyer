package androidx.compose.ui.draw;

import a2.k;
import a2.l;
import d2.w0;
import g1.d;
import g1.o;
import kotlin.jvm.functions.Function1;
import n1.g0;
import n1.s0;
import n1.u;
import n1.x0;
import q1.b;
import s0.g;

/* loaded from: classes.dex */
public abstract class a {
    public static final o a(o oVar, float f10) {
        if (f10 != 1.0f) {
            return androidx.compose.ui.graphics.a.r(oVar, g.f34069a, g.f34069a, f10, g.f34069a, g.f34069a, null, true, 126971);
        }
        return oVar;
    }

    public static final o b(o oVar, x0 x0Var) {
        return androidx.compose.ui.graphics.a.r(oVar, g.f34069a, g.f34069a, g.f34069a, g.f34069a, g.f34069a, x0Var, true, 124927);
    }

    public static final o c(o oVar) {
        return androidx.compose.ui.graphics.a.r(oVar, g.f34069a, g.f34069a, g.f34069a, g.f34069a, g.f34069a, null, true, 126975);
    }

    public static final o d(o oVar, Function1 function1) {
        return oVar.g(new DrawBehindElement(function1));
    }

    public static final o e(o oVar, Function1 function1) {
        return oVar.g(new DrawWithCacheElement(function1));
    }

    public static final o f(o oVar, Function1 function1) {
        return oVar.g(new DrawWithContentElement(function1));
    }

    public static o g(o oVar, b bVar, d dVar, l lVar, float f10, u uVar, int i10) {
        boolean z10;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            dVar = g1.a.f16383e;
        }
        d dVar2 = dVar;
        if ((i10 & 8) != 0) {
            lVar = k.f99d;
        }
        l lVar2 = lVar;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            uVar = null;
        }
        return oVar.g(new PainterElement(bVar, z11, dVar2, lVar2, f11, uVar));
    }

    public static final o h(o oVar, float f10) {
        if (f10 != 1.0f || f10 != 1.0f) {
            return androidx.compose.ui.graphics.a.r(oVar, f10, f10, g.f34069a, g.f34069a, g.f34069a, null, false, 131068);
        }
        return oVar;
    }

    public static o i(o oVar, float f10, x0 x0Var, boolean z10, int i10) {
        long j10;
        if ((i10 & 2) != 0) {
            x0Var = s0.f28162a;
        }
        x0 x0Var2 = x0Var;
        if ((i10 & 4) != 0) {
            if (Float.compare(f10, 0) > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        boolean z11 = z10;
        long j11 = 0;
        if ((i10 & 8) != 0) {
            j10 = g0.f28137a;
        } else {
            j10 = 0;
        }
        if ((i10 & 16) != 0) {
            j11 = g0.f28137a;
        }
        long j12 = j11;
        if (Float.compare(f10, 0) > 0 || z11) {
            return w0.s(oVar, androidx.compose.ui.graphics.a.q(g1.l.f16404b, new k1.k(f10, x0Var2, z11, j10, j12)));
        }
        return oVar;
    }
}
