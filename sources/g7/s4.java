package g7;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: d, reason: collision with root package name */
    public static final s4 f17053d = new s4(0, vt.i0.f38321a);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f17054a;

    /* renamed from: b, reason: collision with root package name */
    public final List f17055b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17056c;

    public s4(int i10, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int[] originalPageOffsets = {i10};
        Intrinsics.checkNotNullParameter(originalPageOffsets, "originalPageOffsets");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f17054a = originalPageOffsets;
        this.f17055b = data;
        this.f17056c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s4.class != obj.getClass()) {
            return false;
        }
        s4 s4Var = (s4) obj;
        if (Arrays.equals(this.f17054a, s4Var.f17054a) && Intrinsics.a(this.f17055b, s4Var.f17055b) && this.f17056c == s4Var.f17056c && Intrinsics.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (nn.d.e(this.f17055b, Arrays.hashCode(this.f17054a) * 31, 31) + this.f17056c) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb2.append(Arrays.toString(this.f17054a));
        sb2.append(", data=");
        sb2.append(this.f17055b);
        sb2.append(", hintOriginalPageOffset=");
        return nn.d.m(sb2, this.f17056c, ", hintOriginalIndices=null)");
    }
}
