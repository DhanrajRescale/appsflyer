package wo;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class h implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f39364a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f39365b;

    public h(m mVar, BottomNavigationView bottomNavigationView) {
        this.f39364a = new WeakReference(mVar);
        this.f39365b = new WeakReference(bottomNavigationView);
    }

    public final void a() {
        WeakReference weakReference = this.f39365b;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            View view = (View) weakReference.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        weakReference.clear();
        this.f39364a.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference weakReference = this.f39364a;
        if (weakReference.get() == null) {
            a();
            return;
        }
        k kVar = (k) weakReference.get();
        v4.b bVar = k.f39378w;
        kVar.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f39364a.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f39364a.get() == null) {
            a();
        } else if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
