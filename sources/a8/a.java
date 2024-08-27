package a8;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.MarginLayoutParams f253a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f253a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public static boolean a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (a(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }
}
