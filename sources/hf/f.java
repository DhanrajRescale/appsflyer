package hf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: a, reason: collision with root package name */
    public final List f18367a;

    public f(List homeElementsV2) {
        Intrinsics.checkNotNullParameter(homeElementsV2, "homeElementsV2");
        this.f18367a = homeElementsV2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.a(this.f18367a, ((f) obj).f18367a);
    }

    public final int hashCode() {
        return this.f18367a.hashCode();
    }

    public final String toString() {
        return a3.a.l(new StringBuilder("DataV2(homeElementsV2="), this.f18367a, ")");
    }
}
