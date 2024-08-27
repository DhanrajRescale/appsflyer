package k7;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final g f22368h = new g();

    /* renamed from: a, reason: collision with root package name */
    public final r0 f22369a;

    /* renamed from: b, reason: collision with root package name */
    public final h.c f22370b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f22371c;

    /* renamed from: e, reason: collision with root package name */
    public List f22373e;

    /* renamed from: g, reason: collision with root package name */
    public int f22375g;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f22372d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List f22374f = Collections.emptyList();

    public h(c cVar, h.c cVar2) {
        this.f22369a = cVar;
        this.f22370b = cVar2;
        if (cVar2.B() != null) {
            this.f22371c = cVar2.B();
        } else {
            this.f22371c = f22368h;
        }
    }

    public final void a(Runnable runnable) {
        Iterator it = this.f22372d.iterator();
        while (it.hasNext()) {
            ((q0) it.next()).f22554a.getClass();
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
