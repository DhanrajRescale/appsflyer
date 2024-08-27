package z;

import e0.d0;
import e0.j0;
import e0.q;
import e0.z;
import java.util.List;
import w.b0;
import y.g1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f41845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu.c f41846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f41847c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f41848d;

    public b(b0 b0Var, d0 d0Var, j0 j0Var, q qVar) {
        this.f41845a = j0Var;
        this.f41846b = qVar;
        this.f41847c = b0Var;
        this.f41848d = d0Var;
    }

    public final float a(float f10) {
        j0 j0Var = this.f41845a;
        n nVar = ((z) j0Var.i()).f14833n;
        List list = ((z) j0Var.i()).f14820a;
        int size = list.size();
        float f11 = Float.POSITIVE_INFINITY;
        float f12 = Float.NEGATIVE_INFINITY;
        for (int i10 = 0; i10 < size; i10++) {
            e0.l lVar = (e0.l) list.get(i10);
            z zVar = (z) j0Var.i();
            g1 g1Var = zVar.f14824e;
            g1 g1Var2 = g1.f40723a;
            zVar.f();
            int i11 = ((z) j0Var.i()).f14825f;
            int i12 = ((z) j0Var.i()).f14823d;
            int i13 = ((z) j0Var.i()).f14821b;
            int i14 = ((e0.k) lVar).f14753m;
            j0Var.j();
            nVar.getClass();
            float f13 = i14 - 0;
            if (f13 <= s0.g.f34069a && f13 > f12) {
                f12 = f13;
            }
            if (f13 >= s0.g.f34069a && f13 < f11) {
                f11 = f13;
            }
        }
        if (f12 == Float.NEGATIVE_INFINITY) {
            f12 = f11;
        }
        if (f11 == Float.POSITIVE_INFINITY) {
            f11 = f12;
        }
        if (!j0Var.d()) {
            f11 = 0.0f;
        }
        if (!j0Var.c()) {
            f12 = 0.0f;
        }
        Float valueOf = Float.valueOf(f12);
        Float valueOf2 = Float.valueOf(f11);
        float floatValue = valueOf.floatValue();
        float floatValue2 = valueOf2.floatValue();
        float floatValue3 = ((Number) this.f41846b.b(Float.valueOf(f10), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
        if (floatValue3 == floatValue || floatValue3 == floatValue2 || floatValue3 == s0.g.f34069a) {
            if (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) {
                return s0.g.f34069a;
            }
            return floatValue3;
        }
        throw new IllegalStateException(("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0").toString());
    }
}
