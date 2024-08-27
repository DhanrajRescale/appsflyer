package d4;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.assetgro.stockgro.prod.R;
import java.util.List;

/* loaded from: classes.dex */
public final class k2 extends o2 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f13774e = new PathInterpolator(s0.g.f34069a, 1.1f, s0.g.f34069a, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final v4.a f13775f = new v4.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f13776g = new DecelerateInterpolator();

    public static void e(View view, p2 p2Var) {
        g2 j10 = j(view);
        if (j10 != null) {
            j10.a(p2Var);
            if (j10.f13743b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), p2Var);
            }
        }
    }

    public static void f(View view, p2 p2Var, WindowInsets windowInsets, boolean z10) {
        g2 j10 = j(view);
        if (j10 != null) {
            j10.f13742a = windowInsets;
            if (!z10) {
                j10.b();
                if (j10.f13743b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), p2Var, windowInsets, z10);
            }
        }
    }

    public static void g(View view, d3 d3Var, List list) {
        g2 j10 = j(view);
        if (j10 != null) {
            d3Var = j10.c(d3Var, list);
            if (j10.f13743b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), d3Var, list);
            }
        }
    }

    public static void h(View view, p2 p2Var, tr.e eVar) {
        g2 j10 = j(view);
        if (j10 != null) {
            j10.d(eVar);
            if (j10.f13743b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), p2Var, eVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static g2 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof j2) {
            return ((j2) tag).f13770a;
        }
        return null;
    }
}
