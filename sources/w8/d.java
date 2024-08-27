package w8;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f38856a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f38857b;

    public d(Bitmap bitmap, Map map) {
        this.f38856a = bitmap;
        this.f38857b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (Intrinsics.a(this.f38856a, dVar.f38856a) && Intrinsics.a(this.f38857b, dVar.f38857b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f38857b.hashCode() + (this.f38856a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f38856a + ", extras=" + this.f38857b + ')';
    }
}
