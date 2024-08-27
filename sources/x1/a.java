package x1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: b, reason: collision with root package name */
    public final int f39823b;

    public a(int i10) {
        this.f39823b = i10;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.a(a.class, cls)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.f39823b == ((a) obj).f39823b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39823b;
    }

    public final String toString() {
        return a3.a.i(new StringBuilder("AndroidPointerIcon(type="), this.f39823b, ')');
    }
}
