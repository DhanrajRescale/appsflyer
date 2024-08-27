package androidx.lifecycle;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s0 implements r, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f1967a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f1968b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1969c;

    public s0(String key, r0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f1967a = key;
        this.f1968b = handle;
    }

    public final void a(o lifecycle, o7.d registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!this.f1969c) {
            this.f1969c = true;
            lifecycle.a(this);
            registry.c(this.f1967a, this.f1968b.f1966e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    @Override // androidx.lifecycle.r
    public final void c(t source, m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == m.ON_DESTROY) {
            this.f1969c = false;
            source.getLifecycle().c(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
