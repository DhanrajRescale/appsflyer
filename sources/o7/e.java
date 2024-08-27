package o7;

import android.os.Bundle;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.navigation.p;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f29765a;

    /* renamed from: b, reason: collision with root package name */
    public final d f29766b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f29767c;

    public e(f fVar) {
        this.f29765a = fVar;
    }

    public final void a() {
        f fVar = this.f29765a;
        o lifecycle = fVar.getLifecycle();
        if (lifecycle.b() == n.f1948b) {
            lifecycle.a(new a(fVar));
            d dVar = this.f29766b;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            if (!dVar.f29760b) {
                lifecycle.a(new p(dVar, 2));
                dVar.f29760b = true;
                this.f29767c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f29767c) {
            a();
        }
        o lifecycle = this.f29765a.getLifecycle();
        if (!lifecycle.b().a(n.f1950d)) {
            d dVar = this.f29766b;
            if (dVar.f29760b) {
                if (!dVar.f29762d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    dVar.f29761c = bundle2;
                    dVar.f29762d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void c(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        d dVar = this.f29766b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = dVar.f29761c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        o.g gVar = dVar.f29759a;
        gVar.getClass();
        o.d dVar2 = new o.d(gVar);
        gVar.f29337c.put(dVar2, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(dVar2, "this.components.iteratorWithAdditions()");
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
    }
}
