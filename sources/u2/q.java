package u2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f36698c = new q(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final q f36699d = new q(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f36700a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f36701b;

    public q(int i10, boolean z10) {
        this.f36700a = i10;
        this.f36701b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f36700a == qVar.f36700a && this.f36701b == qVar.f36701b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36701b) + (Integer.hashCode(this.f36700a) * 31);
    }

    public final String toString() {
        if (Intrinsics.a(this, f36698c)) {
            return "TextMotion.Static";
        }
        if (Intrinsics.a(this, f36699d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
