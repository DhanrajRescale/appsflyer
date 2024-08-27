package androidx.lifecycle;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1899a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1900b;

    public d() {
        Intrinsics.checkNotNullParameter(null, "generatedAdapter");
        this.f1900b = null;
    }

    @Override // androidx.lifecycle.r
    public final void c(t source, m event) {
        int i10 = this.f1899a;
        Object obj = this.f1900b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                new HashMap();
                h[] hVarArr = (h[]) obj;
                if (hVarArr.length <= 0) {
                    if (hVarArr.length <= 0) {
                        return;
                    }
                    h hVar = hVarArr[0];
                    throw null;
                }
                h hVar2 = hVarArr[0];
                throw null;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == m.ON_CREATE) {
                    source.getLifecycle().c(this);
                    ((v0) obj).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
                }
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                a3.a.u(obj);
                throw null;
        }
    }

    public d(h[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f1900b = generatedAdapters;
    }

    public d(v0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f1900b = provider;
    }
}
