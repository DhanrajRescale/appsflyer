package x2;

import kotlin.Unit;
import s0.g;
import t.k0;
import t.l0;
import yk.j;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile k0 f39943a = new k0(0);

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f39944b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f39945c;

    static {
        Object[] objArr = new Object[0];
        f39944b = objArr;
        f39945c = 1.05f;
        synchronized (objArr) {
            f39943a.g((int) 115.0f, new d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f39943a.g((int) 130.0f, new d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f39943a.g((int) 150.0f, new d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f39943a.g((int) 180.0f, new d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f39943a.g((int) 200.0f, new d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.f23355a;
        }
        float f10 = (f39943a.f(0) / 100.0f) - 0.02f;
        f39945c = f10;
        if (f10 > 1.0f) {
            return;
        }
        j.B1("You should only apply non-linear scaling to font scales > 1");
        throw null;
    }

    public static a a(float f10) {
        float f11;
        if (f10 >= f39945c) {
            int i10 = (int) (f10 * 100.0f);
            a aVar = (a) f39943a.e(i10);
            if (aVar != null) {
                return aVar;
            }
            k0 k0Var = f39943a;
            if (k0Var.f34875a) {
                l0.a(k0Var);
            }
            int a10 = u.a.a(k0Var.f34878d, i10, k0Var.f34876b);
            if (a10 >= 0) {
                return (a) f39943a.i(a10);
            }
            int i11 = -(a10 + 1);
            int i12 = i11 - 1;
            if (i12 >= 0 && i11 < f39943a.h()) {
                float f12 = f39943a.f(i12) / 100.0f;
                float f13 = f39943a.f(i11) / 100.0f;
                if (f12 == f13) {
                    f11 = 0.0f;
                } else {
                    f11 = (f10 - f12) / (f13 - f12);
                }
                float max = (Math.max(g.f34069a, Math.min(1.0f, f11)) * 1.0f) + g.f34069a;
                a aVar2 = (a) f39943a.i(i12);
                a aVar3 = (a) f39943a.i(i11);
                float[] fArr = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
                float[] fArr2 = new float[9];
                for (int i13 = 0; i13 < 9; i13++) {
                    float f14 = fArr[i13];
                    float b10 = aVar2.b(f14);
                    fArr2[i13] = ((aVar3.b(f14) - b10) * max) + b10;
                }
                d dVar = new d(fArr, fArr2);
                b(f10, dVar);
                return dVar;
            }
            d dVar2 = new d(new float[]{1.0f}, new float[]{f10});
            b(f10, dVar2);
            return dVar2;
        }
        return null;
    }

    public static void b(float f10, d dVar) {
        synchronized (f39944b) {
            k0 clone = f39943a.clone();
            clone.g((int) (f10 * 100.0f), dVar);
            f39943a = clone;
            Unit unit = Unit.f23355a;
        }
    }
}
