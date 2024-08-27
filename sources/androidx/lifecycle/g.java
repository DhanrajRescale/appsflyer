package androidx.lifecycle;

import android.widget.FrameLayout;
import d4.n1;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1904a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1905b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1906c;

    public g(e defaultLifecycleObserver, r rVar) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f1905b = defaultLifecycleObserver;
        this.f1906c = rVar;
    }

    @Override // androidx.lifecycle.r
    public final void c(t owner, m event) {
        int i10 = this.f1904a;
        Object obj = this.f1905b;
        Object obj2 = this.f1906c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                switch (f.f1903a[event.ordinal()]) {
                    case 1:
                        ((e) obj).getClass();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case 2:
                        ((e) obj).g(owner);
                        break;
                    case 3:
                        ((e) obj).b(owner);
                        break;
                    case 4:
                        ((e) obj).getClass();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case 5:
                        ((e) obj).d(owner);
                        break;
                    case 6:
                        ((e) obj).f(owner);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                r rVar = (r) obj2;
                if (rVar != null) {
                    rVar.c(owner, event);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(owner, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == m.ON_START) {
                    ((o) obj).c(this);
                    ((o7.d) obj2).d();
                    return;
                }
                return;
            case 2:
                HashMap hashMap = ((a) obj2).f1874a;
                a.a((List) hashMap.get(event), owner, event, obj);
                a.a((List) hashMap.get(m.ON_ANY), owner, event, obj);
                return;
            default:
                z7.e eVar = (z7.e) obj2;
                if (!eVar.f42166e.M()) {
                    owner.getLifecycle().c(this);
                    z7.f fVar = (z7.f) obj;
                    FrameLayout frameLayout = (FrameLayout) fVar.f22629a;
                    WeakHashMap weakHashMap = n1.f13788a;
                    if (d4.y0.b(frameLayout)) {
                        eVar.u(fVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public g(Object obj) {
        this.f1905b = obj;
        this.f1906c = c.f1890c.b(obj.getClass());
    }

    public g(o oVar, o7.d dVar) {
        this.f1905b = oVar;
        this.f1906c = dVar;
    }

    public g(z7.e eVar, z7.f fVar) {
        this.f1906c = eVar;
        this.f1905b = fVar;
    }
}
