package kl;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public static final ek.e f23253d = new ek.e(29, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f23254e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f23255a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f23256b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f23257c = new AtomicBoolean(false);

    public e(Activity activity) {
        this.f23255a = new WeakReference(activity);
    }

    public final void a() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            bl.d dVar = new bl.d(this, 2);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                dVar.run();
            } else {
                this.f23256b.post(dVar);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
