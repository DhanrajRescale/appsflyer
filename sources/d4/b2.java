package d4;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f13721a;

    public b2(View view) {
        this.f13721a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f13721a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f13721a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = (View) this.f13721a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(c2 c2Var) {
        View view = (View) this.f13721a.get();
        if (view != null) {
            if (c2Var != null) {
                view.animate().setListener(new z1(0, this, c2Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f13721a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
