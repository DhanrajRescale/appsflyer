package qu;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Object f32274a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f32275b;

    public u(Function1 function1, Object obj) {
        this.f32274a = obj;
        this.f32275b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.a(this.f32274a, uVar.f32274a) && Intrinsics.a(this.f32275b, uVar.f32275b);
    }

    public final int hashCode() {
        Object obj = this.f32274a;
        return this.f32275b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f32274a + ", onCancellation=" + this.f32275b + ')';
    }
}
