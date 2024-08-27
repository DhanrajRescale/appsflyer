package t7;

import android.view.View;

/* loaded from: classes.dex */
public abstract class a0 extends x2.c {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f35442c = true;

    public float t(View view) {
        float transitionAlpha;
        if (f35442c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f35442c = false;
            }
        }
        return view.getAlpha();
    }

    public void u(View view, float f10) {
        if (f35442c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f35442c = false;
            }
        }
        view.setAlpha(f10);
    }
}
