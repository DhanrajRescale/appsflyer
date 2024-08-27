package to;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class r extends t {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f36310h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f36311b;

    /* renamed from: c, reason: collision with root package name */
    public final float f36312c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36313d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36314e;

    /* renamed from: f, reason: collision with root package name */
    public float f36315f;

    /* renamed from: g, reason: collision with root package name */
    public float f36316g;

    public r(float f10, float f11, float f12, float f13) {
        this.f36311b = f10;
        this.f36312c = f11;
        this.f36313d = f12;
        this.f36314e = f13;
    }

    @Override // to.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f36319a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f36310h;
        rectF.set(this.f36311b, this.f36312c, this.f36313d, this.f36314e);
        path.arcTo(rectF, this.f36315f, this.f36316g, false);
        path.transform(matrix);
    }
}
