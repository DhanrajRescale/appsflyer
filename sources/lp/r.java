package lp;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class r extends u implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: d, reason: collision with root package name */
    public transient Map f25046d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f25047e;

    public final void b() {
        Iterator it = this.f25046d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f25046d.clear();
        this.f25047e = 0;
    }
}
