package d2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class z0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.e f13696a;

    public z0(g2.e eVar) {
        this.f13696a = eVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f13696a.a();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f13696a.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f13696a.a();
    }
}
