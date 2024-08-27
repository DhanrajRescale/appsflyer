package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class l implements k, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f858b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f860d;

    /* renamed from: a, reason: collision with root package name */
    public final long f857a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c, reason: collision with root package name */
    public boolean f859c = false;

    public l(m mVar) {
        this.f860d = mVar;
    }

    @Override // androidx.activity.k
    public final void J(View view) {
        if (!this.f859c) {
            this.f859c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f858b = runnable;
        View decorView = this.f860d.getWindow().getDecorView();
        if (this.f859c) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new b(this, 1));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f858b;
        if (runnable != null) {
            runnable.run();
            this.f858b = null;
            p pVar = this.f860d.mFullyDrawnReporter;
            synchronized (pVar.f865b) {
                z10 = pVar.f866c;
            }
            if (z10) {
                this.f859c = false;
                this.f860d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.f857a) {
            this.f859c = false;
            this.f860d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f860d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
