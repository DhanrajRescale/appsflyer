package d2;

import android.graphics.Matrix;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f13439a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f13440b;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f13441c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f13442d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f13443e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13444f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13445g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13446h = true;

    public h2(q0 q0Var) {
        this.f13439a = q0Var;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f13443e;
        if (fArr == null) {
            fArr = new float[]{1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f};
            this.f13443e = fArr;
        }
        if (this.f13445g) {
            this.f13446h = t0.t.Y(b(obj), fArr);
            this.f13445g = false;
        }
        if (!this.f13446h) {
            return null;
        }
        return fArr;
    }

    public final float[] b(Object obj) {
        float[] fArr = this.f13442d;
        if (fArr == null) {
            fArr = new float[]{1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 1.0f};
            this.f13442d = fArr;
        }
        if (!this.f13444f) {
            return fArr;
        }
        Matrix matrix = this.f13440b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f13440b = matrix;
        }
        this.f13439a.invoke(obj, matrix);
        Matrix matrix2 = this.f13441c;
        if (matrix2 == null || !Intrinsics.a(matrix, matrix2)) {
            androidx.compose.ui.graphics.a.v(matrix, fArr);
            this.f13440b = matrix2;
            this.f13441c = matrix;
        }
        this.f13444f = false;
        return fArr;
    }

    public final void c() {
        this.f13444f = true;
        this.f13445g = true;
    }
}
