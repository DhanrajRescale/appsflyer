package w;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f38639a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38640b;

    public p1(Object obj, Object obj2) {
        this.f38639a = obj;
        this.f38640b = obj2;
    }

    public final boolean a(Object obj, Object obj2) {
        if (Intrinsics.a(obj, this.f38639a) && Intrinsics.a(obj2, this.f38640b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (Intrinsics.a(this.f38639a, p1Var.f38639a)) {
                if (Intrinsics.a(this.f38640b, p1Var.f38640b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        Object obj = this.f38639a;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        Object obj2 = this.f38640b;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i12 + i11;
    }
}
