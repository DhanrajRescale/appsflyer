package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 implements o7.c {

    /* renamed from: a, reason: collision with root package name */
    public final o7.d f1985a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1986b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1987c;

    /* renamed from: d, reason: collision with root package name */
    public final ut.g f1988d;

    public v0(o7.d savedStateRegistry, i1 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f1985a = savedStateRegistry;
        this.f1988d = ut.h.a(new c2.p0(viewModelStoreOwner, 9));
    }

    @Override // o7.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1987c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.f1988d.getValue()).f1873b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((r0) entry.getValue()).f1966e.a();
            if (!Intrinsics.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f1986b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f1986b) {
            Bundle a10 = this.f1985a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f1987c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (a10 != null) {
                bundle.putAll(a10);
            }
            this.f1987c = bundle;
            this.f1986b = true;
        }
    }
}
