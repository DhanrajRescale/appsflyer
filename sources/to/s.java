package to;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class s extends t {

    /* renamed from: b, reason: collision with root package name */
    public float f36317b;

    /* renamed from: c, reason: collision with root package name */
    public float f36318c;

    @Override // to.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f36319a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f36317b, this.f36318c);
        path.transform(matrix);
    }
}
