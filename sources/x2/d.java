package x2;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f39948a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f39949b;

    public d(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.f39948a = fArr;
            this.f39949b = fArr2;
            return;
        }
        throw new IllegalArgumentException("Array lengths must match and be nonzero".toString());
    }

    @Override // x2.a
    public final float a(float f10) {
        return c.l(f10, this.f39949b, this.f39948a);
    }

    @Override // x2.a
    public final float b(float f10) {
        return c.l(f10, this.f39948a, this.f39949b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Arrays.equals(this.f39948a, dVar.f39948a) && Arrays.equals(this.f39949b, dVar.f39949b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f39949b) + (Arrays.hashCode(this.f39948a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f39948a);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f39949b);
        Intrinsics.checkNotNullExpressionValue(arrays2, "toString(this)");
        sb2.append(arrays2);
        sb2.append(UrlTreeKt.componentParamSuffixChar);
        return sb2.toString();
    }
}
