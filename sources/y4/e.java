package y4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends c {
    public /* synthetic */ e(int i10) {
        this(a.f41149b);
    }

    public final Object a(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f41150a.get(key);
    }

    public final void b(b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f41150a.put(key, obj);
    }

    public e(c initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        this.f41150a.putAll(initialExtras.f41150a);
    }
}
