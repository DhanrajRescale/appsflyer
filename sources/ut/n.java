package ut;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class n {
    public static final m a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new m(exception);
    }

    public static final void b(Object obj) {
        if (!(obj instanceof m)) {
        } else {
            throw ((m) obj).f37396a;
        }
    }
}
