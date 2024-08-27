package ut;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f37396a;

    public m(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f37396a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (Intrinsics.a(this.f37396a, ((m) obj).f37396a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37396a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f37396a + ')';
    }
}
