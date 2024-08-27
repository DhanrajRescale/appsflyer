package os;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener, Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f30316c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f30317d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f30318e;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30315b = true;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f30314a = false;

    public f(View view, k0 k0Var, Handler handler) {
        this.f30317d = k0Var;
        this.f30316c = new WeakReference(view);
        this.f30318e = handler;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        run();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f30315b) {
            return;
        }
        View view = (View) this.f30316c.get();
        if (view != null && !this.f30314a) {
            this.f30317d.c(view);
            this.f30318e.removeCallbacks(this);
            this.f30318e.postDelayed(this, 1000L);
            return;
        }
        if (this.f30315b) {
            View view2 = (View) this.f30316c.get();
            if (view2 != null) {
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
            this.f30317d.b();
        }
        this.f30315b = false;
    }
}
