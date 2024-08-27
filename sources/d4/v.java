package d4;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f13844a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f13845b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f13846c = new HashMap();

    public v(Runnable runnable) {
        this.f13844a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f13845b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.t0) ((x) it.next())).f1831a.o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(x xVar) {
        this.f13845b.remove(xVar);
        u uVar = (u) this.f13846c.remove(xVar);
        if (uVar != null) {
            uVar.f13833a.c(uVar.f13834b);
            uVar.f13834b = null;
        }
        this.f13844a.run();
    }
}
