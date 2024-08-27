package d4;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class c1 {
    public static d3 a(@NonNull View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        d3 g10 = d3.g(null, rootWindowInsets);
        b3 b3Var = g10.f13731a;
        b3Var.r(g10);
        b3Var.d(view.getRootView());
        return g10;
    }

    public static int b(@NonNull View view) {
        return view.getScrollIndicators();
    }

    public static void c(@NonNull View view, int i10) {
        view.setScrollIndicators(i10);
    }

    public static void d(@NonNull View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
