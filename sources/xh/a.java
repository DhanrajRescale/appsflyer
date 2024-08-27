package xh;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f40260a;

    public a(Pair pair) {
        this.f40260a = pair;
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
        Intrinsics.d(obj, "null cannot be cast to non-null type com.assetgro.stockgro.ui.social.auth.util.Event<*>");
        if (Intrinsics.a(this.f40260a, ((a) obj).f40260a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f40260a;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return Boolean.hashCode(false) + (i10 * 31);
    }
}
