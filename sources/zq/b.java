package zq;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;

/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppStartTrace f42796a;

    public b(AppStartTrace appStartTrace) {
        this.f42796a = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.f42796a.f11833t++;
    }
}
