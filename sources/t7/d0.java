package t7;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class d0 extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f35450g = true;

    @Override // x2.c
    public void r(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.r(view, i10);
        } else if (f35450g) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f35450g = false;
            }
        }
    }
}
