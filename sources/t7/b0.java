package t7;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b0 extends a0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f35445d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f35446e = true;

    public void v(View view, Matrix matrix) {
        if (f35445d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f35445d = false;
            }
        }
    }

    public void w(View view, Matrix matrix) {
        if (f35446e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f35446e = false;
            }
        }
    }
}
