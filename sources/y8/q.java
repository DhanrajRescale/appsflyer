package y8;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import vt.p0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final q f41413b = new q(p0.d());

    /* renamed from: a, reason: collision with root package name */
    public final Map f41414a;

    public q(Map map) {
        this.f41414a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            if (Intrinsics.a(this.f41414a, ((q) obj).f41414a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41414a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f41414a + ')';
    }
}
