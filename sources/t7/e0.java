package t7;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class e0 extends d0 {
    @Override // t7.d0, x2.c
    public final void r(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // t7.a0
    public final float t(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // t7.a0
    public final void u(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // t7.b0
    public final void v(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // t7.b0
    public final void w(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // t7.c0
    public final void x(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }
}
