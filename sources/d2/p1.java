package d2;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class p1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f13565a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f13566b = new int[2];

    @Override // d2.n1
    public void a(@NotNull View view, @NotNull float[] fArr) {
        Matrix matrix = this.f13565a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f13566b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        androidx.compose.ui.graphics.a.v(matrix, fArr);
    }
}
