package d2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class x0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f13677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.d f13678b;

    public x0(Configuration configuration, g2.d dVar) {
        this.f13677a = configuration;
        this.f13678b = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f13677a;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f13678b.f16433a.entrySet().iterator();
        while (it.hasNext()) {
            g2.b bVar = (g2.b) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (bVar == null || Configuration.needNewResources(updateFrom, bVar.f16430b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f13678b.f16433a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f13678b.f16433a.clear();
    }
}
