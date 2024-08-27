package fr;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f16209a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f16210b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f16211c;

    public b(View view, zq.a aVar) {
        this.f16210b = new AtomicReference(view);
        this.f16211c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.f16210b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: fr.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b bVar = b.this;
                bVar.getClass();
                view.getViewTreeObserver().removeOnDrawListener(bVar);
            }
        });
        this.f16209a.postAtFrontOfQueue(this.f16211c);
    }
}
