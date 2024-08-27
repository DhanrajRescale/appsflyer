package fr;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f16215a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f16216b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f16217c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f16218d;

    public e(View view, zq.a aVar, zq.a aVar2) {
        this.f16216b = new AtomicReference(view);
        this.f16217c = aVar;
        this.f16218d = aVar2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.f16216b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.f16215a;
        handler.post(this.f16217c);
        handler.postAtFrontOfQueue(this.f16218d);
        return true;
    }
}
