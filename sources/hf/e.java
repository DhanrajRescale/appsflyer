package hf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: a, reason: collision with root package name */
    public final List f18366a;

    public e(List homeElements) {
        Intrinsics.checkNotNullParameter(homeElements, "homeElements");
        this.f18366a = homeElements;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.a(this.f18366a, ((e) obj).f18366a);
    }

    public final int hashCode() {
        return this.f18366a.hashCode();
    }

    public final String toString() {
        return a3.a.l(new StringBuilder("Data(homeElements="), this.f18366a, ")");
    }
}
