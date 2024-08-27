package z1;

import v.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f41901a;

    /* renamed from: b, reason: collision with root package name */
    public final float f41902b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41903c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41904d;

    public c(float f10, float f11, long j10, int i10) {
        this.f41901a = f10;
        this.f41902b = f11;
        this.f41903c = j10;
        this.f41904d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f41901a == this.f41901a && cVar.f41902b == this.f41902b && cVar.f41903c == this.f41903c && cVar.f41904d == this.f41904d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41904d) + e.c(this.f41903c, e.a(this.f41902b, Float.hashCode(this.f41901a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb2.append(this.f41901a);
        sb2.append(",horizontalScrollPixels=");
        sb2.append(this.f41902b);
        sb2.append(",uptimeMillis=");
        sb2.append(this.f41903c);
        sb2.append(",deviceId=");
        return a3.a.i(sb2, this.f41904d, ')');
    }
}
