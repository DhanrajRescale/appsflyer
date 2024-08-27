package d4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public abstract class b1 {
    public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static d3 b(@NonNull View view, @NonNull d3 d3Var, @NonNull Rect rect) {
        WindowInsets f10 = d3Var.f();
        if (f10 != null) {
            return d3.g(view, view.computeSystemWindowInsets(f10, rect));
        }
        rect.setEmpty();
        return d3Var;
    }

    public static boolean c(@NonNull View view, float f10, float f11, boolean z10) {
        return view.dispatchNestedFling(f10, f11, z10);
    }

    public static boolean d(@NonNull View view, float f10, float f11) {
        return view.dispatchNestedPreFling(f10, f11);
    }

    public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static d3 j(@NonNull View view) {
        if (!q2.f13809d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = q2.f13806a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) q2.f13807b.get(obj);
            Rect rect2 = (Rect) q2.f13808c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            e.l lVar = new e.l(13);
            ((u2) lVar.f14641b).e(u3.c.b(rect.left, rect.top, rect.right, rect.bottom));
            ((u2) lVar.f14641b).g(u3.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            d3 K = lVar.K();
            K.f13731a.r(K);
            K.f13731a.d(view.getRootView());
            return K;
        } catch (IllegalAccessException e10) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(@NonNull View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f10) {
        view.setElevation(f10);
    }

    public static void t(View view, boolean z10) {
        view.setNestedScrollingEnabled(z10);
    }

    public static void u(@NonNull View view, d0 d0Var) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, d0Var);
        }
        if (d0Var == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new a1(view, d0Var));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f10) {
        view.setTranslationZ(f10);
    }

    public static void x(@NonNull View view, float f10) {
        view.setZ(f10);
    }

    public static boolean y(View view, int i10) {
        return view.startNestedScroll(i10);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
