package d4;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class g0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f13739a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f13740b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f13741c;

    public g0(View view, Runnable runnable) {
        this.f13739a = view;
        this.f13740b = view.getViewTreeObserver();
        this.f13741c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                g0 g0Var = new g0(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(g0Var);
                view.addOnAttachStateChangeListener(g0Var);
                return;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f13740b.isAlive();
        View view = this.f13739a;
        if (isAlive) {
            this.f13740b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f13741c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f13740b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f13740b.isAlive();
        View view2 = this.f13739a;
        if (isAlive) {
            this.f13740b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
