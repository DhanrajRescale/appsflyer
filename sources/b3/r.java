package b3;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3143a;

    public r(Object obj) {
        this.f3143a = obj;
        new LinkedHashMap();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.a(cls2, cls)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.LayoutReference");
        if (Intrinsics.a(((e) this).f3112b, ((e) ((r) obj)).f3112b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((e) this).f3112b.hashCode();
    }
}
