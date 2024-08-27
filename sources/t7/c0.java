package t7;

import android.view.View;

/* loaded from: classes.dex */
public abstract class c0 extends b0 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f35447f = true;

    public void x(View view, int i10, int i11, int i12, int i13) {
        if (f35447f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f35447f = false;
            }
        }
    }
}
