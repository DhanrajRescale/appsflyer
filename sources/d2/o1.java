package d2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class o1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f13559a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f13560b = new int[2];

    public o1(float[] fArr) {
        this.f13559a = fArr;
    }

    @Override // d2.n1
    public final void a(View view, float[] fArr) {
        n1.k0.c(fArr);
        b(view, fArr);
    }

    public final void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z10 = parent instanceof View;
        float[] fArr2 = this.f13559a;
        if (z10) {
            b((View) parent, fArr);
            n1.k0.c(fArr2);
            n1.k0.e(fArr2, -view.getScrollX(), -view.getScrollY());
            w0.v(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            n1.k0.c(fArr2);
            n1.k0.e(fArr2, left, top);
            w0.v(fArr, fArr2);
        } else {
            int[] iArr = this.f13560b;
            view.getLocationInWindow(iArr);
            n1.k0.c(fArr2);
            n1.k0.e(fArr2, -view.getScrollX(), -view.getScrollY());
            w0.v(fArr, fArr2);
            float f10 = iArr[0];
            float f11 = iArr[1];
            n1.k0.c(fArr2);
            n1.k0.e(fArr2, f10, f11);
            w0.v(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            androidx.compose.ui.graphics.a.v(matrix, fArr2);
            w0.v(fArr, fArr2);
        }
    }
}
