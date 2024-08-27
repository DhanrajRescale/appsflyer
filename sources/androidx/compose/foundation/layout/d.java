package androidx.compose.foundation.layout;

import b0.m;
import g1.f;
import g1.g;
import g1.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a */
    public static final FillElement f1284a = new FillElement(2, 1.0f);

    /* renamed from: b */
    public static final FillElement f1285b = new FillElement(1, 1.0f);

    /* renamed from: c */
    public static final FillElement f1286c = new FillElement(3, 1.0f);

    /* renamed from: d */
    public static final WrapContentElement f1287d;

    /* renamed from: e */
    public static final WrapContentElement f1288e;

    /* renamed from: f */
    public static final WrapContentElement f1289f;

    /* renamed from: g */
    public static final WrapContentElement f1290g;

    static {
        int i10 = 1;
        f fVar = g1.a.f16389k;
        int i11 = 0;
        f1287d = new WrapContentElement(1, false, new m(fVar, i10), fVar);
        f fVar2 = g1.a.f16388j;
        f1288e = new WrapContentElement(1, false, new m(fVar2, i10), fVar2);
        g gVar = g1.a.f16383e;
        f1289f = new WrapContentElement(3, false, new e(gVar, i11), gVar);
        g gVar2 = g1.a.f16379a;
        f1290g = new WrapContentElement(3, false, new e(gVar2, i11), gVar2);
    }

    public static final o a(o oVar, float f10, float f11) {
        return oVar.g(new UnspecifiedConstraintsElement(f10, f11));
    }

    public static o b(o oVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return a(oVar, f10, f11);
    }

    public static final o c(o oVar, float f10) {
        FillElement fillElement;
        if (f10 == 1.0f) {
            fillElement = f1285b;
        } else {
            fillElement = new FillElement(1, f10);
        }
        return oVar.g(fillElement);
    }

    public static final o e(o oVar, float f10) {
        FillElement fillElement;
        if (f10 == 1.0f) {
            fillElement = f1284a;
        } else {
            fillElement = new FillElement(2, f10);
        }
        return oVar.g(fillElement);
    }

    public static /* synthetic */ o f(o oVar) {
        return e(oVar, 1.0f);
    }

    public static final o g(o oVar, float f10) {
        return oVar.g(new SizeElement(s0.g.f34069a, f10, s0.g.f34069a, f10, true, 5));
    }

    public static final o h(o oVar, float f10, float f11) {
        return oVar.g(new SizeElement(s0.g.f34069a, f10, s0.g.f34069a, f11, true, 5));
    }

    public static final o i(o oVar, float f10) {
        return oVar.g(new SizeElement(s0.g.f34069a, f10, s0.g.f34069a, f10, false, 5));
    }

    public static final o j(o oVar, float f10) {
        return oVar.g(new SizeElement(f10, f10, f10, f10, false));
    }

    public static final o k(o oVar, float f10, float f11) {
        return oVar.g(new SizeElement(f10, f11, f10, f11, false));
    }

    public static o l(o oVar, float f10, float f11) {
        return oVar.g(new SizeElement(f10, f11, Float.NaN, Float.NaN, false));
    }

    public static final o m(o oVar, float f10) {
        return oVar.g(new SizeElement(f10, f10, f10, f10, true));
    }

    public static final o n(o oVar, float f10, float f11) {
        return oVar.g(new SizeElement(f10, f11, f10, f11, true));
    }

    public static final o o(o oVar, float f10, float f11, float f12, float f13) {
        return oVar.g(new SizeElement(f10, f11, f12, f13, true));
    }

    public static o p(o oVar, float f10, float f11, float f12, int i10) {
        float f13 = Float.NaN;
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        if ((i10 & 4) != 0) {
            f12 = Float.NaN;
        }
        if ((i10 & 8) == 0) {
            f13 = s0.g.f34069a;
        }
        return o(oVar, f10, f11, f12, f13);
    }

    public static final o q(o oVar, float f10) {
        return oVar.g(new SizeElement(f10, s0.g.f34069a, f10, s0.g.f34069a, true, 10));
    }

    public static final o r(o oVar, float f10, float f11) {
        return oVar.g(new SizeElement(f10, s0.g.f34069a, f11, s0.g.f34069a, true, 10));
    }

    public static o s(o oVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return r(oVar, f10, f11);
    }

    public static o t(o oVar) {
        WrapContentElement wrapContentElement;
        f fVar = g1.a.f16389k;
        if (Intrinsics.a(fVar, fVar)) {
            wrapContentElement = f1287d;
        } else if (Intrinsics.a(fVar, g1.a.f16388j)) {
            wrapContentElement = f1288e;
        } else {
            wrapContentElement = new WrapContentElement(1, false, new m(fVar, 1), fVar);
        }
        return oVar.g(wrapContentElement);
    }

    public static o u(o oVar, g gVar, int i10) {
        WrapContentElement wrapContentElement;
        int i11 = i10 & 1;
        g gVar2 = g1.a.f16383e;
        if (i11 != 0) {
            gVar = gVar2;
        }
        if (Intrinsics.a(gVar, gVar2)) {
            wrapContentElement = f1289f;
        } else if (Intrinsics.a(gVar, g1.a.f16379a)) {
            wrapContentElement = f1290g;
        } else {
            wrapContentElement = new WrapContentElement(3, false, new e(gVar, 0), gVar);
        }
        return oVar.g(wrapContentElement);
    }
}
