package g7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w0 extends z0 {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f17105b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Throwable error) {
        super(false);
        Intrinsics.checkNotNullParameter(error, "error");
        this.f17105b = error;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f17152a == w0Var.f17152a && Intrinsics.a(this.f17105b, w0Var.f17105b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17105b.hashCode() + Boolean.hashCode(this.f17152a);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.f17152a + ", error=" + this.f17105b + ')';
    }
}
