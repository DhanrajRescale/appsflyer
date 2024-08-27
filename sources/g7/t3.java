package g7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t3 extends v3 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f17076a;

    public t3(Exception throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f17076a = throwable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3) && Intrinsics.a(this.f17076a, ((t3) obj).f17076a);
    }

    public final int hashCode() {
        return this.f17076a.hashCode();
    }

    public final String toString() {
        return kotlin.text.l.c("LoadResult.Error(\n                    |   throwable: " + this.f17076a + "\n                    |) ");
    }
}
