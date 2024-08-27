package u9;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import d2.f1;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f37021a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final tr.e f37022b = tr.e.y("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: c, reason: collision with root package name */
    public static final tr.e f37023c = tr.e.y("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        pointF.x = w9.e.b(pointF.x, -1.0f, 1.0f);
        pointF.y = w9.e.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = w9.e.b(pointF2.x, -1.0f, 1.0f);
        float b10 = w9.e.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        float f10 = pointF.x;
        float f11 = pointF.y;
        float f12 = pointF2.x;
        f1 f1Var = w9.f.f38892a;
        try {
            return f4.a.b(f10, f11, f12, b10);
        } catch (IllegalArgumentException e10) {
            if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                return f4.a.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, s0.g.f34069a), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.animation.Interpolator] */
    public static x9.a b(v9.c cVar, j9.i iVar, float f10, i0 i0Var, boolean z10, boolean z11) {
        Object obj;
        LinearInterpolator a10;
        Interpolator a11;
        Interpolator a12;
        Object obj2;
        x9.a aVar;
        tr.e eVar;
        PointF pointF;
        Object obj3;
        PointF pointF2;
        boolean z12;
        LinearInterpolator linearInterpolator = f37021a;
        tr.e eVar2 = f37022b;
        if (z10 && z11) {
            cVar.b();
            PointF pointF3 = null;
            PointF pointF4 = null;
            PointF pointF5 = null;
            boolean z13 = false;
            PointF pointF6 = null;
            PointF pointF7 = null;
            PointF pointF8 = null;
            Object obj4 = null;
            PointF pointF9 = null;
            PointF pointF10 = null;
            float f11 = s0.g.f34069a;
            Object obj5 = null;
            while (cVar.g()) {
                int H = cVar.H(eVar2);
                tr.e eVar3 = f37023c;
                LinearInterpolator linearInterpolator2 = linearInterpolator;
                switch (H) {
                    case 0:
                        eVar = eVar2;
                        pointF = pointF4;
                        f11 = (float) cVar.l();
                        eVar2 = eVar;
                        linearInterpolator = linearInterpolator2;
                        pointF4 = pointF;
                        break;
                    case 1:
                        pointF = pointF4;
                        obj4 = i0Var.i(cVar, f10);
                        linearInterpolator = linearInterpolator2;
                        pointF4 = pointF;
                        break;
                    case 2:
                        pointF = pointF4;
                        obj5 = i0Var.i(cVar, f10);
                        linearInterpolator = linearInterpolator2;
                        pointF4 = pointF;
                        break;
                    case 3:
                        tr.e eVar4 = eVar2;
                        pointF = pointF4;
                        PointF pointF11 = pointF5;
                        boolean z14 = z13;
                        if (cVar.x() == 3) {
                            cVar.b();
                            float f12 = s0.g.f34069a;
                            float f13 = s0.g.f34069a;
                            float f14 = s0.g.f34069a;
                            float f15 = s0.g.f34069a;
                            while (cVar.g()) {
                                int H2 = cVar.H(eVar3);
                                if (H2 != 0) {
                                    if (H2 != 1) {
                                        cVar.J();
                                    } else if (cVar.x() == 7) {
                                        f15 = (float) cVar.l();
                                        obj4 = obj4;
                                        f13 = f15;
                                    } else {
                                        obj3 = obj4;
                                        cVar.a();
                                        f13 = (float) cVar.l();
                                        if (cVar.x() == 7) {
                                            f15 = (float) cVar.l();
                                        } else {
                                            f15 = f13;
                                        }
                                        cVar.c();
                                        obj4 = obj3;
                                    }
                                } else {
                                    obj3 = obj4;
                                    if (cVar.x() == 7) {
                                        f14 = (float) cVar.l();
                                        obj4 = obj3;
                                        f12 = f14;
                                    } else {
                                        cVar.a();
                                        f12 = (float) cVar.l();
                                        if (cVar.x() == 7) {
                                            f14 = (float) cVar.l();
                                        } else {
                                            f14 = f12;
                                        }
                                        cVar.c();
                                        obj4 = obj3;
                                    }
                                }
                            }
                            pointF8 = new PointF(f12, f13);
                            pointF9 = new PointF(f14, f15);
                            cVar.d();
                        } else {
                            pointF6 = p.b(cVar, f10);
                        }
                        z13 = z14;
                        eVar2 = eVar4;
                        linearInterpolator = linearInterpolator2;
                        pointF5 = pointF11;
                        pointF4 = pointF;
                        break;
                    case 4:
                        eVar = eVar2;
                        if (cVar.x() == 3) {
                            cVar.b();
                            float f16 = s0.g.f34069a;
                            float f17 = s0.g.f34069a;
                            float f18 = s0.g.f34069a;
                            float f19 = s0.g.f34069a;
                            while (cVar.g()) {
                                PointF pointF12 = pointF5;
                                int H3 = cVar.H(eVar3);
                                if (H3 != 0) {
                                    pointF2 = pointF4;
                                    if (H3 != 1) {
                                        cVar.J();
                                    } else if (cVar.x() == 7) {
                                        f19 = (float) cVar.l();
                                        f17 = f19;
                                    } else {
                                        cVar.a();
                                        f17 = (float) cVar.l();
                                        if (cVar.x() == 7) {
                                            z12 = z13;
                                            f19 = (float) cVar.l();
                                        } else {
                                            z12 = z13;
                                            f19 = f17;
                                        }
                                        cVar.c();
                                    }
                                    pointF5 = pointF12;
                                    pointF4 = pointF2;
                                } else {
                                    pointF2 = pointF4;
                                    z12 = z13;
                                    if (cVar.x() == 7) {
                                        f16 = (float) cVar.l();
                                        f18 = f16;
                                    } else {
                                        cVar.a();
                                        f16 = (float) cVar.l();
                                        if (cVar.x() == 7) {
                                            f18 = (float) cVar.l();
                                        } else {
                                            f18 = f16;
                                        }
                                        cVar.c();
                                    }
                                }
                                z13 = z12;
                                pointF5 = pointF12;
                                pointF4 = pointF2;
                            }
                            pointF = pointF4;
                            PointF pointF13 = new PointF(f16, f17);
                            PointF pointF14 = new PointF(f18, f19);
                            cVar.d();
                            pointF3 = pointF14;
                            pointF10 = pointF13;
                        } else {
                            pointF = pointF4;
                            pointF7 = p.b(cVar, f10);
                        }
                        eVar2 = eVar;
                        linearInterpolator = linearInterpolator2;
                        pointF4 = pointF;
                        break;
                    case 5:
                        if (cVar.n() == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        linearInterpolator = linearInterpolator2;
                        break;
                    case 6:
                        pointF4 = p.b(cVar, f10);
                        linearInterpolator = linearInterpolator2;
                        break;
                    case 7:
                        pointF5 = p.b(cVar, f10);
                        linearInterpolator = linearInterpolator2;
                        break;
                    default:
                        cVar.J();
                        linearInterpolator = linearInterpolator2;
                        break;
                }
            }
            LinearInterpolator linearInterpolator3 = linearInterpolator;
            PointF pointF15 = pointF4;
            PointF pointF16 = pointF5;
            boolean z15 = z13;
            Object obj6 = obj4;
            cVar.d();
            if (z15) {
                obj2 = obj6;
            } else {
                if (pointF6 != null && pointF7 != null) {
                    linearInterpolator3 = a(pointF6, pointF7);
                } else if (pointF8 != null && pointF9 != null && pointF10 != null && pointF3 != null) {
                    a11 = a(pointF8, pointF10);
                    a12 = a(pointF9, pointF3);
                    obj2 = obj5;
                    linearInterpolator3 = null;
                    if (a11 == null && a12 != null) {
                        aVar = new x9.a(iVar, obj6, obj2, a11, a12, f11);
                    } else {
                        aVar = new x9.a(iVar, obj6, obj2, linearInterpolator3, f11, (Float) null);
                    }
                    aVar.f40128o = pointF15;
                    aVar.f40129p = pointF16;
                    return aVar;
                }
                obj2 = obj5;
            }
            a11 = null;
            a12 = null;
            if (a11 == null) {
            }
            aVar = new x9.a(iVar, obj6, obj2, linearInterpolator3, f11, (Float) null);
            aVar.f40128o = pointF15;
            aVar.f40129p = pointF16;
            return aVar;
        }
        tr.e eVar5 = eVar2;
        if (z10) {
            cVar.b();
            Object obj7 = null;
            PointF pointF17 = null;
            boolean z16 = false;
            float f20 = s0.g.f34069a;
            PointF pointF18 = null;
            PointF pointF19 = null;
            PointF pointF20 = null;
            Object obj8 = null;
            while (cVar.g()) {
                tr.e eVar6 = eVar5;
                switch (cVar.H(eVar6)) {
                    case 0:
                        f20 = (float) cVar.l();
                        break;
                    case 1:
                        obj7 = i0Var.i(cVar, f10);
                        break;
                    case 2:
                        obj8 = i0Var.i(cVar, f10);
                        break;
                    case 3:
                        pointF18 = p.b(cVar, 1.0f);
                        break;
                    case 4:
                        pointF17 = p.b(cVar, 1.0f);
                        break;
                    case 5:
                        if (cVar.n() == 1) {
                            z16 = true;
                            break;
                        } else {
                            z16 = false;
                            break;
                        }
                    case 6:
                        pointF19 = p.b(cVar, f10);
                        break;
                    case 7:
                        pointF20 = p.b(cVar, f10);
                        break;
                    default:
                        cVar.J();
                        break;
                }
                eVar5 = eVar6;
            }
            cVar.d();
            if (z16) {
                obj = obj7;
            } else {
                if (pointF18 != null && pointF17 != null) {
                    a10 = a(pointF18, pointF17);
                    obj = obj8;
                    x9.a aVar2 = new x9.a(iVar, obj7, obj, a10, f20, (Float) null);
                    aVar2.f40128o = pointF19;
                    aVar2.f40129p = pointF20;
                    return aVar2;
                }
                obj = obj8;
            }
            a10 = linearInterpolator;
            x9.a aVar22 = new x9.a(iVar, obj7, obj, a10, f20, (Float) null);
            aVar22.f40128o = pointF19;
            aVar22.f40129p = pointF20;
            return aVar22;
        }
        return new x9.a(i0Var.i(cVar, f10));
    }
}
