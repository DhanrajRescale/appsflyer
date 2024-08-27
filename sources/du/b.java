package du;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class b extends cu.b {
    @Override // cu.b
    public final void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Integer num = a.f14502b;
        if (num != null && num.intValue() < 19) {
            super.a(cause, exception);
        } else {
            cause.addSuppressed(exception);
        }
    }
}
